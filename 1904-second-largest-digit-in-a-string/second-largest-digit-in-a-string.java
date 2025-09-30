class Solution {
    public int secondHighest(String s) {
        
       List<Integer> ll = new ArrayList<>();
    

       for(int i =0;i<s.length();i++){
            int val = s.charAt(i)-'0';
            if(val >=0 && val <=9){
                ll.add(val);
            }
       } 
       if(ll.size() ==0){
        return -1;
       }
       Collections.sort(ll);
       int val = ll.get(ll.size()-1);
       int ind=ll.size()-2;

       while(ind >=0 && val == ll.get(ind)){
        ind--;
       }
       if(ind <0){
        return -1;
       }else{
        return ll.get(ind);
       }


       
    }
}