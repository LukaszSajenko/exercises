package pl.alx.waluty;

public class WypiszBiezaceKursy {

	public static void main(String[] args) {
		System.out.println("Pobieram kursy...");
		
		try {
			TabelaKursow tabela = TabelaKursow.pobierzAktualne();
			System.out.println();
			System.out.println("Numer tabeli: " + tabela.getNumerTabeli());
			System.out.println("Data notowania: " + tabela.getData());
			System.out.println();
			for(String kod : tabela.wszystkieKody()) {
				System.out.printf("%3s %s : %s%n", kod, tabela.dajNazwe(kod), tabela.dajKurs(kod));
			}
			System.out.println("Gotowe");
		} catch (BladAplikacji e) {
			System.err.println("Sorry, problemy...");
			e.printStackTrace();
		}
	}
}
