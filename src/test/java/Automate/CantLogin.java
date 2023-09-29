package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CantLogin {
	public static String browser = "Chrome";
	public static WebDriver driver;

	public static void main(String[] args) {
		if(browser.equals("Chrome")){
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("123");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("qwerty");
		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();
	}
		
}
