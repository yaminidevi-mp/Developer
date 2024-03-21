package linkedlist.singlelinkedlist;

public class SingleLLPersonMain {
	public static void main(String [] args) {
		SingleLinkedListPerson sllLinkedListPerson = new SingleLinkedListPerson();
		sllLinkedListPerson.insert("yamini");
		sllLinkedListPerson.insert("reshi");
		sllLinkedListPerson.insert("dev");
		sllLinkedListPerson.delete(1);
		sllLinkedListPerson.print();
	}
}
