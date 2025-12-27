class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        // free rooms (by index)
        PriorityQueue<Integer> free = new PriorityQueue<>();
        // busy rooms: [endTime, roomIndex]
        PriorityQueue<long[]> busy = new PriorityQueue<>(
            (a, b) -> a[0] == b[0] ? Long.compare(a[1], b[1]) : Long.compare(a[0], b[0])
        );

        for (int i = 0; i < n; i++) {
            free.add(i);
        }
        int[] count = new int[n];
        for (int[] meet : meetings) {
            long start = meet[0];
            long end = meet[1];

            // free rooms that are done before start
            while (!busy.isEmpty() && busy.peek()[0] <= start) {
                free.add((int) busy.poll()[1]);
            }

            if (!free.isEmpty()) {
                int room = free.poll();
                busy.add(new long[]{end, room});
                count[room]++;
            } else {
                // delay meeting
                long[] earliest = busy.poll();
                long newEnd = earliest[0] + (end - start);
                busy.add(new long[]{newEnd, earliest[1]});
                count[(int) earliest[1]]++;
            }
        }

        int ans = 0;
        for (int i = 1; i < n; i++) {
            if (count[i] > count[ans]) {
                ans = i;
            }
        }

        return ans;
    }
}
