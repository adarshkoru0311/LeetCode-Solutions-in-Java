class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (nums[i] != val)
                nums[count++] = nums[i];
        }
        return count;
    }
}