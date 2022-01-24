import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Map {
	public static void main(String[] args) {
		
	
	List<Integer> li=new ArrayList<Integer>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(40);
	li.add(50);
	System.out.println("li :"+li);
/*	List<Integer> li1=new ArrayList<>();
	Iterator<Integer> i=li.iterator();
{
		while(i.hasNext()) {
			Integer value=i.next();
			Integer square=value*value;
			li1.add(square);
	}
		System.out.println("li1 :"+li1);
	}
	Stream<Integer> s=li.stream();
	Stream<Integer> s1=s.map((x)->x*x);
    System.out.println(s1);
	System.out.println(s1.count());
	Object[] o=s1.toArray();
	for(Object o1:o) {
		System.out.println(o1);
	}
	List<Integer> l1=s1.collect(Collectors.toList());
	System.out.println("l1 "+l1);*/
		
	List<Integer> li1=li.stream().map((x)-> x*x).collect(Collectors.toList());
	System.out.println("li1 :"+li1);
	}

}
