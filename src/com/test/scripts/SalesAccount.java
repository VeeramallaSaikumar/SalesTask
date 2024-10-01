package com.test.scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SalesAccount {
	WebDriver driver;
	ChromeOptions opt; 
	Actions act;
	EdgeOptions eo;
	Robot r;
	public void launchAUT() {
		//opt=new ChromeOptions();
		//opt.addArguments("--disable-notifications");
		//driver=new ChromeDriver(opt);
		eo=new EdgeOptions();
		eo.addArguments("--disable-notifications");
		driver=new EdgeDriver(eo);	
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
	}
	public void login() {
		driver.findElement(By.id("username")).sendKeys("saikumarhg5472@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Tb4H8Ht1@");
		driver.findElement(By.id("Login")).click();
	}
	public void objCreation() throws InterruptedException, AWTException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//explicity wait 
		WebDriverWait wt=new WebDriverWait(driver,Duration.ofSeconds(10));
		act=new Actions(driver);
		driver.findElement(By.xpath("//button[@title='App Launcher']/div")).click();
		driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input']")).sendKeys("Sales");
		//wt.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and more']"))).click();
		
	driver.findElement(By.xpath("//p[text()='Manage your sales process with accounts, leads, opportunities, and more']")).click();	
	
		driver.findElement(By.xpath("//one-app-nav-bar-item-root[@data-id='Account']")).click();

		driver.findElement(By.xpath("//div[text()='New']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Rating']")).click();
	r=new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		Thread.sleep(2000);
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.DOWN).build().perform();	
		act.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//input[@class='slds-input' and @name='Name']")).sendKeys("saikumar veeramalla");
		driver.findElement(By.xpath("//input[@class='slds-input' and @name='Phone']")).sendKeys("8247246031");
		driver.findElement(By.xpath("//input[@class='slds-input' and @name='AccountNumber']")).sendKeys("5622656227");
		driver.findElement(By.xpath("//input[@class='slds-input' and @name='Fax']")).sendKeys("123fa");
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		driver.findElement(By.xpath("//input[@class='slds-input' and @name='Website']")).sendKeys("NA");		
		driver.findElement(By.xpath("//input[@class='slds-input' and @name='Site']")).sendKeys("NA");
		driver.findElement(By.xpath("//input[@class='slds-input' and @name='TickerSymbol']")).sendKeys("NA");
//
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		driver.findElement(By.xpath("//button[@aria-label='Type']")).click();		
		driver.findElement(By.xpath("//span[text()='Customer - Direct']")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='Ownership']")).click();
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
//		WebElement ele=wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Public']")));
//		ele.click();
		//driver.findElement(By.xpath("//span[text()='Public']")).click();
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		driver.findElement(By.xpath("//button[@aria-label='Industry']")).click();
		Thread.sleep(1000);
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.ENTER).perform();
		//driver.findElement(By.xpath("//span[@title='Agriculture']")).click();
		driver.findElement(By.xpath("//input[@class='slds-input' and @name='NumberOfEmployees']")).sendKeys("10");
	
		driver.findElement(By.xpath("//input[@inputmode='decimal' and @name='AnnualRevenue']")).sendKeys("3000000");
		driver.findElement(By.xpath("//input[@class='slds-input' and @name='Sic']")).sendKeys("4335");
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		driver.findElement(By.xpath("(//textarea[@name='street'])[1]")).sendKeys("Nandanavanam clocny  ");
		driver.findElement(By.xpath("(//textarea[@name='street'])[2]")).sendKeys("karmanghat saroor nagar  rangareddy");
		driver.findElement(By.xpath("(//input[@name='city'])[1]")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("(//input[@name='city'])[2]")).sendKeys("Hyderabad");
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 driver.findElement(By.xpath("(//input[@name='postalCode'])[1]")).sendKeys("500079");
		 driver.findElement(By.xpath("(//input[@name='province'])[1]")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("(//input[@name='postalCode'])[2]")).sendKeys("630067");
		 driver.findElement(By.xpath("(//input[@name='province'])[2]")).sendKeys("Chennai");		
		 driver.findElement(By.xpath("(//input[@name='country'])[1]")).sendKeys("india");
		 driver.findElement(By.xpath("(//input[@name='country'])[2]")).sendKeys("india");
		 //Addtional Information 
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//button[@aria-label='Customer Priority']")).click();
//		 driver.findElement(By.xpath("//span[text()='High']"));
			act.sendKeys(Keys.DOWN).perform();
			act.sendKeys(Keys.DOWN).build().perform();	
			act.sendKeys(Keys.ENTER).perform();
		driver.findElement(By.xpath("//button[@aria-label='SLA']")).click();
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.DOWN).build().perform();	
		act.sendKeys(Keys.ENTER).perform();
		 r.keyPress(KeyEvent.VK_PAGE_DOWN);
		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		driver.findElement(By.xpath("//input[@name='SLASerialNumber__c' and @part='input']")).sendKeys("54637");
//		r.keyPress(KeyEvent.VK_PAGE_DOWN);
//		 r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		driver.findElement(By.xpath("//input[@step='any' and @name='NumberofLocations__c']")).sendKeys("5");		 
		driver.findElement(By.xpath("//button[@aria-label='Upsell Opportunity']")).click();
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.DOWN).build().perform();	
		act.sendKeys(Keys.ENTER).perform();		
		//driver.findElement(By.xpath("//span[contains(text(),'Maybe')]")).click();
		
		driver.findElement(By.xpath("//button[contains(@aria-label,'Active')]")).click();
		act.sendKeys(Keys.DOWN).perform();
		act.sendKeys(Keys.DOWN).build().perform();	
		act.sendKeys(Keys.ENTER).perform();
		
		//Description information
		driver.findElement(By.xpath("(//textarea[@part='textarea'])[3]")).sendKeys("NA",Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER);
		//driver.findElement(By.name("CancelEdit")).click();
		//driver.findElement(By.xpath("//button[text()='Save']")).click();
	}
	public static void main(String[] args) throws InterruptedException, Exception {
		SalesAccount obj=new SalesAccount();
		obj.launchAUT();
		obj.login();
		obj.objCreation();
	}

}
