public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0, sum = 0, digit = 0;
        while (i >= 0 || j >= 0) {
            sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            carry = sum / 2;
            digit = sum % 2;
            sb.append(digit);
        }
        if (carry > 0) sb.append(carry);
        return sb.reverse().toString();
    }