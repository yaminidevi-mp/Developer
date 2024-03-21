package stack;

import java.util.Stack;

public class StackLIFOMain {

	public static void main(String[] args) {
		StackLogic<Integer> obj = new StackLogic<Integer>();
		obj.push(3);
		obj.push(2);
		obj.push(8);
		obj.push(6);
		obj.push(9);
		obj.print();
		System.out.println("**********");
		StackLogic<String> obj1 = new StackLogic<String>();
		obj1.push("Yamini");
		obj1.push("Reshi");
		obj1.push("Dev");
		obj1.push("Yamii");
		obj1.print();
		obj1.peek();
		System.out.println("**********\npeek : "+obj1.peek());
		System.out.println("**********\nPop :");
		obj1.pop();
		obj1.pop();
		obj1.pop();
		obj1.pop();
		obj1.pop();
		obj1.pop();
		obj1.print();
		
		
//       Default class :
//		Stack<Integer> stack = new Stack<Integer>();
//		stack.push(3);
//		stack.push(4);
//		stack.push(5);
//		stack.push(7);
//		System.out.println("**********");
//		int count1 = 0;
//		for(int i = 0; i < stack.size(); i++) {
//			System.out.println(stack.get(i));
//			count1++;
//		}
//		System.out.println("**********"+"\ncount1 :"+count1);
//		stack.pop();
//		for(int i = 0; i < stack.size(); i++) {
//			System.out.println(stack.get(i));
//			count1++;
//		}
//		System.out.println("********** \nPeek :"+stack.peek());
//	}

	}
}