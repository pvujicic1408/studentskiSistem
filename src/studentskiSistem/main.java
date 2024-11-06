package studentskiSistem;

import java.util.Scanner;

public class main {
	
	private static Scanner tastatura = new Scanner(System.in);

	
	public static void main(String[] args) {
		while(true) {
			System.out.println("1. Dodaj studenta");
			System.out.println("2. Prikazi sve studente i njihove prosecne ocene");
			System.out.println("3. Prikazi studente sa prosekom iznad zeljenog");
			System.out.println("4. Izlaz");
			System.out.println("Unesite redni broj: ");
			int opcija=tastatura.nextInt();
			tastatura.nextLine();
			
			switch(opcija) {
			case 1:
				 StudentskiSistem.dodajStudenta();
				break;
			case 2:
				StudentskiSistem.prikaziSveStudente();
				break;
			case 3:
				StudentskiSistem.prikaziStudenteSaProsekomIznad();
				break;
			case 4:
				System.out.print("Izlaz");
				tastatura.close();
				return;
			default:
				System.out.println("Pogresan unos. Pokusajte ponovo.");
			}
		}		
	}
}
