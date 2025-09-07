class Solution {
    public int[] sumZero(int n) {

        int arr[] = new int[n];
        int ind=0;
        for(int i=-n/2;i<=n/2;i++){

            if(i==0){
                if(n%2!=0){
                    arr[ind++] = i;
                }
            }else{
                arr[ind++] = i;
            }
        }
        return arr;
    }
}
