//Sol 1
public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    Arrays.sort(strs);
    String prefix = strs[0];
    int i = 0;
    while (i < prefix.length() && prefix.charAt(i) == strs[strs.length-1].charAt(i)) {
        i++;
    }
    return prefix.substring(0, i);
}

// Sol 2
public String longestCommonPrefix(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++) {
        int j = 0;
        while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
            j++;
        }
        if (j == 0) return "";
        prefix = prefix.substring(0, j);
    }
    return prefix;
}