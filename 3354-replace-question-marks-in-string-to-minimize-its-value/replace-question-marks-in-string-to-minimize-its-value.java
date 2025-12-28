class Solution {
    public String minimizeStringValue(String s) {
        int n = s.length();
        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            if (c != '?') {
                freq[c - 'a']++;
            }
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]
        );

        for (int i = 0; i < 26; i++) {
            pq.offer(new int[]{freq[i], i});
        }
        List<Character> replace = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (c == '?') {
                int[] cur = pq.poll();
                replace.add((char) (cur[1] + 'a'));
                cur[0]++;
                pq.offer(cur);
            }
        }
        Collections.sort(replace);

        StringBuilder sb = new StringBuilder();
        int idx = 0;
        for (char c : s.toCharArray()) {
            if (c == '?') {
                sb.append(replace.get(idx++));
            } else {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
