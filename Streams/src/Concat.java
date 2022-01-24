import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Concat {
	public static void main(String[] args) {
		List<Integer> li=new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		
		List<Integer> li1=new ArrayList<>();
		li1.add(50);
		li1.add(60);
		li1.add(70);
		li1.add(80);
		Stream<Integer> s1=li.stream();
		Optional<Integer> o=s1.reduce((x,y)->{
			return x+y;
		});
		if(o.isPresent()) {
			System.out.println(o.get());
		}
//		Stream<Integer> s2=li1.stream();
//		Stream<Integer> s=Stream.concat(s1, s2);
//		s.forEach((s3)->{
//			System.out.println(s3);
//		});
	}

}
