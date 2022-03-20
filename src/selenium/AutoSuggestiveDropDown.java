package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"autosuggest\"]")).sendKeys("Ind");
		Thread.sleep(5000);
		List<WebElement> city=driver.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
		for(WebElement E:city) {
			if(E.getText().equalsIgnoreCase("India")) {
				E.click();
				break;
			}
		}
		
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()=\" Ahmedabad (AMD)\"]")).click();
		Thread.sleep(2000);
		List<WebElement> ci=driver.findElements(By.xpath("//input[@name=\"ctl00_mainContent_ddl_destinationStation1_CTXT\"]"));
		Thread.sleep(2000);
		for(WebElement W1:ci) {
			if(W1.getText().equalsIgnoreCase(" Amritsar (ATQ)")) {
				W1.click();
				break;
			
		}
		}
	}
		
		
		
		
	}


