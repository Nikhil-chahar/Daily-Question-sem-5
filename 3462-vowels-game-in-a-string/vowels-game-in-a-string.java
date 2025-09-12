class Solution {
    public boolean doesAliceWin(String s) {
        int l = s.length();
        int c=0;
        for(int i=0;i<l;i++){
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                c++;
            }
        }
        // if(c==1){
        //     return true;
        // }
        if(c ==0){
            return false;
        }

        return true;
    }
}