class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int pos = 0;  // index for placing positive numbers (even indices)
        int neg = 1;  // index for placing negative numbers (odd indices)

        for (int num : nums) {
            if (num > 0) {
                result[pos] = num;
                pos += 2;
            } else {
                result[neg] = num;
                neg += 2;
            }
        }

        return result;
    }
}
