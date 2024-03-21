package string;

public class StringCondition {

	public static void main(String[] args) {
		String str1 = "Hello", str2 = "World", str3 = "Hello", str4 = null ,str5 = "hello", str6= "lo";
		// Function call:
		String s1 = "Hello world";
		String s2 = "Hello world All";
		logicRepeat(s1);
		System.out.println("***********");
		logicRepeat(s2);
		System.out.println("***********");
		logicReplace(s1);
		System.out.println("\n***********");
		logicReverseString(s1);
		System.out.println("\n***********");
		logicSpace(s1);
		System.out.println("\n***********");
		//equal
		//using assignmnet operators
		if(str1 == str3) {
			System.out.println("Str1: "+ str1+ " | Str2: "+str2+" true");
		}else {
			System.out.println("Str1: "+ str1+ " | Str2: "+str2+" false");
		}
		//.equals() method comparing with string 
		if(str1.equals(str4)) {
			System.out.println("Str1: "+ str1+ " | Str4: "+str4+" true");
		}else {
			System.out.println("Str1: "+ str1+ " | Str4: "+str4+" false");
		}
		//.equals() mehtod comparing with null value string
		if(str1.equals(str3)) {
			System.out.println("Str1: "+ str1+ " | Str3: "+str3+" true");
		}else {
			System.out.println("Str1: "+ str1+ " | Str3: "+str3+" false");
		}
		//.equals of mehtod with lowercase value
		if(str1.toLowerCase().equals(str5.toLowerCase())) {
			System.out.println("Str1: "+ str1+ " | Str5: "+str5+" true");
		}else {
			System.out.println("Str1: "+ str1+ " | Str5: "+str5+" false");
		}
		//.equals of with ignorecase mehtod whitch ignores the casesentive in a string
		if(str1.equalsIgnoreCase(str5)) {
			System.out.println("Str1: "+ str1+ " | Str5: "+str5+" true");
		}else {
			System.out.println("Str1: "+ str1+ " | Str5: "+str5+" false");
		}
		
		
		
		//contains 1
		if(str1 != null && str4 != null && str1.contains(str4)) {
			System.out.println("Str1: "+ str1+ " | Str3: "+str4+" true");
		}else {
			System.out.println("Str1: "+ str1+ " | Str3: "+str4+" false");
		}
		//contains2 
		if(str1 != null && str6 != null && str1.contains(str6)) {
			System.out.println("Str1: "+ str1+ " | Str5: "+str6+" true");
		}else {
			System.out.println("Str1: "+ str1+ " | Str5: "+str6+" false");
		}
		
	}
	public static void logicRepeat(String s) {
		 String[] sArr=s.split(" ");
	    for(int i=0; i<sArr.length; i++) {
	   
	    	for(int j=0; j<sArr.length-i ; j++){
	    		System.out.print(sArr[i]+" ");
	    	}
	    	 System.out.println();
	    }
	   
	}
	
	public static void logicReplace(String s) {
	    		
		System.out.print(s.replace("world", "All")+" ");
	   
	}
	
	public static void logicReverseString(String s) {
		 String[] sArr=s.split(" ");
		 for(int i=sArr.length-1; i>=0; i--) {
				System.out.print(sArr[i]+" ");
			}
	}
	
	public static void logicSpace(String s) {
		System.out.print(s.replace(" ", "_ _ _")+" ");
		
	}
	
	public static void logicGap(String s) {
		System.out.print(s.replace(" ", "_ _ _")+" ");
		
	}
	

}
