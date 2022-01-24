import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
public class HashMap1 {
	public static void main(String[] args) {
		HashMap<String, Integer> map=new HashMap<>();
		map.put("Siddhartha", 15);
		map.put("Harshitha", 19);
		map.put("Sandeep", 23);
		map.put("Anil", 26);
		map.put("Kavitha", 28);
		System.out.println(map);
		map.put("Sandeep", 22);
		System.out.println(map);
		Set<String> set=map.keySet();
		System.out.println(set);
		Collection<Integer> collection=map.values();
		System.out.println(collection);
		Set<Entry<String, Integer>> entrySet=map.entrySet();
		Iterator<Entry<String, Integer>> entrySetItr=entrySet.iterator();
		while (entrySetItr.hasNext()) {
			Map.Entry<String, Integer> entry=entrySetItr.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
			if(entry.getKey().equalsIgnoreCase("sandeep")) {
				entry.setValue(21);
//				System.out.println(entry.getKey()+":"+entry.getValue());
			}
			
		}
		System.out.println(map);
			}

}
