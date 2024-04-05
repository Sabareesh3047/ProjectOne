package arrayList;

import java.util.ArrayList;

public class UsePhone {
	public static void main(String[] args) {
		Phone p=new Phone("SAMSUMG", 12000, "YELLOW", 9.8F, 2022);
		Phone q=new Phone("LENOVA", 15000, "BLUE", 8.8F, 2024);
		Phone r=new Phone("SAMSUMG", 170000, "PINK", 8.8F, 2023);
		Phone s=new Phone("SAMSUMG", 190000, "MERUN", 3.8F, 2021);
		
		
		ArrayList<Phone> phones =new ArrayList<>();
		phones.add(p);
		phones.add(q);
		phones.add(r);
		phones.add(s);
		
		System.out.println(phones);
		System.out.println("\n");
		
		for(int i=0; i<phones.size();i++) {
			
			System.out.println(phones.get(i));
		}
		System.out.println("\n");
		
		for(Phone mk:phones) {
			if(mk.getPrice()>5000 && mk.getPrice()<20000) {
				System.out.println(mk);
			}
		}
		System.out.println("\n");
		ArrayList<Phone> newphone=new ArrayList<>();
		phones.forEach(c-> {
				if(c.getEditionYear()>2004) {
					
				newphone.add(c);
				}
					
				});
		System.out.println(newphone);
		System.out.println("\n");
		
		phones.forEach(c-> {
			if(c.getRating()>8) {
				c.setPrice(c.getPrice()+(c.getPrice()*25/100));
			}
		});
		phones.forEach(c-> System.out.println(c));
		System.out.println("\n");
		
		for(int i=0; i<phones.size(); i++) {
			if(phones.get(i).getRating()>8) {
				phones.get(i).setPrice(phones.get(i).getPrice()+(phones.get(i).getPrice()*25/100));
			}
		}
		phones.forEach(c-> System.out.println(c));
		//System.out.println(phones);
		System.out.println("GIT UP PROJECT CHECK ");
	}

}
