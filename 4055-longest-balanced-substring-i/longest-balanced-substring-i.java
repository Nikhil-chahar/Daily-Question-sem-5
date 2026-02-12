class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int mx =0;
        for(int i=0;i<n;i++){
            HashMap<Character,Integer> map = new HashMap<>();
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                map.put(ch,map.getOrDefault(ch,0)+1);
                if(check(map,ch)){
                    mx = Math.max(mx,j-i+1);
                }
            }
        }
        return mx;
    }
    public boolean check(HashMap<Character,Integer> map,char ch){
        int v = map.get(ch);

        for(char key : map.keySet()){
            if(map.get(key) != v){
                return false;
            }
        }
        return true;
    }
}