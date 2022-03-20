package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Locator {

	public static void main(String[] args) throws Exception  {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar\\Chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("test");
		driver.findElement(By.id("username")).clear();
		driver.findElement(By.id("username")).sendKeys("Milind");
		driver.findElement(By.name("pw")).sendKeys("test123");
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		  
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		Thread.sleep(2000);
		//driver.findElement(By.linkText("Need Help Logging In?")).click();
		//driver.findElement(By.partialLinkText("Need Help")).click();
		//Thread.sleep(2000);
		List<WebElement> obj=driver.findElements(By.tagName("a"));
		System.out.println(obj.size());
		
		

	}

}
