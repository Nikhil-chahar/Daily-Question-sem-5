class Solution {
    public List<List<String>> groupAnagrams(String[] arr) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();

        for(int i=0;i<arr.length;i++){
            String key = getKey(arr[i]);
            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(arr[i]);
        }
        for(String key : map.keySet()){
            ans.add(map.get(key));
        }
        
        // System.out.print(key);
        return ans;
    }
    public String getKey(String s){
        int freq[] = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<freq.length;i++){
            sb.append(freq[i]);
            sb.append("#");
        }

        return sb.toString();
    }
}