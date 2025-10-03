class Solution {
    public void reverseString(char[] s) {
        reverse(s,0,s.length-1);
    }
    public void reverse(char ch[] , int st, int en){
        if(st >= en){
            return;
        }
        char c = ch[st];
        ch[st]= ch[en];
        ch[en] = c;

        st++;
        en--;
        reverse(ch,st,en);
    }
}