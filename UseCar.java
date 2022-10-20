 package hashMap;
import java.util.HashMap;
import java.util.Iterator;

public class UseCar {
	public static void main(String[] args) {
		Car car1 = new Car("audi",100000,"black","TN051234",true);
		Car car2 = new Car("bmw",200000,"white","TN055678",false);
		Car car3 = new Car("ford",300000,"red","TN051236",true);
		Car car4 = new Car("jaguar",400000,"grey","TN057896",false);
		HashMap<String,Car> cars = new HashMap<>();
		cars.put(car1.getNoplate(),car1);
		cars.put(car2.getNoplate(),car2);
		cars.put(car3.getNoplate(),car3);
		cars.put(car4.getNoplate(),car4);
		Car name =car1;
		int max =0;
		for(Car c: cars.values()) {
			if(c.getPrice()>max) {
				max=c.getPrice();
				name=c;
			}
			
			
		}
		System.out.println(name);
		System.out.println("-----iterator----");
		
		
//	Iterator<Car> c = cars.values().iterator();
//	while(c.hasNext()) {
//		if(c.next().getPrice()>=200000) {
//			c.remove();
//		}
//		
//	}
	System.out.println(cars);
	System.out.println("-----using keyset-----");
	Iterator<String> d = cars.keySet().iterator();
	while(d.hasNext()) {
		String t = d.next();
		if(cars.get(t).getPrice()>300000) {
			d.remove();
			
		}
	}
	cars.forEach((x,y)->System.out.println(y));
		
	}
}
