class Solution {
    public int canBeTypedWords(String text, String bs) {
        String[] str = text.split(" ");

        char[] ch = new char[bs.length()];
        for(int i=0;i<bs.length();i++){
            ch[i] = bs.charAt(i);
        }
        int c=0;

        for(int i =0;i<str.length;i++){
            boolean fl = true;

            for(int j=0;j<ch.length;j++){
                if(str[i].indexOf(ch[j]) != -1){
                    fl = false;
                    break;
                }
            }
            if(fl){
                c++;
            }
        }
        return c;
    }
}