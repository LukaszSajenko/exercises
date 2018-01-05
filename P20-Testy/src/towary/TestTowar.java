package towary;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

public class TestTowar {
	@Test
	public void testKonstruktor() {
		BigDecimal cena = new BigDecimal("1000.00");
		BigDecimal vat = new BigDecimal("0.23");
		Towar towar = new Towar("Pralka", cena, vat);
		
		assertEquals("Pralka", towar.getNazwa());
		assertEquals(cena, towar.getCenaNetto());
		assertEquals(vat, towar.getVat());
	}

	@Test
	public void testCenaBrutto() {
		// Typowy test ma uk³ad:
		
		// Arrange
		BigDecimal cena = new BigDecimal("1000.00");
		BigDecimal vat = new BigDecimal("0.23");
		Towar towar = new Towar("Pralka", cena, vat);

		// Act
		BigDecimal wynik = towar.getCenaBrutto();
		
		// Assert
		BigDecimal oczekiwanyWynik = new BigDecimal("1230.00");
		assertEquals(oczekiwanyWynik, wynik);
	}
	
}
