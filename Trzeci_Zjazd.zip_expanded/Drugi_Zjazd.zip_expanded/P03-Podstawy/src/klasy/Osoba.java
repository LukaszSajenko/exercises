package klasy;

public class Osoba {
	// Zmienne definiowane w ten sposób w klasie są określne jako:
	// pola (field)
	// atrybuty (attribute)
	// zmienne instancyjne (instance variable)

	String imie, nazwisko;
	int wiek;
	
	public Osoba() {
	}
	
	public Osoba(String i, String n, int w) {
		imie = i;
		nazwisko = n;
		wiek = w;
	}
	
	// stała  , w wielu językach programowania const
	public static final int WIEK_EMERYTALNY = 65;

	void wypiszSie() {
		System.out.println("Nazywam się " + imie + " " + nazwisko);
	}

	int ileLatDoEmerytury() {
		if(wiek < WIEK_EMERYTALNY) {
			return WIEK_EMERYTALNY - wiek;
		} else {
			return 0;
		}
	}
		
	public String toString() {
		return imie + " " + nazwisko + " (" + wiek + "l.)";
	}
	
	// Inne metody, których nadpisanie ma wpływ na działanie klasy
	// equals() hashCode() clone()
}
