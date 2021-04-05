package com.coforge.sort;

import java.util.Comparator;

public class NameSort implements Comparator<Mobile> {

	@Override
	public int compare(Mobile o1, Mobile o2) { 
		return o1.getModel().compareTo(o2.getModel());
	}

	
}
