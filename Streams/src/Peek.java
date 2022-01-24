import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Peek {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(10);
		li.add(43);
		li.add(50);
		li.stream().distinct().filter((x)-> x%2==0).limit(3).peek((x)->{System.out.println(x*x);}).count();
	}

}
