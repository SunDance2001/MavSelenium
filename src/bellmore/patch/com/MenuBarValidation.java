package bellmore.patch.com;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class MenuBarValidation 
{

	WebDriver driver;

	@Before 
	public void  browserStart()
	
	{
		driver = new FirefoxDriver();
		driver.get("http://bellmore.patch.com");
		
	}
	
	@After
	public void end() throws Exception
	
	{
		driver.close();
		Thread.sleep(2000);  //thows Exception was added
	}
		
	@Test
	public void MenuValidation() throws Exception
	
	{
		
		//Menu - Home
		driver.findElement(By.id("home_menu")).click();
		//Menu - News
		driver.findElement(By.id("news_menu")).click();
		//Comes to previous page
		driver.navigate().back();
		
		//Menu - Blogs
		driver.findElement(By.id("blogs_menu")).click();
		driver.navigate().back();
		
		//Menu - Boards
		driver.findElement(By.id("boards_menu")).click();
		driver.navigate().back();		
		
		//Menu - Events
		driver.findElement(By.id("events_menu")).click();
		driver.navigate().back();		
		
		//Menu - Business
		driver.findElement(By.id("listings_menu")).click();
		driver.navigate().back();
		
		//Menu - Real Estate
		driver.findElement(By.id("realestate_menu")).click();
		driver.navigate().back();
		
		//Menu - Jobs
		driver.findElement(By.id("jobs_menu")).click();
		driver.navigate().back();
		
				
	}
	
	
	@Test
	public void patchHomePageObjectVarification()
	{
	
	driver.get("http://www.patch.com");
	try
	{
		driver.findElement(By.id("zip")).isDisplayed();
	}
	catch (NoSuchElementException e)
	{
		System.out.println("Zip code text box not found");
	}
	
	try
	{
		driver.findElement(By.xpath("//input[@class='submits' and @value='FIND MY PATCH']")).isDisplayed();

	}
	catch (NoSuchElementException e)
	{
		System.out.println("Find my patch button not found");
	}
	
				
	}
	
	
}
