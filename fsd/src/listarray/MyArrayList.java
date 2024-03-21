package listarray;
import java.util.ArrayList;
public class MyArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		al.add(12);
		al.add(34);
		al.add(19);
		al.add(29);
		System.out.println("*****************");
		al.add(1, 45);
		print(al);
		System.out.println("*****************");
		al.remove(3);
		print(al);
		System.out.println("*****************");
		al.clear();
		al.add(11);
		al.add(23);
		al.add(21);
		al.add(10);
		print(al);
		
		System.out.println("\nIs empty check: "+al.isEmpty());
		System.out.println("Array list size: "+al.size());
		System.out.println("Find index 21: "+al.indexOf(21));
		System.out.println("Find index 11: "+al.indexOf(12));
		
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(2);
		a2.add(11);
		a2.add(6);
		a2.add(3);
		a2.add(21);
		a2.add(9);
		a2.add(12);
		a2.add(18);
		a2.add(7);
		
		
		ArrayListLogic<Integer> logic = new ArrayListLogic(a2);
		System.out.println("*******Odd**********");
		logic.print(logic.oddArray());
		System.out.println("*******even**********");
		logic.print(logic.evenArray());
		
		ArrayListLogic<String> logic = new ArrayListLogic(al);
	}
	
	

	public static void print(ArrayList<Integer> al) {
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}
	}
	
	

}
