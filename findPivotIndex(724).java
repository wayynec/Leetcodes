// Time O(n) Space O(1)
public int pivotIndex(int[] nums) {
    int total = 0;
    for (int num: nums) total += num;
    int left_sum = 0;
    for (int i = 0; i < nums.length; left_sum += nums[i++]) {
        if (2 * left_sum == total - nums[i]) return i;
    }
    return -1;
}