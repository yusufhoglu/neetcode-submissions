class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1Length = s1.length();
        int idx = 0;
        
        char[] s1Array = new char[s1Length];
        for(char c: s1.toCharArray()) {
            s1Array[idx++] = c;
        }        
        Arrays.sort(s1Array);

        for (int i = 0; i <= s2.length() - s1Length; i++) {
            idx = 0;
            char[] substr = new char[s1Length];
            for(int j = i; j < i+s1Length; j++) {
                substr[idx++] = s2.charAt(j);
            }
            Arrays.sort(substr);
            if(Arrays.equals(s1Array, substr)) return true;
        }
        return false;
    }
}
