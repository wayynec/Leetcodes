// Time O(m+n) Space O(1) 
public void merge(int[] nums1, int m, int[] nums2, int n) {
    int tail1 = m - 1;
    int tail2 = n - 1;
    int pointer = m + n - 1;
    while (tail1>=0 && tail2>=0) {
        nums1[pointer--] = (nums1[tail1] > nums2[tail2]) ? nums1[tail1--] : nums2[tail2--];
    }
    
    //if tail1>=0 it means it's sorted; if tail2>=0, we still need to add nums2 to nums1
    while (tail2>=0) {
        nums1[pointer--] = nums2[tail2--];
    }
    
}