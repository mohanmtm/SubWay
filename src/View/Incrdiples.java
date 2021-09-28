package View;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import OutPut.result;

public class Incrdiples {
	
	private generateRandom gen;
	private result res;
	private int c;
	private int f;
	private int t;
	public Incrdiples() {
		
	}
void getRandon(){
	List<Integer> list = new ArrayList();
	
    list.add(1);
    list.add(2);
    list.add(3);
	gen = new generateRandom();
	Random rand = new Random();
	int num=3;
	
	c = list.get(rand.nextInt(list.size()));
	f = list.get(rand.nextInt(list.size()));
	List<Integer> list2 = new ArrayList();
	list2.add(1);
	list2.add(2);
	if(!(f == 1 || f==3)) {
	list2.add(3);
	}
	list2.add(4);
	t = list.get(rand.nextInt(list.size()));
	res = new result();
	res.result(c, f, t, gen.crust, gen.crustRate, gen.fillng, gen.fillngRate, gen.toppings,
			gen.toppingsRate);
}
}
