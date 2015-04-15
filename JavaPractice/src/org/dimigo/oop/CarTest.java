/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ CarTest
 *
 *	1. 개요 :
 *	2. 작성일 : 2015. 4. 14.
 *  </pre>
 *
 * @author		: 강지훈
 * @version		: 1.0
 */
public class CarTest {
	public static void main(String[] args) {
//		Car car[] = {new Car(), new Car(), new Car()};
//		car[0].setCompany("현대자동차");
//		car[0].setModel("제네시스");
//		car[0].setColor("검정색");
//		car[0].setMaxSpeed(225);
//		car[0].setPrice(50000000);
//		
//		car[1].setCompany("기아자동차");
//		car[1].setModel("K7");
//		car[1].setColor("흰색");
//		car[1].setMaxSpeed(246);
//		car[1].setPrice(40000000);
//		
//		car[2].setCompany("삼성자동차");
//		car[2].setModel("SM7");
//		car[2].setColor("회색");
//		car[2].setMaxSpeed(200);
//		car[2].setPrice(38000000);
//		
		Car3 car[] = {new Car3("현대자동차", "제네시스", "검정색", 225, 50000000), new Car3("기아자동차", "K7", "흰색", 246), new Car3("삼성자동차", "SM7", "회색")};
		
		System.out.println("제조사명 : " + car[0].getCompany());
		System.out.println("모델명 : " + car[0].getModel());
		System.out.println("색상 : " + car[0].getColor());
		System.out.println("최대속도 : " + car[0].getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d",car[0].getPrice()) + "원");
		
		System.out.println("제조사명 : " + car[1].getCompany());
		System.out.println("모델명 : " + car[1].getModel());
		System.out.println("색상 : " + car[1].getColor());
		System.out.println("최대속도 : " + car[1].getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d",car[1].getPrice()) + "원");
		
		System.out.println("제조사명 : " + car[2].getCompany());
		System.out.println("모델명 : " + car[2].getModel());
		System.out.println("색상 : " + car[2].getColor());
		System.out.println("최대속도 : " + car[2].getMaxSpeed() + "km");
		System.out.println("가격 : " + String.format("%,d",car[2].getPrice()) + "원");
	}
}
