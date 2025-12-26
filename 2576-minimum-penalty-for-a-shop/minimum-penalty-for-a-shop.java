class Solution {
    public int bestClosingTime(String s) {
        int pen=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'Y'){
                pen++;
            }
        }

        int min = pen;
        int close=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'Y'){
                pen--;
            }else{
                pen++;
            }
            if(pen < min){
                min = pen;
                close = i+1;
            }
        }
        return close;
    }
}