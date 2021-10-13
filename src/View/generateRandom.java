package View;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.REUtil;

import OutPut.result;

public class generateRandom {

	private MenuView menu;
	private result res;
	private int hard = 10;
	private String HARD = "Hard";
	private int thin = 10;
	private String THIN = "Thin";
	private int soft = 12;
	private String SOFT = "Soft";
	private int chick_tikka = 120;
	private String CHICKEN_TIKKA = "Chicken Tikka";
	private int paneer_tikka = 100;
	private String PANEER_TIKKA = "Panner Tikka";
	private int turkey_meat = 130;
	private String TURKEY_MEET = "Turkey Meat";

	private int cucumber = 25;
	private String CUCUMBER = "Cucumber";
	private int tomato = 20;
	private String TOMATO = "Tomato";
	private int meet_stript = 45;
	private String MEET_STRIP = "Meat Strip";
	private int cabbage = 20;
	private String CABBAGE = "Cabbage";
	public Map<Integer, String> crust = new LinkedHashMap<Integer, String>();
	public Map<Integer, Integer> crustRate = new LinkedHashMap<Integer, Integer>();
	public Map<Integer, String> fillng = new LinkedHashMap<Integer, String>();
	public Map<Integer, Integer> fillngRate = new LinkedHashMap<Integer, Integer>();
	public Map<Integer, String> toppings = new LinkedHashMap<Integer, String>();
	public Map<Integer, Integer> toppingsRate = new LinkedHashMap<Integer, Integer>();

	private int crustchoice;
	private int fillingchoice;
	private String toppingchoice;

	public generateRandom() {
		crust.put(1, HARD);
		crustRate.put(1, hard);
		crust.put(2, THIN);
		crustRate.put(2, thin);
		crust.put(3, SOFT);
		crustRate.put(3, soft);
		fillng.put(1, CHICKEN_TIKKA);
		fillngRate.put(1, chick_tikka);
		fillng.put(2, PANEER_TIKKA);
		fillngRate.put(2, paneer_tikka);
		fillng.put(3, TURKEY_MEET);
		fillngRate.put(3, turkey_meat);
		toppings.put(1, CUCUMBER);
		toppingsRate.put(1, cucumber);
		toppings.put(2, TOMATO);
		toppingsRate.put(2, tomato);
		toppings.put(3, MEET_STRIP);
		toppingsRate.put(3, meet_stript);
		toppings.put(4, CABBAGE);
		toppingsRate.put(4, cabbage);

	}

	public void optionCrust() {
		System.out.println("Select \"Crust\" (Max of 1)");
		for (int i = 1; i <= crust.size(); i++) {
			System.out.println(i + ") " + crust.get(i) + "- " + crustRate.get(i) + " Rs");
		}
		crustchoice = menu.sc.nextInt();
		optionFillng(crustchoice);
	}

	public void optionFillng(Integer crustchoice) {
		System.out.println("Select \"fillng\" (Max of 1)");
		for (int i = 1; i <= fillng.size(); i++) {
			System.out.println(i + ") " + fillng.get(i) + "- " + fillngRate.get(i) + " Rs");
		}
		fillingchoice = menu.sc.nextInt();
		optionTopping(crustchoice, fillingchoice, "");
	}

	public void optionTopping(Integer crustchoice, Integer fillingchoice, String err) {
		System.out.println("Select \"Toppings\" (Max of 3)" + err);
		for (int i = 1; i <= toppings.size(); i++) {
			System.out.println(i + ") " + toppings.get(i) + "- " + toppingsRate.get(i) + " Rs");
		}
		if(toppingchoice == null) {
		menu.sc.nextLine();
		}
		toppingchoice = menu.sc.nextLine();
		String[] list;
		list = toppingchoice.split(",");
		Validate(crustchoice, fillingchoice, list);
	}

	public void Validate(Integer crustchoice, Integer fillingchoice, String[] list) {
		String err=null;
		if(list.length >3 ) {
			err = "  (Your toppings are more than 3. Please correct!)"+" your selection is: " +list.length;
			optionTopping(crustchoice, fillingchoice, err);
			return;
		}
		
		for (String  l : list) {
			if ((fillingchoice == 1 || fillingchoice == 3) && l.equals("3")) {
				err = "  (Meat Stript cannat add to non veg please change!!!)";
				optionTopping(crustchoice, fillingchoice, err);
				break;
		}
			
		}
		res = new result();
		res.result(crustchoice, fillingchoice, list, crust, crustRate, fillng, fillngRate, toppings,
				toppingsRate);
	}
}
