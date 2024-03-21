package linkedlist.doublelinkedlist;

public class DoubleLinkedList {
	DLLPerson head;
	DLLPerson tail;
	public void insert(String name) {
		DLLPerson person = new DLLPerson(name);
		if(head ==  null) {
			head = person;
			tail = person;
		}
		else {
			person.connectPrev = tail;
			tail.connectNext = person;		
			tail = person;
		}
	}
	public void insertMid(String name, int position) {
		DLLPerson newNode = new DLLPerson(name);
		newNode.setName(name);
		if(head == null && position == 0) {
			head = newNode;
			tail = newNode;
		}
		else if(position == 0) {
			newNode.setConnectNext(head);
			head = newNode;
		}
		else {
			int index = 1;
			DLLPerson currentItem = head;
			while (currentItem != null ) {
				if(position == index) {
					newNode.setConnectNext(currentItem.getConnectNext());
					currentItem.setConnectNext(newNode);
					break;
				}
				currentItem = currentItem.getConnectNext();
				index++;
			}
			if(index < position) {
				System.out.println("Index out of bound error");
			}
		}
	}
	//Reverse :
//	public void print() {
//		DLLPerson currentPerson = tail;
//		while(currentPerson != null) {
//			System.out.println(currentPerson.name);
//			currentPerson = currentPerson.connectPrev;
//		}
//	}
	public void sortList() {
		
	}
	public void print() {
		DLLPerson currentPerson = head;
		while(currentPerson != null) {
			System.out.println(currentPerson.name);
			currentPerson = currentPerson.connectNext;
		}
	}
}
