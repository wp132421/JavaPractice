/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * org.dimigo.collection >> MelonChart
 *
 * @author joona0825
 */
public class MelonChart {
	public static void main(String[] args) {
		List<Music> list = new ArrayList<>();
		list.add(new Music("Live Forever", "Oasis"));
		list.add(new Music("The Masterplan", "Oasis"));
		list.add(new Music("From Me To You", "The Beatles"));
		System.out.println("-- << 멜론 차트 >> --");
		printList(list);

		list.add(1, new Music("Don't Look Back In Anger", "Oasis"));
		System.out.println("-- << 2위 곡 추가 >> --");
		printList(list);
		System.out.println();
		
		list.set(2, new Music("In the Heat Of The Moment", "Noel Gallagher's High Flying Birds"));
		System.out.println("-- << 3워 곡 변경 >> --");
		printList(list);
		System.out.println();

		list.remove(3);
		System.out.println("-- << 4위 곡 삭제 >> --");
		printList(list);
		System.out.println();

		list.clear();
		System.out.println("-- << 전체 리스트 삭제 >> --");
		printList(list);
		System.out.println();
	}
	
	public static void printList(List<Music> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(String.format("%d. %s", i+1, list.get(i).toString()));
		}
	}

}
