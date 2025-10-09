class Solution {
    public int maximumUnits(int[][] box, int truck) {
        int total = 0;

        Arrays.sort(box, (a,b) -> b[1]-a[1]);

        for(int i=0;i<box.length;i++){
            if(truck == 0){
                break;
            }
            if(truck >= box[i][0]){
                truck -= box[i][0];
                total= total + (box[i][0] * box[i][1]);
            }else{
                total= total + (truck * box[i][1]);
                truck =0;
            }
        }
        return total;
    }
}