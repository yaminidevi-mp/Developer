package patterns;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Racecar";
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<str.length();j++) {
				if(i==j) {
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
