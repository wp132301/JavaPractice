/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ SnackTest
 *
 *	1. 개요 :
 *	2. 작성일 : 2015. 5. 19.
 *  </pre>
 *
 * @author		: 강지훈
 * @version		: 1.0
 */
public class SnackTest {
	public static void main(String[] args) {
		
		int sum=0;
		
		Snack[] snackarr = new Snack[] {
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)
		};
		
		for(Snack snack : snackarr) {
			System.out.println("이름 : " + snack.getName());
			System.out.println("제조사 : " + snack.getCompany());
			System.out.println("가격 : " + String.format("%,d",snack.getPrice()) + "원");
			System.out.println("개수 : " + snack.getNumber() + "개");
			sum+= snack.getPrice()*snack.getNumber();
		}
		System.out.println();
		
		System.out.println("총 구매 금액 : " + String.format("%,d",sum) + "원");
	}
}