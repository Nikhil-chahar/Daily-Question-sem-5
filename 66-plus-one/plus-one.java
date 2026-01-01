class Solution {
    public int[] plusOne(int[] digits) {
        int carry =1;
        StringBuilder sb = new StringBuilder();
        
        for(int i=digits.length-1;i>=0;i--){
            sb.append((digits[i]+carry)%10);
            carry = (digits[i]+carry)/10;
            
        }
        if(carry != 0 ){
            sb.append(carry);
        }
        sb.reverse();
        int ans[] = new int[sb.length()];
        for(int i=0;i<sb.length();i++){
            ans[i] = sb.charAt(i)-'0';
        }

        return ans;
    }
}