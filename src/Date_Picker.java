import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date_Picker {

	public static void main(String[] args) throws InterruptedException {
		String expectedMonth="May 2022";
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.trivago.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@data-testid=\"calendar-checkin\"]")).click();
		String currMonth=driver.findElement(By.xpath("//button[text()=\"March 2022\"]")).getText();
		System.out.println(currMonth);
		
		while(!currMonth.contains(expectedMonth)) {
			driver.findElement(By.xpath("//button[@data-testid=\"calendar-button-next\"]")).click();
			Thread.sleep(1000);
			currMonth=driver.findElement(By.xpath("//button[text()=\"March 2022\"]")).getText();
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()=\"Tue, 05/03/22\"]")).click();
		
		

	}

}
