package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
public static void main(String[] args) {
	Map<String, String> map1=new HashMap<>();
	int id=1;
	map1.put("id", id+"");
	map1.put("libelle", "hp dv7");
	map1.put("prix","5000");
	map1.put("id", "9");
//	System.out.println("map 1 "+map1.get("libelle"));

	Iterator<String> ikeys = map1.keySet().iterator();
	while (ikeys.hasNext()) {
		String key=ikeys.next();
		System.out.println("key "+key+", value : "+map1.get(key));
		
	}
	
	for (String cle : map1.keySet()) {
		System.out.println(map1.get(cle));
	}
	
}
}
