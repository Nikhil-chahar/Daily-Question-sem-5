class Solution {
    public int minimumJumps(int[] forbidden, int a, int b, int x) {

        Set<Integer> forbid = new HashSet<>();
        for (int f : forbidden) forbid.add(f);

        int max = Math.max(x, Arrays.stream(forbidden).max().orElse(0)) + a + b;

        boolean[][] visited = new boolean[max + 1][2];
        Queue<int[]> q = new LinkedList<>();

        // state: {position, lastWasBackward(0/1)}
        q.offer(new int[]{0, 0});
        visited[0][0] = true;

        int jumps = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            while (size-- > 0) {
                int[] cur = q.poll();
                int pos = cur[0];
                int back = cur[1];

                if (pos == x) return jumps;

                // forward jump
                int nextF = pos + a;
                if (nextF <= max &&
                    !forbid.contains(nextF) &&
                    !visited[nextF][0]) {

                    visited[nextF][0] = true;
                    q.offer(new int[]{nextF, 0});
                }

                // backward jump (only if last wasn't backward)
                int nextB = pos - b;
                if (back == 0 &&
                    nextB >= 0 &&
                    !forbid.contains(nextB) &&
                    !visited[nextB][1]) {

                    visited[nextB][1] = true;
                    q.offer(new int[]{nextB, 1});
                }
            }
            jumps++;
        }
        return -1;
    }
}
