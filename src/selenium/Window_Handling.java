package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();
		Thread.sleep(2000);
		Set<String> S=driver.getWindowHandles();
		Iterator <String> itr=S.iterator();
		String parent=itr.next();
		String child=itr.next();
		driver.switchTo().window(child);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.switchTo().window(parent);
		System.out.println(driver.getCurrentUrl());

	}

}
