package testthecode11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Tries {
	private class Node {
		char data;
		HashMap<Character, Node> children;
		boolean isTerminal;

		Node(char data, boolean isTerminal) {
			this.data = data;
			this.isTerminal = isTerminal;
			this.children = new HashMap<>();
		}
	}

	private Node root;
	private int numWords;

	public Tries() {
		// TODO Auto-generated constructor stub
		this.root = new Node('\0', false);
		this.numWords = 0;
	}

	public void addWord(String word) {
		this.addWord(this.root, word);
	}

	private void addWord(Node node, String word) {
		if (word.length() == 0) {
			if (node.isTerminal) {

			} else {
				node.isTerminal = true;
				this.numWords++;
			}
			return;
		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = node.children.get(cc);
		if (child == null) {
			child = new Node(cc, false);
			node.children.put(cc, child);
		}
		this.addWord(child, ros);
	}

	public void display() {
		this.display(this.root, "");
	}

	private void display(Node node, String osf) {
		if (node.isTerminal) {
			String toprint = osf.substring(1) + node.data;
			System.out.println(toprint);
		}
		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
		for (Map.Entry<Character, Node> entry : entries) {
			this.display(entry.getValue(), osf + node.data);
		}
	}

	public void displayAsTree() {
		this.displayAsTree(this.root);
	}

	private void displayAsTree(Node node) {
		String str = "";
		str = str + node.data + "=>";
		Set<Map.Entry<Character, Node>> entries = node.children.entrySet();
		for (Map.Entry<Character, Node> entry : entries) {
			str = str + entry.getKey() + ", ";
		}
		str = str + "END";
		System.out.println(str);
		for (Map.Entry<Character, Node> entry : entries) {
			this.displayAsTree(entry.getValue());
		}
	}

	public boolean search(String word) {
		return this.search(this.root, word);
	}

	private boolean search(Node node, String word) {

		if (word.length() == 0) {
			if (node.isTerminal) {
				return true;
			} else {
				return false;
			}

		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = node.children.get(cc);
		if (child == null) {
			return false;
		}
		return this.search(child, ros);
	}

	public void remove(String word) {
		this.remove(this.root, word);
	}

	private void remove(Node parent, String word) {
		if (word.length() == 0) {
			if (parent.isTerminal) {
				parent.isTerminal = false;
				this.numWords--;
			} else {
				// parent is part of some other word
			}
			return;

		}
		char cc = word.charAt(0);
		String ros = word.substring(1);
		Node child = parent.children.get(cc);
		if (child == null) {
			return;
		}
		this.remove(child, ros);
		if (!child.isTerminal && child.children.size() == 0) {
parent.children.remove(cc);
		}

	}

}
