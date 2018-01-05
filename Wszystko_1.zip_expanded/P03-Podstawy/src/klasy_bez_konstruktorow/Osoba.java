package klasy_bez_konstruktorow;

public class Osoba {
	// Zmienne definiowane w ten sposób w klasie są określne jako:
	// pola (field)
	// atrybuty (attribute)
	// zmienne instancyjne (instance variable)

	String imie, nazwisko;
	int wiek;
	
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

}
