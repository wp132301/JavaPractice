package org.dimigo.basic;

public class Conditon {
	public static void main(String[] args) {
		int fee1 = 850;
		int fee2 = 300;
		int fee3 = 600;
		int fere = 0;
		int distance = 10;
		int addfere1 = 300;
		int addfere2 = 200;
		String car = "고속버스";
		
		switch(car) {
		case "고속버스":
			if(distance <= 10) {
				fee1 += 0;
				fere = fee1;
			} else if(distance <= 20) {
				fee1 += addfere1;
				fere = fee1;
			} else if(distance <= 30) {
				fee1 += addfere1*2;
				fere = fee1;
			}
			break;
		case "경차":
			if(distance <= 10) {
				fee2 += 0;
				fere = fee2;
			} else if(distance <= 20) {
				fee2 += addfere2;
				fere = fee2;
			} else if(distance <= 30) {
				fee2 += addfere2*2;
				fere = fee2;
			}
			break;
		default:
			if(distance <= 10) {
				fee3 += 0;
				fere = fee3;
			} else if(distance <= 20) {
				fee3 += addfere2;
				fere = fee3;
			} else if(distance <= 30) {
				fee3 += addfere2*2;
				fere = fee3;
			}
			
		}
		System.out.println("<<고속도로 통행료 계산>>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + fere + "원");
	}
}
