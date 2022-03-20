package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_FB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()=\"Create New Account\"]")).click();
		Thread.sleep(1000);
		WebElement WB=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select S=new Select(WB);
		S.selectByValue("30");
		WebElement Wb1=driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select S1=new Select(Wb1);
		S1.selectByVisibleText("Feb");
		WebElement Wb2=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select S2=new Select(Wb2);
		S2.selectByValue("1988");
		driver.findElement(By.xpath("//label[text()=\"Male\"]")).click();

	}

}
