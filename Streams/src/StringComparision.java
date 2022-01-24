import java.util.Comparator;
import java.util.TreeSet;

class TreeString implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String str1=(String) o1;
		String str2=(String) o2;
		return str1.compareTo(str2);
	}
	
	
}
public class StringComparision {
	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new TreeString());
		treeSet.add("B");
		treeSet.add("Z");
		treeSet.add("L");
		treeSet.add("C");
		treeSet.add("M");
		System.out.println(treeSet);
	}

	}


