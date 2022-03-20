package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_Calender {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"ui-datepicker-trigger\"]")).click();
		Thread.sleep(1000);
		List<WebElement> WE=driver.findElements(By.xpath("//td[@data-month=\"1\"]"));
		List<WebElement> WE1=driver.findElements(By.xpath("//td[@data-month=\"2\"]"));
		for(WebElement W:WE) {
			if(W.getText().equalsIgnoreCase("18")) {
				W.click();
				break;
			}
			}
		for(WebElement W1:WE1) {
			if(W1.getText().equalsIgnoreCase("20")) {
				W1.click();
				break;
			}
		}

	}

}
