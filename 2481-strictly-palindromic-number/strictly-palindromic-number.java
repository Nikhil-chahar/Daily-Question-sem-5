class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i =2;i<n-1;i++){
            String s = Bin(n,i);
            if(!ispalin(s)){
                return false;
            }
        }
        // System.out.print(Bin(10,2));
        return true;

    }
    public String Bin(int val,int base){
        StringBuilder sb = new StringBuilder();

        while(val >0){
            sb.append(Integer.toString(val%base));
            val /= base;
        }
        return sb.reverse().toString();
    }
    public boolean ispalin(String s){
        int si=0,ei=s.length()-1;

        while(si < ei){
            if(s.charAt(si) != s.charAt(ei)){
                return false;
            }
            si++;
            ei--;
        }
        return true;
    }
}