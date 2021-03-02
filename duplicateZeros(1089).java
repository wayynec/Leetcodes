// Time O(n) Space O(1)
public void duplicateZeros(int[] arr) {
    int n = arr.length;
    int zeros = 0;
    for (int num: arr) {
        if (num == 0) zeros++;
    }
    int j = n-1;
    int write = n-1+zeros;
    while (j>=0 && write>=0) {
        if (arr[j] != 0) {
            if (write < n) arr[write] = arr[j];
        } else {
            if (write < n) arr[write] = 0;
            write--;
            if (write < n) arr[write] = 0;
        }
        j--;
        write--;
    }
}