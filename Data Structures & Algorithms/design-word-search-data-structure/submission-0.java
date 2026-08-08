class TrieNode {
    boolean isWord;
    HashMap<Character, TrieNode> map = new HashMap<>();
}

class WordDictionary {
    TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode curr = root;
        for (char c: word.toCharArray()) {
            if (!curr.map.containsKey(c) ) {
                curr.map.put(c, new TrieNode());
            }
            curr = curr.map.get(c);
        }
        curr.isWord = true;
    }

    public boolean search(String word) {
        return dfs(root, word, 0);
    }

private boolean dfs(TrieNode node, String word, int idx) {
    if (idx == word.length()) {
        return node.isWord;
    }
    
    char c = word.charAt(idx);
    
    if (c == '.') {
        for (TrieNode child : node.map.values()) {
            if (dfs(child, word, idx + 1)) {
                return true;
            }
        }
        return false;
    } else {
        if (!node.map.containsKey(c)) {
            return false;
        }
        return dfs(node.map.get(c), word, idx + 1);
    }
}
}
