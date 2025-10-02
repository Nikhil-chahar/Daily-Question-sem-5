class Solution {
    public int findKthLargest(int[] arr, int k) {
       PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> arr[b] -arr[a]);

        for(int i=0;i<arr.length;i++){
            pq.add(i);
        }

        
        for(int i=0;i<k-1;i++){
            pq.poll();
        }

        // for(int i=k;i<arr.length;i++){
        //     if(arr[i] > pq.peek()){
        //         pq.poll();
        //         pq.add(arr[i]);
        //     }
        // }
        return arr[pq.peek()];

    }
}