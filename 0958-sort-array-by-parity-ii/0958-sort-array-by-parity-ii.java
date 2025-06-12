class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
         int even=0;
        int odd=1;
 while (even < n && odd < n) {
            // If number at even index is correct, move forward
            if (nums[even] % 2 == 0) {
                even += 2;
            }
            // If number at odd index is correct, move forward
            else if (nums[odd] % 2 == 1) {
                odd += 2;
            }
            // Else, swap misplaced elements
            else {
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
                even += 2;
                odd += 2;
            }
        }

        return nums;
    }
}