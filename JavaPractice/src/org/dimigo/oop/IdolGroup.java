/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * org.dimigo.oop
 * 	|_ IdolGroup
 *
 *	1. 개요 :
 *	2. 작성일 : 2015. 5. 27.
 *  </pre>
 *
 * @author		: 강지훈
 * @version		: 1.0
 */
public class IdolGroup {
	public static void main(String[] args) {
		String[] idolGroup = {"빅뱅", "2ne1", "걸스데이"};
		String[][] members = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "소진", "민아", "혜리"}
		};
		
		for(int i=0; i<idolGroup.length; i++) {
			
			System.out.println("<< " + idolGroup[i] + "멤버 >>");
			
			for(String member : members[i]) {
				System.out.println(member);
			}
			System.out.println();
		}
		
		System.out.println();
		
	}
}
