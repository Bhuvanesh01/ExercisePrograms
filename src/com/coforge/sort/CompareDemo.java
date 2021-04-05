package com.coforge.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareDemo {

	public static void main(String[] args) {
		
		
		Mobile mob1 = new Mobile("A123",20000.0,"Samsung");
		Mobile mob2 = new Mobile("12",1120000.0,"Apple");
		Mobile mob3 = new Mobile("12 Mini",70000.0,"Apple");
		Mobile mob4 = new Mobile("Pixel 4a",30000.0,"Google");
		Mobile mob5 = new Mobile("Rog Phone 5",50000.0,"Asus");
		
		ArrayList<Mobile> mobileList = new ArrayList<>();
		mobileList.add(mob1);
		mobileList.add(mob2);
		mobileList.add(mob3);
		mobileList.add(mob4);
		mobileList.add(mob5);
		
		for(Mobile mobile:mobileList) {
			System.out.println(mobile);
		}
		System.out.println("");
		Collections.sort(mobileList);
		for(Mobile mobile:mobileList) {
			System.out.println(mobile);
		}
		System.out.println("");
//		Comparator<Mobile> c = new NameSort();
//		Comparator<Mobile> c = new PriceSort();
//		Comparator<Mobile> c =(Mobile o1, Mobile o2)->{
//			return o1.getBrand().compareTo(o2.getBrand());
//			};
//			Collections.sort(mobileList,c);
		Collections.sort(mobileList,(o1,o2)->{return ((Double)o1.getPrice()).compareTo((Double)o2.getPrice());});
		for(Mobile mobile:mobileList) {
			System.out.println(mobile);
		}
	}

}
