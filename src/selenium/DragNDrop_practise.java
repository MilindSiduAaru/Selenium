package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop_practise {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		WebElement WE=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		driver.switchTo().frame(WE);
		Actions A=new Actions(driver);
		WebElement E=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement E1=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		A.dragAndDrop(E, E1).build().perform();

	}

}
