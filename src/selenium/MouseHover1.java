package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		WebElement W=driver.findElement(By.xpath("//a[text()=\"Main Item 2\"]"));
		Actions A=new Actions(driver);
		A.moveToElement(W).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()=\"SUB SUB LIST »\"]")).click();
		

	}

}
