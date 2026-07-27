class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length;
        int pro = (nums[i-1] - 1 ) *(nums[i-2] - 1);

        return pro;
        
            }
        }
        