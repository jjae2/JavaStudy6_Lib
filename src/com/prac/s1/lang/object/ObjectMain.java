package com.prac.s1.lang.object;

public class ObjectMain {

	public static void main(String[] args) {
		ObjectStudy1 os1= new ObjectStudy1();
		os1.study1();
		Car car =new Car();
		System.out.println("car"+car);
		Object obj =car;
		FireCar fc = new FireCar();
		fc.hashCode();
		obj =fc;
		boolean check = car.equals(fc);
		

	}

}
