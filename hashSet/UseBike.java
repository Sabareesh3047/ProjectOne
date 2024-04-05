package hashSet;
import java.util.*;
public class UseBike {
	public static void main(String[] args) {
		
		
			 Bike b=new Bike("YAMAHA",50000);
			 Bike b1=new Bike("HONDA",70000);
		HashSet<Bike> bikes =new HashSet<>();
		bikes.add(b);
		bikes.add(b1);
		System.out.println(bikes);
		
		bikes.forEach(x-> System.out.println(x));
		
		System.out.println("\n");
		
		bikes.forEach(x->{
			if(x.getPrice()>40000) {
				System.out.println(x);
				
			}
			
		});
		
		
	}

}
