class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        // find the break point
        for(int i = n-2;i>=0;i--){
            if(nums[i+1]>nums[i]){
            index = i;
            break;
        }
    }
         
         if(index == -1){
            Arrays.sort(nums);
            return;
         }
        // find the just greater number and swap
        for(int  i = n-1;i> index;i--){
            if(nums[index] < nums[i]){
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;  
            }
        }
        Arrays.sort(nums, index+ 1, n);
    }
}
