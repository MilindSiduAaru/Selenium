package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_practise2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Actions A=new Actions(driver);
		WebElement frame=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		WebElement drag=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement drop=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		A.dragAndDrop(drag, drop).build().perform();
		driver.switchTo().defaultContent();

	}

}
