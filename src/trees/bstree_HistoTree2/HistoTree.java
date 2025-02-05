package trees.bstree_HistoTree2;//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

import trees.bstree_HistoTree1.HistoNode;

public class HistoTree
{
   private TreeNode root;

	public HistoTree( )
	{
		root = null;
	}

	public void addData(Comparable data)
	{
		if (search(data) == null){
			root = add(data, root);
		}
		else{
			TreeNode found = search(data);
		}
	}

	private TreeNode add(Comparable data, TreeNode tree)
	{
		if (tree == null){
			return new TreeNode(data, null, null);
		}
		else{
			int dirTest = data.compareTo(tree.getValue());

			// add the node
			if (dirTest < 0){
				tree.setLeft(add(data, tree.getLeft()));
			}
			else if (dirTest > 0){
				tree.setRight(add(data, tree.getRight()));
			}
		}
		return tree;
	}

	private TreeNode search(Comparable data)
	{
		return search(data, root);
	}

	private TreeNode search(Comparable data, TreeNode tree)
	{
		if (tree == null){
			return null;
		}

		int dirTest = data.compareTo(tree.getValue());

		if(dirTest == 0){
			return tree;
		}
		else if (dirTest < 0){
			search(data, tree.getLeft());
		}
		else{
			search(data, tree.getRight());
		}


		return null;
	}

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