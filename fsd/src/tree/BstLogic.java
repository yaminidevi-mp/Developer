package tree;

public class BstLogic {
	BstNode root = null;
	public BstNode insert(int value) {
		if(root == null) {
			root = new BstNode(value);
			return root;
		}
		else {
			return insert(root,value);
		}
	}
	
	private BstNode insert(BstNode currentRoot,int value) {
		if(currentRoot == null) {
			BstNode newNode = new BstNode(value);
			return newNode;
		}
		if(value <= currentRoot.value) {
			System.out.println("Parent : "+currentRoot.value+"->left  : "+value);
			currentRoot.left = insert(currentRoot.left, value);
		}
		else {
			System.out.println("Parent : "+currentRoot.value+"->right : "+value);
			currentRoot.right = insert(currentRoot.right, value);
		}
		return currentRoot;
	}
	public BstNode find(int value) {
		if(root == null) {
			root = new BstNode(value);
			return root;
		}
		else {
			return find(root,value);
		}
	}

	private BstNode find(BstNode currentRoot,int value) {
		if(value == currentRoot.value) {
			System.out.println("True");
			currentRoot.left = find(currentRoot.left, value);
		}
		else if(value <= currentRoot.value)  {
			System.out.println("true");
			currentRoot.left = find(currentRoot.left, value);
		}
		else if(value > currentRoot.value) {
			System.out.println("True");
			currentRoot.right = find(currentRoot.right, value);
		}
		else {
			System.out.println("False");
		}
		return currentRoot;
	}
	

}
