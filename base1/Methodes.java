package base1;

import java.util.Scanner;

public class Methodes {

	public static void main(String[] args) {
		
		int i=0;
		i++;
		System.out.println("1- i est "+i);
		++i;
		System.out.println("2- i est "+i);
		i=2;
		if(i++ == 2) {
			System.out.println("OK");
		}else {
			System.out.println("KO");
		}
		//i=3
		System.out.println("i est "+(i++));
		System.out.println("i est "+i);
		int age=20;
		i=4;
		boolean selectionable=(age>=12 && ++i<=4);
		System.out.println(selectionable+" , i = "+i);
		
		int nombreNote=saisirNombreNote();
		double notes []=saisirNotes(nombreNote);
	double moyenne=	 calculerMoyenne(notes);
	afficherMoyenne(moyenne);
	afficherDecision(moyenne);


	}

	private static int saisirNombreNote() {
		Scanner clavier=new Scanner(System.in);
	int nombreNote=0;
	int nombreTentative=3;
	boolean nombreValide=false;
		do {
	System.out.println("Entrer le nombre de notes");
	 nombreNote=clavier.nextInt();
	 
	 nombreValide=nombreNote>0;
	 
		if (!nombreValide) {
			if (--nombreTentative==0) {
				System.out.println("Arret du programme");

				return 0 ;

			}
			System.out.println("Erreur, nombre de note doit etre >0,il vous reste "+nombreTentative+" tentative(s)");
			
		}
		}while(!nombreValide);
		
		
		return nombreNote;
	}

	private static void afficherMoyenne(double moyenne) {
		System.out.println("la moyenne est "+moyenne);
	}

	private static void afficherDecision(double moyenne) {
		if (moyenne>=10) {
			System.out.println("MODULE VALIDE");
		} else {
System.out.println("MODULE NON VALIDE");
		}
		
	}

	private static double calculerMoyenne(double[] notes) {
	double somme=0;
	for (int i = 0; i < notes.length; i++) {
		somme+=notes[i];
	}
		
		return somme/notes.length;
	}

	private static double[] saisirNotes(int n) {
		Scanner clavier =new Scanner(System.in);
		double notes[]=new double [n];
	   boolean noteValide=false;
		for (int i = 0; i < n; i++) {
			
		do {	
			System.out.println("Entrer la note numero "+(i+1));
			notes[i]=clavier.nextDouble();
			noteValide=notes[i]>=0 && notes[i]<=20;
			if (!noteValide) {
				System.out.println("Note incorrecte");
			}
		}while(!noteValide);
			
			
			
		}
		
		return notes;
	}
	
	}

