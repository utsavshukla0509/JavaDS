package testthecode11;

public class TriesClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tries trie = new Tries();
		trie.addWord("art");
		trie.addWord("arts");
		trie.addWord("bug");
		trie.addWord("boy");
		trie.addWord("sea");
		trie.addWord("see");
		trie.addWord("seen");
		trie.display();

		System.out.println("**************");
		trie.displayAsTree();
		
		//System.out.println(trie.search("artist"));
		
		trie.remove("arts");
		System.out.println("**************");
		trie.displayAsTree();
		System.out.println("**************");
		trie.remove("art");
		trie.displayAsTree();

	}

}
