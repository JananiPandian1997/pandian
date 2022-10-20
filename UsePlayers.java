 package hashMap;

import java.util.HashMap;
import java.util.Iterator;

public class UsePlayers {
	public static void main(String[] args) {
		HashMap<Integer,Players> p = new HashMap<>();
		Players p1 = new Players("sachin",50,1000,10,"mumbai");
		Players p2 = new Players("dhoni",25,5000,7,"chennai");
		Players p3 = new Players("kohli",60,4500,15,"bangalore");
		Players p4 = new Players("ashwin",31,7000,18,"punjab");
		Players p5 = new Players("abcd",35,9000,19,"pune");
		Players p6 = new Players("rorkel",40,9000,110,"chennai");
		p.put(p1.getJerseyNo(),p1);
		p.put(p2.getJerseyNo(),p2);
		p.put(p3.getJerseyNo(),p3);
		p.put(p4.getJerseyNo(),p4);
		p.put(p5.getJerseyNo(),p5);
		p.put(p6.getJerseyNo(),p6);
		System.out.println(p);
		for(Integer a : p.keySet()) {
			System.out.println(p.get(a).getname());
	}
		HashMap<Integer,Players> ep = new  HashMap<>();
		p.keySet().forEach((x)->System.out.println(x));
		for(Integer b : p.keySet()) {
			if(b%2==0) {
				ep.put(b,p.get(b));
			}
			
		}
		System.out.println(ep);
		for(Integer c : p.keySet()) {		
			if(p.get(c).getAge()>40) {
				ep.put(c, p.get(c));
				
				
			}
		}
		System.out.println("--------------");
		for(Integer d :p.keySet()) {
			if(p.get(d).getAge()<40) {
				System.out.println(p.get(d).getname());
			}
		}
	}
}
					
			
		
	


		
			

