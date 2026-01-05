class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        List<String> ll1 = new ArrayList<>();
        List<String> ll2 = new ArrayList<>();
        int a=1;

        for(int i=0;i<groups.length;i++){
            if(a != groups[i]){
                a = groups[i];
                ll1.add(words[i]);
            }
        }
        a=0;
        for(int i=0;i<groups.length;i++){
            if(a != groups[i]){
                a = groups[i];
                ll2.add(words[i]);
            }
        }
        return ll1.size() >= ll2.size() ? ll1 : ll2;
    }
}