package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Click {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar\\Chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@value=\"radio1\"]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@value=\"radio2\"]")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@value=\"radio3\"]")).click();

	}

}
