package homeWork;
import java.util.*;

public class HashMapTask {
	public static void main(String[] args) {
		
		
		HashMap<Integer,String> home=new HashMap<>();
		home.put(1, "GOWTHAMBROSRI");
		home.put(2, "BALAJI");
		home.put(3, "PRAVEEN");
		home.put(4, "PRAKASH");
		home.put(5, "SAKTHI");
		home.put(6, "PRABHA");
		home.put(7, "JEYA");
		home.put(8, "MAFHESH");
		
		home.keySet().forEach(x-> {
			if(x%2==0) {
				System.out.println(x);
			}
		});
		System.out.println("\n");
		
		home.values().forEach(x-> {
			if(x.startsWith("B")) {
				System.out.println(x);
			}
		});
		System.out.println("\n");
		
		home.values().forEach(x-> {
			if(x.endsWith("H")) {
				System.out.println(x);
			}
		});
		System.out.println("\n");
	   String max= home.get(1);
		for(String a:home.values()) {
			if(a.length()>max.length()) {
				max=a;
				
			}
		}
			System.out.println(max);
			System.out.println("\n");
			home.keySet().forEach(x-> {
				if(home.get(x).endsWith("H")) {
					System.out.println(home.get(x));
				}
			});
		
	}

}
