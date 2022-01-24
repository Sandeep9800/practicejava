import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AllMatch {
	public static void main(String[] args) {
		List<String> li = new ArrayList<>();
		li.add("corejava advancedjava Springboot");
		li.add("aws datascience");
		li.add("html,javascript");
		Stream<String> s = li.stream();
		boolean b2=s.allMatch((x)->{
			return x.startsWith("core");
		});
		System.out.println(b2);
	}


}
