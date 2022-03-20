package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class Assertion {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com//");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Test1");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Pass1");
		driver.findElement(By.xpath("//input[@id=\"Login\"]")).click();
		Thread.sleep(2000);
		String actual=driver.findElement(By.xpath("//div[@id=\"error\"]")).getText();
		String Expected="Pleas check your username and password. If you still can't log in, contact your Salesforce administrator.";
		System.out.println(actual);
		System.out.println(Expected);
		Assert.assertEquals(actual,Expected,"Test Has Passed");
		System.out.println("Assertion Passed");
		
		//driver.close();
		

	}

}
