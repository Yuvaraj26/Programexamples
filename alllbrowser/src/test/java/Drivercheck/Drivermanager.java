package Drivercheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivermanager {
public static void main(String[] args) throws InterruptedException {
	//Used to invoke safari driver
	WebDriver driver2=new SafariDriver();
	driver2.get("https://www.google.com");
	driver2.quit();
	//Used to invoke firefox driver
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.quit();
	////Used to invoke chrome driver
	WebDriverManager.chromedriver().setup();
	WebDriver driver1=new ChromeDriver();
	driver1.get("https://www.google.com");
	driver1.quit();
}
}
