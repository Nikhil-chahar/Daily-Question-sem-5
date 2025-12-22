class Solution {
    public String generateTag(String cap) {
        cap = cap.trim();
        if(cap.length() == 0){
            return "#";
        }
        StringBuilder sb = new StringBuilder();
        boolean fl = false;
        sb.append('#');
        char low = Character.toLowerCase(cap.charAt(0));
        sb.append(low);

        for(int i=1;i<cap.length();i++){
            char ch = cap.charAt(i);
            if( ch == ' '){
                fl = true;
            }
            else if(fl && (ch >= 'a' || ch <= 'z') && (ch >='A' || ch <= 'Z')){
                char upper = Character.toUpperCase(ch);
                sb.append(upper);
                fl = false;
            }
            else if((ch >= 'a' || ch <= 'z') && (ch >='A' || ch <= 'Z')){
                char lower = Character.toLowerCase(ch);
                sb.append(lower);

            }
            if(sb.length() == 100){
                return sb.toString();
            }
        }

        return sb.toString();
    }
}