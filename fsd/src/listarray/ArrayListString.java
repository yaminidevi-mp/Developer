package listarray;

import java.util.ArrayList;

public class ArrayListString {
	public static void main(String[] args) {
		ArrayList<String> al =new ArrayList<String>();
		al.add("Yamini");
		al.add("Yamini");
		al.add("Yamini");
		al.add("Yamini");
		
		ArrayListLogic<String> arrayListLogic = new ArrayListLogic();
		arraylistLogic.print(al);
	}
}
