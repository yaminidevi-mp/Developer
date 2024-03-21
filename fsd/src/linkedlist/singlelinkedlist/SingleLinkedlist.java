package linkedlist.singlelinkedlist;

public class SingleLinkedlist {
	SingleLLNode head = null, tail = null;
	
	public void insert(int value) {
		// node creation :
		SingleLLNode singleLLNode = new SingleLLNode();
		//adding value : 
		singleLLNode.setValue(value);
		
		if(head == null) {
			head = singleLLNode;
			tail = singleLLNode;
		}
		// exchange the current tail : 
		else {
			// creates a object of the next element to the previous element
			tail.setNext(singleLLNode);
			// now it  will change the tail : 
			tail = singleLLNode;
		}
	}
	
	public void insert(int value, int position) {
		// object creation :
		SingleLLNode newNode = new SingleLLNode();
		newNode.setValue(value);
		
		if(head == null && position == 0) {
//			System.out.println("1");
			head = newNode;
			tail = newNode;
		}
		else if(position == 0) {
//			System.out.println("2");
			newNode.setNext(head);
			head = newNode;
		}
		else {
//			System.out.println("3");
			int index = 1;
			SingleLLNode currentItem = head;
			while (currentItem != null ) {
//				System.out.println("4"+index);
				if(position == index) {
					newNode.setNext(currentItem.getNext());
					currentItem.setNext(newNode);
					break;
				}
				// to known the current position of the node : 
				currentItem = currentItem.getNext();
				index++;
			}
			if(index < position) {
				System.out.println("Index out of bound error");
			}
		}
	}
//	public void delete(int value) {
//		SingleLLNode node = head;
//		SingleLLNode prev = null;
//        
//        if(head.data == value) {
//            head = head.next;
//        }
//        while(node.next!=null) {
//            prev= node;
//            if(node.next.data==num) {
//                node.next=node.next.next;
//                node=prev;
//            }
//            node= node.next;
//        }
//        if(node.data == num) {
//            prev.next = null;
//        }
//    }
	
	public void print() {
		SingleLLNode currentVal = head;
		if(head != null) {
			System.out.println("Print : ");
			while(currentVal != null) {
				System.out.println(currentVal.getValue());
				currentVal = currentVal.getNext();
			}
		}
		else {
			System.out.println("List is empty");
		}
	}
}


