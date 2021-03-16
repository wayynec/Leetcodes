// Time O(n) Space O(1)
public int dominantIndex(int[] nums) {
        int largest = -1, second = -1, index = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                second = largest;
                largest = nums[i];
                index = i;
            } else if (nums[i] > second) second = nums[i];
        }
        return second * 2 > largest ? -1 : index;
}