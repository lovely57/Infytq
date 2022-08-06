1. VALIDATE BST 
// Java program to check if a given tree is BST.
class Sol
{
static class Node
{
	int data;
	Node left, right;
};
static boolean isBST(Node root, Node l, Node r)
{
	// Base condition
	if (root == null)
		return true;
	if (l != null && root.data <= l.data)
		return false;
	if (r != null && root.data >= r.data)
		return false;
	return isBST(root.left, l, root) &&
		isBST(root.right, root, r);
}
static Node newNode(int data)
{
	Node node = new Node();
	node.data = data;
	node.left = node.right = null;
	return (node);
}
public static void main(String args[])
{
	Node root = newNode(3);
	root.left = newNode(2);
	root.right = newNode(5);
	root.left.left = newNode(1);
	root.left.right = newNode(4);

	if (isBST(root,null,null))
		System.out.print("Is BST");
	else
		System.out.print("Not a BST");
}
}
2. PREORDER, POSTORDER, INORDER TRAVERSAL 
class Node {
	int key;
	Node left, right;

	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

class BinaryTree {
	Node root;

	BinaryTree() { root = null; }
	void printPostorder(Node node)
	{
		if (node == null)
			return;
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(node.key + " ");
	}
	void printInorder(Node node)
	{
		if (node == null)
			return;
		printInorder(node.left);
		System.out.print(node.key + " ");
		printInorder(node.right);
	}
	void printPreorder(Node node)
	{
		if (node == null)
			return;
		System.out.print(node.key + " ");
		printPreorder(node.left);
		printPreorder(node.right);
	}
	void printPostorder() { printPostorder(root); }
	void printInorder() { printInorder(root); }
	void printPreorder() { printPreorder(root); }
	public static void main(String[] args)
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

		System.out.println(
			"Preorder traversal of binary tree is ");
		tree.printPreorder();

		System.out.println(
			"\nInorder traversal of binary tree is ");
		tree.printInorder();

		System.out.println(
			"\nPostorder traversal of binary tree is ");
		tree.printPostorder();
	}
}

3.LEVEL ORDER TRAVERSAL
class Node {
	int data;
	Node left, right;
	public Node(int item)
	{
		data = item;
		left = right = null;
	}
}

class BinaryTree {
	Node root;
	public BinaryTree() { root = null; }
	void printLevelOrder()
	{
		int h = height(root);
		int i;
		for (i = 1; i <= h; i++)
			printCurrentLevel(root, i);
	}
	int height(Node root)
	{
		if (root == null)
			return 0;
		else {
			/* compute height of each subtree */
			int lheight = height(root.left);
			int rheight = height(root.right);

			/* use the larger one */
			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}
	void printCurrentLevel(Node root, int level)
	{
		if (root == null)
			return;
		if (level == 1)
			System.out.print(root.data + " ");
		else if (level > 1) {
			printCurrentLevel(root.left, level - 1);
			printCurrentLevel(root.right, level - 1);
		}
	}

	public static void main(String args[])
	{
		BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);

	System.out.println("Level order traversal ");
	tree.printLevelOrder();
	}
}

4. DFS
import java.io.*;
import java.util.*;
class Graph {
	private int V;
	private LinkedList<Integer> adj[];
	@SuppressWarnings("unchecked") Graph(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}
	void addEdge(int v, int w)
	{
		adj[v].add(w);
	}
	void DFSUtil(int v, boolean visited[])
	{
		visited[v] = true;
		System.out.print(v + " ");
		Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext()) {
			int n = i.next();
			if (!visited[n])
				DFSUtil(n, visited);
		}
	}
	void DFS(int v)
	{
		boolean visited[] = new boolean[V];
		DFSUtil(v, visited);
	}
	public static void main(String args[])
	{
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println(
			"Following is Depth First Traversal "
			+ "(starting from vertex 2)");

		g.DFS(2);
	}
}


5. BFS
import java.io.*;
import java.util.*;
class Graph
{
	private int V;
	private LinkedList<Integer> adj[];
	Graph(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i)
			adj[i] = new LinkedList();
	}
	void addEdge(int v,int w)
	{
		adj[v].add(w);
	}
	void BFS(int s)
	{
		boolean visited[] = new boolean[V];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[s]=true;
		queue.add(s);

		while (queue.size() != 0)
		{
			s = queue.poll();
			System.out.print(s+" ");
			Iterator<Integer> i = adj[s].listIterator();
			while (i.hasNext())
			{
				int n = i.next();
				if (!visited[n])
				{
					visited[n] = true;
					queue.add(n);
				}
			}
		}
	}
	public static void main(String args[])
	{
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 0);
		g.addEdge(2, 3);
		g.addEdge(3, 3);

		System.out.println("Following is Breadth First Traversal "+
						"(starting from vertex 2)");

		g.BFS(2);
	}
}

