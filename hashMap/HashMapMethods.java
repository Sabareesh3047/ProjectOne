package hashMap;
import java.util.*;

public class HashMapMethods {
	public static void main(String[] args) {
		HashMap<Integer,String> details=new HashMap<>();
																				//put();
																				//KeySet();
		details.put(1,"Gowtham");											    //Values();
		details.put(2,"JEYAGANESH");												//remove();
		details.put(3,"LAKSHMI");												//get();
		details.put(4,"PRAVEEN");
		details.put(4,"JEYAGANESH");
		details.put(5,"JEYAGANESH");
		
		System.out.println(details);
		System.out.println(details.keySet());
		System.out.println(details.values());
		details.remove(3);
		System.out.println(details);
		System.out.println(details.get(2));
		
		for(Integer a:details.keySet()) {
		System.out.println(a);
		}
		for(String a:details.values()) {
			System.out.println(a);
			System.out.println("\n");
		}
		for(Integer a:details.keySet()) {
			System.out.println(a+" "+details.get(a));
			System.out.println("\n");
		
		}
		//forEach;
		details.keySet().forEach(x->System.out.println(x));
		System.out.println("\n");
		details.values().forEach(x->System.out.println(x));
		System.out.println("\n");
		details.keySet().forEach(x->System.out.println(x+" "+details.get(x)));
		System.out.println("\n");
		details.forEach((x,y)->System.out.println(x+" "+y));
		
		List<Integer> k=details.values().stream().()
			
		}
	}


