class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<Pair> q = new LinkedList<>();
        HashSet<String> dict = new HashSet<>(wordList);
        if(!dict.contains(endWord)) return 0;
        HashSet<String> visited = new HashSet<>();
        q.add(new Pair(beginWord,1));
        int ans = Integer.MAX_VALUE;
        while(!q.isEmpty()){
            Pair rp = q.poll();

            if(visited.contains(rp.word)){
                continue;
            }
            visited.add(rp.word);

            if(rp.word.equals(endWord)){
                ans = Math.min(ans,rp.step);
            }

            for(int i=0;i<rp.word.length();i++){
                for(int j=0;j<26;j++){
                    char ch = (char)('a' + j);
                    if(ch == rp.word.charAt(i) ) continue;
                    String nw = rp.word.substring(0,i) + ch + rp.word.substring(i+1);

                    if(dict.contains(nw) && !visited.contains(nw)){
                        q.add(new Pair(nw,rp.step+1));
                    }
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0: ans;
    }
    class Pair{
        String word;
        int step;
        public Pair(String word,int step){
            this.word = word;
            this.step = step;
        }
    }
}