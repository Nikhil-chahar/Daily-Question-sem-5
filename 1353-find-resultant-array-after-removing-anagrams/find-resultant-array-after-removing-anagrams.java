class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> ans = new ArrayList<>();

        for(int i=0;i<words.length;i++){
            ans.add(words[i]);
        }

        for(int i=1;i<ans.size();i++){
            if(check(ans.get(i),ans.get(i-1))){
                ans.remove(ans.get(i));
                i--;
            }
        }
        return ans;
    }
    public boolean check(String s1,String s2){
        if(s1.length() != s2.length()) return false;

        char ch1[] = new char[s1.length()];
        char ch2[] = new char[s1.length()];

        for(int i=0;i<s1.length();i++){
            ch1[i] = s1.charAt(i);
            ch2[i] = s2.charAt(i);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        for(int i=0;i<s1.length();i++){
            if(ch1[i] != ch2[i]) return false;
        }
        return true;

    }
}
