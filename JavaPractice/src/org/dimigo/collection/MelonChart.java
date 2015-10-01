/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * org.dimigo.collection
 * 	|_ MelonChart
 *
 *	1. 개요 :
 *	2. 작성일 : 2015. 9. 25.
 *  </pre>
 *
 * @author		: 강지훈
 * @version		: 1.0
 */
public class MelonChart {
	
	public static void main(String[] args) {
		
	
		List<Music> list = new ArrayList<>();
		list.add(new Music("바람이나 좀 쐐", "개리"));
		list.add(new Music("보통연애", "박경"));
		list.add(new Music("취향저격", "ikon"));
		System.out.println("<<멜론 차트>>");
		printList(list);
		
		list.add(new Music("레옹", "이유갓지"));	
		System.out.println("<<2위곡 추가>>");
		printList(list);
		System.out.println();
		
		list.set(2,new Music("맙소사", "황태지"));	
		System.out.println("<<3위곡 변경>>");
		printList(list);
		System.out.println();
		
		list.remove(3);
		System.out.println("<<4위곡 삭제>>");
		printList(list);
		System.out.println();
		
		list.clear();
		System.out.println("<<전체 리스트 삭제>>");
		printList(list);
		System.out.println();
		
	}
	
	public static void printList(List<Music> list) {
		for(int i=0; i<list.size(); i++) {
			System.out.println(String.format("%d. %s", i+1, list.get(i).toString()));
		}
		
		
	}
	
}
