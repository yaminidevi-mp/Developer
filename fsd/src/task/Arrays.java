package task;

class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[9];
	    arr[0]=1;
	    arr[1]=9;
	    arr[2]=6;
	    arr[3]=4;
	    arr[4]=3;
	    arr[5]=2;
	    arr[6]=7;
	    arr[7]=5;
	    arr[8]=8;
	   
	    for(int i=0;i<arr.length;i++) {
	    	int rev=arr.length-(i+1);
	    	System.out.print(arr[rev]);
	    	
	    	
	    }
	    
//	    System.out.println("\nreversed array :");
	    //stack reverse :
//	    for(int i=arr.length-1;i>=0;i--) {
//	    	System.out.print(arr[i]);
//	    }
	    
		

	}

}
