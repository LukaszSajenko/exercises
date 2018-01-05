package proste_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WjedzNaStrone {

	public static void main(String[] args) {
		System.out.println("Uruchamiam przeglądarkę...");
		
		System.setProperty("webdriver.gecko.driver", "C:/Tools/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		System.out.println("Jest przeglądarka");
		
		driver.get("http://www.alx.pl");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		System.out.println();
		System.out.println(driver.getPageSource());
		
		System.out.println();
		System.out.println("Zamykamy...");
		driver.quit();
		System.out.println("Koniec");
	}
}
