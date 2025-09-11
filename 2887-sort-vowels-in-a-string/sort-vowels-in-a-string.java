class Solution {
    public String sortVowels(String s) {
        List<Character> vowels = new ArrayList<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        
        List<Character> vowel = new ArrayList<>();
        List<Character> cons = new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(vowels.contains(ch)){
                vowel.add(ch);
            }else{
                cons.add(ch);
            }
        }
        Collections.sort(vowel);
        StringBuilder ans = new StringBuilder("");
        int ind =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(vowels.contains(ch)){
                ans.append(vowel.get(ind++));
            }else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}