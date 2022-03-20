package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Select_calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value=\"RoundTrip\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@value=\"AMD\"]")).click();
		driver.findElement(By.xpath("//a[@value=\"GOI\"]")).click();
		driver.findElement(By.xpath("//a[text()=\"15\"]")).click();
		
		//List<WebElement> WE=driver.findElements(By.xpath("//td[@data-month=\"2\"]"));
		driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date2\"]")).click();
		List<WebElement>WE=driver.findElements(By.xpath("//td[@data-month=\"1\"]"));
		for(WebElement W:WE) {
			if(W.getText().equalsIgnoreCase("23")) {
				W.click();
				break;
			}
		}
		driver.findElement(By.xpath("//div[@class=\"row1 adult-infant-child\"]")).click();
		//driver.findElement(By.xpath("//span[@id=\"hrefIncAdt\"]")).click();
		WebElement C=driver.findElement(By.xpath("//select[@name=\"ctl00$mainContent$DropDownListCurrency\"]"));
		Select S=new Select(C);
		Thread.sleep(2000);
		S.selectByValue("USD");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//input[@value=\"Search\"]")).click(); */
		
	}

}
