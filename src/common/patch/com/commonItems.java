package common.patch.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class commonItems 
{
	
	
	
	public void navbarTop(WebDriver driver)
	{
		patchName(driver);
		weather(driver);
		nearBy(driver);
		newsletter(driver);
	}
			
		public void patchName(WebDriver driver)
		{
			//Town Name
			driver.findElement(By.xpath("//div[@class='town-name']")).isDisplayed();
			
			//Patch Logo
			driver.findElement(By.xpath("//div[contains(@class,'patch-logo')]")).isDisplayed();	
		}
		
		public void weather(WebDriver driver)
		{
			//Weather Icon
			driver.findElement(By.xpath("//i[@class='inline-icon icon_26']")).isDisplayed();
			
			//Current Temp
			driver.findElement(By.xpath("//span[contains(@class,'current_temp']")).isDisplayed();
			//div[@id='weather']//span     .. this will work too.	
		}

		public void nearBy(WebDriver driver)
		{
		
		//Nearby
		driver.findElement(By.xpath("//span[contains(@class,'invisible-mobile nearby_label']")).isDisplayed();
		
		}
		
		public void newsletter(WebDriver driver)
		{
			
			//Email Icon
			driver.findElement(By.xpath("//i[@class='icon_email-icon inline-icon']")).isDisplayed();
			
			//Get Newsletter
			driver.findElement(By.xpath("//strong[@class='get_newsletter_copy']")).isDisplayed();
		}
				
		public void navMessages(WebDriver driver)
		{
			signUp(driver);
			signIn(driver);
		}
			
			public void signUp(WebDriver driver)
			{
				
				//Sign up 
				driver.findElement(By.xpath("//strong[text()='Join']")).click();
				driver.findElement(By.xpath("//input[@name='name']")).isDisplayed();
				driver.findElement(By.xpath("//input[@name='email']")).isDisplayed();
				driver.findElement(By.xpath("//input[@name='password']")).isDisplayed();
				driver.findElement(By.xpath("//input[@name='confirm_password']")).isDisplayed();
				driver.findElement(By.xpath("//form[@id='js-signup_form']//a[text()='Cancel']")).isDisplayed();
				driver.findElement(By.xpath("//input[@id='signup' and @type='submit']")).isDisplayed();
			}
			
			public void signIn(WebDriver driver)
			{
				
				//Log in
				driver.findElement(By.xpath("//strong[text()='Sign In']")).click();
				driver.findElement(By.xpath("//a[contains(@href, '/users/authorize')]")).isDisplayed();
				driver.findElement(By.xpath("//input[@class='login-input' and @name='email']")).isDisplayed();
				driver.findElement(By.xpath("//input[@class='login-input' and @name='password']")).isDisplayed();
				driver.findElement(By.xpath("//input[@id='persistent_1']")).isDisplayed();
				driver.findElement(By.xpath("//a[contains(@href, '/forgot_password')]")).isDisplayed();
				driver.findElement(By.xpath("//div/a[@class='close close-cancel']")).isDisplayed();
				driver.findElement(By.xpath("//button[@id='signin']")).isDisplayed();
				driver.findElement(By.xpath("//div/a[text()='Join Patch Now']")).isDisplayed();
			}
		
		public void socialNetwork(WebDriver driver)
		{
			twitter(driver);
			facebook(driver);
		}
			
			public void twitter(WebDriver driver)
			{
				
				//Twitter Logo		
				driver.findElement(By.xpath("//i[contain@class,'icon_twitter-header']"));
				
				//Twitter Mouseover
				new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@id=twitter_tooltip_target]"))).perform();//Mouse over
				
				
			/*	WebElement elems=driver.findElement(By.linkText("Custom Development"));//Menu Item
				WebElement elems1=driver.findElement(By.xpath("//li[@id='item-465']/a"));//Menu
				Actions builder = new Actions(driver); 
				Actions hoverOverRegistrar = builder.moveToElement(elems1);
				hoverOverRegistrar.perform();
				elems.click();//at last Menu Item Click  */
				
				//Twitter Badge
				driver.findElement(By.id("abTwitterBadgeFrame_0")).isDisplayed(); //Confirm Badge
				driver.findElement(By.id("abTwitterBadgeFrame_0")).click(); //Check Link
					
			}
			
			public void facebook(WebDriver driver)
			{
				
				//Facebook Logo		
				driver.findElement(By.xpath("//i[contain@class,'icon_facebook-header']"));
				
				//Twitter Mouseover
				new Actions(driver).moveToElement(driver.findElement(By.xpath("//div[@id=facebook_tooltip_target]"))).perform();//Mouse over
				
				//Facebook Badge
				driver.findElement(By.id("abFacebookConnectFrame_0")).isDisplayed(); //Confirm Badge
				driver.findElement(By.id("abFacebookConnectFrame_0")).click(); //Check Link
			}
		
		public void headerMenu(WebDriver driver)
			
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

} 
	
	
	

