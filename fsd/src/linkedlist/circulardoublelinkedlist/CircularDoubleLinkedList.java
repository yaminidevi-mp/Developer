package linkedlist.circulardoublelinkedlist;
public class CircularDoubleLinkedList {
	CLLPerson head;
	CLLPerson tail;
	public void insert(String name) {
		CLLPerson person = new CLLPerson(name);
		if(head ==  null) {
			person.connectNext = person;
			head = person;
			tail = person;
		}
		else {
			person.connectPrev = head;
			tail.connectNext = person;		
			tail = person;
		}
	}
	public void print() {
		CLLPerson currentPerson = head;
		if(currentPerson != null) {
			do {
				System.out.println(currentPerson.name);
				currentPerson = currentPerson.connectNext;
			}
	 
			while(currentPerson != head);
			}
			else {
				System.out.println("List is empty");
			}
	}
}
