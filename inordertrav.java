import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
 
// A class to store a binary tree node
class Node
{
    int key;
    Node left, right;
 
    public Node(int key)
    {
        this.key = key;
        left = right = null;
    }
}
 
class Main
{
    // Recursive function to perform inorder traversal on a given binary tree
    public static void inorderTraversal(Node root)
    {
        if (root == null) {
            return;
        }
 
        inorderTraversal(root.left);
        System.out.print(root.key + " ");
        inorderTraversal(root.right);
    }
 
    // Recursive function to perform postorder traversal on a given binary tree
    public static void preorderTraversal(Node root)
    {
        if (root == null) {
            return;
        }
 
        System.out.print(root.key + " ");
        preorderTraversal(root.left);
        preorderTraversal(root.right);
    }
 
    // Recursive function to construct a binary tree from a given
    // inorder and preorder sequence
    public static Node construct(int start, int end,
                                int[] preorder, AtomicInteger pIndex,
                                Map<Integer, Integer> map) {
        // base case
        if (start > end) {
            return null;
        }
 
        // The next element in `preorder[]` will be the root node of subtree
        // formed by sequence represented by `inorder[start, end]`
        Node root = new Node(preorder[pIndex.getAndIncrement()]);
 
        // get the root node index in sequence `inorder[]` to determine the
        // left and right subtree boundary
        int index = map.get(root.key);
 
        // recursively construct the left subtree
        root.left = construct(start, index - 1, preorder, pIndex, map);
 
        // recursively construct the right subtree
        root.right = construct(index + 1, end, preorder, pIndex, map);
 
        // return current node
        return root;
    }
 
    // Construct a binary tree from inorder and preorder traversals.
    // This function assumes that the input is valid, i.e., given
    // inorder and preorder sequence forms a binary tree.
    public static Node construct(int[] inorder, int[] preorder)
    {
        // create a map to efficiently find the index of any element in
        // a given inorder sequence
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
 
        // `pIndex` stores the index of the next unprocessed node in a preorder
        // sequence. We start with the root node (present at 0th index).
        AtomicInteger pIndex = new AtomicInteger(0);
 
        return construct(0, inorder.length - 1, preorder, pIndex, map);
    }
 
    public static void main(String[] args) {
        /* Construct the following tree
                   1
                 /   \
                /     \
               2       3
              /       / \
             /       /   \
            4       5     6
                   / \
                  /   \
                 7     8
        */
 
        int[] inorder = { 4, 2, 1, 7, 5, 8, 3, 6 };
        int[] preorder = { 1, 2, 4, 3, 5, 7, 8, 6 };
 
        Node root = construct(inorder, preorder);
 
        // traverse the constructed tree
        System.out.print("The inorder traversal is ");
        inorderTraversal(root);
 
        System.out.print("\nThe preorder traversal is ");
        preorderTraversal(root);
    }
}