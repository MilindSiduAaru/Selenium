package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_Link {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Jar\\Chrome_driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List <WebElement> AllCheckbox=driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		int num=AllCheckbox.size();
		System.out.println(num);
		for(int i=0;i<=num;i++) {
			if(i==2) {
			AllCheckbox.get(i).click();
			}
		}
		/*First we stored the all checkboxes into List interface. 
 CheckBox is a web-element * that is why we stored into web-element type into List.
Find out the size of checkboxes (number of counts) using size() method.
Using For loop and get() method we iterate all checkboxes.
Using click() method we select the checkbox.*/
		

	}

}
