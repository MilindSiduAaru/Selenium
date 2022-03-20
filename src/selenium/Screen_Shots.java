package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen_Shots {
	public static void main(String args[]) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebElement ScShot=driver.findElement(By.xpath("//input[@class=\"inputs\"]"));
		File src=ScShot.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("E:\\ScreenShot\\ScSh1.png"));
		
	}

}
