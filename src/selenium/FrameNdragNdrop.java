package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

////iframe[@class="demo-frame"]
public class FrameNdragNdrop {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
        WebElement frame=driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
        driver.switchTo().frame(frame);
        WebElement W=driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
        WebElement W1=driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
        Actions A=new Actions(driver);
        A.dragAndDrop(W, W1).build().perform();
	}

}
