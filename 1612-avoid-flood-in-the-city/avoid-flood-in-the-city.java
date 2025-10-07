import java.util.*;

class Solution {
    public int[] avoidFlood(int[] rains) {
        int n = rains.length;
        int[] ans = new int[n];
        Map<Integer, Integer> fullLake = new HashMap<>(); // stores lake → last day it was filled
        TreeSet<Integer> dryDays = new TreeSet<>(); // stores indices of dry days (rains[i] == 0)

        for (int i = 0; i < n; i++) {
            if (rains[i] == 0) {
                dryDays.add(i); // we can dry something later
                ans[i] = 1; // default value, will update if needed
            } else {
                int lake = rains[i];
                ans[i] = -1; // raining day always -1
                
                // if this lake was already full
                if (fullLake.containsKey(lake)) {
                    int lastFullDay = fullLake.get(lake);
                    
                    // find the first dry day *after* the last full day
                    Integer dryDay = dryDays.higher(lastFullDay);
                    if (dryDay == null) {
                        // no dry day available → flood!
                        return new int[0];
                    }
                    
                    ans[dryDay] = lake; // dry this lake on that day
                    dryDays.remove(dryDay);
                }
                
                // update the lake as full today
                fullLake.put(lake, i);
            }
        }
        return ans;
    }
}
