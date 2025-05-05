
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
		if (next != null) {
            return y.toString() + " " + next.toString();
        } else {
            return y.toString();
        }
	}
}
