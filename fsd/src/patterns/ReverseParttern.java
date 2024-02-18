package patterns;

public class ReverseParttern {
public static void main(String[] agrs) {
	String str="racecar";
	for(int i=0;i<str.length();i++) {
		for(int j=0;j<str.length();j++) {
			if(i+j==str.length()-1) {
				System.out.print(str.charAt(i));
			}
			else {
				System.out.print("*");
			}
		}
		System.out.println(" ");
	}
}
}
