package hashMap;

import java.util.HashMap;

public class UsingEnhanceFor {
		public static void main(String[] args) {
			HashMap<Integer,String>  c = new HashMap<>();
			c.put(123, "janu");
			c.put(456, "laskhmi");
			c.put(789, "akila");
			c.put(787, "janani");
			c.put(852, "selvi");
			c.remove(159, "nothing");
			for(Integer k : c.keySet()) {
				System.out.println(k);
			}
			for(String s : c.values()) {
				System.out.println(s);
			}
			
		}
}
