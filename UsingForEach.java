 package hashMap;

import java.util.HashMap;

public class UsingForEach {
	public static void main(String[] args) {
		HashMap<Integer,String>  c = new HashMap<>();
		c.put(123, "janu");
		c.put(456, "laskhmi");
		c.put(789, "akila");
		c.put(787, "janani");
		c.put(852, "selvi");
		
		c.keySet().forEach((x)->System.out.println(x));
		c.values().forEach((y)->System.out.println(y));
	}
}

