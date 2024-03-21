package linkedlist.singlelinkedlist;

public class SinlgleLinkedListMain {

	public static void main(String[] args) {
		SingleLinkedlist sll = new SingleLinkedlist();
		sll.insert(11, 0);
		sll.insert(5);
		sll.insert(3);
		sll.insert(6);
		sll.insert(9);
		sll.insert(12, 2);
		sll.insert(17, 0);
		sll.insert(4);
		sll.insert(2);
		sll.print();
	}

}
