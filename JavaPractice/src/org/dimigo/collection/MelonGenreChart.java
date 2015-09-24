/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * org.dimigo.collection >> MelonChart
 *
 * @author joona0825
 */
public class MelonGenreChart {
	public static void main(String[] args) {
		Map<String, List<Music>> map = new HashMap<>();

		List<Music> _70rock = new ArrayList<>();
		List<Music> _90rock = new ArrayList<>();

		_70rock.add(new Music("Hotel California", "Eagles"));
		_70rock.add(new Music("Walk Away", "Joe Walsh"));
		_70rock.add(new Music("Imagine", "John Lennon"));
		_90rock.add(new Music("Live Forever", "Oasis"));
		_90rock.add(new Music("Supersonic", "Oasis"));

		map.put("70년대 록", _70rock);
		map.put("90년대 록", _90rock);

		System.out.println("-- << 멜론 장르별 차트 >> --");
		printMap(map);
		System.out.println();
		
		_70rock.set(2, new Music("Let Me Roll In", "Paul McCartney"));
		map.replace("70년대 록", _70rock);
		System.out.println("-- << 70년대 록 3위 곡 변경 >> --");
		printMap(map);
		System.out.println();
		
		_70rock.remove(0);
		map.replace("70년대 록", _70rock);
		System.out.println("-- << 70년대 록 1위 곡 삭제 >> --");
		printMap(map);
		System.out.println();
		
		map.clear();
		System.out.println("-- << 전체 리스트 삭제 >> --");
		printMap(map);
		System.out.println();
		
	}
	
	public static void printMap(Map<String, List<Music>> map) {
		for(String key : map.keySet()) {
			System.out.println("[" + key + "]");
			List<Music> list = map.get(key);
			for(int i = 0; i < list.size(); i++) {
				System.out.println(String.format("%d. %s", i+1, list.get(i)));
			}
		}
	}

}
