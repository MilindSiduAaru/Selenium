package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args)throws Exception{
		System.setProperty("webdriver.chrome.driver","E:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//driver.manage().window().minimize();
	    //Thread.sleep(1000);
	    //driver.manage().window().maximize();
	    //Thread.sleep(1000);
	    driver.findElement(By.xpath("//input[@id=\"alertbtn\"]")).click();
	    Thread.sleep(1000);
	   // driver.switchTo().alert().accept();
	   String alert=driver.switchTo().alert().getText();
	  System.out.println(alert);
	    driver.switchTo().alert().accept();
	    
	    
	    
		


	}

}
