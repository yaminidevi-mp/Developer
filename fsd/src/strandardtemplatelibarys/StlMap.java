package strandardtemplatelibarys;

import java.util.HashMap;
import java.util.Map;

public class StlMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map= new HashMap<String, String>();
		map.put("name", "yamini");
		map.put("age", "22");
		map.put("gender", "female");
		
		System.out.println(map.get("name"));
		System.out.println(map.get("age"));
		System.out.println(map.get("gender"));
		
		Map<String,Integer> map1 = new HashMap<String,Integer>();
		map1.put("Age", 22);
		map1.put("pincode", 621211);
		
		System.out.println(map1.get("Age"));
		System.out.println(map1.get("pincode"));
		
		Map<Integer,Double> map2 = new HashMap<Integer,Double>();
		map2.put(0, 22.3);
		map2.put(1, 24.3);
		map2.put(2, 23.3);
		
		System.out.println(map2.get(2));
		System.out.println(map2.get(1));
		
	   map.keySet();	
	}

}
