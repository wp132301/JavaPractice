/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ Score
 *
 *	1. 개요 :
 *	2. 작성일 : 2015. 5. 13.
 *  </pre>
 *
 * @author		: 강지훈
 * @version		: 1.0
 */
public class Score {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		
		
		StringBuilder sb = new StringBuilder();
		sb.append("<<점수 출력>>\n");
		
		sb.append(String.format("국어 점수 출력 : %d점\n", kor));
		sb.append(String.format("수학 점수 출력 : %d점\n", math));
		sb.append(String.format("영어 점수 출력 : %d점\n", eng));
		sb.append(String.format("총점 : %d\n", kor+eng+math));
		sb.append(String.format("평균 : %.1f\n", (kor+eng+math)/3.0));
		
		System.out.println(sb);
		
	}
}
