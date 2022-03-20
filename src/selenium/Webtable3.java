package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable3 {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
	        driver.get("https://www.dezlearn.com/webtable-example/");
	        driver.manage().window().maximize();
	        List<WebElement> rows=driver.findElements(By.xpath("//table[@class=\"tg\"]/tbody/tr"));
	        int count=0;
	        for(WebElement row:rows) {
	        	count++;
	     	   if(count==1) {
	     		   continue;
	     	   }
	        	String name=row.findElement(By.xpath("td[1]")).getText();
	        	if(name.equals("Tim Watson")) {
	        		row.findElement(By.xpath("td[3]/input")).click();
	        		row.findElement(By.xpath("td[4]/input")).click();
	        		List<WebElement>options=row.findElements(By.xpath("td[5]/select/option"));
	        		for(WebElement option:options) {
	        			if(option.getText().equals("Sports")) {
	        			option.click();
	        			break;
	        			}
	        		}
	        		row.findElement(By.xpath("td[6]/input")).sendKeys("Milind");
	        		break;
	        	}
	        }

		}

	}

