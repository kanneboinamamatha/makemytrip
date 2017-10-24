package trip;
	import java.util.concurrent.TimeUnit;
	import org.junit.*;
	import org.openqa.selenium.*;
	import org.openqa.selenium.firefox.FirefoxDriver;
	

	public class trip2 {
	  private WebDriver driver;
	

	  @Before
	  public void setUp() throws Exception {
	    driver = new FirefoxDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testTrip() throws Exception {
	    driver.get("https://www.makemytrip.com/");
	    driver.findElement(By.id("ch_login_icon")).click();
	    driver.findElement(By.id("ch_login_email")).clear();
	    driver.findElement(By.id("ch_login_email")).sendKeys("munnyammu448@gmail.com");
	    driver.findElement(By.id("ch_login_password")).clear();
	    driver.findElement(By.id("ch_login_password")).sendKeys("mamatha552");
	    driver.findElement(By.id("ch_login_btn")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.cssSelector("span.ch__marL5")).click();
	    driver.findElement(By.id("ch_logged-inlogout")).click();
	  
	  }
	}

