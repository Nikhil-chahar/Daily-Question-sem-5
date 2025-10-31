class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int count=0;
            for(int j=i;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if(count == 2){
                arr.add(nums[i]);
            }

        }
        int arr2[] = new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            arr2[i] = arr.get(i);
        }
        return arr2;
    }
}
