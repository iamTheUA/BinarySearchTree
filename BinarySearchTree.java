package BST;

public class BinarySearchTree {

	public INode root = null;

	public void insert(int data) {

		INode t, n;
		n = new INode();
		n.data = data;
		n.left = null;
		n.right = null;
		if (root == null) {
			root = n;
		} else {

			t = root;
			while (t != null) {

				if (data > t.data) {
					if (t.right == null) {
						t.right = n;
						break;
					} else {
						t = t.right;
					}
				} else if (data <= t.data) {
					if (t.left == null) {
						t.left = n;
						break;
					} else {
						t = t.left;
					}
				}
			}

		}

	}
	public void traversal() {
		System.out.printf("%nPreorder: ");
		preOrderTraversal(root);
		System.out.printf("%nInorder: ");
		inOrderTraversal(root);
		System.out.printf("%nPostorder: ");
		postOrderTraversal(root);
		
	}
	public void preOrderTraversal(INode n) {
		if(n==null) {
			return;
		}
		System.out.printf(n.data+" ");
		preOrderTraversal(n.left);
		preOrderTraversal(n.right);
	}
	
	public void postOrderTraversal(INode n) {
		if(n==null) {
			return;
		}
		preOrderTraversal(n.left);
		preOrderTraversal(n.right);
		System.out.printf(n.data+" ");
	}
	
	public void inOrderTraversal(INode n) {
		if(n==null) {
			return;
		}
		preOrderTraversal(n.left);
		System.out.printf(n.data+" ");
		preOrderTraversal(n.right);
	}
	
}
