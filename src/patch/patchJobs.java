package patch;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class patchJobs 
{

	WebDriver driver;
	
	@Before
	
	public void browserStart()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.patch.com/jobs");
	}
	
	
	@Test
	
	public void header()
	{
		driver.findElement(By.xpath("//div[4]/div/div/h1/a/img")).isDisplayed();
		//driver.findElement(By.xpath("//*[@id='abFacebookConnect_0']")).isDisplayed();
		driver.findElement(By.id("abFacebookConnect_0")).isDisplayed();
		driver.findElement(By.xpath("//div[@class='M-change_towns NS_1t2m99gade']")).isDisplayed();
		
	}
	
	
	@Test
	public void login()
	{
	
		driver.findElement(By.xpath("//ul[@id='nav_messages']/li[2]/a/strong")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("megahellfire2002@gmail.com");
		driver.findElement(By.name("password")).sendKeys("sample1234");
		driver.findElement(By.id("signin")).click();
		
	}
	
	
	@Test
	public void listElement()
	{
		driver.findElement(By.xpath("//a[contains(text(),'Search all openings')]")).isDisplayed();
		
	}
}
