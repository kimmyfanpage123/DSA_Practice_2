package trees.bstree_BasicTree;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree
{
	private TreeNode root;

	public BinarySearchTree()
	{
		root = null;
	}

	public void add(Comparable val)
	{
		root = add(val, root);
	}

	private TreeNode add(Comparable val, TreeNode tree)
	{
	   if(tree == null)
			tree = new TreeNode(val);
		
		Comparable treeValue = tree.getValue();
		int dirTest = val.compareTo(treeValue);
		
		
		if(dirTest < 0)
			tree.setLeft(add(val, tree.getLeft()));
		else if(dirTest > 0)
			tree.setRight(add(val, tree.getRight()));
		
		return tree;
	}

   public void inOrder()
	{
		inOrder(root);
		System.out.println("\n\n");
	}

	private void inOrder(TreeNode tree)
	{
		if (tree != null){
			inOrder(tree.getLeft());
			System.out.print(tree.getValue() + " ");
			inOrder(tree.getRight());
		}
	}

	//add preOrder, postOrder, and revOrder

	public void preOrder(){
		preOrder(root);
		System.out.println("\n\n");
	}
	private void preOrder(TreeNode tree){
		if (tree != null){
			System.out.print(tree.getValue() + " ");
			preOrder(tree.getLeft());
			preOrder(tree.getRight());
		}
	}

	public void postOrder(){
		postOrder(root);
		System.out.println("\n\n");
	}
	private void postOrder(TreeNode tree){
		if (tree != null){
			postOrder(tree.getLeft());
			postOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
		}
	}

	public void revOrder(){
		revOrder(root);
		System.out.println("\n\n");
	}
	private void revOrder(TreeNode tree){
		if (tree != null){
			revOrder(tree.getRight());
			System.out.print(tree.getValue() + " ");
			revOrder(tree.getLeft());
		}
	}


	public int getNumLevels()
	{
		return getNumLevels(root);
	}

	private int getNumLevels(TreeNode tree)
	{
		if(tree==null)
			return 0;
		else if(getNumLevels(tree.getLeft())>getNumLevels(tree.getRight()))
			return 1+getNumLevels(tree.getLeft());
		else
			return 1+getNumLevels(tree.getRight());
	}



	//add getNumLeaves, getDiameter, getHeight, getNumNodes, and isFull
	public int getNumLeaves(){
		return getNumLeaves(root);
	}
	private int getNumLeaves(TreeNode tree){
		if (tree == null){
			return 0;
		}
		else if (tree.getLeft() == null && tree.getRight() == null){
			return 1;
		}
		return getNumLeaves(tree.getLeft()) + getNumLeaves(tree.getRight());

	}

	public int getNumNodes(){
		return getNumNodes(root);
	}
	private int getNumNodes(TreeNode tree){
		if (tree == null){
			return 0;
		}
		int l = getNumNodes(tree.getLeft());
		int r = getNumNodes(tree.getRight());

		return 1 + l + r;
	}

	public int getHeight(){
		return getHeight(root);
	}
	private int getHeight(TreeNode tree){
		return getNumLevels(tree) - 1;
	}

	public int getDiameter(){
		return getDiameter(root);
	}
	private int getDiameter(TreeNode tree){
		return getHeight(tree.getLeft()) + getHeight(tree.getRight());
	}

	public boolean isFull(){
		return isFull(root);
	}
	private boolean isFull(TreeNode tree){
		if (tree == null){
			return true;
		}
		else if (tree.getLeft() == null && tree.getRight() == null){
			return true;
		}
		else if ((tree.getLeft() != null) && (tree.getRight() != null)){
			return (isFull(tree.getLeft()) && isFull(tree.getRight()));
		}
		return false;
	}

	public int getWidth(){
		return getWidth(root);
	}
	private int getWidth(TreeNode tree){
		if (tree == null){
			return 0;
		}

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		Queue<Integer> indices = new LinkedList<>();

		q.add(tree);
		indices.add(0);

		int maxWidth = 0;

		while (!q.isEmpty()){
			int size = q.size();
			int first = 0;
			int last = 0;
			int minIndex = indices.peek();

			for (int i = 0; i < size; i++){
				TreeNode node = q.poll();
				int currIndex = indices.poll() - minIndex;

				if (i == 0){
					first = currIndex;
				}
				if (i == size - 1){
					last = currIndex;
				}

				if (node.getLeft() != null){
					q.add(node.getLeft());
					indices.add(2*currIndex);
				}
				if (node.getRight() != null){
					q.add(node.getRight());
					indices.add(2*currIndex+1);
				}
			}
			maxWidth = Math.max(maxWidth, last - first + 1);
		}
		return maxWidth;
	}
	
	//add extra credit options here - 10 points each
	
	//search
	
	//maxNode
	
	//minNode
	
	//level order
	
	//display like a tree
	
	//remove


	public String toString()
	{
		return toString(root);
	}

	private String toString(TreeNode tree)
	{
		if (tree == null){
			return "";
		}
		else{
			return "" + toString(tree.getLeft()) + " " + tree.getValue() + " " + toString(tree.getRight());
		}
	}
}