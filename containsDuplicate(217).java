// Sol. 1: Brute force: Time O(n^2) Space O(1) 

// Sol.2: sort: Time O(nlogn) Space O(1)
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; i++) {
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}

// Sol.3: Hashtable: Time O(n) Space O(n) extra space for hash table
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int num: nums) {
        	if (set.contains(num)) {
        		return true;
        	}
        	set.add(num);
        }
        return false;
    }
}