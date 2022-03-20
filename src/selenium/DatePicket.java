package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicket {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.trivago.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@data-testid=\"calendar-checkin\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=\"11\"]")).click();
		List<WebElement> Wb=driver.findElements(By.xpath("//table[@class=\"w-auto leading-none\"]/tbody/tr"));
		for(WebElement w:Wb) {
			w.findElement(By.xpath("td[41]")).click();
			
		}


	}

}
