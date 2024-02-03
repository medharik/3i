package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Liste {
 
 public static void main(String[] args) {
	 int t[]=new int[2];//taile fixe, on ne peut modifier par la suite 
	 t[0]=100;
	 t[1]=200;
//	t= {1,2,3,4}
	// t[2]=9;
	 
//collection => tableaux dynamiques
	 // 1- LIST
	 //2-SET
	 //3- MAP
	 List<String> list1=new LinkedList<>();
	 list1.add("hp");
	 list1.add("dell");
	 list1.add("sony");
	 
List<String> l1 = Arrays.asList("acer","toshiba","hp");
	 list1.addAll(l1);
	 
 System.out.println("liste 1 est "+list1);

for (String mot : list1) {
	System.out.println(" mot "+mot);
}
Iterator<String> iList = list1.iterator();
System.out.println(iList.next());

while (iList.hasNext()) {
	System.out.println(" avec iterator  "+iList.next());	
}
if (list1.contains("DELL")) {
	System.out.println("TRUE");
}

for (int i = 0; i < list1.size(); i++) {
	System.out.println("produit "+(i+1)+" est "+list1.get(i));	
}



}
	
	
}
