package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handles_practise2 {

	public static void main(String[] args)throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id=\"openwindow\"]")).click();
		Thread.sleep(2000);
        Set<String> S=driver.getWindowHandles();
        Iterator<String> itr=S.iterator();
        String ParentWindow=itr.next();
        String ChildWindow=itr.next();
        driver.switchTo().window(ChildWindow);
        System.out.println(driver.getCurrentUrl());
        driver.switchTo().window(ParentWindow);
        System.out.println(driver.getCurrentUrl());
	}

}
