package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/menu/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement W=driver.findElement(By.xpath("//a[text()=\"Main Item 2\"]"));
		Actions a=new Actions(driver);
		a.moveToElement(W).perform();
		Thread.sleep(1000);
		WebElement W1=driver.findElement(By.xpath("//a[text()=\"SUB SUB LIST »\"]"));
		a.moveToElement(W1).perform();
		//Thread.sleep(1000);
		driver.findElement(By.linkText("Sub Sub Item 1")).click();
		//driver.findElement(By.xpath("//a[@text()=\"Sub Sub Item 1\"]")).click();

	}

}
