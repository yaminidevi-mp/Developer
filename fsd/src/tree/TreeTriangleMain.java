package tree;

public class TreeTriangleMain {

	public static void main(String[] args) {
		 int root = 21;
		   int left = 5;
		   int right = 5;
		   System.out.println(root);
		   for(int i=0;i<left;i++) {
				for(int j=0;j<left;j++) {
					if(i==j ||	
							i+j==left-1) {
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
				System.out.println("");
			}
		   
		   
//		   for(int i=0;i<right;i++) {
//				for(int j=0;j<right;j++) {
//					if(i+j==right-1) {
//						System.out.print("*");
//					}
//					else {
//						System.out.print(" ");
//					}
//				}
//				System.out.println(" ");
//			}
//		
	
	}
}


