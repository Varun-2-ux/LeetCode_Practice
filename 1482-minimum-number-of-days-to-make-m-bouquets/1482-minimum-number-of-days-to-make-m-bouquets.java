class Solution {
     boolean possible(int[] arr, int day, int m, int k){
        int count = 0;
        int noofbloom = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]<=day){
                count++;
            }
            else{
                noofbloom = noofbloom + (count/k);
                count = 0;
            }
        }
            noofbloom = noofbloom + (count/k);
            return noofbloom >= m;  
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long totalneeded = (long)m*k;
        if(totalneeded > bloomDay.length){
            return -1;
        }
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        for(int w : bloomDay){
             low = Math.min(low,w);
             high = Math.max(high ,w); 
        }
        while(low<=high){
            int mid = low + (high - low)/2;
            if(possible(bloomDay,mid,m,k)){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}