
public class Wypisywanie {

	public static void main(String[] args) {
		
		Ogloszenie dom = new Ogloszenie("Nr.1 DOM JEDNORODZINNY", "Jest to pi�kny dom na przedmie�ciach, kt�ry posiada wspania�� lokalizacj� " 
				+ "\ni z pewno�ci� zapewni wspania�e warunki do mieszkania.", 300500000);
		System.out.println(dom);
		
		System.out.println();
		
		Ogloszenie mieszkanie = new Ogloszenie("Nr.2 MIESZKANIE", "Ogromne mieszkanie z tarasem, kt�re posiada wspania�y widok", 100000000);
		System.out.println(mieszkanie);
				
				

	}

}
