class TrieNode {
    // Initialize your data structure here.
    char c;
    HashMap<Character, TrieNode> child = new HashMap<Character, TrieNode>();
    boolean hasWord;
    public TrieNode() {

    }
    public TrieNode(char c) {
        this.c = c;
    }
}

public class Trie {
    private TrieNode root;
    
    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        HashMap<Character, TrieNode> curtMap = root.child;
        TrieNode curtNode = null;
        for(int i=0; i<word.length(); i++) {
            if(curtMap.containsKey(word.charAt(i))) {
                curtNode = curtMap.get(word.charAt(i));
                curtMap = curtNode.child;
            } else {
                curtMap.put(word.charAt(i), new TrieNode(word.charAt(i)));
                curtNode = curtMap.get(word.charAt(i));
                curtMap = curtNode.child;
            }
            if(i == word.length()-1) {
                curtNode.hasWord = true;
            }
        }
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        if(getPos(word) == null || !getPos(word).hasWord) {
            return false;
        } else {
            return true;   
        }
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        if(getPos(prefix) != null) {
            return true;
        } else {
            return false;
        }
    }
    public TrieNode getPos(String word) {
        HashMap<Character, TrieNode> curtMap = root.child;
        TrieNode curtNode = null;
        for(int i=0; i<word.length(); i++) {
            if(!curtMap.containsKey(word.charAt(i))) {
                return null;
            } else {
                curtNode = curtMap.get(word.charAt(i));
                curtMap = curtNode.child;
            }
        }
        return curtNode;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
