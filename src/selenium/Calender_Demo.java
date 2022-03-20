package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"ui-datepicker-trigger\"]")).click();
		List<WebElement> WE=driver.findElements(By.xpath("//td[@data-month=\"1\"]"));
		int A=WE.size();
		/*for(int i=0;i<A;i++) {
			String x=WE.get(i).getText();
			if(x.equalsIgnoreCase("16")) {
				WE.get(i).click();
			}*/
		for(WebElement WE1:WE) {
			if(WE1.getText().equalsIgnoreCase("17")) {
				WE1.click();
				break;
			}
		}
		}

		
	}


