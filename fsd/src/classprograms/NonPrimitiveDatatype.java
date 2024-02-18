package classprograms;
import java.util.Scanner;
public class NonPrimitiveDatatype {
     public static void main(String[] args) {
    	 Scanner sc = new Scanner(System.in);
//    	 System.out.println("Test");
//    	 ClassExample classExample=new ClassExample();
    	 ClassExample yamini = new ClassExample();
    	 yamini.setName(sc.next());
    	 yamini.setAge(sc.nextInt());
    	 yamini.setGender(sc.next());
    	 yamini.setWeight(sc.nextFloat());
    	 System.out.println(yamini.toString());
    	 ClassExample prince = new ClassExample("Prince", "Female", 21, 50f);
    	 System.out.println(prince.toString());
//    	 int arr[]= {1,2,3,4};
//    	 String[] strarr= {"Yamini","Princy","Bhavas"};
//    	 System.out.println(classExample.getname());
//    	 System.out.println(classExample.age());
//    	 System.out.println(classExample.weight());
//    	 System.out.println(classExample.gender);
//    	 System.out.println(arr.length);
//    	 System.out.println(strarr.length);
     }
}
