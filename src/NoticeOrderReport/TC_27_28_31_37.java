package NoticeOrderReport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_27_28_31_37 extends Reuse {

	@Test
	public void tc_27_28_31_37() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_27_28_31_37.html");
		logger =report.startTest("TC_27_28_31_37");
		
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
		 String fromdate=driver.findElement(By.id("fromrange")).getAttribute("value");
		 FromDate.clear();
		 ToDate.clear();
		 Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		Thread.sleep(2000);
		waitexplicit("//*[text()='Date is required.']");
		if(driver.findElement(By.xpath("//*[text()='Date is required.']")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_27", "TC-No : 27 - Error message displaying when From date is not given");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_27", "TC-No : 27 - Error message not displaying when From date is not given");
		 }
		
		 FromDate.sendKeys(fromdate);
		String getday=fromdate.substring(0,2);
		System.out.println(getday);
		int day1=Integer.parseInt(getday);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		Thread.sleep(2000);
		waitexplicit("(//*[@class='ng-binding'])[3]");
		String date=driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]")).getText();
		String dateday=date.substring(0,2);
		System.out.println(dateday);
		int day2=Integer.parseInt(dateday);
		if(day2>=day1)
		 {
			 passscreenshot(driver, "NOR-TC_28", "TC-No : 28 - Results are displaying from selected date only");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_28", "TC-No : 28 - Results are not displaying from selected date");
		 }
		
		 OrderNumber.sendKeys("1234567890");
		 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		Thread.sleep(2000);
		waitexplicit("//*[text()='No Records are Found.']");
		if(driver.findElement(By.xpath("//*[text()='No Records are Found.']")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_31", "TC-No : 31 - No Records found error message displaying when invalid Order number is given");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_31", "TC-No : 31 - No Records found error message not displaying when invalid Order number is given");
		 }
		
		 
		 WebElement ReferenceNumber0=driver.findElement(By.id("referenceNumber"));
		 WebElement Address0=driver.findElement(By.xpath("//*[@id='address']"));
		 WebElement Clear=driver.findElement(By.xpath("//*[text()='Clear']"));
		
		 driver.findElement(By.id("torange")).sendKeys(fromdate);
		 ReferenceNumber0.sendKeys("12345");
		 Address0.sendKeys("warangal");
		 Thread.sleep(1000);
		 Clear.click();
		 Thread.sleep(1000);
		 String FromDate1=driver.findElement(By.id("fromrange")).getAttribute("value");
		 String ToDate1=driver.findElement(By.id("torange")).getAttribute("value");
		 String OrderNumber1=driver.findElement(By.id("orderNumber")).getAttribute("value");
		 String ReferenceNumber1=driver.findElement(By.id("referenceNumber")).getAttribute("value");
		 String Address1=driver.findElement(By.xpath("//*[@id='address']")).getAttribute("value");
		 Thread.sleep(1000);
		 
		 if(FromDate1.equals("") && ToDate1.equals("") && OrderNumber1.equals("") && ReferenceNumber1.equals("") && Address1.equals(""))
		 {
			 passscreenshot(driver, "NOR-TC_37", "TC-No : 37 - All field are getting cleared when clicked on clear");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_37", "TC-No : 37 - All field are not getting cleared when clicked on clear");
		 }
		
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}