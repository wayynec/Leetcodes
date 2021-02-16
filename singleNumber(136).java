// sol1: bitwise xor Time O(n) Space O(1)
public int singleNumber(int[] nums) {
	int result;
	for (int i = 0; i < nums.length; i++) {
		result ^= nums[i];
	}
	return result;
}

// sol2: hash set Time O(n) Space O(n)
public int singleNumber(int[] nums) {
	int result = 0;
	Set<Integer> set = new HashSet<>();
	for (int num: nums) {
		if (!set.contains(num)) {
			set.add(num);
			result += num;
		}else{
			result -= num;
		}
	}
	return result;
}