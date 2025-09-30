class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ll = new ArrayList<>();
        if(p.length() > s.length()) return ll;

        int freq1[] = new int[26];
        int freq2[] = new int[26];

        for(int i=0;i<p.length();i++){
            freq1[p.charAt(i) -'a']++;
            freq2[s.charAt(i) -'a']++;
        }

        if(equals(freq1,freq2)) ll.add(0);
        int left=0,right=p.length();
 
        while(right <s.length()){
            freq2[s.charAt(left) -'a']--;
            freq2[s.charAt(right) -'a']++;
            left++;
            if(equals(freq1,freq2)){
                ll.add(left);
            }
            right++;
        }
        return ll;
    }
    public boolean equals(int freq1[],int freq2[]){
        for(int i=0;i<freq1.length;i++){
            if(freq1[i] != freq2[i]) return false;
        }
        return true;
    }
    
}