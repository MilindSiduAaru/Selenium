package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practise7 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"autosuggest\"]")).sendKeys("AUS");
		Thread.sleep(1000);
		List<WebElement> E=driver.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
		for(WebElement Country:E) {
			if(Country.getText().equalsIgnoreCase("Austria")) {
				String s=Country.getText();
				System.out.println(s);
				Country.click();
				
				break;
			}
		}

	}

}
