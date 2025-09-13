class Solution {
    public int maxFreqSum(String s) {
        if(s.length() == 0){
            return 0;
        }
        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxcon=0;
        int maxvow = 0;
        for(char key : map.keySet()){
            if( key == 'a' || key == 'e' || key == 'i' || key == 'o' ||key == 'u' ){
                if(maxvow < map.get(key)){
                    maxvow = map.get(key);
                }
            }else{
                if(maxcon < map.get(key)){
                    maxcon = map.get(key);
                }
            }
        }
        return maxvow + maxcon;

    }
}
