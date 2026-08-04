class Solution {
    public int countSubstrings(String s) {
        int palCount = 0;
        int idx = 0;
        for (int i = 0; i < s.length(); i++) {
            //odd
            int l = i, r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                palCount++;
                l--;
                r++;
            }

            //even
            l = i;
            r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                palCount++;
                l--;
                r++;
            }
        }
        return palCount;
    }
}
