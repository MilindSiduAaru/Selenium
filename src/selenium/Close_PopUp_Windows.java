package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_PopUp_Windows {

	        public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","E:\\Chrome\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.dezlearn.com/multiple-browser-windows/");
			driver.manage().window().maximize();
			String ParentWindow=driver.getWindowHandle();
			driver.findElement(By.xpath("//button[@id=\"u_7_8\"]")).click();
			Thread.sleep(3000);
			Set<String> windows=driver.getWindowHandles();
			for(String window:windows) {
				if(!window.equals(ParentWindow)) {
					driver.switchTo().window(window);
					driver.close();
					Thread.sleep(1000);
					
					
				}
			}
			driver.switchTo().window(ParentWindow);
			String S=driver.findElement(By.xpath("//h4[text()=\"Click on the button below to launch multiple browser windows\"]")).getText();
			System.out.println(S);

	}

}
