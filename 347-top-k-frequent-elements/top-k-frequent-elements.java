class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int arr[][] = new int[map.size()][2];
        int ind=0;

        for(int key : map.keySet()){
            arr[ind][0] = key;
            arr[ind][1] = map.get(key);
            ind++;
        }
        Arrays.sort(arr, (a,b) ->b[1]-a[1]);

        // for(int i=0;i<arr.length;i++){
        //     System.out.println(arr[i][0] +" " +arr[i][1]);
        // }
        
        int ans[] = new int[k];
        for(int i=0;i<k;i++){
            ans[i] = arr[i][0];
        }
        // System.out.print(ll);
        // for(int i=0;i<ans.length;i++){
        //     ans[i] = ll.get(i);
        // }
        
        return ans;
    }
}