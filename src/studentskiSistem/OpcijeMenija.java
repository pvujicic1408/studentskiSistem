package studentskiSistem;

public enum OpcijeMenija {
	DODAJ_STUDENTA(1),
    PRIKAZI_SVE_STUDENTE(2),
    PRIKAZI_STUDENTE_SA_PROSEKOM(3),
    IZLAZ(4);
	
	private final int opcija;
	
	OpcijeMenija (int opcija) {
		this.opcija=opcija;
	}
	
	public int getOpcija() {
		return opcija;
	}
	
	public static OpcijeMenija izOpcije(int opcija) {
		for(OpcijeMenija om : OpcijeMenija.values()) {
			if(om.getOpcija()==opcija) {
				return om;
			}
		}
		return null;
	}

}
