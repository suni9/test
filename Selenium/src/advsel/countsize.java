package advsel;


import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver; 

import org.openqa.selenium.support.ui.Select;
public class countsize 
{
	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./software/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		Thread.sleep(2000);
		driver.findElement(By.name("NewWindow")).click();
	    Set<String> all_id= driver.getWindowHandles();
	    for(String id:all_id)
	    {
	    	  System.out.println(id);
	    }
	    int size=all_id.size();
	    System.out.println(size);
	}
}