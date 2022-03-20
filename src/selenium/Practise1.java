package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practise1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption2\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption3\"]")).click();

	}

}
