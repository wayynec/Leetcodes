class Solution {
	public void moveZeroes(int[] nums) {
		for (int i=0, j=0; i<nums.length && j<nums.length; j++) { // j is faster pointer
			if (nums[j] != 0) {
				// if j is not 0, then we swap
				int temp = nums[i];
				nums[i++] = nums[j];
				nums[j] = temp;
			}
		}
	}
}