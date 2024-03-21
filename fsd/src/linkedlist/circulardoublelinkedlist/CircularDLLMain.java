package linkedlist.circulardoublelinkedlist;
public class CircularDLLMain{

	public static void main(String[] args) {
		CircularDoubleLinkedList cdll = new CircularDoubleLinkedList();
		System.out.println("List : ");
		cdll.insert("Ranjith");
		cdll.insert("Gokul");
		cdll.insert("RTO");
		cdll.insert("CM");
		cdll.print();
	}

}
