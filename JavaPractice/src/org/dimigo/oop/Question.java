/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ Question
 *
 *	1. 개요 :
 *	2. 작성일 : 2015. 5. 12.
 *  </pre>
 *
 * @author		: 강지훈
 * @version		: 1.0
 */
public class Question {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("나의 이름은?");
		String answer = scanner.nextLine();
		if("강지훈".equals(answer)) {
			System.out.println("맞아브럿다");
		} else {
			System.out.println("틀렷당께");
		}
		
		System.out.println("내짝궁이름은?");
		String answer2 = scanner.nextLine();
		if("조준희".equals(answer2)) {
			System.out.println("맞아브럿다");
		} else {
			System.out.println("틀렷당께");
		}
		
		System.out.println("강동원보다 잘생긴 사람은?");
		String answer3 = scanner.nextLine();
		if("이지호".equals(answer3)) {
			System.out.println("맞아브럿다");
		} else {
			System.out.println("틀렷당께");
		}
	}
}
