
public class Wypisywanie2 {

	public static void main(String[] args) {
		
		Ogloszenie dom = new Ogloszenie("Nr.1 DOM JEDNORODZINNY", "Jest to piêkny dom na przedmieœciach, który posiada wspania³¹ lokalizacjê " 
				+ "\ni z pewnoœci¹ zapewni wspania³e warunki do mieszkania.", 300500000);
//		System.out.println(dom);
		
		
		Ogloszenie mieszkanie = new Ogloszenie("Nr.2 MIESZKANIE", "Ogromne mieszkanie z tarasem, które posiada wspania³y widok", 100000000);
//		System.out.println(mieszkanie);
		
		Cechy apartament = new Cechy("Nr.3 APARTAMENT", "Jest to wspania³y apartament, który zosta³ wybudowany i oddany w tym roku", 200000, "Gdañsk", 98, 4);
		
		System.out.println(dom + "\n" + mieszkanie + "\n" + apartament);

	}

}
