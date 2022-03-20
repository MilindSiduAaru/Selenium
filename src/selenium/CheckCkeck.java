package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//"https://rahulshettyacademy.com/AutomationPractice/"
public class CheckCkeck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.manage().window().maximize();
		List<WebElement>check=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for(WebElement C:check) {
			if(C.getAttribute("value").equals("option2")) {
				C.click();
			}
		}

	}

}
