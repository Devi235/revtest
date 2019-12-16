package Vieworders;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_03_to_04 extends Reuse{
public ExtentReports report=new ExtentReports(ReportSavingPath+"\\Vieworders\\"+"TC_03_to_04.html");
public ExtentTest logger =report.startTest("TC_03_to_04");	
public String OrderNo1;
public String Referencenumber;
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
		Referencenumber =RandomStringUtils.randomAlphabetic(5);
		//order place
		 driver.findElement(By.xpath("//*[@id='refno']")).sendKeys(Referencenumber);
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(8000);
		 String Ordernumber=driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])[1]")).getText();
		 OrderNo1=Ordernumber.replace("Order number : ", "");
		 System.out.println(OrderNo1); 
	}
  
	@Test(priority=1)
	public void ViewOrdersSearch() throws Exception {
		driver.findElement(By.xpath("(//*[text()='View Orders'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='flatNumber']")).sendKeys(OrderNo1);
		driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
		Thread.sleep(5000);
		String ordernumbertext=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[1]")).getText();
		screenshot(ScreenshotSavingPath+"VO_TC_03");
		if(ordernumbertext.equals(OrderNo1))
		{
			logger.log(LogStatus.PASS,"user search by giving order no",logger.addScreenCapture(ScreenshotSavingPath+"VO_TC_03"));
		}
		else
		{
			logger.log(LogStatus.FAIL,"user search by giving order no",logger.addScreenCapture(ScreenshotSavingPath+"VO_TC_03"));
		}
		report.endTest(logger);
		report.flush();
	}
	
	@Test(priority=2)
	public void ReferenceNumberSearch() throws Exception {
		driver.findElement(By.xpath("(//*[text()='View Orders'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='flatNumber']")).sendKeys(Referencenumber);
		driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
		Thread.sleep(5000);
		String ordernumbertext=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[1]")).getText();
		screenshot(ScreenshotSavingPath+"VO_TC_04");
		if(ordernumbertext.equals(OrderNo1))
		{
			logger.log(LogStatus.PASS,"user search by giving ReferenceNumber",logger.addScreenCapture(ScreenshotSavingPath+"VO_TC_04"));
		}
		else
		{
			logger.log(LogStatus.FAIL,"user search by giving ReferenceNumber",logger.addScreenCapture(ScreenshotSavingPath+"VO_TC_04"));
		}
		report.endTest(logger);
		report.flush();
		driver.close();
	}
}
