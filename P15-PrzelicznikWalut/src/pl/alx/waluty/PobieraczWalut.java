package pl.alx.waluty;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

class PobieraczWalut {
	public static final String ADRES = "http://api.nbp.pl/api/exchangerates/tables/A/";
	public static final String DOPISEK = "?format=xml";

	static Document pobierzAktualne() throws BladAplikacji {
		try {
			URL url = new URL(ADRES + DOPISEK);

			try (InputStream stream = url.openStream()) {
				return parsujXml(stream);
			}
		} catch (IOException e) {
			throw new BladAplikacji("Problem z URL-em", e);
		}

	}

	private static Document parsujXml(InputStream stream) throws BladAplikacji {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(stream);
			return doc;
		} catch (ParserConfigurationException | SAXException | IOException e) {
			throw new BladAplikacji("Problem z XML-em", e);
		}
	}
}
