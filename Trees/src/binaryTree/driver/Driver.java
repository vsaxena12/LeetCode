package binaryTree.driver;
import java.util.*;
import binaryTree.binaryTreeConcepts.InorderIterator;

public class Driver
{
	public static void main(String[] args)
	{
		System.out.println("Testing...");
		//IdenticalTrees identical = new IdenticalTrees();
		//identical.isIdenticalTest();

    
	    List<Integer> input = new ArrayList<Integer>();
	    input.add(100);input.add(50);input.add(200);input.add(25);input.add(75);input.add(125);input.add(300);
	    input.add(12); input.add(35); input.add(60);
	    BinaryTreeNode root = BinaryTree.createBST(input);
	    System.out.print("Inorder Iterator = ");
	    System.out.println(inorderUsingIterator(root));
	  
			
	}
}