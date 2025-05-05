
class Node<AnyType>
{

	public AnyType y; 
	Node next;	

	public Node( ) {
		
	}
	
	public Node( AnyType x ) {
		this.y = x;
		this.next = null;
	}

	public Node( AnyType x, Node<AnyType> n ) {
		this.y = x;
		this.next = n;
	}

	public AnyType getItem() {
		return y;
	}

	public void setItem(AnyType x) {
		this.y = x;
	}

	public void setNextNode(Node<AnyType> n) {
		this.next = n;
	}

	public Node<AnyType> getNextNode(){
		return next;
	}

	@Override
	public String toString() {
		//Essentially put your item's toString(), then a space, then whatever comes after you
		//If nothing is after you, don't add that last space
		if (next != null) {
            return y.toString() + " " + next.toString();
        } else {
            return y.toString();
        }
	}
}
