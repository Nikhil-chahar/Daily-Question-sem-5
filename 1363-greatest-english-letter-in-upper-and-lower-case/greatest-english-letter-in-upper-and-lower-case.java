class Solution {
    public String greatestLetter(String s) {
        List<Character> ll = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(Math.abs(s.charAt(i)-s.charAt(j)) ==32 ){
                    if((int)s.charAt(i) < 97){
                        ll.add(s.charAt(i));
                    }else{
                        ll.add(s.charAt(j));
                    }
                }
            }
        }
        Collections.sort(ll);
        if(ll.size() == 0){
            return "";
        }

        
        return Character.toString(ll.get(ll.size()-1));
    }
}