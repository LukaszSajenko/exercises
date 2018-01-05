package klasy;

public class Osoba {

	// Zmienne definiowane w ten sposób w klasie s¹ nazywane:
	// pola (field)
	// atrybuty (attribute)
	// zmienne instancyjne (instance variable)

	String imie, nazwisko;
	int wiek;
	
	public Osoba() {
		
	}
	
	public Osoba(String i, String n, int w){
		imie = i;
		nazwisko = n;
		wiek = w;
		
	}

	void wypiszSie() {
		System.out.println("Nazywam siê " + imie + " " + nazwisko);

	}

	int ileLatDoEmerytury() {
		if (wiek < 65) {
			return 65 - wiek;
		} else {
			return 0;
		}

	}
	
	public String toString() {
		return imie + " " + nazwisko + " (" + wiek + "l.)";
		
	}

}
