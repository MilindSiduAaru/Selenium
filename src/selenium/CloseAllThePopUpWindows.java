package selenium;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAllThePopUpWindows {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dezlearn.com/multiple-browser-windows/");
		String parentwindow=driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id=\"u_7_8\"]")).click();
		Thread.sleep(2000);
		Set<String> windows=driver.getWindowHandles();
		for(String window:windows) {
			if(!parentwindow.equals(window)) {
				driver.switchTo().window(window);
				Thread.sleep(2000);
				driver.close();
				
			}
		}
		

	}

}

