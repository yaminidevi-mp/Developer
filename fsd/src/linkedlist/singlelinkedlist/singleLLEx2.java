package linkedlist.singlelinkedlist;

public class singleLLEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleLLNode head = null;
		SingleLLNode tail = null; 
		
		SingleLLNode obj1 = new SingleLLNode();
		obj1.setValue(5);
		System.out.println(obj1);
		// first value creation 
		if(head == null) {
			head = obj1;
			tail = obj1;
			System.out.println(head);
			System.out.println(tail);
		}
		// second value creation 
		SingleLLNode obj2 = new SingleLLNode();
		obj2.setValue(3);
		// replacing the object as tail :
		tail.setNext(obj2);
		tail = obj2;
		
		
		SingleLLNode obj3 = new SingleLLNode();
		obj3.setValue(6);
		tail.setNext(obj3);
		tail = obj3;
		
		System.out.println(head.getValue());
		System.out.println(head.getNext().getValue());
		System.out.println(head.getNext().getValue());
		
		
	}

}
