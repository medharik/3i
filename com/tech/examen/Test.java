package com.tech.examen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {
public static void main(String[] args) {
	
	TechncienDev td=new TechncienDev(10, "dev", 2800, 10);
	TechnicienReseaux tr=new TechnicienReseaux(11,"tech Reseaux", 40,80);
	Produit hp =new Produit(1000, 10, "hp dv8");
	Chargeable charge[]= {tr,td,hp};
List <Affichable> a=new LinkedList<>();
Affichable dell=new Produit(90, 1, "dell");
dell.afficher();
a.add(hp);
a.add(tr);
a.add(td);

for (int i = 0; i < a.size(); i++) {
a.get(i).afficher();
}

	double totalCharge=0;
	for (int i = 0; i < charge.length; i++) {
totalCharge+=charge[i].calculerCharge();
	}
	System.out.println("Total des charges est "+totalCharge+"$");
	
}
}
