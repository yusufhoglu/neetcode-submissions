class Solution {
    public boolean isPalindrome(String s) {
        String cleanS = s.replace(" ", "");
        cleanS = s.replaceAll("[^a-zA-Z0-9]", "");
        cleanS = cleanS.toLowerCase();
        char[] arr = cleanS.toCharArray();
        int i = 0, k = cleanS.length() - 1;

        while (i < k) {
            if(arr[i] == arr[k]) {
                i++;
                k--;
            } else {
                return false;
            }
        }
        return true;
    }
}
