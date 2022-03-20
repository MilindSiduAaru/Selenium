package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_CSS_Locators {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar\\Chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Test123");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("input[id=\"Login\"]")).click();
		Thread.sleep(2000);
		
		
		

	}
}


