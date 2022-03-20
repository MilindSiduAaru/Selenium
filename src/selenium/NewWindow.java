package selenium;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
		String ParentWindow=driver.getWindowHandle();
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("http://www.gmail.com");
		driver.manage().window().maximize();
		Set<String> windows=driver.getWindowHandles();
		for(String window:windows) {
			//driver.switchTo().window(window);
			if(!window.equals(ParentWindow)) {
				driver.switchTo().window(window);
				driver.close();
				}
			}
		

	}

}
