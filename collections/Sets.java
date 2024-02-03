package collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
public static void main(String[] args) {

	Set<String> set1= new TreeSet<>();
	List<String> liste1 = Arrays.asList("acer","toshiba");
	
	 set1.add("hp");
	set1.add("dell");
	set1.add("sony");
	set1.add("hp");
	set1.addAll(liste1);
	
	
	System.out.println("set 1 : "+set1);
	
	//avec iterator
	Iterator<String> iSet = set1.iterator();
	while (iSet.hasNext()) {
		String prod = iSet.next();
		System.out.println("prod est "+prod);
		
	}
	//for each
	for (String prd : set1) {
		System.out.println("prd est "+prd);
	}
	
}
}
