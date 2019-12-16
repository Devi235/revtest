package Vieworders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_57_54 extends Reuse{
	public ExtentReports report=new ExtentReports(ReportSavingPath+"\\Vieworders\\"+"TC_57_54.html");
	public ExtentTest logger =report.startTest("TC_57_54");
	String OrderNo1;
	@Test(priority=0)
	public void OrderNumberGet() throws Exception {
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user 
		Thread.sleep(3000);	
		try{
			if(driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).isDisplayed()){
				driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).click();
				Thread.sleep(8000);
			}}
			catch(Exception e)
			{
				
			}
			
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(10000);
		 
		 String Ordernumber=driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])[1]")).getText();
		 OrderNo1=Ordernumber.replace("Order number : ", "");
		 
		 screenshot(ScreenshotSavingPath+"TC_57_01");
		 logger.log(LogStatus.PASS,"Order placed",logger.addScreenCapture(ScreenshotSavingPath+"TC_57_01"));
         driver.findElement(By.xpath("//*[@class='logoutlink']")).click();
         String wait1="//*[@name='userName']";
		 waitexplicit(wait1);;Thread.sleep(4000);
		 report.endTest(logger);
		 report.flush();   
	}
	
	@Test(priority=1)
	public void TC_11_to_17_view() throws Exception {
		 AdminLogin();Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='View Orders'])[1]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id='flatNumber']")).sendKeys(OrderNo1);
		 driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
		 Thread.sleep(5000);
		 screenshot(ScreenshotSavingPath+"TC_57_02");
		 String orderstatus=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[3]")).getText();
			try{
			WebElement bulkbilled=driver.findElement(By.xpath("//*[text()='Bulk billed']"));
			WebElement bulkunbilled=driver.findElement(By.xpath("//*[text()='Bulk unbilled']"));
			logger.log(LogStatus.FAIL,"When status is in inprogress bulk status options display",logger.addScreenCapture(ScreenshotSavingPath+"TC_57_02"));
			}
			catch(Exception e)
			{
				logger.log(LogStatus.PASS,"When status is in inprogress bulk status options display",logger.addScreenCapture(ScreenshotSavingPath+"TC_57_02"));	
			}
			driver.findElement(By.xpath("//*[@id='flatNumber']")).sendKeys(OrderNo1);
			driver.findElement(By.xpath("//*[@class='logoutlink']")).click();
	        String wait1="//*[@name='userName']";
			waitexplicit(wait1);;Thread.sleep(4000);
			report.endTest(logger);
			report.flush();		     
}
	
@Test(priority=2)
public void Customerview() throws Exception {
	UserLogin();Thread.sleep(5000);
	 try{
		 if(driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).isDisplayed()){
			driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).click();
			Thread.sleep(8000);
				}}
			catch(Exception e)
			{
					
			}		
	  screenshot(ScreenshotSavingPath+"TC_57_03");
	  logger.log(LogStatus.PASS,"Order Closed",logger.addScreenCapture(ScreenshotSavingPath+"TC_57_03"));	
	  driver.findElement(By.xpath("//*[@class='logoutlink']")).click();
      String wait1="//*[@name='userName']";
	  waitexplicit(wait1);;Thread.sleep(4000);
		 //admin login
		  AdminLogin();Thread.sleep(5000);	  
				driver.findElement(By.xpath("(//*[text()='View Orders'])[1]")).click();
				Thread.sleep(5000);
			
				driver.findElement(By.xpath("//*[@id='flatNumber']")).sendKeys(OrderNo1);
				driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
				Thread.sleep(5000);
				 screenshot(ScreenshotSavingPath+"TC_57_04");
				String orderstatus=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[3]")).getText();
				try{
				WebElement bulkbilled=driver.findElement(By.xpath("//*[text()='Bulk billed']"));
				WebElement bulkunbilled=driver.findElement(By.xpath("//*[text()='Bulk unbilled']"));
				logger.log(LogStatus.PASS,"When status is in completed bulk status options display",logger.addScreenCapture(ScreenshotSavingPath+"TC_57_04"));
				}
				catch(Exception e)
				{
					logger.log(LogStatus.FAIL,"When status is in completed bulk status options display",logger.addScreenCapture(ScreenshotSavingPath+"TC_57_04"));	
				}
			 report.endTest(logger);
			 report.flush();  
			 driver.close();
	}
}
