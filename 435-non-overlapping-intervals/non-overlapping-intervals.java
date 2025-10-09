class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> a[1]-b[1]);

        for(int i=0;i<intervals.length;i++){
            System.out.println(intervals[i][0] + " " +intervals[i][1]);
        }

        int fi = intervals[0][1];
        int over=0;

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0] < fi){
                over++;
            }else{
                fi = intervals[i][1];
            }
        }
        return over;
    }
}