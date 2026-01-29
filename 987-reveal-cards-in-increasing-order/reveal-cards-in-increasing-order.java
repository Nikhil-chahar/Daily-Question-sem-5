class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        Queue<Integer> q = new LinkedList<>();
        Arrays.sort(deck);
        int n = deck.length;
        for(int i=0;i<n;i++){
            q.add(i);
        }
        int ind=0;
        int ans[] = new int[n];
        for(int c : deck){
            ans[q.poll()] = c;
            if(!q.isEmpty()){
                q.add(q.poll());
            }
        }
        return ans;
    }
}