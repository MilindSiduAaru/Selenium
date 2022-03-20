package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Professional_Courier {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tpcindia.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class=\"form-control\"]")).sendKeys("JGN124913312");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()=\"SEARCH\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=\"View Details in text\"]")).click();
		Thread.sleep(3000);
		WebElement WB=driver.findElement(By.xpath("//iframe[@id=\"ContentPlaceHolderMid_ContentPlaceHolder2_iFrameDialog\"]"));
		System.out.println(WB.getText());

	}

}
