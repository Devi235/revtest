package Vieworders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_62_63 extends Reuse{
	public ExtentReports report=new ExtentReports(ReportSavingPath+"\\Vieworders\\"+"TC_62_63.html");
	public ExtentTest logger =report.startTest("TC_62_63");
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
		 screenshot(ScreenshotSavingPath+"TC_62_01");
		 try{
				if(driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).isDisplayed()){
					driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).click();
					Thread.sleep(8000);
				}}
				catch(Exception e)
				{
					
				}
		
		 logger.log(LogStatus.PASS,"Order placed",logger.addScreenCapture(ScreenshotSavingPath+"TC_62_01"));
         driver.findElement(By.xpath("//*[@class='logoutlink']")).click();
         String wait1="//*[@name='userName']";
		 waitexplicit(wait1);;Thread.sleep(4000);
		 report.endTest(logger);
		 report.flush();   
	}
	
	@Test(priority=1)
	public void TC_CTB() throws Exception {
		 AdminLogin();Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='View Orders'])[1]")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id='flatNumber']")).sendKeys(OrderNo1);
		 driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
		 Thread.sleep(5000);
		
		//completed to unbilled
		 Actions a=new Actions(driver);
         WebElement checkbox=driver.findElement(By.xpath("(//*[@name='checkbox'])[1]"));
         a.click(checkbox).build().perform();Thread.sleep(1000);
         WebElement bulkunbilled=driver.findElement(By.xpath("//*[text()='Bulk unbilled']"));
         bulkunbilled.click();
		 String wait1="//*[text()='Order status changed successfully']";
		 waitexplicit(wait1);;Thread.sleep(4000);
		 screenshot(ScreenshotSavingPath+"TC_62_02");
		 String orderstatus=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[3]")).getText();
		 if(orderstatus.equals("UnBilled")){
			 logger.log(LogStatus.PASS,"Status change from Completed to UnBilled",logger.addScreenCapture(ScreenshotSavingPath+"TC_62_02")); 
		 }
		 else
		 {
			 logger.log(LogStatus.FAIL,"Status change from Completed to UnBilled",logger.addScreenCapture(ScreenshotSavingPath+"TC_62_02"));
		 }
		//Unbilled to billed
		 try{
		WebElement checkbox1=driver.findElement(By.xpath("(//*[@name='checkbox'])[1]"));
		a.click(checkbox1).build().perform();Thread.sleep(1000);
		WebElement bulkbilled=driver.findElement(By.xpath("//*[text()='Bulk billed']"));
		 bulkunbilled.click();
		 String wait2="//*[text()='Order status changed successfully']";
		 waitexplicit(wait2);;Thread.sleep(4000);
		 screenshot(ScreenshotSavingPath+"TC_62_03");
		 String orderstatus1=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[3]")).getText();
		 if(orderstatus1.equals("Billed")){
			 logger.log(LogStatus.PASS,"Status change from UnBilled to Billed",logger.addScreenCapture(ScreenshotSavingPath+"TC_62_03")); 
		 }
		 else
		 {
			 logger.log(LogStatus.FAIL,"Status change from UnBilled to Billed",logger.addScreenCapture(ScreenshotSavingPath+"TC_62_03"));
		 }}
		 catch(Exception e)
		 {
			 logger.log(LogStatus.FAIL,"Status change from UnBilled to Billed",logger.addScreenCapture(ScreenshotSavingPath+"TC_62_03")); 
		 }
		 report.endTest(logger);
		 report.flush();   
		 driver.close();
}
}
