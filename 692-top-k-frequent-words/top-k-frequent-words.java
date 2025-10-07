class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map = new HashMap<>();

        for(int i=0;i<words.length;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);
        }
        String str[][] = new String[map.size()][2];

        int ind=0;
        for(String key : map.keySet()){
            str[ind][0] = key;
            str[ind][1] = Integer.toString(map.get(key));
            ind++;
        }
        
        Arrays.sort(str, (a,b) -> a[0].compareTo(b[0]));
        Arrays.sort(str, (a,b) -> Integer.parseInt(b[1]) -Integer.parseInt(a[1]));
        
        List<String> ll = new ArrayList<>();
        for(int i=0;i<k;i++){
            ll.add(str[i][0]);
        }
        
        return ll;
    }
}