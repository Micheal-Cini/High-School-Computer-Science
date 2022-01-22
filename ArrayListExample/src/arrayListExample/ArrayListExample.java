package arrayListExample;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList <String> cars=new ArrayList();
		System.out.println(cars.size());
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add(2,"Toyota");
		cars.add(4,"Benz");
		cars.set(1,"Audi");
		System.out.println(cars.size());
		
		System.out.println(cars);
		cars.remove(4);
		System.out.println(cars.get(2));
		
		
	}

}
