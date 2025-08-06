class Solution {
    public boolean areNumbersAscending(String s) {
        String str[] = s.split(" ");
        List<Integer> ans = new ArrayList<>();

        for(int i=0;i<str.length;i++){
            if(str[i].matches("\\d+")){
                ans.add(Integer.parseInt(str[i]));
            }
        }

        for(int i=0;i<ans.size()-1;i++){
            if(((int)ans.get(i+1) - (int)ans.get(i)) <= 0){
                return false;
            }
        }
        System.out.print(ans);
        return true;
    }
}