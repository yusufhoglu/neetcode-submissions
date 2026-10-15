class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Length = s1.length();
        
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        String sortedS1 = new String(s1Array);
    
        for (int i = 0; i <= s2.length() - s1Length; i++) {;
            char[] substr = s2.substring(i, i+s1Length).toCharArray();
            Arrays.sort(substr);
            String sortedSubstr = new String(substr);
            if(sortedSubstr.equals(sortedS1)) return true;
        }
        return false;
    }
}