/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 * org.dimigo.inheritance
 * 	|_ SmartPhoneTest
 *
 *	1. 개요 :
 *	2. 작성일 : 2015. 8. 28.
 *  </pre>
 *
 * @author		: 강지훈
 * @version		: 1.0
 */
public class SmartPhoneTest {

	public static void main(String[] args) {
		
		SmartPhone[] phones = {
				new IPhone("iPhone6", "애플", 700000),
				new Galaxy("갤럭시 s6", "삼성", 650000)
		};
		
		for(SmartPhone phone : phones) {
			System.out.println(phone);
			phone.turnOn();
			phone.pay();
			
			phone.useSpecialFunction();
			
			phone.turnoff();
			System.out.println();
			
		}
		
		
		
		
	}
}
