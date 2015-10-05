public class WordDictionary {
    TrieNode node = new TrieNode();
    // Adds a word into the data structure.
    public void addWord(String word) {
        TrieNode curtNode = node;
        HashMap<Character, TrieNode> curtMap = node.child;
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

    // Returns if the word is in the data structure. A word could
    // contain the dot character '.' to represent any one letter.
    public boolean search(String word) {
        return searchWord(word, node);
    }
    public boolean searchWord(String word, TrieNode node) {
        if(word == null|| word.length()==0) {
            return node.hasWord;
        }
        if(node == null ) {
            return false;
        }
        TrieNode curtNode = node;
        HashMap<Character, TrieNode> curtMap = node.child;
        if(curtMap.containsKey(word.charAt(0))) {
            return searchWord(word.substring(1), curtMap.get(word.charAt(0)));
        } else if(word.charAt(0)=='.'){
            for(char k:curtMap.keySet()) {
                if(searchWord(word.substring(1), curtMap.get(k))) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

}

class TrieNode{
    char c;
    HashMap<Character, TrieNode> child = new HashMap<Character, TrieNode>();
    boolean hasWord;
    public TrieNode() {
        
    }
    public TrieNode(char c){
        this.c = c;
    }
}
// Your WordDictionary object will be instantiated and called as such:
// WordDictionary wordDictionary = new WordDictionary();
// wordDictionary.addWord("word");
// wordDictionary.search("pattern");
