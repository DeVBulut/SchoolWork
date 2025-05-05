
public class Assignment_18 {

	//18.9 a
	public static <AnyType> int numberOfLeaves(BinaryTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return t == null ? 0: numberOfLeaves(t.getRoot()); 
	}
	public static <AnyType> int numberOfLeaves(BinaryNode<AnyType> t) {
		if (t == null) {
            return 0;
        } else if (t.getLeft() == null && t.getRight() == null) {
            return 1; // Node is a leaf
        } else {
            return numberOfLeaves(t.getLeft()) + numberOfLeaves(t.getRight());
        }
	}
	
	//18.9 b
	public static <AnyType> int numberOfNodesWithOneNonNullChild(BinaryTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return t == null ? 0: numberOfNodesWithOneNonNullChild(t.getRoot()); 
	}
	public static <AnyType> int numberOfNodesWithOneNonNullChild(BinaryNode<AnyType> t) {
		if (t == null) {
            return 0;
        } else if ((t.getLeft() != null && t.getRight() == null) || (t.getLeft() == null && t.getRight() != null)) {
            return 1 + numberOfNodesWithOneNonNullChild(t.getLeft()) + numberOfNodesWithOneNonNullChild(t.getRight());
        } else {
            return numberOfNodesWithOneNonNullChild(t.getLeft()) + numberOfNodesWithOneNonNullChild(t.getRight());
        }
	}
	
	//18.9 c
	public static <AnyType> int numberOfNodesWithTwoNonNullChildren(BinaryTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return t == null ? 0: numberOfNodesWithTwoNonNullChildren(t.getRoot()); 
	}
	public static <AnyType> int numberOfNodesWithTwoNonNullChildren(BinaryNode<AnyType> t) {
		if (t == null) {
            return 0;
        } else if (t.getLeft() != null && t.getRight() != null) {
            return 1 + numberOfNodesWithTwoNonNullChildren(t.getLeft()) + numberOfNodesWithTwoNonNullChildren(t.getRight());
        } else {
            return numberOfNodesWithTwoNonNullChildren(t.getLeft()) + numberOfNodesWithTwoNonNullChildren(t.getRight());
        }
	}
	
	//18.10 a
	public static int numberOfNodesWithEvenDataItems(BinaryTree<Integer> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return t == null ? 0: numberOfNodesWithEvenDataItems(t.getRoot()); 
	}
	public static int numberOfNodesWithEvenDataItems(BinaryNode<Integer> t) {
		if (t == null) {
            return 0;
        } else if (t.getElement() % 2 == 0) {
            return 1 + numberOfNodesWithEvenDataItems(t.getLeft()) + numberOfNodesWithEvenDataItems(t.getRight());
        } else {
            return numberOfNodesWithEvenDataItems(t.getLeft()) + numberOfNodesWithEvenDataItems(t.getRight());
        }
	}
	
	//18.10 b
	public static int sumOfAllItems(BinaryTree<Integer> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return t == null ? 0: sumOfAllItems(t.getRoot()); 
	}
	public static int sumOfAllItems(BinaryNode<Integer> t) {
		if (t == null) {
            return 0;
        } else {
            return t.getElement() + sumOfAllItems(t.getLeft()) + sumOfAllItems(t.getRight());
        }
	}

	public static void printRuntimes() {
		//TODO type in the runtimes on these lines: i.e. log(n), n, n log(n), n*n, etc
		System.out.println("BigOh runtime of numberOfLeaves is: O(n)");
        System.out.println("BigOh runtime of numberOfNodesWithOneNonNullChild is: O(n)");
        System.out.println("BigOh runtime of numberOfNodesWithTwoNonNullChildren is: O(n)");
        System.out.println("BigOh runtime of numberOfNodesWithEvenDataItems is: O(n)");
        System.out.println("BigOh runtime of sumOfAllItems is: O(n)");
		
	}
	
}
