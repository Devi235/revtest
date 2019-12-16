package Vieworders;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_21 extends Reuse{
	public ExtentReports report=new ExtentReports(ReportSavingPath+"\\Vieworders\\"+"TC_21.html");
	public ExtentTest logger =report.startTest("TC_21");
	String random;
	String OrderNo1;String date1; String Addressread;
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
			System.out.println(e);
		}
		
		//order place
		
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(10000);
		
		 screenshot(ScreenshotSavingPath+"TC_21");
		 String Ordernumber=driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])[1]")).getText();
		 OrderNo1=Ordernumber.replace("Order number : ", "");
		 System.out.println(OrderNo1); 
		 logger.log(LogStatus.PASS,"OrderPlaced",logger.addScreenCapture(ScreenshotSavingPath+"TC_21"));report.endTest(logger);
		 report.flush();  
	}
	
	@Test(priority=1)
	  public void TC_21_view() throws Exception {
		   
			driver.findElement(By.xpath("(//*[text()='View Orders'])[1]")).click();
			Thread.sleep(5000);
		
			driver.findElement(By.xpath("//*[@id='flatNumber']")).sendKeys(OrderNo1);
			driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
			Thread.sleep(5000);
			 screenshot(ScreenshotSavingPath+"TC_21_View");
			String Refnumbertext=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[2]")).getText();
			if(Refnumbertext.equals(""))
			{
				 logger.log(LogStatus.PASS,"Without Reference number",logger.addScreenCapture(ScreenshotSavingPath+"TC_21_View"));
			}
			else
			{
				logger.log(LogStatus.FAIL,"Without Reference number",logger.addScreenCapture(ScreenshotSavingPath+"TC_21_View"));
			}
			String Total=driver.findElement(By.xpath("((//*[text()='Search']))[1]//following-sibling::div[3]")).getText();
			if(Total.contains("1"))
			{
				 logger.log(LogStatus.PASS,"Total Orders count",logger.addScreenCapture(ScreenshotSavingPath+"TC_21_View"));
			}
			else
			{
				logger.log(LogStatus.FAIL,"Total Orders count",logger.addScreenCapture(ScreenshotSavingPath+"TC_21_View"));
			}
			report.endTest(logger);
			report.flush(); driver.close(); 
	}
}
