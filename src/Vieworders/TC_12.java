package Vieworders;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_12 extends Reuse{
	public ExtentReports report=new ExtentReports(ReportSavingPath+"\\Vieworders\\"+"TC_12.html");
	public ExtentTest logger =report.startTest("TC_12");
	String OrderNo1;
	@Test(priority=0)
	public void OrderNumberclose() throws Exception {
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
		 Thread.sleep(13000);
		 String Ordernumber=driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])[1]")).getText();
		 OrderNo1=Ordernumber.replace("Order number : ", "");
		 System.out.println(OrderNo1+"OrderNo1");
		 driver.findElement(By.xpath("(//*[text()='select'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='select'])[1]")).click();
		 Thread.sleep(1000);
		 Actions a=new Actions(driver);
		 
		 WebElement checkbox=driver.findElement(By.xpath("(//*[@name='checkbox'])[1]"));
		 a.click(checkbox).build().perform();
		 Thread.sleep(1000);//critical
		
		 
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 String wait="(//*[text()='Order saved successfully.'])[2]";
		 waitexplicit(wait);;
		
		 Thread.sleep(12000);
		 
		 driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).click();
		 String wait1="(//*[text()='Order closed successfully.'])[2]";
		 waitexplicit(wait1);;
		 screenshot(ScreenshotSavingPath+"OrderNumberclose");
		 Thread.sleep(3000);
		 if(driver.findElement(By.xpath("(//*[text()='Order closed successfully.'])[2]")).isDisplayed()){
		 logger.log(LogStatus.PASS,"Order Closed",logger.addScreenCapture(ScreenshotSavingPath+"OrderNumberclose"));
		 }
		 else
		 {
		 logger.log(LogStatus.FAIL,"Order Closed",logger.addScreenCapture(ScreenshotSavingPath+"OrderNumberclose"));	 
		 }
		 report.endTest(logger);
		 report.flush();   
	}
	
	@Test(priority=1)
	  public void TC_12_view() throws Exception {
		   
			driver.findElement(By.xpath("(//*[text()='View Orders'])[1]")).click();
			Thread.sleep(6000);
			System.out.println(OrderNo1+"OrderNo1");
			driver.findElement(By.xpath("//*[@id='flatNumber']")).sendKeys(OrderNo1);
			driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
			Thread.sleep(5000);
			String orderstatus=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[3]")).getText();
			screenshot(ScreenshotSavingPath+"TC_12_view");
			if(orderstatus.equals("Completed"))
			{
				logger.log(LogStatus.PASS,"status changed to completed in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_12_view"));
			}
			else
			{
				logger.log(LogStatus.FAIL,"status is not changed to completed in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_12_view"));
			}	
			
			try{
				if(driver.findElement(By.xpath("(//*[text()='View'])[1]")).isDisplayed())
				{
					logger.log(LogStatus.PASS,"when critical and select count is present then view icon display",logger.addScreenCapture(ScreenshotSavingPath+"TC_12_view"));
				}
				else
				{
					logger.log(LogStatus.FAIL,"when critical and select count is present then view icon display",logger.addScreenCapture(ScreenshotSavingPath+"TC_12_view"));
				}}
				catch(Exception e)
				{
					logger.log(LogStatus.FAIL,"when critical and select count is present then view icon display",logger.addScreenCapture(ScreenshotSavingPath+"TC_12_view"));
				}
			report.endTest(logger);
			report.flush();  
			driver.close();
	  }
}
