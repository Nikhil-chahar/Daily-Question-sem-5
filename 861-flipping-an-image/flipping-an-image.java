class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i=0;i<image.length;i++){
            int len = image.length-1;
            int arr[] = new int[image.length];

            for(int j=0;j<image.length;j++){
                arr[len--] = image[i][j];
            }

            for(int j=0;j<image.length;j++){
                if(arr[j] == 0){
                    image[i][j] = 1;
                }else{
                    image[i][j] = 0;
                }
            }
        }
        return image;
    }
}
