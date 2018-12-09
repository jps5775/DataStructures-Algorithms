package CTCI.Chapter_4_Graphs_And_Trees;
import DataStructures.BST.*;
public class MinimalTree {
	
	public static BSTNode convertToBST(int[] arr) {
		return convertToBST(arr, 0, arr.length - 1);
	}
	
	public static BSTNode convertToBST(int[] arr, int start, int end) {
		if(start > end) { return null; }
		int mid = (start + end) / 2;
		BSTNode n = new BSTNode("", arr[mid]);
		n.left = convertToBST(arr, start, mid - 1);
		n.right = convertToBST(arr, mid + 1, end);
		return n;
	}
	
	public static void printInOrderTraversal(BSTNode root){
		if(root != null) {	
			printInOrderTraversal(root.left);
			System.out.println(root.value);
			printInOrderTraversal(root.right);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		BSTNode root = convertToBST(arr);
		printInOrderTraversal(root);
	}
}
