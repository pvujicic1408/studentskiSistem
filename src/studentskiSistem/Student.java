package studentskiSistem;

import java.util.*;

class Student {
    private String ime;
    private String prezime;
    private String brojIndeksa;
    private List<Integer> ocene;

    public Student(String ime, String prezime, String brojIndeksa) {
        setIme(ime);
        setPrezime(prezime);
        setBrojIndeksa(brojIndeksa);
        this.ocene = new ArrayList<>();
    }

    public void setIme(String ime) {
        if (ime.matches("[a-zA-Z]+")) {
            this.ime = ime;
        } else {
            System.out.println("Nevalidan unos. Pokusajte ponovo.");
            System.exit(0);
        }
    }

    public void setPrezime(String prezime) {
        if (prezime.matches("[a-zA-Z]+")) {
            this.prezime = prezime;
        } else {
            System.out.println("Nevalidan unos. Pokusajte ponovo.");
            System.exit(0);
        }
    }

    public void setBrojIndeksa(String brojIndeksa) {
        if (brojIndeksa.matches("[0-9]+")) {
            this.brojIndeksa = brojIndeksa;
        } else {
            System.out.println("Nevalidan unos. Pokusajte ponovo.");
            System.exit(0);
        }
    }

    public void dodajOcenu(String[] oceneStr) {
        for (String ocenaStr : oceneStr) {
            try {
                int ocena = Integer.parseInt(ocenaStr);
                if (ocena >= 5 && ocena <= 10) {
                    ocene.add(ocena);
                } else {
                    System.out.println("Ocena mora biti u opsegu od 5 do 10. Ignorisano.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Nevalidna ocena. Ignorisano.");
            }
        }
    }

    public double izracunajProsek() {
        if (ocene.isEmpty()) {
            return 0.0;
        }
        int zbirOcena = 0;
        for (int ocena : ocene) {
            zbirOcena += ocena;
        }
        return zbirOcena / (double) ocene.size();
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public String getBrojIndeksa() {
        return brojIndeksa;
    }
}
