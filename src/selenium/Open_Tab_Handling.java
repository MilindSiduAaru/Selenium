package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Tab_Handling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.amazon.in");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.flipkart.com");
		Set<String> S=driver.getWindowHandles();
		Iterator<String> itr=S.iterator();
		String ParentWindow=itr.next();
		String ChildWindow=itr.next();
		String GrantChildWindow=itr.next();
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.getCurrentUrl());
		
		}

}
