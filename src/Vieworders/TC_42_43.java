package Vieworders;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_42_43 extends Reuse{
	public ExtentReports report=new ExtentReports(ReportSavingPath+"\\Vieworders\\"+"TC_42_43.html");
	public ExtentTest logger =report.startTest("TC_42_43");
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
		 screenshot(ScreenshotSavingPath+"TC_42_43");
		 Thread.sleep(7000);
		 logger.log(LogStatus.PASS,"Order saved",logger.addScreenCapture(ScreenshotSavingPath+"TC_42_43"));

		 driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).click();
		 String wait1="(//*[text()='Order closed successfully.'])[2]";
		 waitexplicit(wait1);;
		 Thread.sleep(4000);
		 report.endTest(logger);
		 report.flush();   
	}
	@Test(priority=1)
	  public void TC_23_24_view() throws Exception {
		   
			driver.findElement(By.xpath("(//*[text()='View Orders'])[1]")).click();
			Thread.sleep(5000);
		
			driver.findElement(By.xpath("//*[@id='flatNumber']")).sendKeys(OrderNo1);
			driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("(//*[text()='View'])[1]")).click();
			String wait="(//*[@class='circlechart'])[1]";
			waitexplicit(wait);;
			Thread.sleep(12000);
		
			if(!driver.findElement(By.xpath("(//*[@class='checkbox'])[1]")).isSelected())
			{
				driver.findElement(By.xpath("(//*[@class='checkbox'])[1]")).click();Thread.sleep(2000);
				driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
				String wait1="(//*[text()='Order saved successfully.'])[2]";
				waitexplicit(wait1);;Thread.sleep(5000);
			}
			screenshot(ScreenshotSavingPath+"TC_42_43_1");
			 logger.log(LogStatus.PASS,"Search results page",logger.addScreenCapture(ScreenshotSavingPath+"TC_42_43_1"));
			Actions a=new Actions(driver);
			WebElement details= driver.findElement(By.xpath("(//*[text()='Details'])[1]"));
			a.click(details).build().perform();
			 String wait1="(//*[text()='Cancel'])[1]";
			 waitexplicit(wait1);;Thread.sleep(4000);
			 screenshot(ScreenshotSavingPath+"TC_42_43_2");
			 if(driver.findElement(By.xpath("//*[@name='checkbox1']")).isSelected())
			 {
				 logger.log(LogStatus.PASS,"Details page Critical checkbox",logger.addScreenCapture(ScreenshotSavingPath+"TC_42_43_2"));
			 }
			 else
			 {
				 logger.log(LogStatus.FAIL,"Details page Critical checkbox",logger.addScreenCapture(ScreenshotSavingPath+"TC_42_43_2")); 
			 }
			
			report.endTest(logger);
			report.flush(); 
			driver.close(); 
	}
}
