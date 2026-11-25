class Solution {
     int sum(int[] arr, int div){
        int sum = 0;
        for(int i = 0;i<arr.length;i++){
            int c = (int)Math.ceil((double)arr[i]/div);
            sum = sum + c;
        }
        return sum;
     }

    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1;
        int high = nums[0];
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>high)
                high = nums[i];   
        }
         while(low<=high){
            int mid = (low+high)/2;
            if(sum(nums,mid)<=threshold){
                high = mid - 1;
            }
           else{
            low = mid + 1;
           }
         }
         return low;
    }
}