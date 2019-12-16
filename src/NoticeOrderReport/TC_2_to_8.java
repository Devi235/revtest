package NoticeOrderReport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_2_to_8 extends Reuse {

	@Test
	public void tc_2_to_8() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_2_to_8.html");
		logger =report.startTest("TC_2_to_8");
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as admin 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='Reports '])[1]")).click();
		 Thread.sleep(3000);
		 JavascriptExecutor jsx=(JavascriptExecutor)driver;
		 WebElement User=driver.findElement(By.xpath("(//*[text()='Notice Order Report'])[1]"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", User);
		 User.click();
		 String search="(//*[text()='Notice Order Report'])[2]";
		 waitexplicit(search);	
		 Thread.sleep(2000);
		 
		 WebElement FromDate=driver.findElement(By.id("fromrange"));
		 WebElement ToDate=driver.findElement(By.id("torange"));
		 WebElement Search=driver.findElement(By.xpath("//*[text()='Search']"));
		 WebElement FromDateCalendaricon=driver.findElement(By.xpath("(//*[@class='input-group-addon calen'])[1]"));
		 WebElement ToDateCalendaricon=driver.findElement(By.xpath("(//*[@class='input-group-addon calen'])[2]"));
		 
		 FromDate.clear();
		 Search.click();
		 Thread.sleep(1000);
		 if(driver.findElement(By.xpath("//*[@class='normal-error ng-scope']")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_2", "TC-No : 2 - From Date field is Mandatory");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_2", "TC-No : 2 - From Date field is not Mandatory");
		 }
		
		 if(FromDateCalendaricon.isDisplayed() && ToDateCalendaricon.isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_4", "TC-No : 4 - Calendar icons are displaying for From Date and To Date");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_4", "TC-No : 4 - Calendar icons are not displaying for From Date and To Date");
		 }
		 
		 FromDateCalendaricon.click();
		 Thread.sleep(1000);
		 if(driver.findElement(By.xpath("(//*[@class='active day'])")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_5", "TC-No : 5 - Calendar is displaying for From Date");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_5", "TC-No : 5 - Calendar is not displaying for From Date");
		 }
		 driver.findElement(By.xpath("(//*[text()='From Date*'])")).click();
		 Thread.sleep(1000);
		 ToDateCalendaricon.click();
		 Thread.sleep(1000);
		 if(driver.findElement(By.xpath("(//*[@class='active day'])")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_6", "TC-No : 6 - Calendar is displaying for To Date");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_6", "TC-No : 6 - Calendar is not displaying for To Date");
		 }
		 
		 FromDate.clear();
		 FromDate.sendKeys("20 Nov 2030");
		 ToDate.clear();
		 ToDate.sendKeys("20 Nov 2030");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='From Date*'])")).click();
		 Thread.sleep(1000);
		 if(driver.findElement(By.xpath("(//*[@class='normal-error ng-scope'])[1]")).isDisplayed() && driver.findElement(By.xpath("(//*[@class='normal-error ng-scope'])[2]")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_7", "TC-No : 7 - Error messages displayed when Future dates selected");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_7", "TC-No : 7 - Error not messages displayed when Future dates selected");
		 }
		 
		 FromDate.clear();
		 FromDate.sendKeys("20 Nov 2030");
		 ToDate.clear();
		 ToDate.sendKeys("20 Nov 2029");
		 Thread.sleep(1000);
		 Search.click();
		 Thread.sleep(2000);
		 if(driver.findElement(By.xpath("//*[@class='col-xs-12 form-invalid ng-scope']")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_8", "TC-No : 8 - Error message displayed when From date is given more than To date");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_8", "TC-No : 8 - Error message not displayed when From date is given more than To date");
		 }
		 
		 
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}