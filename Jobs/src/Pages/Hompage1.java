package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Hompage1 {
	 static int flag=0;

	public static void main(String[] args) throws Exception
	{
		
			
		System.setProperty("webdriver.chrome.driver", "E:\\batch242\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jobshub.co.za");
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver,20);
		/*w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//iframe)[9]")));
		WebElement e1=driver.findElement(By.xpath("(//iframe)[9]"));
		driver.switchTo().frame(e1);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("EMAIL")));
		driver.findElement(By.name("EMAIL")).sendKeys("pranaygondi212@gmail.com");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("FNAME")));
		driver.findElement(By.name("FNAME")).sendKeys("pranay");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("LNAME")));
		driver.findElement(By.name("LNAME")).sendKeys("GONDI");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.name("PHONE")));
		driver.findElement(By.name("PHONE")).sendKeys("7075473976");
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@value='Subscribe']")));
		driver.findElement(By.xpath("//*[@value='Subscribe']")).click();*/
		driver.findElement(By.xpath("//*[@class='mc-closeModal']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("job_title")).sendKeys("Automation");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[@class='chosen-container chosen-container-single'])[5]/a/span")).click();;
		Thread.sleep(5000);
		List<WebElement>loop1=driver.findElements(By.xpath("//div[@id='specialisms_chosen']/div/ul"));
		Thread.sleep(3000);
		
		flag=0;
		for(WebElement e1:loop1)
		{
			e1.getAttribute("").equals("Business Management");
			e1.click();
			flag=1;
			break;
		}
		
		List<WebElement>loop2=driver.findElements(By.xpath("//*[@id='employer_search_location_chosen']/div/ul"));
	       for(WebElement e2:loop2)
	       {
	    	   e2.getText().equals("Cape Town");
	    	   e2.click();
	    	   break;
	       }
		
		

	}

}
