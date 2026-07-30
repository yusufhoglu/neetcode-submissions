class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word: strs) {
            int[] charArr = new int[26];
            for (char c: word.toCharArray()) {
                charArr[c-'a']++;
            }
            String key = Arrays.toString(charArr);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());        
    }
}
