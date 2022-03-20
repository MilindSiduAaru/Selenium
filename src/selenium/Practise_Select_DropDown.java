package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise_Select_DropDown {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement WE=driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
		Thread.sleep(3000);
		Select S=new Select(WE);
        S.selectByVisibleText("Option1");
        Thread.sleep(2000);
        S.selectByValue("option3");

	}

}
