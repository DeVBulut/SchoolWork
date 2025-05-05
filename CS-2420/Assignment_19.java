
public class Assignment_19 {

	//19.15
	public static <AnyType extends Comparable<? super AnyType>> BinaryNode<AnyType> findMin(BinarySearchTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return findMin(t.root); 
	}
	//Non-recursive implementation adapted from book - but I put in the { } as you obviously should :) 
	//TODO: Screenshot recursive method for your report as this method currently works great so the tester can't tell if you actually used recursion
	private static <AnyType extends Comparable<? super AnyType>> BinaryNode<AnyType> findMin(BinaryNode<AnyType> t) {
		if (t == null) {
			return null; 
		} else if (t.left == null) {
			return t; 
		} else {
			return findMinRecursive(t.left);
		}
	}

	
	//19.15
	public static <AnyType extends Comparable<? super AnyType>> BinaryNode<AnyType> findMax(BinarySearchTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return findMax(t.root); 
	}
	//Non-recursive implementation adapted from book - but I put in the { } as you obviously should :) 
	//TODO: Screenshot recursive method for your report as this method currently works great so the tester can't tell if you actually used recursion
	private static <AnyType extends Comparable<? super AnyType>> BinaryNode<AnyType> findMax(BinaryNode<AnyType> t) {
		if (t == null) {
			return null; 
		} else if (t.right == null) {
			return t;
		} else {
			return findMaxRecursive(t.right); 
		}
	}

	//19.15
	public static <AnyType extends Comparable<? super AnyType>> BinaryNode<AnyType> find(AnyType x, BinarySearchTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return find(x, t.root); 
	}
	//Non-recursive implementation adapted from book - but I put in the { } as you obviously should :) 
	//TODO: Screenshot recursive method for your report as this method currently works great so the tester can't tell if you actually used recursion
	private static <AnyType extends Comparable<? super AnyType>> BinaryNode<AnyType> find(AnyType x, BinaryNode<AnyType> t) {
		if (t == null) {
			return null; 
		}
	
		int compareResult = x.compareTo(t.element);
	
		if (compareResult < 0) {
			return findRecursive(x, t.left); 
		} else if (compareResult > 0) {
			return findRecursive(x, t.right);
		} else {
			return t; 
		}
	}
	
	
	//19.27
	//Ideally the toString methods are stuck in the BinarySearchTree and BinaryNode files
	//to make it easier for me to grade, and you to program, I put them here and changed the methods a little
	public static <AnyType extends Comparable<? super AnyType>> String toString(BinarySearchTree<AnyType> t) {
		//This just calls the BinaryNode method, You can change this if you want, but I found it easier
		//to program the BinaryNode version listed next
		return toString(t.root); 
	}
	
	//Note: You can take a screenshot for your report like you did for the other methods, but the tester makes sure you programmed it correctly
	//so the screenshot of no errors in the main is all I really need
	private static <AnyType extends Comparable<? super AnyType>> String toString(BinaryNode<AnyType> t) {
		if (t == null) {
			return ""; 
		} else {
			return toString(t.left) + t.element.toString() + " " + toString(t.right);
		}
	}

}
