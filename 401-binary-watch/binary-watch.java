class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();

        for(int h=0;h<12;h++){
            for(int m=0;m<60;m++){
                int cntBit = Integer.bitCount(h) + Integer.bitCount(m);
                if(cntBit == turnedOn){
                    String s = h + ":" + (m >=10 ? m : "0"+m);
                    ans.add(s);
                }
            }
        } 
        return ans;
    }
}