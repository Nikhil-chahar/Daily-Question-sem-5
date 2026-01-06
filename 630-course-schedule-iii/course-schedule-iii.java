class Solution {
    public int scheduleCourse(int[][] c) {
        Arrays.sort(c,(a,b) -> a[1]-b[1]);

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> b-a);
        int t =0;

        for(int v[] : c){
            int dur = v[0];
            int end = v[1];

            if(dur + t <= end){
                t += dur;
                pq.add(dur);
            }
            else if(pq.size() >0 && pq.peek() > dur){
                t = t-pq.poll()+dur;
                pq.add(dur);
            }
        }
        return pq.size();
        
    }
}