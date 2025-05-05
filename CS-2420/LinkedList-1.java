
public class LinkedList<AnyType> {

    private Node<AnyType> first; 

	public LinkedList( ) {
        first = null;
	}

    /**
     * Test if the list is logically empty.
     * @return true if empty, false otherwise.
     */
    public boolean isEmpty( ) {
        return first == null;
    }

    /**
     * Make the list logically empty.
     */
    public void makeEmpty( )
    {
        first = null;
    }


    /**
     * Insert at the front
     * @param x the item to insert.
     */
    public void insertFront( AnyType x ) {
        Node<AnyType> newNode = new Node<>(x);
        newNode.next = first;
        first = newNode;
    }

    /**
     * Return Node corresponding to the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found.
     */
    public Node<AnyType> find( AnyType x ) {
    	Node<AnyType> current = first;
        while (current != null) 
        {
            if (current.y.equals(x)) 
            {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    /**
     * Remove the first occurrence of an item.
     * @param x the item to remove.
     */
    public void remove( AnyType x ) {
        if (first == null) 
        {
            return; 
        }

        if (first.y.equals(x)) 
        {
            first = first.next;
            return;
        }

        Node<AnyType> current = first;
        while (current.next != null) 
        {
            if (current.next.y.equals(x)) {
                current.next = current.next.next; 
                return;
            }
            current = current.next;
        }
    }

    /**
     * Return a string representation of the list
     */
    @Override
    public String toString() {
    	
        if (isEmpty()) {
            return null;
        }
    
        Node<AnyType> current = first;
        StringBuilder answer = new StringBuilder();
    
        while (current != null) {
            answer.append(current.y).append(" ");
            current = current.next;
        }
    
        return answer.toString().trim();
    }


    /**
     * Return the size of the list
     * @return
     */
    public static <AnyType> int listSize( LinkedList<AnyType> theList ) {
        int count = 0;
        Node<AnyType> current = theList.first;

        while ( current != null) 
        {
            count += 1;
            current = current.next;
        }
    	return count;
    }

    
    
    
    
    
	//Methods for the Chapter 17 Programming assignment
    /**
     * Insert at the end
     * @param x the item to insert.
     */
    public void insertEnd( AnyType x ) {

        Node<AnyType> newNode = new Node<>(x);

        if (first == null) 
        {
            first = newNode; 
        } 
        else
        {
            Node<AnyType> current = first;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode; 
        }
        
    }

    
    /**
     * Remove the last occurrence of an item.
     * @param x the item to remove.
     */	
	public void removeLast(AnyType x) {
        
        if (first == null) {
            return;
        }
    
        Node<AnyType> prev = null;
        Node<AnyType> current = first;
        Node<AnyType> lastOccurrence = null;
        Node<AnyType> lastOccurrencePrev = null;
    
        while (current != null) {
            if (current.getItem().equals(x)) {
                lastOccurrencePrev = prev;
                lastOccurrence = current;
            }
            prev = current;
            current = current.getNextNode();
        }
    
        if (lastOccurrence != null) {
            if (lastOccurrencePrev != null) {
                lastOccurrencePrev.setNextNode(lastOccurrence.getNextNode());
            } else {
                first = first.getNextNode();
            }
        }
    }
	
    /**
     * Remove all occurrences of an item.
     * @param x the item to remove.
     */	
	public void removeAll(AnyType x) {

        Node<AnyType> prev = null;
        Node<AnyType> current = first;
        
        while (current != null) {
            if (current.getItem().equals(x)) {
                if (prev == null) {
                    first = first.getNextNode();
                    current = first;
                } else {
                    prev.setNextNode(current.getNextNode());
                    current = prev.getNextNode();
                }
            } else {
                prev = current;
                current = current.getNextNode();
            }
        }
	}
	
    /**
     * Return Node just before the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found, or is the first item in the list.
     * 
     */
	public Node<AnyType> previous(AnyType x) {
	    Node<AnyType> prev = null;
        Node<AnyType> current = first;
    
        while (current != null) {
            if (current.getItem().equals(x)) {
              return prev; 
            }
            prev = current;
            current = current.next;
        }
    
        return null; 
	}

	/**
     * Return Node corresponding to the first node containing an item.
     * @param x the item to search for.
     * @return a Node; node is not valid if item is not found.
     * 
     * As a by product, the found node is moved to the front of the list
     * according to the move to front heuristic of 17.17
     */
	public Node<AnyType> findAndMoveToFront(AnyType x) {
		Node<AnyType> prev = null;
        Node<AnyType> current = first;
    
        while (current != null) {
            if (current.getItem().equals(x)) {
                if (prev != null) {
                    prev.next = current.next;
                    current.next = first;
                    first = current;
                }
                return current;
            }
            prev = current;
            current = current.next;
        }
        
        return null; 
	}


}
