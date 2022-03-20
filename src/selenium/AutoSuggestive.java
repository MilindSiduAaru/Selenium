package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"autosuggest\"]")).sendKeys("Ind");
		Thread.sleep(1000);
		List<WebElement>city=driver.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
		for(WebElement W:city) {
			if(W.getText().equalsIgnoreCase("India"))
			{ 
				
				W.click();
				break;
			}
		}

	}

}
