package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickSpecificCheckBox_ForLoop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Jar\\Chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> Element=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		int i=Element.size();
		System.out.println(i);
		for(WebElement E:Element) {
			if(E.getAttribute("value").equalsIgnoreCase("Option3")) {
				E.click();
			}
			
		}
		
		

	}

}
