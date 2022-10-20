package hashMap;

import java.util.HashMap;

public class IterateKeySet {
	public static void main(String[] args) {
		HashMap<Integer,String>  c = new HashMap<>();
		c.put(123, "janu");
		c.put(456, "laskhmi");
		c.put(789, "akila");
		c.put(787, "janani");
		c.put(852, "selvi");
		for(Integer k :c.keySet()) {
			System.out.println(c.get(k));
		}
		
		
		c.keySet().forEach((x)->System.out.println(c.get(x)));
		c.values().forEach((y)->System.out.println(y));
		c.forEach((x,y)->System.out.println(x+"="+y));
		}

}
