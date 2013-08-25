package bellmore.patch.com;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class bellmoreCredential 
{
	
	WebDriver driver;

	@Before 
	public void  browserStart()
	
	{
		driver = new FirefoxDriver();
		driver.get("http://bellmore.patch.com");
		
	}
	//input[@class='signup-input' and @name='name']
	
	@Test
	public void signup()
	{
		driver.findElement(By.xpath("//ul[@id='nav_messages']/li/a/strong")).click();
		driver.findElement(By.xpath("//input[@class='signup-input' and @name='name']")).sendKeys("John Kim");
		driver.findElement(By.xpath("//input[@class='signup-input' and @name='email']")).sendKeys("sample20022002@gmail.com");
		driver.findElement(By.xpath("//input[@class='signup-input' and @name='password']")).sendKeys("sample1234");
		driver.findElement(By.xpath("//input[@class='signup-input' and @name='confirm_password']")).sendKeys("sample1234");
		driver.findElement(By.id("signup")).click();
	}
	
	@Test
	public void login()
	{
	
		driver.findElement(By.xpath("//ul[@id='nav_messages']//strong[text()='Sign In']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sample20022002@gmail.com");
		//driver.findElement(By.xpath("//input[@class='signup-input' and @name='email']")).sendKeys("megahellfire2002@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sample1234");
		driver.findElement(By.id("signin")).click();
		//input[@class='signup-input' and @name='confirm_password']
		
	}
	
	@Test
	public void logout()
	{
		driver.findElement(By.xpath("//div[5]/div[2]/div/a/div[2]")).click();
		//driver.findElement(By.xpath("(//a[contains(text(),'Sign Out')])[2]")).click();
		driver.findElement(By.cssSelector("a.js-logout")).click();
	}
	
	
	@After
	public void end() throws Exception
	
	{
		driver.close();
		Thread.sleep(5000);  //thows Exception was added
	}
	
	
	
	
	
}
