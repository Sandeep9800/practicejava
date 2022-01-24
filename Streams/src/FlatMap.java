import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMap {
	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("Sandeep Saam Amsa");
		li.add("Sandy Chintu");
		li.add("Amsa");
		Stream<String> s=li.stream().flatMap((String x)->{
			String[] value=x.split(" ");
			return Arrays.asList(value).stream();
		});
		System.out.println(s.count());
		System.out.println(li);
//		List<String> li1=s.collect(Collectors.toList());
//		System.out.println("li1 :"+li1);
		Object[] o=s.toArray();
		for(Object o1:o) {
			System.out.println(o1);
			
		}
		
	}

}
