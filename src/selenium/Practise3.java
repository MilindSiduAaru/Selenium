package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise3 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> E=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		//int i=E.size();
		//System.out.println(i);
		for(WebElement E1:E) {
			if(E1.getAttribute("value").equalsIgnoreCase("option2")) {
				E1.click();
				break;
			}
		}
		//driver.close();

	}
	

}
