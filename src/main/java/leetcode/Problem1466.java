package leetcode;

public class Problem1466 {
    public int minReorder(int n, int[][] connections) {
        boolean[] reach = new boolean[n]; // this array tracks cities reachable so far
        reach[0] = true; //mark city 0 as reachable
        int count = 0;
        int visited = 1;
        while (visited < n) {
            for (int[] connection : connections) {
                int source = connection[0];
                int destination = connection[1];

                // if destination is reachable, but source is not, source can be marked as reachable
                if (reach[destination] && !reach[source]) {
                    reach[source] = true;
                    visited++;
                    continue;
                }

                // if source is reachable, but destination is not, we can flip the direction and mark destination reachable.
                if (reach[source] && !reach[destination]) {
                    reach[destination] = true;
                    connection[0] = destination;
                    connection[1] = source;
                    visited++;
                    count++;
                }
            }
        }
        return count;
    }

//    public int minReorder(int n, int[][] connections) {
//        return traverse(n, 0, connections, new HashSet<>());
//    }
//
//    private int traverse(int n, int destination, int[][] connections, Set<Integer> visited) {
//        int count = 0;
//        Set<Integer> nexts = new HashSet<>();
//        for (int[] connection : connections) {
//            if (connection[0] == destination && !visited.contains(connection[1])) {
//                connection[0] = connection[1];
//                connection[1] = destination;
//                count++;
//            }
//            if (connection[1] == destination) {
//                int next = connection[0];
//                if (!visited.contains(next)) {
//                    nexts.add(next);
//                }
//            }
//        }
//        visited.add(destination);
//        if (visited.size() == n) {
//            return count;
//        }
//        for (int next : nexts) {
//            count += traverse(n, next, connections, visited);
//        }
//        return count;
//    }

//    public int minReorder(int n, int[][] connections) {
//        Map<Integer, List<int[]>> hasCity = new HashMap<>();
//        for (int[] connection : connections) {
//            hasCity.compute(connection[0], (index, current) -> {
//                if (current == null) {
//                    current = new ArrayList<>();
//                }
//                current.add(connection);
//                return current;
//            });
//            hasCity.compute(connection[1], (index, current) -> {
//                if (current == null) {
//                    current = new ArrayList<>();
//                }
//                current.add(connection);
//                return current;
//            });
//        }
//        int count = 0;
//        Stack<Integer> destinations = new Stack<>();
//        destinations.add(0);
//        Set<Integer> visited = new HashSet<>(n, 1f);
//        while (!destinations.isEmpty()) {
//            int destination = destinations.pop();
//            for (int[] connection : hasCity.remove(destination)) {
//                if (connection[0] == destination) {
//                    connection[0] = connection[1];
//                    connection[1] = destination;
//                    count++;
//                }
//                int city = connection[0];
//                if (visited.add(city)) {
//                    hasCity.get(city).removeIf(cityConnection ->
//                            cityConnection[0] == destination || cityConnection[1] == destination);
//                    destinations.add(city);
//                }
//            }
//        }
//        return count;
//    }
}
