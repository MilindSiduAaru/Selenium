package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Windows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id=\"u_7_8\"]")).click();
		Set<String> windows=driver.getWindowHandles();
		for(String window : windows){
			System.out.println(window);
			driver.switchTo().window(window);
			System.out.println(driver.getCurrentUrl());
			System.out.println(driver.getTitle());
			System.out.println("---------------------------------");
			Thread.sleep(2000);
			if(driver.getCurrentUrl().equals("//www.facebook.com/")) {
				break;
			}
			
			
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("shirsatm1211@gmail.com");
	}

}
