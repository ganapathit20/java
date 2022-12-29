package Collections;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(6);
		list.add(8);
		list.add(10);

		// System.out.println(list.size());

		// Iterator<Integer> obj = list.iterator();
		// while (obj.hasNext()) {
		// System.out.println(obj.next());
		// }

		// for(int i=0; i<list.size(); i++) {
		// System.out.println(list.get(i));
		// }

		for (int h : list) {
			System.out.println(h);
		}

	}

}
