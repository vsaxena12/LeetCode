package binaryTree.binarySearch;
import binaryTree.binaryNode.Node;

public class BST_Iteration implements BST
{
	
	public Node root = null;

	public void insert(int num)
	{
		Node node = new Node();
		node.data = num;

		if(root == null)
		{
			root = node;
			node.left = null;
			node.right = null;
		}
		else
		{
			Node temp = root;
			while(temp != null)
			{
				if(num <= temp.data)
				{
					if(temp.left == null)
					{
						temp.left = node;
						break;
					}
					temp = temp.left;
				}

				if(num > temp.data)
				{
					if(temp.right == null)
					{
						temp.right = node;
						break;
					}
					temp = temp.right;
				}

				else
				{
					return;
				}
			}
		}
	}

	
	public Node search(Node temp, int key)
	{
		//Node temp = root;
		if(temp == null)
			return null;
		
		if(temp.data == key)
		{
			System.out.println("Print: "+temp.data);
			return temp;
		}
		
		else if(temp.data < key)
		{
			System.out.println(temp.data);
			return search(root.right, key);
		}
		
		else 
		{
			System.out.println(temp.data);
			return search(root.left, key);
		}
		
		/*
			while(temp != null)
			{
				if(key == temp.getData())
				{
					return temp;
				}
				else if(key < temp.getData())
				{
					temp = temp.getNodeLeft();
				}
				else if(key > temp.getData())
				{
					temp = temp.getNodeRight();
				}
			}
			return null;
		*/
		//return temp;

	}


	/*
	 *	In-Order Traversal
	 */
	public void inOrder(Node node)
	{
		if(node !=  null) 
		{
			inOrder(node.left);
			System.out.println("In-Order: "+node.data);
			inOrder(node.right);
		}
	}

	/*
	 *	Pre-Order Traversal
	 */
	public void preOrder(Node node)
	{
		if(node !=  null) 
		{
			System.out.println("Pre-Order: "+node.data);
			preOrder(node.left);
			preOrder(node.right);
		}
		
	}

	/*
	 *	Post-Order Traversal
	 */
	public void postOrder(Node node)
	{
		if(node !=  null) 
		{
			postOrder(node.left);
			postOrder(node.right);
			System.out.println("Post-Order: "+node.data);
		}
		
	}

}