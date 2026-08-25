class Solution {
    public int missingMultiple(int[] nums, int k) {
        int pro =  1;
        while(true){
            int ans = pro*k;
            boolean key = false;

            for(int num : nums){
                if(num == ans){
                  key = true;
                  break;
                }
            }
                if(!key){
                return ans;
                }

            pro++;
          
        }
    }
}