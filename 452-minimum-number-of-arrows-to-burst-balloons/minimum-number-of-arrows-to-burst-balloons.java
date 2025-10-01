class Solution {
    public int findMinArrowShots(int[][] points) {
        if(points.length <2){
            return points.length;
        }
        Arrays.sort(points,(a,b) -> Integer.compare(a[1],b[1]));
        int c=1;
        int val = points[0][1];
        for(int i=1;i<points.length;i++){
            if(val < points[i][0]){
                c++;
                val = points[i][1];
            }
        }

        return c;
        
    }
}