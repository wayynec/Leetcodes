// Time O(n) Space O(n)
public int[] sortedSquares(int[] nums) {
	int n = nums.length;
	int[] result = new int[n];
	int left = 0;
	int right = n - 1;
	for (int j=n-1; j>=0; j--) {
		if(Math.abs(nums[left]) < Math.abs(nums[right])) {
			result[j] = nums[right] * nums[right];
			right--;
		} else {
			result[j] = nums[left] * nums[left];
			left++;
		}
	}
	return result;
}