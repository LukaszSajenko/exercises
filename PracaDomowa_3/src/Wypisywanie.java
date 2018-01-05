
public class Wypisywanie {

	public static void main(String[] args) {
		
		Ogloszenie dom = new Ogloszenie("Nr.1 DOM JEDNORODZINNY", "Jest to piêkny dom na przedmieœciach, który posiada wspania³¹ lokalizacjê " 
				+ "\ni z pewnoœci¹ zapewni wspania³e warunki do mieszkania.", 300500000);
		System.out.println(dom);
		
		System.out.println();
		
		Ogloszenie mieszkanie = new Ogloszenie("Nr.2 MIESZKANIE", "Ogromne mieszkanie z tarasem, które posiada wspania³y widok", 100000000);
		System.out.println(mieszkanie);
				
				

	}

}
