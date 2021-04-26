package binaryTree.binarySearch;
import binaryTree.binarySearch.BST_Iteration;
import binaryTree.binaryNode.Node;

public interface BST
{
	public void insert(int data);
	public void inOrder(Node node);
	public void preOrder(Node node);
	public void postOrder(Node node);
}