package NoticeOrderReport;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_21_to_26_29_to_35 extends Reuse {

	@Test
	public void tc_21_to_26_29_to_35() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_21_to_26_29_to_35.html");
		logger =report.startTest("TC_21_to_26_29_to_35");
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as admin 
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(3000);
		 
		String Rfno=RandomStringUtils.randomNumeric(6);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='refno']")).sendKeys(Rfno);
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 String close1="//*[@class='content-Oder ng-binding']";
		 waitexplicit(close1);	Thread.sleep(1000);
		String OrderNumber=driver.findElement(By.xpath("//*[@class='content-Oder ng-binding']")).getText();
		String OrderNo=OrderNumber.replace("Order number : ", "");
		System.out.println(OrderNo);
		
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
		 WebElement OrderNumber1=driver.findElement(By.id("orderNumber"));
		 WebElement ReferenceNumber=driver.findElement(By.id("referenceNumber"));
		 WebElement Address=driver.findElement(By.xpath("//*[@id='address']"));
		 
		 String fromdate=driver.findElement(By.id("fromrange")).getAttribute("value");
		 String todate=driver.findElement(By.id("torange")).getAttribute("value");
		 OrderNumber1.sendKeys(OrderNo);
		 ReferenceNumber.sendKeys("12345");
		 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		Thread.sleep(2000);
		waitexplicit("//*[text()='No Records are Found.']");
		if(driver.findElement(By.xpath("//*[text()='No Records are Found.']")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_21", "TC-No : 21,33 - No Records found error message displaying when invalid Reference number is given");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_21", "TC-No : 21,33 - No Records found error message not displaying when invalid Reference number is given");
		 }
		
		
		 ReferenceNumber.clear();
		 ReferenceNumber.sendKeys(Rfno);
		 Address.sendKeys("Warangal");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		Thread.sleep(2000);
		waitexplicit("//*[text()='No Records are Found.']");
		if(driver.findElement(By.xpath("//*[text()='No Records are Found.']")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_22", "TC-No : 22,35 - No Records found error message displaying when invalid Addresss is given");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_22", "TC-No : 22,35 - No Records found error message not displaying when invalid Addresss is given");
		 }
		
		 FromDate.clear();
		 FromDate.sendKeys("20 Nov 2030");
		 ToDate.clear();
		 ToDate.sendKeys("20 Nov 2030");
		 Address.clear();
		 Address.sendKeys("M L A Colony, Banjarahills, Hyderabad, 500003");
		 Thread.sleep(2000);
		 waitexplicit("//*[text()='No Records are Found.']");
		if(driver.findElement(By.xpath("//*[text()='No Records are Found.']")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_23", "TC-No : 23 - No Records found error message displaying when invalid Dates are given");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_23", "TC-No : 23 - No Records found error message not displaying when invalid Dates are given");
		 }
		
		FromDate.clear();
		 FromDate.sendKeys(fromdate);
		 ToDate.clear();
		 ToDate.sendKeys(todate);
		WebElement Status=driver.findElement(By.id("category"));
		Select sel=new Select(Status);
		sel.selectByVisibleText("Completed");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[text()='No Records are Found.']");
		if(driver.findElement(By.xpath("//*[text()='No Records are Found.']")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_24", "TC-No : 24 - No Records found error message displaying when invalid Status is selected");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_24", "TC-No : 24 - No Records found error message not displaying when invalid Dates are selected");
		 }
		
		sel.selectByVisibleText("In Progress");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[@class='ng-binding'])[4]");
		 String ON=driver.findElement(By.xpath("(//*[@class='ng-binding'])[4]")).getText();
		 System.out.println(ON);
		if(ON.equals(OrderNo))
		 {
			 passscreenshot(driver, "NOR-TC_25", "TC-No : 25,26,29,30,32,34 - Result for respective order is displaying when all valid fields are given");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_25", "TC-No : 25,26,29,30,32,34 - Result for respective order is not displaying when all valid fields are given");
		 }
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Close Order'])");
		 driver.findElement(By.xpath("(//*[text()='Close Order'])")).click();
		 Thread.sleep(5000);
		
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}