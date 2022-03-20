package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Error_Msg_Check {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar\\Chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com/");;
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("Test");
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("Test123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id=\"Login\"]")).click();
		Thread.sleep(2000);
		String Expected="Please check your username and password. If you still can't log in, contact your Salesforce administrator.";
		System.out.println(Expected);
		String Actual=driver.findElement(By.xpath("//div[@id=\"error\"]")).getText();
		System.out.println(Actual);
		if(Actual.equalsIgnoreCase(Expected)) {
			System.out.println("Congratulations Test has passed");
		}else {
			System.out.println("Failed");
		}
		
		
		

	}

}
