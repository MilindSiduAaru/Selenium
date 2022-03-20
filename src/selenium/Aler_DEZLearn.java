package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aler_DEZLearn {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.dezlearn.com/javascript-alerts/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@id=\"s_alert1\"]")).click();
		Thread.sleep(1000);
		Alert A=driver.switchTo().alert();
		System.out.println(A.getText());
		A.accept();
		driver.findElement(By.xpath("//button[@id=\"c_alert2\"]")).click();
		Thread.sleep(2000);
		Alert A1=driver.switchTo().alert();
		System.out.println(A.getText());
		A.dismiss();
		driver.findElement(By.xpath("//button[@id=\"p_alert3\"]")).click();
		Thread.sleep(2000);
		Alert A2=driver.switchTo().alert();
		A2.getText();
		System.out.println(A2);
		A2.sendKeys("India");
		Thread.sleep(5000);
		A2.accept();
		

	}

}
