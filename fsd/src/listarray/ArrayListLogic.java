package listarray;

import java.util.ArrayList;

public class ArrayListLogic<T>{
	ArrayList<Integer> array;
	public ArrayListLogic(ArrayList<Integer> arr) {
		array = arr;
	}
	
	public ArrayList<Integer> oddArray(){
		return oddAndEven(true);
	}
	public ArrayList<Integer> evenArray(){
		return oddAndEven(false);
	}
	
	/* @param 
	 * isOdd = true => return odd number array
	 * isOdd = false => return even number array
	 * 
	 * */
	public ArrayList<Integer> oddAndEven(Boolean isOdd){
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i=0; i<array.size(); i++) {
			if(oddOrEven(array.get(i)) && isOdd) {
				res.add(array.get(i));
			}
			else if(!isOdd && !oddOrEven(array.get(i))){
				res.add(array.get(i));
			}
		}
		return res;
	}
	
	public boolean oddOrEven(Integer val) {
		if((val % 2) == 1) {
			return true;
		}
		return false;
	}
	
	public void print(ArrayList<T> arr) {
		for(int i =0; i<arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
}
