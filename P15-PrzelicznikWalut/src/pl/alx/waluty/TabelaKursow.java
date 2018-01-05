package pl.alx.waluty;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class TabelaKursow {
	private LocalDate data;
	private String numerTabeli;
	private Map<String, String> nazwy = new TreeMap<>();
	private Map<String, BigDecimal> kursy = new TreeMap<>();
	
	private TabelaKursow() {
	}
	
	public static TabelaKursow pobierzAktualne() throws BladAplikacji {
		Document doc = PobieraczWalut.pobierzAktualne();
		TabelaKursow obiekt = new TabelaKursow();
		obiekt.wczytajKursyZXML(doc);
		return obiekt;
	}
	
	public Collection<String> wszystkieKody() {
		return Collections.unmodifiableCollection(nazwy.keySet());
	}
	
	public String[] dajTabeleKodow() {
		return nazwy.keySet().toArray(new String[0]);
	}
	
	public String dajNazwe(String kodWaluty) {
		return nazwy.get(kodWaluty);
	}
	
	public BigDecimal dajKurs(String kodWaluty) {
		return kursy.get(kodWaluty);
	}
	
	
	
	public LocalDate getData() {
		return data;
	}

	public String getNumerTabeli() {
		return numerTabeli;
	}

	private void wczytajKursyZXML(Document doc) throws BladAplikacji {
		try {
			XPathFactory xpf = XPathFactory.newInstance();
			XPath xpath = xpf.newXPath();
			
			numerTabeli = xpath.evaluate("//No", doc);
			data = LocalDate.parse(xpath.evaluate("//EffectiveDate", doc));
			
			NodeList rates = (NodeList) xpath.evaluate("//Rate", doc, XPathConstants.NODESET);
			final int n = rates.getLength();
			for(int i = 0; i < n; i++) {
				Node rate = rates.item(i);
				
				String code = xpath.evaluate("Code", rate);
				String currency = xpath.evaluate("Currency", rate);
				BigDecimal mid = new BigDecimal(xpath.evaluate("Mid", rate));
				
				nazwy.put(code, currency);
				kursy.put(code, mid);
			}
			
		} catch (XPathExpressionException e) {
			throw new BladAplikacji("Problem w XPath / XML", e);
		}
	}

	public BigDecimal przeliczWaluteNaPln(String kodWaluty, BigDecimal kwota) {
		BigDecimal kurs = this.dajKurs(kodWaluty);
		return kwota.multiply(kurs).setScale(2, RoundingMode.HALF_UP);
	}

	public BigDecimal przeliczPlnNaWalute(String kodWaluty, BigDecimal kwota) {
		BigDecimal kurs = this.dajKurs(kodWaluty);
		return kwota.divide(kurs, 2, RoundingMode.HALF_UP);
	}
}
