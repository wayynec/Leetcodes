//sol1 brute force Time O(n^2) Space O(1)

//sol2 Hash Map Time O(n) Space O(n)
public int[] twoSum(int[] nums, int target) {
	int[] result = new int[2];
	Map<Integer, Integer> map = new HashMap();

	for (int i=0; i<nums.length; i++) {
		if (map.containsKey(target-nums[i])) {
			result[1] = i;
			result[0] = map.get(target-nums[i]);
			return result;
		}
		map.put(nums[i], i);
	}
	return result;
}