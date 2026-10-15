class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<>();
        for (char c : s1.toCharArray()) {
            s1Map.put(c, s1Map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            Map<Character, Integer> s2SubstrMap = new HashMap<>();
            for (char c : s2.substring(i, i + s1.length()).toCharArray()) {
                s2SubstrMap.put(c, s2SubstrMap.getOrDefault(c, 0) + 1);
            }
            if (s1Map.equals(s2SubstrMap)) return true;
        }
        return false;
    }
}