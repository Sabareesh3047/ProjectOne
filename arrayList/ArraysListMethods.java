package arrayList;

import java.util.*;

public class ArraysListMethods {
	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(26);
		nums.add(5);
		nums.add(31);
		nums.add(25);
		nums.add(265);

		System.out.println(nums);

		nums.set(3, 1050);
		System.out.println(nums);

		System.out.println(nums.get(4));

		nums.remove(4);
		System.out.println(nums);
		System.out.println(nums.size());
		
		
		for(int i=0; i<nums.size(); i++) {
			System.out.print(nums.get(i));
		}
		for(Integer a: nums) {
			System.out.print(a);
		}
		for(int i=0; i<nums.size(); i++) {
			if(nums.get(i)%2==0) {
				System.out.println(nums.get(i));
			}
		
		}
		for(Integer c:nums) {
			if(c%2!=0) {
				System.out.println(c);
				
			}
		}
		System.out.println("\n");
		
		nums.forEach(x-> System.out.println(x));
		System.out.println("\n");
		
		nums.forEach(x-> {
			if(x%2==0) {
				System.out.println(x);
				
			}
		});
		
}
}
