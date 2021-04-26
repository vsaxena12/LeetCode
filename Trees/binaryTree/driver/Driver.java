package driver;
import java.util.*;
import binarySearch.BST_Iteration;
import binarySearch.BST;
import binaryNode.Node;



public class Driver
{
	public static void main(String[] args)
	{
		//System.out.println("Testing...");
		//IdenticalTrees identical = new IdenticalTrees();
		//identical.isIdenticalTest();
		Scanner scanner = new Scanner(System.in);
		Node root = null;
		BST_Iteration bst = new BST_Iteration();
		bst.insert(10);
		bst.insert(5);
		bst.insert(20);
		bst.insert(8);
		bst.insert(30);
		bst.insert(1);
		bst.insert(30);
		
		bst.inOrder(bst.root);
		System.out.print("\n");
		bst.preOrder(bst.root);
		System.out.print("\n");
		bst.postOrder(bst.root);

		//bst.search();





		bst.search(root, 30);

		//System.out.println("Element: "+root);
		
		
			
	}
}