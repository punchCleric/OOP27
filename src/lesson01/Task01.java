package lesson01;

import java.util.*;

public class Task01 {
	
	public static void removeAllOdd(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i ++) {
			if(list.get(i) % 2 == 1) {
				list.remove(i);
				i--;
			}
		}
	}
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(5);
		list.add(5);
		list.add(14);
		list.add(5);
		list.add(8);
		list.add(10);
		System.out.println(list);

		
		list.removeIf((e) -> e % 2 == 1);
		list.forEach((e) -> System.out.print(e + " "));
		//removeAllOdd(list);
		System.out.println(list);
		
		Scanner scn = new Scanner(System.in);
		
	}
}
