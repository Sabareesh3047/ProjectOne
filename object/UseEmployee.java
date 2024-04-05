package object;
import java.util.*;
import java.util.stream.Collectors;
public class UseEmployee {
	public static void main(String[] args) {
		Employee e1=new Employee("BALAJI",123,23,"MALE",50000,"DAY");
		Employee e2=new Employee("SUNDAR",124,26,"MALE",60000,"NIGHT");
		Employee e3=new Employee("BALAJI",125,30,"MALE",55000,"DAY");
		Employee e4=new Employee("LAKSHMI",133,29,"FEMALE",40000,"NIGHT");
		Employee e5=new Employee("DEEPI",153,27,"FEMALE",60000,"DAY");
		
		HashMap<Integer,Employee> emp=new HashMap<>();
		emp.put(e1.getId(), e1);	
		emp.put(e2.getId(), e2);	
		emp.put(e3.getId(), e3);	
		emp.put(e4.getId(), e4);	
		emp.put(e5.getId(), e5);	
		
		emp.keySet().forEach(x->System.out.println(x));
		System.out.println("\n");
		emp.values().forEach(x->System.out.println(x));
		System.out.println("\n");
		
		emp.keySet().forEach(x->System.out.println(x+" "+emp.get(x)));
		System.out.println("\n");
		
		for(Integer c:emp.keySet()) {
			System.out.println(c);
			System.out.println("\n");
		}
		System.out.println("\n");
		for(Employee c:emp.values()) {
			System.out.println(c);
			
		}
		System.out.println("\n");
		for(Integer c:emp.keySet()) {
			System.out.println(c+" "+emp.get(c));
		}
		System.out.println("\n");
		emp.keySet().forEach(x-> {
			if(emp.get(x).getSalary()>30000 && emp.get(x).getSalary()<50000 ) {
				System.out.println(emp.get(x));
			}
		});
		System.out.println("\n");
		
		emp.values().forEach(x-> {
			if(x.getShift().equals("NIGHT")) {
				System.out.println(x);
			}
		});
		System.out.println("\n");
		emp.keySet().forEach(x-> {
			if(emp.get(x).getShift().equals("NIGHT")) {
				System.out.println(emp.get(x));
			}
		});
		
		System.out.println("\n");
		emp.forEach((x,y)->{
			if(y.getShift().equals("NIGHT")) {
				System.out.println(y);
			}
		});
		System.out.println("\n");

			for(Employee a:emp.values()) {
				if(a.getGender().equals("MALE")) {
					a.setSalary(a.getSalary()+(a.getSalary()*25/100));
				}
			}
			emp.values().forEach(x-> System.out.println(x));
			
			emp.forEach((x,y)->{
				if(y.getGender().equals("MALE")) {
					y.setSalary(y.getSalary()+(y.getSalary()*25/100));
						
					}
				
			});
			System.out.println("\n");
			emp.values().forEach(x-> System.out.println(x));
HashMap<Integer,Employee> emp1=new HashMap<>();
       
         emp.keySet().forEach(x->{
        	 if(emp.get(x).getGender().equals("FEMALE")) {
        		 emp1.put(x, emp.get(x));
        		 
        	 }
         });
         System.out.println("\n");
         System.out.println(emp1);
			
//         for(Integer c:emp.keySet()) {
//        	 if(emp.get(c).getAge()>25) {
//        		 emp.remove(c);							if bunch of values remove use only Iterator .because facing concurrent error;
//        	 }
//         }
//         System.out.println("\n");
//
//			emp.values().forEach(x-> System.out.println(x));

			 
         Integer sm=emp.values().stream().map(Employee::getAge).sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
         System.out.println(sm);
         
        List<Employee> sms=emp.values().stream().sorted(Comparator.comparing(Employee::getAge)).limit(1).collect(Collectors.toList()) ;
         System.out.println(sms);
         
         List<String> words = Arrays.asList("apple", "banana", "cherry");
         words.stream()
              .forEach(System.out::print);
		}
	}


