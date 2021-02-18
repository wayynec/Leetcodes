// Time: O(n) Space: O(1)
public int[] plusOne(int[] digits) {
	for (int j=digits.length-1; j>=0; j--) {
		if (digits[j] < 9) {
			digits[j]++;
			return digits;
		}
		digits[j] = 0;
	}
	//handles when array is 999->1000
	int[] result = new int[digits.length+1];
	result[0] = 1; //others are 0 by default
	return result;
}