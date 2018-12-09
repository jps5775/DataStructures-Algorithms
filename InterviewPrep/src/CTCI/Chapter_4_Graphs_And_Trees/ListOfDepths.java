package CTCI.Chapter_4_Graphs_And_Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import DataStructures.TreeNode;

public class ListOfDepths {

	
	private ArrayList<LinkedList<TreeNode>> createLevelLL(TreeNode root) {
		ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
		createLevelLL(root, lists, 0);
		return lists;
	}
	
	public void createLevelLL(TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
		if(root == null) { return; }
		
		LinkedList<TreeNode> listToAdd = null;
		if(lists.size() == level) {
			listToAdd = new LinkedList<TreeNode>();
			lists.add(listToAdd);
		}else {
			listToAdd = lists.get(level);
		}
		listToAdd.add(root);
		createLevelLL(root.left, lists, level + 1);
		createLevelLL(root.right, lists, level + 1);
	}
	
	
	public static void main(String[] args) {
		
	}
	
}
