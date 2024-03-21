package classtask;

public class Sum {
	
	Integer a,b;
	public Sum(Integer a,Integer b) {
		this.a = a;
		this.b = b;
	}
	
	private Integer sum() {
		return a+b;
	}
	
	public Integer add(Integer x, Integer y) {
		return x+y;
	}
	
	public Double add(Double x, Double y) {
		return x+y;
	}

	public static float addFloat(float x1 , float y1) {
		return x1+y1;
	}

	
}
