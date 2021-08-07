package leetcode;

import java.util.*;
import java.util.stream.Collectors;

@Algorithms(Algorithm.SLIDING_WINDOW)
@BeatsPercent(25.51)
@TimeComplexity(worst = Complexity.LINEARITHMIC_N)
@SpaceComplexity(worst = Complexity.LINEAR_N)
public class Problem1169 {
    static class Transaction {
        String name;
        int time;
        int amount;
        String city;

        public String toString() {
            return name + "," + time + "," + amount + "," + city;
        }
    }

    public List<String> invalidTransactions(String[] transactions) {
        int n = transactions.length;
        Transaction[] txns = new Transaction[n];
        for (int i = 0; i < n; i++) {
            String[] chunks = transactions[i].split(",");
            txns[i] = new Transaction();
            txns[i].name = chunks[0];
            txns[i].time = Integer.parseInt(chunks[1]);
            txns[i].amount = Integer.parseInt(chunks[2]);
            txns[i].city = chunks[3];
        }
        Arrays.sort(txns,
            Comparator.comparing((Transaction a) -> a.name)
                .thenComparingInt(a -> a.time));

        Set<Transaction> invalid = new HashSet<>();
        Deque<Transaction> last_hour = new LinkedList<>(); // sliding window
        Map<String, Integer> last_hour_cities = new HashMap<>(); // city counter for sliding window
        for (int i = 0; i < n; i++) {
            Transaction txn = txns[i];
            if (!last_hour.isEmpty() && !txn.name.equals(last_hour.getLast().name)) {
                if (last_hour_cities.size() > 1) {
                    invalid.addAll(last_hour);
                }
                last_hour.clear();
                last_hour_cities.clear();
            }
            while (!last_hour.isEmpty() && txn.time - last_hour.getFirst().time > 60) {
                if (last_hour_cities.size() > 1) {
                    invalid.addAll(last_hour);
                }
                Transaction removed = last_hour.removeFirst();
                last_hour_cities.compute(removed.city, (city, count) -> count == 1 ? null : count - 1);
            }
            if (txn.amount > 1000) {
                invalid.add(txn);
            }
            last_hour.addLast(txn);
            last_hour_cities.compute(txn.city, (city, count) -> count == null ? 1 : count + 1);
        }
        if (last_hour_cities.size() > 1) {
            invalid.addAll(last_hour);
        }
        return
            invalid.stream()
                .map(Object::toString)
                .collect(Collectors.toList());
    }
}
