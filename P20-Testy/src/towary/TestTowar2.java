package towary;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class TestTowar2 {
	private BigDecimal cena;
	private BigDecimal vat;
	private Towar towar;
	
	@Before
	public void setUp() {
		cena = new BigDecimal("1000.00");
		vat = new BigDecimal("0.23");
		towar = new Towar("Pralka", cena, vat);
	}

	@Test
	public void testKonstruktor() {		
		assertEquals("Pralka", towar.getNazwa());
		assertEquals(cena, towar.getCenaNetto());
		assertEquals(vat, towar.getVat());
	}

	@Test
	public void testCenaBrutto() {
		BigDecimal wynik = towar.getCenaBrutto();
		BigDecimal oczekiwanyWynik = new BigDecimal("1230.00");
		assertEquals(oczekiwanyWynik, wynik);
	}
}
