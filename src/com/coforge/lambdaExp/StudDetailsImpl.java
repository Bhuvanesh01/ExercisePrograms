package com.coforge.lambdaExp;

public class StudDetailsImpl implements StudDetails {
	@Override
	public double getAverage(int... marks) {
		int sum =0;
		double avg = 0;
		for(int val:marks) {
		sum += val;
	}
	avg = (sum/marks.length);
	return avg;
	}
}
