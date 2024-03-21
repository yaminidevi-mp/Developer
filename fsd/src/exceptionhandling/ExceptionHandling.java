package exceptionhandling;

public class ExceptionHandling {

	String str = " Hello World ", a = null;
	try {
//		int c = 3/0;
//		System.out.println(c);
		if(str != null && a != null && str.contains(a)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
	}
	}
	catch{
		
	}
	
	//to find the length of the string
	System.out.println("Length : "+str.length());
	
	//it changes the string as a array and then it tells the length of the string
	System.out.println("Length : "+str.toCharArray().length);
	
	//replace the String
	System.out.println("Replace : "+str.replace("World", "all"));
	
	//substring 
	System.out.println("SubString : "+str.substring(0,8));
	
	//concat which is used to add the string with the old string
	System.out.println("concat : "+str.concat(" All"));
	
	//splitting the string in form of array
	System.out.println("Split : "+str.split(" ")[0]+"  2 : "+str.split(" ")[1]);
	
	//remove white space
	System.out.println("Trim: "+str.trim());
	
	//prints the index of the string 
	System.out.println("index of : "+str.indexOf("l"));
	
	//converts to upper case
	System.out.println("uppercase : "+str.toUpperCase());
	
	System.out.println("uppercase: "+str.toString());
	
	int j=3;
	String s1=String.valueOf(j);//convert to string
	System.out.println("equals : "+str.equals("3"));
	
	//spliting using char array
	String[] strArr = str.split("");
	char[] strArr1 = str.toCharArray();
	
	System.out.println("*****Split*****");
	//Split each char 
	for(int i=0; i<strArr.length; i++) {
		System.out.println(strArr[i]);
	}
	System.out.println("***** tochar Array *****");
	
	for(int i=0;i<strArr1.length; i++) {
		System.out.println(strArr1[i]);
	}
	

	//Duplicate function call
	System.out.println("duplicate : "+findDuplicates(str));
}
public static String findDuplicates(String str) {
	String response="";
	str = str.trim();
	for(int i=1; i<str.length(); i++) {
		if(str.substring(i).contains(str.substring(i-1,i))) {
			if(!response.contains(str.substring(i-1,i))){
				response = response.concat(str.substring(i-1,i));
			}
		}
	}
	return response;
}


}
