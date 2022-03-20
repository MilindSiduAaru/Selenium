package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_ClickSpecific {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\Selenium Jar\\Chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> checkBox=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for(WebElement E:checkBox) {
			if(E.getAttribute("value").equalsIgnoreCase("Option2")) {
				E.click();
			}
		}
		
		}
}
