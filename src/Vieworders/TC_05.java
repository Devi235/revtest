package Vieworders;

import java.io.IOException;

import jxl.read.biff.BiffException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Helper.Reuse;

public class TC_05 extends Reuse{
	public ExtentReports report=new ExtentReports(ReportSavingPath+"\\Vieworders\\"+"TC_05.html");
	public ExtentTest logger =report.startTest("TC_05");	
	public String OrderNo1;
	public String OrderNo2;

	@Test(priority=0)
	public void Order1Place() throws Exception {
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
		 Thread.sleep(12000);
		 screenshot(ScreenshotSavingPath+"Order1Place");
		 WebElement Order=driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])[1]"));
		 String Ordernumber=driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])[1]")).getText();
		 OrderNo1=Ordernumber.replace("Order number : ", "");
		 System.out.println(OrderNo1); 
		 if(Order.isDisplayed())
			{
				logger.log(LogStatus.PASS,"Order:1",logger.addScreenCapture(ScreenshotSavingPath+"Order1Place"));
			}
			else
			{
				logger.log(LogStatus.FAIL,"Order:1",logger.addScreenCapture(ScreenshotSavingPath+"Order1Place"));
			}
			report.endTest(logger);
			report.flush();
	}
	
	@Test(priority=1)
	public void Order2Place() throws Exception {

		try{
		if(driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).isDisplayed()){
			driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).click();
			Thread.sleep(8000);
		}}
		catch(Exception e)
		{
			
		}
		//order place
		 
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(12000);
		 screenshot(ScreenshotSavingPath+"Order2Place");
		 WebElement Order=driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])[1]"));
		 String Ordernumber=driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])[1]")).getText();
		 OrderNo2=Ordernumber.replace("Order number : ", "");
		 System.out.println(OrderNo2); 
		 if(Order.isDisplayed())
			{
				logger.log(LogStatus.PASS,"Order:2",logger.addScreenCapture(ScreenshotSavingPath+"Order2Place"));
			}
			else
			{
				logger.log(LogStatus.FAIL,"Order:2",logger.addScreenCapture(ScreenshotSavingPath+"Order2Place"));
			}
			report.endTest(logger);
			report.flush();
	}
	
  @Test(priority=2)
  public void TC_05_view() throws Exception {

		driver.findElement(By.xpath("(//*[text()='View Orders'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
		Thread.sleep(5000);
		WebElement ordernumbertext2=driver.findElement(By.xpath("(//*[text()='"+OrderNo1+"'])[1]"));
		WebElement ordernumbertext1=driver.findElement(By.xpath("(//*[text()='"+OrderNo2+"'])[1]"));
		screenshot(ScreenshotSavingPath+"VO_TC_05");
		if(ordernumbertext2.isDisplayed() && ordernumbertext1.isDisplayed())
		{
			logger.log(LogStatus.PASS,"when clicked on search without giving any word",logger.addScreenCapture(ScreenshotSavingPath+"VO_TC_05"));
		}
		else
		{
			logger.log(LogStatus.FAIL,"when clicked on search without giving any word",logger.addScreenCapture(ScreenshotSavingPath+"VO_TC_05"));
		}
		report.endTest(logger);
		report.flush();
		driver.close();
	  
  }
}
