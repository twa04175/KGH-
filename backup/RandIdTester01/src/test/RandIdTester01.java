package test;

import id.RandId;

public class RandIdTester01 {
	
	public static void main(String[] args) {
		RandId a = new RandId();
		RandId b = new RandId();
		RandId c = new RandId();
		
		System.out.println("a의 식별번호 : " + a.getId());
		System.out.println("b의 식별번호 : " + b.getId());
		System.out.println("c의 식별번호 : " + c.getId());
	}

}
