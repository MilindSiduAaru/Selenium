package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement obj=driver.findElement(By.xpath("//input[@value=\"option1\"]"));
		obj.click();
		//obj.click();
		System.out.println(obj.isDisplayed());
		System.out.println(obj.isEnabled());
		System.out.println(obj.isSelected());
	
		
		

	}

}
