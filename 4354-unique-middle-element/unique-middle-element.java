class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int a = nums[nums.length/2] ; 
        int count = 0 ; 
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] == a){
                count++;
            }
        }
        if(count == 1){
            return true;

        }
        else{
            return false;
        }
        
    }
}