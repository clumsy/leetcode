package leetcode;

import java.util.HashMap;
import java.util.Map;

@Difficulty(Level.MEDIUM)
@Algorithms(Algorithm.MAP)
@BeatsPercent(52.95)
public class Problem1396 {
    class UndergroundSystem {
        private final class SumCount {
            private double sum;
            private int count;

            private SumCount(double sum) {
                this.sum = sum;
                this.count = 1;
            }

            private SumCount add(double val) {
                sum += val;
                ++count;
                return this;
            }

            private double average() {
                return sum/count;
            }
        }

        private final class StationTime {
            private String station;
            private int time;

            private StationTime(String station, int time) {
                this.station = station;
                this.time = time;
            }

            private StationTime set(String s, int t) {
                station = s;
                time = t;
                return this;
            }
        }

        private final Map<Integer, StationTime> locations = new HashMap<>();
        private final Map<String, SumCount> averages = new HashMap<>();

        public UndergroundSystem() {

        }

        @TimeComplexity(average = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public void checkIn(int id, String stationName, int t) {
            locations.compute(id, (__, v) -> v == null ? new StationTime(stationName, t) : v.set(stationName, t));
        }

        @TimeComplexity(average = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public void checkOut(int id, String stationName, int t) {
            StationTime current = locations.get(id);
            averages.compute(fromStationToStation(current.station, stationName), (__, v) -> v == null ? new SumCount(t - current.time) : v.add(t - current.time));
        }

        @TimeComplexity(average = Complexity.CONSTANT)
        @SpaceComplexity(worst = Complexity.CONSTANT)
        public double getAverageTime(String startStation, String endStation) {
            return averages.get(fromStationToStation(startStation, endStation)).average();
        }

        private String fromStationToStation(String stationFrom, String stationTo) {
            return stationFrom + "-" + stationTo;
        }
    }
}
