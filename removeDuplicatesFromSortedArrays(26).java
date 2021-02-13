// two pointers: i tracks the current unique number, when i and j differ, increment i and replace it by next unique number j
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {return 0;}
        if (nums.length ==1 ) {return 1;}
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
        	if (nums[i] != nums[j]) {
        		nums[++i] = nums[j];
        	}
        }
        return i + 1;
    }
}