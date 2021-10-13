package OutPut;

import java.util.Arrays;
import java.util.Map;

import View.MenuView;
import View.generateRandom;

public class result {
	private int total;
	MenuView menu;
	private static final String inv_sub = "Invoice for Sub";

	public void result(Integer crustSize, Integer fillingSize, String[] toppingSize, Map<Integer, String> crust, Map<Integer, Integer> crustRate,
			Map<Integer, String> fillings, Map<Integer, Integer> fillingsRate, Map<Integer, String> topping,
			Map<Integer, Integer> toppingRate) {
		System.out.println(inv_sub);
		int toppingTotal = 0;

		System.out.println("Crust - " + crust.get(crustSize) + " - " + crustRate.get(crustSize) + " Rs");
		System.out.println("Filling - " + fillings.get(crustSize) + " - " + fillingsRate.get(fillingSize) + " Rs");
		int lowPrice = 0;
		if (toppingSize.length > 2) {
			int allToopings[] = { toppingRate.get(Integer.parseInt(toppingSize[0])), toppingRate.get(Integer.parseInt(toppingSize[1])), toppingRate.get(Integer.parseInt(toppingSize[2])) };
			Arrays.sort(allToopings);
			lowPrice = allToopings[0];
		}
		boolean check = false;
		for (String top : toppingSize) {
			if(!check && (lowPrice == toppingRate.get(Integer.parseInt(top)))) {
				check = true;
				System.out.println("Topping - " + topping.get(Integer.parseInt(top)) + " - "
						+ "0" + " Rs" + " (Note: this is 0 since more than 2 topping)");
			}else {
			System.out.println("Topping - " + topping.get(Integer.parseInt(top)) + " - "
					+ toppingRate.get(Integer.parseInt(top)) + " Rs");
			toppingTotal += toppingRate.get(Integer.parseInt(top));
			}
		}

		total = crustRate.get(crustSize) + fillingsRate.get(fillingSize) + toppingTotal;
		System.out.println("Total - " + total + " Rs");

		showReust(total);

	}

	private void showReust(Integer total) {
		System.out.println("enter to confirm");

		try {
			System.in.read();
		} catch (Exception e) {
		}
		System.out.println("Your Subway order is placed for " + total + " Rs");

	}
}
