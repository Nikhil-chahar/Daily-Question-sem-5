class Solution {
    public boolean isOneBitCharacter(int[] bits) {
        int n = bits.length;
        String s= "";
        for(int v : bits){
            if(s.equals("10") || s.equals("11") || s.equals("0")){
                s ="";
            }
            s+=v;
        }
        if(s.equals("0")) return true;
        return false;
        
    }
}