
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BinaryTree tree = new BinaryTree();
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		
		tree.postOrder(root);
		System.out.println("-");
		tree.inOrder(root);
		System.out.println("-");
		tree.preOrder(root);

	}

}
