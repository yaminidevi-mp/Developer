package linkedlist.circularsinglelinkedlist;

public class CircularSingleLL {
	CircularSLL head = null;
	CircularSLL tail = null;
	public void insert(String name) {
		CircularSLL person = new CircularSLL(name);
		if(head == null) {
			person.connectNext = person;
			head = person;
			tail = person;
		}
		else {
			person.connectNext = head;
			tail.connectNext = person;
			tail = person;
		}
	}
	public void print(){
		CircularSLL currentPerson = head;
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

