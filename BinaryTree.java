import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree {
	

	public void postOrder(Node root) {
		System.out.print("Postorder:");
		Stack<Node> stack1 = new Stack<>();
		Stack<Node> stack2 = new Stack<>();
		
		if(root == null) return;
		
		stack1.push(root);
		while(!stack1.isEmpty()) {
			Node curr = stack1.pop();
			stack2.push(curr);
			
			if(curr.left != null) {
				stack1.push(curr.left);
			}
			if(curr.right != null) {
				stack1.push(curr.right);
			}
			
		}
		
		while(!stack2.isEmpty()) {
			Node curr = stack2.pop();
			System.out.print(curr.data + " ");
		}
	}
	
	
	public void inOrder(Node root) {
		System.out.print("Inorder:");
		Stack<Node> stack = new Stack<>();
		Node curr = root;
		
		while (curr != null || !stack.isEmpty()) {
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			
			curr = stack.pop();
			System.out.print(curr.data + " ");
			curr = curr.right;
		}
		
		
	}
	
	public void preOrder(Node root) {
		System.out.print("Preorder:");
		if(root == null) return;
		
		
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		
	
		while(!stack.isEmpty()) {
			Node node = stack.pop();
			System.out.print(node.data + " ");
			
			if(node.right != null) {
				stack.push(node.right);
			}
			if(node.left != null) {
				stack.push(node.left);
			}
			
		}
		
	}
	
	public void bfs(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			Node node = queue.poll();
			System.out.println(node.data);
			
			if(node.left != null) {
				queue.add(node.left);
				}
			if (node.right != null) {
				queue.add(node.right);
			}
			
		}
		
	}
	
	
	
}
