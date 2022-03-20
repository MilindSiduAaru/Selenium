package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/slider/#colorpicker");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement W1=driver.findElement(By.xpath("//div[@class=\"ui-slider-range ui-corner-all ui-widget-header ui-slider-range-min\"]"));
		Actions a=new Actions(driver);
		a.clickAndHold(W1).moveByOffset(-20, 0).release(W1).build().perform();
		
	}

}
