package View;
import java.util.Scanner;

import OutPut.result;
import View.Incrdiples;
public class MenuView {
	private Incrdiples incrid;
	private result res;
	private static final String HEADER = "Welcome to SubWay";
	private static final String MENU1 = "1. Order 'Sub' off the day";
	private static final String MENU2 = "2. Order Your own Sub";
	private static final String MENU3 = "3. Exit";
	private int choice;
	public static Scanner sc = new Scanner(System.in);
	public MenuView() {
		init();
	}
	public void init() {
		System.out.println(HEADER);
		System.out.println(MENU1);
		System.out.println(MENU2);
		System.out.println(MENU3);
		
	}
	
	public void CustomerOrder() {
		choice = sc.nextInt();
		generateRandom gen = new generateRandom();
		if(choice == 1) {
			
			incrid = new Incrdiples();
			incrid.getRandon();
		}
		else if(choice == 2) {
			gen.optionCrust();
		}else if(choice == 3) {
			System.out.println("Thank you");
		}
	}
}


