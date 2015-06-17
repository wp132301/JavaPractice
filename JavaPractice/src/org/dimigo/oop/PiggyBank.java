/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ PiggyBank
 *
 *	1. 개요 :
 *	2. 작성일 : 2015. 6. 16.
 *  </pre>
 *
 * @author		: 강지훈
 * @version		: 1.0
 */
public class PiggyBank {
	private static int balance;
	
	public static void putMoney(FamilyMember member, int amount) {
		balance += amount;
		System.out.println(member.getMemberName() + " " + amount + "넣음");
	}
	
	public static void printBalance() {
		System.out.println("저금통 총 금액 : " + balance + "원");
	}
}
