import java.util.*;

class Solution {
    public int minArrivalsToDiscard(int[] arrivals, int w, int m) {
        int n = arrivals.length;
        int i = 0, j = 0;
        Map<Integer, Integer> map = new HashMap<>();
        boolean[] isDiscarded = new boolean[n];
        int cnt = 0;

        while (j < n) {
            map.put(arrivals[j], map.getOrDefault(arrivals[j], 0) + 1);
            if (j - i + 1 > w) {
                if (!isDiscarded[i]) {
                    map.put(arrivals[i], map.get(arrivals[i]) - 1);
                    if (map.get(arrivals[i]) == 0) map.remove(arrivals[i]);
                }
                i++;
            }
            if (map.get(arrivals[j]) > m) {
                map.put(arrivals[j], map.get(arrivals[j]) - 1);
                if (map.get(arrivals[j]) == 0) map.remove(arrivals[j]);
                isDiscarded[j] = true;
                cnt++;
            }
            j++;
        }
        return cnt;
    }
}