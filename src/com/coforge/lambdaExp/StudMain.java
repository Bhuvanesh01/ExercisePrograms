package com.coforge.lambdaExp;

public class StudMain {

	public static void main(String[] args) {
		
		Student sd = new Student();
		StudDetails details = new StudDetailsImpl();
		sd.printDetails("Ram", "Pune", details, 90,85,56);
		
		sd.printDetails("Ramesh", "Pune", details, 90,85);
		sd.printDetails("Ramu", "Delhi",details, 90,85,56,85,45);
		sd.printDetails("Sam", "Delhi", (marks)->{
			int sum =0;
			double avg = 0;
			for(int val:marks) {
			sum += val;
		}
		avg = (sum/marks.length);
		return avg;
		}, 90,85,56,85,87,41,52);
	}

}

