package com.coforge.sort;

import java.util.Comparator;

public class PriceSort implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) {
//		cannot compare primitives need to pass objects only
//		Double p1 = o1.getPrice();
//		Double p2 = o2.getPrice();
//		return p1.compareTo(p2)
		return o1.getPrice().compareTo(o2.getPrice());
	}

	
}
