package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Click {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//input[@value=\"option1\"]")).click();
		List<WebElement> EW=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		int A=EW.size();
		for(WebElement E:EW) {
			if(E.getAttribute("name").equalsIgnoreCase("checkBoxOption3")) {
				E.click();
				break;
			}
		}
		Thread.sleep(5000);
		driver.close();

	}

}
