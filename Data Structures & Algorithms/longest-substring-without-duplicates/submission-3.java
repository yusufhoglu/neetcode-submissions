class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> set = new HashMap<>();
        int longestSize = 0;
        int index = 0;
        for (char c: s.toCharArray()) {
            if (set.containsKey(c) == false) {
                set.put(c, index);
                longestSize = Math.max(set.size(), longestSize);
            } else {
                int prevIndex = set.get(c);
                set.entrySet().removeIf(entry -> entry.getValue() <= prevIndex);
                set.put(c, index);
                longestSize = Math.max(set.size(), longestSize);
            }
            index++;
        }

        return longestSize;
    }
}
