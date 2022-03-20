package selenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise_OpenTaB_handling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.amazon.com");
		Thread.sleep(1000);
		driver.switchTo().newWindow(WindowType.TAB).get("https://www.flipkart.com");
		Set<String> S=driver.getWindowHandles();
		Iterator<String> itr=S.iterator();
		String PW=itr.next();
		String CW=itr.next();
		String GCW=itr.next();
		driver.switchTo().window(CW);
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("Dolls");
		driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=\"Barbie and Ken in India (Color & Design may vary)\"]")).click();
		Thread.sleep(2000);

	}

}
