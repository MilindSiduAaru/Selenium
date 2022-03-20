package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise6 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement E=driver.findElement(By.xpath("//select[@id=\"dropdown-class-example\"]"));
		Select s=new Select(E);
		//s.selectByIndex(3);
		s.selectByVisibleText("Option2");
		Thread.sleep(2000);
		s.selectByValue("option1");

	}

}
