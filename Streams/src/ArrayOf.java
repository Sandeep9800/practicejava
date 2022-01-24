import java.util.stream.Stream;

public class ArrayOf {
	public static void main(String[] args) {
		String[] s= {"corejava","advanced Java","aws"};
		Stream<String> s1=Stream.of(s);
//		s1.forEach((s2)->{
//			System.out.println(s2);
//		});
//		Stream<String> s2=s1.sorted();
//		s2.forEach((s3)->{
//			System.out.println(s3);
//		});
		
		Stream<Integer> s2=Stream.of(new Integer[] {10,20,30,50,70});
		Stream<Integer> s3=s2.sorted();
//		s3.forEach((s4)->{
//			System.out.println(s4);
//		});
		Object[] o=s3.toArray();
		for(Object o1:o) {
			System.out.print(o1+" ");
		}
	}

}
