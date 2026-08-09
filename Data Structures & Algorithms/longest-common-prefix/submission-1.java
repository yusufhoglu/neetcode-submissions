class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 1) return strs[0];
        String result = "";
        for(int j = 0; j < strs[0].length(); j++) {
            for(int i = 1; i < strs.length; i++) {
                if(j >= strs[i].length()) return result;
                if(strs[i].charAt(j) != strs[i-1].charAt(j)) {
                    return result;
                } else if(i == strs.length - 1) {
                    result += strs[i].charAt(j);
                }
            }
        }

        return result;
    }
}