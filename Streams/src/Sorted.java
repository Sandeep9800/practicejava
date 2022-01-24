import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sorted {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(10);
		li.add(30);
		li.add(50);
		li.add(20);
		li.add(70);
		li.add(15);
		System.out.println(li);
//		List<Integer> li1=li.stream().sorted().collect(Collectors.toList());
//		System.out.println(li1);
//		Object[] o=li.toArray();
//		for(Object o1:o) {
//			System.out.println(o1);
//		}
//		Stream<Integer> s=li.stream().sorted();
//		Object[] o=s.toArray();
//		for(Object o1:o) {
//			System.out.println(o1);
//			
//		}
		Optional<Integer> o = li.stream().min((x, y) -> {
			return x.compareTo(y);
		});
		if (o.isPresent()) {
			System.out.println(o.get());
		}
	}

}
