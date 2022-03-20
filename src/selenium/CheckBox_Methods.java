package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Methods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Jar\\Chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name=\"checkBoxOption1\"]")).click();
		WebElement obj=driver.findElement(By.xpath("//input[@name=\"checkBoxOption1\"]"));
		//System.out.println(obj.getSize());
		System.out.println(obj.isDisplayed());
		System.out.println(obj.isEnabled());
		System.out.println(obj.isSelected());
		

	}

}
