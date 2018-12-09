package DataStructures.BST;

public class BST {

    private BSTNode root;

    // time: O(log v), where v is the number of vertices
    // space: O(h), where h is the height of the tree
    public void put(String key, int value){
        root = put(root, key, value);
    }

    private BSTNode put(BSTNode n, String key, int value){
        if(n == null) return new BSTNode(key,value);
        if(value > n.value){
            // go right
            n.right = put(n.right, key, value);
        }else if (value < n.value){
            // go left
            n.left = put(n.left, key, value);
        }

        return n;
    }

    // time: O(log v), where v is the number of vertices
    // space: O(h), where h is the height of the tree
    public void inOrderTraversal(){
        inOrderTraversal(root);
    }

    private void inOrderTraversal(BSTNode n){
        if(n != null){
            inOrderTraversal(n.left);
            System.out.print("Key: " + n.key + " Value: " + n.value + "\n");
            inOrderTraversal(n.right);
        }
    }

    // time: O(log v), where v is the number of vertices
    // space: O(h), where h is the height of the tree
    public BSTNode search(int value){
        return search(root, value);
    }

    private BSTNode search(BSTNode root, int value){
        if(root.value == value){
            return root;
        }

        if(root.value > value){
            return search(root.left, value);
        }else{
            return search(root.right, value);
        }
    }

    // time: O(log v), where v is the number of vertices
    // space: O(h), where h is the height of the tree
    public void delete(int value){
        // 1. leaf node to delete
        // 2. node with one node
        // 3. node with two nodes
        root = delete(root, value);
    }

    private BSTNode delete(BSTNode n, int value){
        if(n == null){return root;} // if tree empty

        // otherwise recurse down tree
        if(n.value < value){
            // go right
            n.right = delete(n.right, value);
        }else if (n.value > value){
            // go left
            n.left = delete(n.left, value);
        }else{
            // found node
            // Case 1 and 2: none or one child;
            if(n.left == null){
                return n.right;
            }else if(n.right == null){
                return n.left;
            }
            // Case 3: two children
            // get inOrder Successor; there is two children
            // so just check the leftmost child of right
            n.value = minValue(n.right);

            // delete inOrder Successor like case 1
            n.right = delete(n.right, n.value);
        }
        return n;
    }

    private int minValue(BSTNode n){
        while(n.left != null){
            n = n.left;
        }
        return n.value;
    }

    public static void main(String[] args){
        BST bst = new BST();
        bst.put("A",16);
        bst.put("B",13);
        bst.put("C",12);
        bst.put("D",14);
        bst.put("E",15);
        bst.put("F",17);

        bst.delete(15);

        bst.inOrderTraversal();

        BSTNode node = bst.search(14);
        System.out.println("The found key: " + node.key + " and value: " + node.value);
    }

}
