package hashMap;

import java.util.HashMap;

public class Lms {
	public static void main(String[] args) {
		HashMap<Integer,String>  c = new HashMap<>();
		c.put(123, "janu");
		c.put(456, "laskhmi");
		c.put(789, "akila");
		c.put(787, "janani");
		c.put(852, "selvi");
		c.remove(123);
		System.out.println(c.get(787));
		System.out.println(c.keySet());
		System.out.println(c.values());
		System.out.println(c.remove(852,"selvi"));
		System.out.println(c);
		System.out.println(c.size());
		
		
	}

}
