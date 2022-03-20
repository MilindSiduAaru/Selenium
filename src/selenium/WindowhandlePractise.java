package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//https://www.dezlearn.com/multiple-browser-windows/
public class WindowhandlePractise {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		String ParentWindow=driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id=\"u_7_8\"]")).click();
		Thread.sleep(2000);
		Set<String>windows=driver.getWindowHandles();
		for(String window:windows) {
			if(!window.equals(ParentWindow)) {
				driver.switchTo().window(window);
				Thread.sleep(5000);
				driver.close();
			}
			
		}
		
		
	}

}
