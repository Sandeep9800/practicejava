import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Distinct {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<>();
		li.add(10);
		li.add(23);
		li.add(46);
		li.add(10);
		li.add(38);
		li.add(23);
		li.add(68);
		li.add(45);
		List<Integer> li1 = li.stream().distinct().filter((x) -> x % 2 == 0).map((x) -> x * x).limit(3)
				.collect(Collectors.toList());
		System.out.println("li1 :" + li1);

	}

}
