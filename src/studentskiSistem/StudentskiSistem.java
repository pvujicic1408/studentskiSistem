package studentskiSistem;

import java.util.List;
import java.util.Scanner;

public class StudentskiSistem {
	private static List<Student> studenti;
	private static Scanner tastatura = new Scanner(System.in);
	
	public static void dodajStudenta() {
		System.out.print("Unesite ime: ");
		String ime=tastatura.nextLine();
		
		System.out.print("Unesite prezime: ");
        String prezime = tastatura.nextLine();
		
        System.out.print("Unesite broj indeksa: ");
        String brojIndeksa = tastatura.nextLine();
        
        Student student=new Student(ime,prezime,brojIndeksa);
        
        System.out.print("Unesite ocene (npr. 9 8 10): ");
        String[] oceneStr= tastatura.nextLine().split(" ");    
        student.dodajOcenu(oceneStr);
        
        studenti.add(student);
        System.out.println("Student uspesno dodat!");
	}
	
	public static void prikaziSveStudente() {
		for(Student student:studenti) {
			 System.out.printf("Student: %s %s, Indeks: %s, Prosek: %.2f%n",
	                    student.getIme(), student.getPrezime(), student.getBrojIndeksa(), student.izracunajProsek());
		}
	}
	
	public static void prikaziStudenteSaProsekomIznad() {
		System.out.print("Unesite minimalni prosek: ");
        double minProsek = tastatura.nextDouble();
        
        System.out.println("Studenti sa prosekom iznad " + minProsek + ":");
        for(Student student:studenti) {
        	if(student.izracunajProsek()>minProsek) {
        		System.out.printf("%s %s%n", student.getIme(), student.getPrezime());
        	}
        }
	}
}


