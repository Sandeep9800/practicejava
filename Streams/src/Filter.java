import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(5);
		li.add(10);
		li.add(15);
		li.add(20);
		li.add(25);
		li.add(30);
		li.add(35);
		li.add(40);
		System.out.println("li :" + li);
		/*
		 * List<Integer> li1 = new ArrayList<>(); Iterator<Integer> i = li.iterator();
		 * while (i.hasNext()) { Integer value = i.next(); if (value % 2 == 0) { Integer
		 * square = value * value; li1.add(square); }
		 * 
		 * } System.out.println("li1 :" + li1);
		 */
		List<Integer> li1 = li.stream().filter((x) -> x % 2 == 0).map((x) -> x * x).collect(Collectors.toList());
		System.out.println("li1 :" + li1);
	}
}
