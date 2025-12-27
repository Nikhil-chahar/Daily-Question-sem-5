class Solution {
    public String resultingString(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            int len = sb.length();

            if(len > 0){
                char last = sb.charAt(len-1);
                int diff = Math.abs(last - ch);

                if(diff == 1 || diff == 25){
                    sb.deleteCharAt(len-1);
                    continue;
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}