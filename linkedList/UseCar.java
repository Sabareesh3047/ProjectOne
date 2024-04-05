package linkedList;
import java.util.*;

public class UseCar {
	public static void main(String[] args) {
		
		Car n=new Car("HONDA","SUV","SMALL",50000);
		Car n1=new Car("THOR","SUV","SMALL",700000);
		Car n2=new Car("SUZUKI","SUV","SMALL",900000);
		Car n3=new Car("BENZ","SUV","SMALL",1050000);
		
		LinkedList<Car> cars=new LinkedList<>();
		cars.add(n);
		cars.add(n1);
		cars.add(n2);
		cars.add(n3);
		
		System.out.println(cars);
		System.out.println("\n");
		
		for(int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		System.out.println("\n");
		
		for(Car km:cars) {
			System.out.println(km);
		}
		System.out.println("\n");
		
		cars.forEach(c->{
			if(c.getPrice()>600000) {
				c.setPrice(c.getPrice()+50000);
			}
			
		 
		});
		cars.forEach(c-> System.out.println(c));
		System.out.println("\n");
		for(int i=0; i<cars.size(); i++) {
			if(cars.get(i).getPrice()>50000) {
				cars.get(i).setBrand("SUZUA");
				cars.get(i).setPrice((cars.get(i).getPrice()+300000));
			}
		
		}
		cars.forEach(x-> System.out.println(x));
	
		
		

		
	}

}
