package Vieworders;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_18 extends Reuse{
	public ExtentReports report=new ExtentReports(ReportSavingPath+"\\Vieworders\\"+"TC_18.html");
	public ExtentTest logger =report.startTest("TC_18");public String OrderNo1;
	@Test(priority=0)
	public void OrderNumberGet() throws Exception {
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user 
		Thread.sleep(3000);	
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(10000);
		 
		 String Ordernumber=driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])[1]")).getText();
		 OrderNo1=Ordernumber.replace("Order number : ", "");
		 
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
		 screenshot(ScreenshotSavingPath+"TC_18");
		 Thread.sleep(1000);
		 logger.log(LogStatus.PASS,"Order saved",logger.addScreenCapture(ScreenshotSavingPath+"TC_18"));report.endTest(logger);
		 report.flush();   
	}
	
	@Test(priority=1)
	  public void TC_08_view() throws Exception {
		   
			driver.findElement(By.xpath("(//*[text()='View Orders'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id='flatNumber']")).sendKeys(OrderNo1);
			driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
			Thread.sleep(5000);
			try{
			String criticalcount=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[6]")).getText();
			String selectedcount=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[7]")).getText();
			screenshot(ScreenshotSavingPath+"TC_08_view");
			
			if(criticalcount.equals("1") && selectedcount.equals("2"))
			{
				logger.log(LogStatus.PASS,"criticalcount & selectedcount updated",logger.addScreenCapture(ScreenshotSavingPath+"TC_08_view"));
				
			}
			else
			{
				logger.log(LogStatus.FAIL,"criticalcount & selectedcount not updated",logger.addScreenCapture(ScreenshotSavingPath+"TC_08_view"));
			}//else close
		
			}//try close
			catch(Exception e)
			{
				logger.log(LogStatus.FAIL,"criticalcount & selectedcount not updated(I)");
			}
		
			report.endTest(logger);
			report.flush();  
			driver.close();
	  }
}
