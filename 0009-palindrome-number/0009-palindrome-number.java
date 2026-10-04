class Solution {
    public boolean isPalindrome(int x) {
        int num = x;
       if(x<0 ){
        return false;
       }
       int r = 0;
       while(x>0){
        int v = x%10;
        r = r*10 + v;
        x = x/10;
       }
       if(num == r){
        return true;
       }
       else{
        return false;
       }


    }
}

// class Solution {
//     public boolean isPalindrome(int x) {
//        if(x<0 || (x%10 == 0 && x!=0)){
//         return false;
//        }
//        int r = 0;
//        while(x>r){
//         int v = x%10;
//         r = r*10 + v;
//         x = x/10;
//        }
//        return(x==r || x==r/10);

//     }
// }