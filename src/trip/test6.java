package trip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test6 {
	public static void main (String args[]) throws InterruptedException  {
		 System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.get("https://accounts.google.com/signin");
		    driver.findElement(By.id("identifierId")).clear();
			   driver.findElement(By.id("identifierId")).sendKeys("mamathakanneboina448@gmail.com");
			   driver.findElement(By.id("identifierNext")).click();
			   Thread.sleep(2000);
			   
			   driver.findElement(By.name("password")).sendKeys("mamatha552");
			   driver.findElement(By.id("passwordNext")).click();
			   Thread.sleep(2000);
}
}