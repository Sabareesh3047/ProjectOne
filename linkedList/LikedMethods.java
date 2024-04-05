package linkedList;
import java.util.*;

public class LikedMethods {
	public static void main(String[] args) {
	

	
	LinkedList<String> a=new LinkedList<>();
	
	a.add("SIVA");
	a.add("VICKY");
	a.add("MURALI");
	a.add("LAKSHMI");
	System.out.println(a);
	
	a.set(3, "soma");
	System.out.println(a);
	
	System.out.println(a.get(1));
	
	a.remove(3);
	System.out.println(a);
	
	a.forEach(x-> System.out.println(x));
	
	
	

}
}
