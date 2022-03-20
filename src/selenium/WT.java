package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WT {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\Chrome98\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.dezlearn.com/webtable-example/");
        driver.manage().window().maximize();
        List<WebElement>rows=driver.findElements(By.xpath("//table[@class=\"tg\"]/tbody/tr"));
        int c=0;
        for(WebElement row:rows) {
        	c++;
        	if(c==1) {
        		continue;
        	}
        	String Name=row.findElement(By.xpath("td[1]")).getText();
        	System.out.println(Name);
        	System.out.println("------------------");
        	if(Name.equals("Tim Watson")) {
        		row.findElement(By.xpath("td[3]/input")).click();
        		List<WebElement>options=row.findElements(By.xpath("td[5]/select/option"));
        		for(WebElement option:options) {
        			if(option.getText().equals("Sports")) {
        				option.click();
        				break;
        			}
        		}
        	}
        }

	}

}
