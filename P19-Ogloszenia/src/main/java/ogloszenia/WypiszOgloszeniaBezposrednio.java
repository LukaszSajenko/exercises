package ogloszenia;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WypiszOgloszeniaBezposrednio {

	public static void main(String[] args) {
		List<Ogloszenie> ogloszenia = znajdzOgloszenia("Mazda 6 III");
		System.out.println("Znalazłem " + ogloszenia.size() + " ogłoszeń:");
		
		for (Ogloszenie ogloszenie : ogloszenia) {
			System.out.println(ogloszenie);
		}
	}
	
	private static List<Ogloszenie> znajdzOgloszenia(String jakieAuto) {
		System.setProperty("webdriver.gecko.driver", "C:/Tools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	    driver.get("http://moto.gratka.pl/");
	    driver.findElement(By.id("element-87")).click();
	    driver.findElement(By.id("element-87")).clear();
	    driver.findElement(By.id("element-87")).sendKeys(jakieAuto);
	    driver.findElement(By.cssSelector("button.btn.btnSearch")).click();

		List<Ogloszenie> lista = new LinkedList<>();
		
		List<WebElement> elementy = driver.findElements(By.className("opisOferty"));
		for (WebElement element : elementy) {
			WebElement h3 = element.findElement(By.tagName("h3"));
			String tytul = h3.getText();
			String url = h3.findElement(By.tagName("a")).getAttribute("href");
			
			WebElement cena = element
					.findElement(By.className("pasek"))
					.findElement(By.tagName("strong"));
			
			String silnik = cena.getText();
			
			Ogloszenie ogloszenie = new Ogloszenie(tytul, 0, 0, 0, silnik, url);
			lista.add(ogloszenie);
		}
		
		driver.quit();
		
		return lista;
	}

}
