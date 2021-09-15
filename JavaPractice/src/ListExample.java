import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ListExample {
	


	public static void main(String[] args) {
		List<String> keys = new ArrayList<String>();
		keys.add("a");
		keys.add("b");
		keys.add("c");
		List<String> values = new ArrayList<String>();
		values.add("x");
		values.add("y");
		values.add("z");
		Map<String , String> map = new LinkedHashMap<String , String>();
		for(int i=0;i<keys.size();i++) {
			map.put(keys.get(i), values.get(i));
			
		}
		
		System.out.println(map);
	}

}
