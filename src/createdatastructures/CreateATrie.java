package createdatastructures;

public class CreateATrie {

    // Solution: https://thedailybyte.dev/solution/85?token=cf45139d1a6659b1bfb4e819f62fff036c6778418d16dc5bc308d351b8e749fd
    // Runtime of insert and search: O(N) where N is the length of the string we’re inserting or searching for.
    // Space complexity of insert and search: O(N) where N is the length of the string and O(1) respectively.
    class Node {
        public Node[] children;
        public String word;

        public Node() {
            children = new Node[26];
            word = "";
        }
    }

    class Trie {
        private Node root;

        public Trie() {
            root = new Node();
        }

        public void insert(String word) {
            Node current = root;
            for (char c : word.toCharArray()) {
                if (current.children[c - 'a'] == null) {
                    current.children[c - 'a'] = new Node();
                }
                current = current.children[c - 'a'];
            }

            current.word = word;
        }

        public boolean search(String word) {
            Node current = root;
            for (char c : word.toCharArray()) {
                if (current.children[c - 'a'] == null) {
                    return false;
                }

                current = current.children[c - 'a'];
            }

            return current.word.equals(word);
        }
    }
}
