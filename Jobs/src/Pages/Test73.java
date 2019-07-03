package Pages;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test73 extends Thread
{
	public void run()
	{
		try
		{
			Thread.sleep(8000);
			Robot r=new Robot();
			StringSelection s1=new StringSelection("pranaygondi212@gmail.com");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(5000);
			StringSelection s2=new StringSelection("pranay");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s2, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(5000);
			StringSelection s3=new StringSelection("gondi");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s3, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(5000);
			StringSelection s4=new StringSelection("7075473976");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s4, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_V);
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
			Thread.sleep(5000);
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			
		}
		catch(Exception ex)
		{
			
		}
	}
	
	public static void main(String[] args)
	{
		Test73 obj =new Test73();
		obj.start();
		System.setProperty("webdriver.chrome.driver", "E:\\batch242\\chromedriver.exe");

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jobshub.co.za");
		driver.manage().window().maximize();	
	}

}
