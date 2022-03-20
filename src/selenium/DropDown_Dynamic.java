package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Dynamic {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar\\Chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]")).click();
		WebElement WE=driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
		Select S=new Select(WE);
		S.selectByValue("option1");

	}

}
