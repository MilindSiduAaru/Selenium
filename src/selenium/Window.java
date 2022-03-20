package selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
        driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();
        Set<String> S=driver.getWindowHandles();
        for(String S1:S) {
        	driver.switchTo().window(S1);
        	System.out.println(S1);
        	System.out.println(driver.getCurrentUrl());
        	System.out.println(driver.getTitle());
        	System.out.println("-------------------------");
        	
        }
        
	}

}
