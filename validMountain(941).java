// Time O(n) Space O(1)
public boolean validMountainArray(int[] arr) {
        int n = arr.length, i = 0, j = n-1;
        while (i < n-1 && arr[i] < arr[i+1]) {
            i++;
        }
        while (j > 0 && arr[j-1] > arr[j]) {
            j--;
        }
        return i==j && i>0 && j<n-1;
}