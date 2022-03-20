package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.dezlearn.com/webtable-example/");
        driver.manage().window().maximize();
       List<WebElement>rows= driver.findElements(By.xpath("//table[@class=\"tg\"]/tbody/tr"));
       int count=0;
       for(WebElement row:rows) {
    	   count++;
    	   if(count==1) {
    		   continue;
    	   }
    	   String name=row.findElement(By.xpath("td[1]")).getText();
    	   String Email=row.findElement(By.xpath("td[2]")).getText();
    	   System.out.println("Name "+name);
    	   System.out.println("Email" +Email);
    	   System.out.println("------------------");
    	   
       }
	}

}
