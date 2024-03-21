package linkedlist.singlelinkedlist;

public class SingleLinkedListPerson {
	SingleLLPerson head = null;
	SingleLLPerson tail = null; 
	public void insert(String name) {
		SingleLLPerson person = new SingleLLPerson(name);
		if(head == null) {
			head = person;
			tail = person;
		}else {
			tail.connectNext = person;
			tail = person;
		}
	}
//	public void delete(String name) {
//		SingleLLPerson node = head;
//		SingleLLPerson prev = null;
//        if(head == null) {
//            head = head.connectNext;
//        }
//        String num = null;
//		while(node.connectNext!=null) {
//            prev= node;
//            if(node.connectNext.name == num) {
//                node.connectNext=node.connectNext.connectNext;
//                node=prev;
//            }
//            node= node.connectNext;
//        }
//        if(node.name == num) {
//            prev.connectNext = null;
//        }
//    }
	public void delete(int position){
	      if (head == null)
	          return;
	      SingleLLPerson temp = head;
	      if (position == 0)
	      {
	          head = temp.connectNext;   
	          return;
	      }
	      int i=0;
	      while ( temp!=null && i<position-1) {
	          temp = temp.connectNext;
	          i++;
	      }
	      if (temp == null || temp.connectNext == null)
	          return;
	       SingleLLPerson connectNext = temp.connectNext.connectNext;

	      temp.connectNext = connectNext;  
	  }

	public void print() {
		SingleLLPerson currentPerson = head;
		while(currentPerson != null) {
			System.out.println(currentPerson.name);
			currentPerson = currentPerson.connectNext;
		}
	}
}
