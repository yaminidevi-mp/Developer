package linkedlist.doublelinkedlist;

public class DoubleLLMain {
	public static void main(String[] args) {
		DoubleLinkedList dll = new DoubleLinkedList();
		System.out.println("List : ");
		dll.insert("Ranjith");
		dll.insert("Gokul");
		dll.insert("RTO");
		dll.insert("CM");
		dll.insertMid("Officer",2 );
		dll.print();
		
		
		
	}
}
