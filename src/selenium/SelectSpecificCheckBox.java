package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectSpecificCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> WB=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		for(WebElement check:WB) {
			/*if(check.getAttribute("name").equals("checkBoxOption3")) {
				check.click();
				break;*/
			check.click();
			}
		}

	}


