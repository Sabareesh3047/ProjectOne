package hashSet;
import java.util.*;

public class HashSetsMethods {
	public static void main(String[] args) {
		HashSet<Integer> n=new HashSet<>();
		
		n.add(54);
		n.add(32);
		n.add(54);
		n.add(45);
		
		System.out.println(n);
		
		System.out.println(n.size());
		n.remove(45);
		System.out.println(n);
		System.out.println(n.isEmpty());
		System.out.println(n.clone());
		
		HashSet<String> m=new HashSet<>();
				
		m.add("Danalakshmi");
		m.add("madam");
		m.add("class");
		System.out.println(m);
		
		
		
	}

}
