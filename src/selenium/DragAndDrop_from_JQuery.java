package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_from_JQuery {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement frame=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(frame);
		WebElement W1=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement W2=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		Actions a=new Actions(driver);
		//a.dragAndDrop(W1, W2).perform();
		a.clickAndHold(W1).moveToElement(W2).release(W1).build().perform();
		

	}

}
