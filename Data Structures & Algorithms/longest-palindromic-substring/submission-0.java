class Solution {
    public String longestPalindrome(String s) {
        int longestLength = 0;
        int idx = 0;
        for(int i = 0; i < s.length(); i++) {
            //odd
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r) ) {
                if (longestLength < (r-l + 1)) {
                    idx= l;
                    longestLength = r-l+1;
                }
                l--;
                r++;
            }
            //even
            l = i;
            r = i+1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r) ) {
                    if (longestLength < (r-l + 1)) {
                        idx= l;
                        longestLength = r-l+1;
                    }
                    l--;
                    r++;
            }
        }
        return s.substring(idx, idx + longestLength);
    }
}
