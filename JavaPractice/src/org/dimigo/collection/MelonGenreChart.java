/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <pre>
 * org.dimigo.collection
 * 	|_ MelonGenreChart
 *
 *	1. 개요 :
 *	2. 작성일 : 2015. 9. 30.
 *  </pre>
 *
 * @author		: 강지훈
 * @version		: 1.0
 */
public class MelonGenreChart {
	
	public static void main(String[] args) {
		
		Map<String,List<Music>> map = new HashMap<>();
		List<Music> ballad = new ArrayList<Music>();
		
		ballad.add(new Music("내 첫사랑", "베리굿"));
		ballad.add(new Music("또 다시 사랑", "임창정"));
		ballad.add(new Music("부산에 가면", "박진영"));
		map.put("발라드", ballad);
		System.out.println("-----------<<멜론 장르별 차트>>-------------");
		
		List<Music> dance = new ArrayList<Music>();
		
		dance.add(new Music("커피", "유재한,김예림"));
		dance.add(new Music("다 잘될거야", "쿨"));
		map.put("댄스", dance);
		printMap(map);
		
		System.out.println("--------<<발라드 3위곡 변경>>-----------");
		
		ballad.set(2, new Music("지우고 지워도", "차수경"));
		map.replace("발라드", ballad);
		printMap(map);
		
		System.out.println("--------<<발라드 1위곡 삭제>>-----------");
		
		ballad.remove(0);
		map.replace("발라드", ballad);
		printMap(map);
		
		System.out.println("---------<<전체 리스트 삭제>>-----------");
		
		map.clear();
		printMap(map);
		
	}
	
	public static void printMap(Map<String,List<Music>> map) {
		for(String key : map.keySet()) {
			System.out.println("[" + key + "]");
			for(int i=0; i<map.get(key).size(); i++) {
				System.out.println(i+1 + "." + map.get(key).get(i));
			}
		}
	}

}