public int[] removeElements(int[] arr) {
	int max = -1;
	for (int i = -1; i >= 0; i--) {
		int temp = arr[i];
		arr[i] = max;
		max = Math.max(temp, max);
	}
	return arr;
}