package Vieworders;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_11_to_17 extends Reuse{
	public ExtentReports report=new ExtentReports(ReportSavingPath+"\\Vieworders\\"+"TC_11_to_17.html");
	public ExtentTest logger =report.startTest("TC_11_to_17");
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
		random =RandomStringUtils.randomAlphabetic(5);
		//order place
		 driver.findElement(By.xpath("//*[@id='refno']")).sendKeys(random);
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 Thread.sleep(1000);
		 Addressread=driver.findElement(By.xpath("//*[@name='address']")).getAttribute("value");
		 Addressread=Addressread.trim();
		 System.out.println(Addressread);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(8000);
		 //get date
		 
		 DateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy HH");
		 
		 //get current date time with Date()
		 Date date = new Date();
		 
		 // Now format the date
		 date1= dateFormat.format(date);
		 
		 // Print the Date
		 System.out.println(date1);
		 String datetext=driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]")).getText();
		 System.out.println(datetext);
		 screenshot(ScreenshotSavingPath+"TC_11_to_17");
		 String Ordernumber=driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])[1]")).getText();
		 OrderNo1=Ordernumber.replace("Order number : ", "");
		 System.out.println(OrderNo1); 
		 logger.log(LogStatus.PASS,"OrderPlaced",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17"));report.endTest(logger);
		 report.flush();  
	}
	
	@Test(priority=1)
	  public void TC_11_to_17_view() throws Exception {
		   
			driver.findElement(By.xpath("(//*[text()='View Orders'])[1]")).click();
			Thread.sleep(5000);
		
			driver.findElement(By.xpath("//*[@id='flatNumber']")).sendKeys(OrderNo1);
			driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
			Thread.sleep(5000);
			String ordernumbertext=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[1]")).getText();
			String Refnumbertext=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[2]")).getText();
			String orderstatus=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[3]")).getText();
			String Address=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[4]")).getText();
			Address=Address.trim();
			System.out.println(Address);
			String date=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[5]")).getText();
			String criticalcount=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[6]")).getText();
			String selectedcount=driver.findElement(By.xpath("((//*[text()='Order No.'])[1])//following::td[7]")).getText();
			screenshot(ScreenshotSavingPath+"TC_11_to_17_view");
			
			if(ordernumbertext.equals(OrderNo1))
			{
				logger.log(LogStatus.PASS,"OrderNumber Display in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			else
			{
				logger.log(LogStatus.FAIL,"OrderNumber Display in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			if(Refnumbertext.equals(random))
			{
				logger.log(LogStatus.PASS,"RefNumber Display in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			else
			{
				logger.log(LogStatus.FAIL,"RefNumber Display in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			if(orderstatus.equals("InProgress"))
			{
				logger.log(LogStatus.PASS,"status Display in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			else
			{
				logger.log(LogStatus.FAIL,"status Display in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			if(Address.equals(Addressread))
			{
				logger.log(LogStatus.PASS,"Address Display in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			else
			{
				logger.log(LogStatus.FAIL,"Address Display in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			if(criticalcount.equals("0"))
			{
				logger.log(LogStatus.PASS,"criticalcount Display in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			else
			{
				logger.log(LogStatus.FAIL,"criticalcount Display in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			if(selectedcount.equals("0"))
			{
				logger.log(LogStatus.PASS,"selectedcount Display in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			else
			{
				logger.log(LogStatus.FAIL,"selectedcount Display in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			try{
			if(!driver.findElement(By.xpath("(//*[text()='View'])[1]")).isDisplayed())
			{
				logger.log(LogStatus.PASS,"when selected count and critical count are zeros then view icon display",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			else
			{
				logger.log(LogStatus.FAIL,"when selected count and critical count are zeros then view icon display",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}}
			catch(Exception e)
			{
				logger.log(LogStatus.PASS,"when selected count and critical count are zeros then view icon display",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			if(date.contains(date1))
			{
				logger.log(LogStatus.PASS,"Date & Time Display in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			else
			{
				logger.log(LogStatus.FAIL,"Date & Time Display in ViewOrderspage",logger.addScreenCapture(ScreenshotSavingPath+"TC_11_to_17_view"));
			}
			report.endTest(logger);
			report.flush();  
			driver.close();
	  }
	
}
