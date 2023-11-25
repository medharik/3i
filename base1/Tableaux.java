package base1;

public class Tableaux {
public static void main(String[] args) {
	
	//tableau : ensemble de donnees indexees de meme type (et de taille fixe)
	double notes[];
//	System.out.println(notes[0]);
	//instanciation 
	notes=new double[3];
	System.out.println("note 0 est "+notes[0]);
	notes[0]=12;
	notes[1]=12/3;
	notes[2]=21/7.0;

//	System.out.println(" x est "+x);
	System.out.println("longueur du tableau : "+notes.length);
	System.out.println(" x est "+(12/5.0));
//	ou 
	
	for (int i = 0; i < notes.length; i++) {
		System.out.println("note "+i+" est "+notes[i]);
	}
	//foreach 
	for (double d : notes) {
		System.out.println("d est "+d);
	}
// initializer 
	int qtes[]=new int[2];
	qtes[0]=10;
	qtes[1]=20;
// ou bien , on utilise un initializer de tableau
	int qtes2[]= {10,20};
	
	
	

	
	
}
}
