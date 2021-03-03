// Time O(n) Space(1)
public int removeElement(int[] nums, int val) {
    int index = 0;
    for (int num: nums) {
        if (num != val) nums[index++] = num;
    }
    return index;
}