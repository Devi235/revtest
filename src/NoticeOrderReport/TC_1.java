package NoticeOrderReport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_1 extends Reuse {

	@Test
	public void tc_1() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_1.html");
		logger =report.startTest("TC_1");
		
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
		 WebElement OrderNumber=driver.findElement(By.id("orderNumber"));
		 WebElement ReferenceNumber=driver.findElement(By.id("referenceNumber"));
		 WebElement Address=driver.findElement(By.xpath("//*[@id='address']"));
		 WebElement Status=driver.findElement(By.id("category"));
		 WebElement Search=driver.findElement(By.xpath("//*[text()='Search']"));
		 WebElement Clear=driver.findElement(By.xpath("//*[text()='Clear']"));
		 
		 
		 
		 if(FromDate.isDisplayed())
		 {
			 passscreenshot(driver, "NOR-FromDate", "TC-No : 1 - From Date is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-FromDate", "TC-No : 1 - From Date is not displaying");
		 }
	     
		 if(ToDate.isDisplayed())
		 {
			 passscreenshot(driver, "NOR-ToDate", "TC-No : 1 - To Date field is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-ToDate", "TC-No : 1 - To Date field is not displaying");
		 }
		 
		 if(OrderNumber.isDisplayed())
		 {
			 passscreenshot(driver, "NOR-OrderNumber", "TC-No : 1 - OrderNumber field is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-OrderNumber", "TC-No : 1 - OrderNumber field is not displaying");
		 }
		 
		 if(ReferenceNumber.isDisplayed())
		 {
			 passscreenshot(driver, "NOR-ReferenceNumber", "TC-No : 1 - ReferenceNumber field is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-ReferenceNumber", "TC-No : 1 - ReferenceNumber field is not displaying");
		 }
		 
		 if(Address.isDisplayed())
		 {
			 passscreenshot(driver, "NOR-Address", "TC-No : 1 - Address field is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-Address", "TC-No : 1 - Address field is not displaying");
		 }
		 
		 if(Status.isDisplayed())
		 {
			 passscreenshot(driver, "NOR-Status", "TC-No : 1 - Status field is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-Status", "TC-No : 1 - Status field is not displaying");
		 }
		 
		 if(Search.isDisplayed())
		 {
			 passscreenshot(driver, "NOR-Search", "TC-No : 1 - Search field is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-Search", "TC-No : 1 - Search field is not displaying");
		 }
		 
		 if(Clear.isDisplayed())
		 {
			 passscreenshot(driver, "NOR-Clear", "TC-No : 1 - Clear field is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-Clear", "TC-No : 1 - Clear field is not displaying");
		 }
		 
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}