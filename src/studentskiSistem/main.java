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
			
			OpcijeMenija izabranaOpcija = OpcijeMenija.izOpcije(opcija);
			
			switch(izabranaOpcija) {
			case DODAJ_STUDENTA:
				 StudentskiSistem.dodajStudenta();
				break;
			case PRIKAZI_SVE_STUDENTE:
				StudentskiSistem.prikaziSveStudente();
				break;
			case PRIKAZI_STUDENTE_SA_PROSEKOM:
				StudentskiSistem.prikaziStudenteSaProsekomIznad();
				break;
			case IZLAZ:
				System.out.print("Izlaz");
				tastatura.close();
				return;
			}
		}		
	}
}
