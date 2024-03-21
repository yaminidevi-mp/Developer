package queue;

public class QueueMain {

	public static void main(String[] args) {
		QueueLogic<String> obj = new QueueLogic<String>();
		obj.enqueue("Yamini");
		obj.enqueue("Reshi");
		obj.enqueue("dev");
		obj.enqueue("Yamii");
		obj.print();
		System.out.println("**************");
		obj.dequeue();
		obj.print();
		obj.peek();
		System.out.println("**************\nPeek :"+obj.peek());
		obj.dequeue();
		obj.dequeue();
		System.out.println("**************");
		obj.print();
		
	}

}
