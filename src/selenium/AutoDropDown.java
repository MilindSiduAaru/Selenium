package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"autosuggest\"]")).sendKeys("Ind");
		Thread.sleep(1000);
		List<WebElement>WB=driver.findElements(By.xpath("//a[@class=\"ui-corner-all\"]"));
		for(WebElement W:WB) {
		if(W.getText().equalsIgnoreCase("India")) {
			W.click();
			break;
			}
		}
		
         driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_rbtnl_Trip_1\"]")).click();
         driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_ddl_originStation1_CTXT\"]")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//a[text()=\" Ahmedabad (AMD)\"]")).click();
         driver.findElement(By.xpath("//a[text()=\" Gorakhpur (GOP)\"]")).click();
         List<WebElement>WB1=driver.findElements(By.xpath("//td[@data-month=\"3\"]"));
         for(WebElement W1:WB1) {
        	 if(W1.getText().equals("12")) {
        		 W1.click();
        		 break;
        	 }
         }
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@id=\"ctl00_mainContent_view_date2\"]")).click();
         List<WebElement>S1=driver.findElements(By.xpath("//td[@data-month=\"3\"]"));
         for(WebElement D:S1) {
        	 if(D.getText().equals("12")) {
        		 D.click();
        		 break;
        	 }
         }
        WebElement S=driver.findElement(By.xpath("//select[@id=\"ctl00_mainContent_DropDownListCurrency\"]"));
        Select S4=new Select(S);
        S4.selectByVisibleText("USD");
	}

}
