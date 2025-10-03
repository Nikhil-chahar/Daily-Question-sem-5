class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ll = new ArrayList<>();
        permu(s,0,"",ll);
        return ll;
    }
    public void permu(String s,int i,String ans,List<String> ll){
        if(ans.length() == s.length()){
            ll.add(ans);
            return;
        }
        char ch = s.charAt(i);
        if(ch >= 'a' && ch <= 'z'){
            permu(s,i+1,ans+ch,ll);
            permu(s,i+1,ans+(char)((int)ch -32),ll);

        }else if(ch >= 'A' && ch <= 'Z'){
            permu(s,i+1,ans+ch,ll);
            permu(s,i+1,ans+(char)((int)ch +32),ll);

        }
        else{
            permu(s,i+1,ans+ch,ll);
        }
    }
}