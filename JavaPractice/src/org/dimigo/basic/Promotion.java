package org.dimigo.basic;

public class Promotion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int month = 1700000;
		int parttime = 3;
		int count = 1500;
		long year = (long)month*12*parttime*count;
		
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : " + String.format("%,d", month) + "원");
		System.out.println("점포 내 직원 수 : " + parttime + "명");
		System.out.println("점포 수 : " + String.format("%,d", count) + "개");
		System.out.println("연간 인건비 : " +  String.format("%,d", year) + "원");
		
	}

}
