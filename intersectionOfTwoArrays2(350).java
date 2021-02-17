// sol1: Time O(m+n) Space O(min(m,n))
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            intersect(nums2, nums1);
        }
        Map<Integer, Integer> map = new HashMap();
        for (int num: nums1) {
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        
        List<Integer> list = new ArrayList();
        for (int num: nums2) {
            int count = map.getOrDefault(num, 0);
            if (count > 0) {
                list.add(num);
                map.put(num, count-1);
            }
        }
        
        int[] result = new int[list.size()];
        int i = 0;
        for (int num: list) {
            result[i++] = num;
        }
        return result;
    }
}

// sol2: Time O(mlogm+nlogn) Space(1) constant space for our algorithm
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> list = new ArrayList();
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                list.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]){
                i++;
            }else {
                j++;
            }
        }
        int[] result = new int[list.size()];
        int k = 0;
        for (int num: list) {
            result[k++] = num;
        }
        return result;
    }
}