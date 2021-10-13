package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import OutPut.result;

public class Incrdiples {

	private generateRandom gen;
	private result res;
	private int crust;
	private int filling;
	private String[] topping;

	public Incrdiples() {

	}

	void getRandon() {
		List<Integer> list = new ArrayList();

		list.add(1);
		list.add(2);
		list.add(3);
		gen = new generateRandom();
		Random rand = new Random();
		int num = 3;

		crust = list.get(rand.nextInt(list.size()));
		filling = list.get(rand.nextInt(list.size()));
		List<String> list2 = new ArrayList();
		list2.add("1");
		list2.add("2");
		if (!(filling == 1 || filling == 3)) {
			list2.add("3");
		}
		list2.add("4");
		List<String> newList = new ArrayList<>();
		for (int i = 0; i < list2.size(); i++) {

			int randomIndex = rand.nextInt(list2.size());
			if (newList.indexOf(list2.get(randomIndex)) == -1) {
				newList.add(list2.get(randomIndex));
			}
		}
		topping = newList.toArray(new String[newList.size()]);

		res = new result();
		res.result(crust, filling, topping, gen.crust, gen.crustRate, gen.fillng, gen.fillngRate, gen.toppings, gen.toppingsRate);
	}
}
