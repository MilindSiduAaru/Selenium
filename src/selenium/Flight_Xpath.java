package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flight_Xpath {

	public static void main(String[] args) throws Exception {
		
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar\\Chrome_driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
			Thread.sleep(1000);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@text=\"Amritsar (ATQ)\"]")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//a[@text=\"Bagdogra (IXB)\"]")).click();
			
			
			
			

	}

}
