package Drivercheck;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivermanager {
public static void main(String[] args) throws InterruptedException {
	
	WebDriver driver2=new SafariDriver();
	driver2.get("https://www.google.com");
	driver2.quit();
	
	WebDriverManager.firefoxdriver().setup();
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.google.com");
	Thread.sleep(2000);
	driver.quit();
}
}
