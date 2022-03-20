package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Select_Multiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/selectable/");
		driver.switchTo().frame(0);
		driver.manage().window().maximize();
		WebElement W1=driver.findElement(By.cssSelector("ol#selectable>li:nth-child(1)"));
		WebElement W2=driver.findElement(By.cssSelector("ol#selectable>li:nth-child(3)"));
		WebElement W3=driver.findElement(By.cssSelector("ol#selectable>li:nth-child(5)"));
		Actions a=new Actions(driver);
		a.keyDown(Keys.CONTROL).perform();
		a.click(W1);
		a.click(W2);
		a.click(W3);
		a.keyUp(Keys.CONTROL).perform();
		

	}

}
