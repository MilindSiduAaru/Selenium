package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Static {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar\\Chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		WebElement E=driver.findElement(By.xpath("//select[@name=\"ctl00$mainContent$DropDownListCurrency\"]"));
		Select s=new Select(E);
		//s.selectByIndex(2);
		//Thread.sleep(1000);
		//s.selectByValue("USD");
		//Thread.sleep(1000);
		s.selectByVisibleText("USD");
		//s.deselectByVisibleText("USD");
		
		
		

	}

}
