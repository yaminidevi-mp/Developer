package stack;
public class StackLogic<T> {
	StackNode<T> first = null;
	StackNode<T> last = null; 
	int count = 0;
	public void push(T value) {
		StackNode<T> current = new StackNode<T>(value);
		if(first == null) {
			first = current;
			last = current;
			count++;
		}else {
			last.next = current;
			last = current;
			count++;
		}
	}
	public T peek(){
		if(last != null) 
			return last.value;
		return null;
	}
	public int size() {
		return count;
	}
	public void pop() {
		if(first == last) {
			first = null;
			last = null;
			count = 0;
		}
		else if(first != null) {
			StackNode<T> current = first;
			while(current != null) {
				if(current.next == last) {
					current.next = null;
					last = current;
					count--;
					break;
				}
				current = current.next;
			}
		}
	}
	public void print() {
		if(first != null) {
			StackNode<T> current = first;
			while(current != null) {
				System.out.println(current.value);
				current = current.next;

			}
		   }
		System.out.println("count : "+count);

		}
	}
	
	


