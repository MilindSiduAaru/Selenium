package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practise10 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement E=driver.findElement(By.xpath("//a[@id=\"opentab\"]"));
		//WebElement E1=driver.findElement(By.xpath("//button[@id=\"openwindow\"]"));
		Actions A=new Actions(driver);
		A.contextClick(E).perform();
		Thread.sleep(2000);
		//A.doubleClick(E1).perform();
		
        
	}

}
