public int myAtoi(String s) {
    if (s == null || s.length() == 0) return 0;
    
    int n = s.length();
    int sign = 1;
    int res = 0;
    int i = 0;
    
    while (i < n && s.charAt(i) == ' ') i++;
    if (i < n && (s.charAt(i) == '-' || s.charAt(i) == '+')) {
        sign = s.charAt(i) == '-' ? -1 : 1;
        i++;
    } 
    while (i< n && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
        if(res > Integer.MAX_VALUE/10 || res == Integer.MAX_VALUE/10 && (s.charAt(i) - '0') > Integer.MAX_VALUE%10) {
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        
        res = res*10 + (s.charAt(i) - '0'); 
        i++;
        
    }      
    return res*sign;                
}