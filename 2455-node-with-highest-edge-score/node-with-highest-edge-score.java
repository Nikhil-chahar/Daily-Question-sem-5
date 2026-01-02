class Solution {
    public int edgeScore(int[] edges) {
        HashMap<Integer, Long> map = new HashMap<>();

        for (int i = 0; i < edges.length; i++) {
            map.put(edges[i], map.getOrDefault(edges[i], 0L) + i);
        }

        long max = -1;
        int ind = 0;

        for (int key : map.keySet()) {
            long val = map.get(key);
            if (val > max || (val == max && key < ind)) {
                max = val;
                ind = key;
            }
        }
        return ind;
    }
}
