package patch;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class patchHomePageObjectVarification 
{
	WebDriver driver; // Calls WebDriver

	@Before 
	public void  browserStart()
	{
		driver = new FirefoxDriver();
		driver.get("http://www.patch.com");
		
	}
	
	
	@Test
	public void splashLeft()
	{
	
		try //This function like feature removes error details.
		{
			//driver.findElement(By.partialLinkText("Patch")).isDisplayed();
			driver.findElement(By.xpath(".//a[@class='logo' and @title='Patch']")).isDisplayed();
			
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Logo not found");
		}
		
		driver.findElement(By.id("zip")).isDisplayed();
		driver.findElement(By.xpath("//input[@class='submit' and @value='FIND MY PATCH']")).isDisplayed();
						
		try
		{
			driver.findElement(By.xpath(".//a[@title='PropwashJunction Patch']")).isDisplayed();
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Ad logo Link not found");
		}
			
	}
	
	@Test
	public void splashRight()
	{
	
				/* 
	    		Differnt ways to make xpath
	    		.//div[@id='top-stories'] – filter elements by ID, or by another attribute using @ symbol
	    		.//div[contains(text(),'iPhone')] – filter by DIV elements which have ‘iPhone’ word – searching
	    		.//div[@id='top-stories']/div[last()] – last() command will return us last element in collection
	    		.//*[@id='top-stories']/div[position() > 5][position() < 10] – position() command will return position of element. In current sample I taking elements from 5 till 10.
	    		.//div[@id='top-stories']/div[position() mod 2 = 0] – mod – modulo. Here are all even elements.
				/ select from root
				//Selects nodes in the document from the current node that match the selection no matter where they are 
				. Selects the current node
				.. Selects the parent of the current node
				@ Selects attributes
				//a[contains(text(), 'programming')]/@href  --- for link
				 
				 */

				
		//California
		driver.findElement(By.id("California")).isDisplayed();
		//driver.findElement(By.partialLinkText("California")).isDisplayed();
		driver.findElement(By.xpath("//li[@id='California']")).isDisplayed();
		
		//Connecticut
		driver.findElement(By.xpath("//li[@id='Connecticut']")).isDisplayed();
		//driver.findElement(By.partialLinkText(linkText))

		//DistrictofColumbia
		driver.findElement(By.xpath("//li[@id='DistrictofColumbia']")).isDisplayed();


		//Florida
		driver.findElement(By.xpath("//li[@id='Florida']")).isDisplayed();	
	
		//Georgia
		driver.findElement(By.xpath("//li[@id='Georgia']")).isDisplayed();	
	
		//Illinois
		driver.findElement(By.xpath("//li[@id='Illinois']")).isDisplayed();	
	
		//Iowa
		driver.findElement(By.xpath("//li[@id='Iowa']")).isDisplayed();	
	
		//Maryland
		driver.findElement(By.xpath("//li[@id='Maryland']")).isDisplayed();	
	
		//Illinois
		driver.findElement(By.xpath("//li[@id='Illinois']")).isDisplayed();	
	
		//Massachusetts
		driver.findElement(By.xpath("//li[@id='Massachusetts']")).isDisplayed();
	
		//Michigan
		driver.findElement(By.xpath("//li[@id='Michigan']")).isDisplayed();
	
		//Minnesota
		driver.findElement(By.xpath("//li[@id='Minnesota']")).isDisplayed();
	
		//Missouri
		driver.findElement(By.xpath("//li[@id='Missouri']")).isDisplayed();
	
		//NewHampshire
		driver.findElement(By.xpath("//li[@id='NewHampshire']")).isDisplayed();
	
		//NewJersey
		driver.findElement(By.xpath("//li[@id='NewJersey']")).isDisplayed();	
	
		//NewYork
		driver.findElement(By.xpath("//li[@id='NewYork']")).isDisplayed();	
	
		//NorthCarolina
		driver.findElement(By.xpath("//li[@id='NorthCarolina']")).isDisplayed();	
	
		//Ohio
		driver.findElement(By.xpath("//li[@id='Ohio']")).isDisplayed();		
	
		//Pennsylvania
		driver.findElement(By.xpath("//li[@id='Pennsylvania']")).isDisplayed();		
	
		//RhodeIsland
		driver.findElement(By.xpath("//li[@id='RhodeIsland']")).isDisplayed();	
	
		//SouthCarolina
		driver.findElement(By.xpath("//li[@id='SouthCarolina']")).isDisplayed();

		//Virginia
		driver.findElement(By.xpath("//li[@id='Virginia']")).isDisplayed();

		//Washington
		driver.findElement(By.xpath("//li[@id='Washington']")).isDisplayed();
		
		//Wisconsin
		driver.findElement(By.xpath("//li[@id='Wisconsin']")).isDisplayed();
		
	}
	
	@Test
	public void footer()
	{
		//Patch Info
		driver.findElement(By.partialLinkText("About Us")).isDisplayed();
		driver.findElement(By.partialLinkText("Jobs")).isDisplayed();
		driver.findElement(By.partialLinkText("Advertise")).isDisplayed();
		driver.findElement(By.partialLinkText("About Our Ads")).isDisplayed();
		driver.findElement(By.partialLinkText("Terms of Use")).isDisplayed();
		driver.findElement(By.partialLinkText("Privacy Policy")).isDisplayed();
		
		//Get in Touch
		driver.findElement(By.partialLinkText("Go Patch!")).isDisplayed();
		driver.findElement(By.partialLinkText("Help")).isDisplayed();
		driver.findElement(By.partialLinkText("Contact Us")).isDisplayed();
		driver.findElement(By.partialLinkText("Patch Blog")).isDisplayed();
		
		//Patch Initiatives
		driver.findElement(By.partialLinkText("PatchU")).isDisplayed();
		
		//FooterLogo
		driver.findElement(By.xpath(".//a[@title='Patch Network']")).isDisplayed();

	}
	
	
	@After
	public void end() throws Exception 
	{
		driver.close();
		Thread.sleep(2000);  //thows Exception was added
	}
	
}
