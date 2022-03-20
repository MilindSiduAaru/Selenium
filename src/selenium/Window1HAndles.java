package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1HAndles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//String ParentWindow=driver.getWindowHandle();
		//System.out.println(ParentWindow);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.amazon.com");
		Set<String> windows=driver.getWindowHandles();
		for(String window:windows) {
		     
		      driver.switchTo().window(window);
		      System.out.println(window);
		     System.out.println(driver.getCurrentUrl());
		      System.out.println(driver.getTitle());
		      System.out.println("---------------------------");
		     if(driver.getCurrentUrl().equals("https://www.amazon.com/")) {
		    	 break;
		     }
			}
	}
		
		
		

	}


