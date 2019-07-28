package easy;

//Definition for a binary tree node.
class TreeNode {
	
	 int val;
	 
	 TreeNode left;
	 TreeNode right;
	 
	 TreeNode(int x) { 
		 val = x; 
	 }
}


public class RangeSumBST {

	
    // Root Left Right
    public static int preOrderTraverseTree(TreeNode focusNode, int L, int R) {
        
    	int sum = 0;
    	
        while(focusNode != null) {
        	
        	System.out.println(focusNode);
        	
        	if(focusNode.val >= L && focusNode.val <= R) {
        		sum += focusNode.val;
        	}
        	
        	preOrderTraverseTree(focusNode.left, L, R);
        	
        	preOrderTraverseTree(focusNode.right, L, R);
        	
        }
        
        return sum;
        
    }
    
    
    // ex. rangeSumBST(root, 5, 10)
    public static int rangeSumBST(TreeNode root, int L, int R) {
        
        int sum = 0;
        
        sum = preOrderTraverseTree(root, L, R);
        	
        return sum;
        
    }
	
	public static void main(String[] args) {
		TreeNode node1 = new TreeNode(8);
		node1.left = new TreeNode(3);
		int l = 3;
		int r = 10;
		System.out.println("Root Node: " + node1.val);
		System.out.println("Range: " + l + " - " + r);
		int answer = rangeSumBST(node1, l, r);
		System.out.println("Sum: " + answer);

	}

}


