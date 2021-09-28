package OutPut;

import java.util.Map;

import View.generateRandom;

public class result {
	private int total;
	private static final String inv_sub = "Invoice for Sub";

	public void result(Integer c, Integer f, int toppingchoice, Map<Integer, String> crust, Map<Integer, Integer> crustRate,
			Map<Integer, String> fillings, Map<Integer, Integer> fillingsRate, Map<Integer, String> topping,
			Map<Integer, Integer> toppingRate) {
		System.out.println(inv_sub);
		System.out.println("Crust - " + crust.get(c) + "- " + crustRate.get(c) + " Rs");
		System.out.println("Filling - " + fillings.get(c) + "- " + fillingsRate.get(f) + " Rs");
		System.out.println("Topping - " + topping.get(toppingchoice) + "- " + toppingRate.get(toppingchoice) + " Rs");
		total = crustRate.get(c) + fillingsRate.get(f) + toppingRate.get(toppingchoice);
		System.out.println("Total - " + total +" Rs");

	}
}
