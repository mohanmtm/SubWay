import java.util.Scanner;

import View.MenuView;

public class SubWay {
	private static MenuView menu;

	public static void main(String[] args) {
		init();
	}

	private static void init() {
		MenuView m = new MenuView();

		m.CustomerOrder();
		Scanner sc = new Scanner(System.in);
	}

}
