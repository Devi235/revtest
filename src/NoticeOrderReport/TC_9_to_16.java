package NoticeOrderReport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_9_to_16 extends Reuse {

	@Test
	public void tc_9_to_16() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_9_to_16.html");
		logger =report.startTest("TC_9_to_16");
		
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
		 
		 WebElement OrderNumber=driver.findElement(By.id("orderNumber"));
		 WebElement ReferenceNumber=driver.findElement(By.id("referenceNumber"));
		 WebElement Address=driver.findElement(By.xpath("//*[@id='address']"));
		 
		 Thread.sleep(1000);
		 String OrderNumber1=OrderNumber.getAttribute("placeholder");
		 System.out.println(OrderNumber1);
		 if(OrderNumber1.equals("Order No"))
		 {
			 passscreenshot(driver, "NOR-TC_9", "TC-No : 9 - Water mark is displaying for Order No");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_9", "TC-No : 9 - Water mark is not displaying for Order No");
		 }
		 Thread.sleep(1000);
		 OrderNumber.sendKeys("abcde");
		 driver.findElement(By.xpath("//*[text()='Order No']")).click();
		 Thread.sleep(1000);
		 String OrderNumber2=OrderNumber.getAttribute("value");
		 System.out.println(OrderNumber2);
		 if(OrderNumber2.equals("abcde"))
		 {
			 passscreenshot(driver, "NOR-TC_10", "TC-No : 10 - Order Number field is accepting alphabets");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_10", "TC-No : 10 - Order Number field is not accepting alphabets");
		 }
		 Thread.sleep(1000);
		 OrderNumber.clear();
		 OrderNumber.sendKeys("12345");
		 driver.findElement(By.xpath("//*[text()='Order No']")).click();
		 Thread.sleep(1000);
		 String OrderNumber3=OrderNumber.getAttribute("value");
		 System.out.println(OrderNumber3);
		 if(OrderNumber3.equals("12345"))
		 {
			 passscreenshot(driver, "NOR-TC_11", "TC-No : 11 - Order Number field is accepting Numerics");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_11", "TC-No : 11 - Order Number field is accepting Numerics");
		 }
		 
		 Thread.sleep(1000);
		 String ReferenceNumber1=ReferenceNumber.getAttribute("placeholder");
		 System.out.println(ReferenceNumber);
		 if(ReferenceNumber1.equals("Reference No"))
		 {
			 passscreenshot(driver, "NOR-TC_12", "TC-No : 12 - Water mark is displaying for Reference No");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_12", "TC-No : 12 - Water mark is not displaying for Reference No");
		 }
		
		 Thread.sleep(1000);
		 ReferenceNumber.clear();
		 ReferenceNumber.sendKeys("12345");
		 driver.findElement(By.xpath("//*[text()='Order No']")).click();
		 Thread.sleep(1000);
		 String ReferenceNumber2=ReferenceNumber.getAttribute("value");
		 System.out.println(ReferenceNumber2);
		 if(ReferenceNumber2.equals("12345"))
		 {
			 passscreenshot(driver, "NOR-TC_13", "TC-No : 13 - Reference Number field is accepting Numerics");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_13", "TC-No : 13 - Reference Number field is accepting Numerics");
		 }
		 
		 Thread.sleep(1000);
		 String Address1=Address.getAttribute("placeholder");
		 System.out.println(Address1);
		 if(Address1.equals("Address"))
		 {
			 passscreenshot(driver, "NOR-TC_14", "TC-No : 14 - Water mark is displaying for Address");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_14", "TC-No : 14 - Water mark is not displaying for Address");
		 }
		 Thread.sleep(1000);
		 Address.sendKeys("abcde");
		 driver.findElement(By.xpath("//*[text()='Order No']")).click();
		 Thread.sleep(1000);
		 String Address2=Address.getAttribute("value");
		 System.out.println(Address2);
		 if(Address2.equals("abcde"))
		 {
			 passscreenshot(driver, "NOR-TC_15", "TC-No : 15 - Address field is accepting alphabets");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_15", "TC-No : 15 - Address field is not accepting alphabets");
		 }
		 Thread.sleep(1000);
		 Address.clear();
		 Address.sendKeys("12345");
		 driver.findElement(By.xpath("//*[text()='Order No']")).click();
		 Thread.sleep(1000);
		 String Address3=Address.getAttribute("value");
		 System.out.println(Address3);
		 if(Address3.equals("12345"))
		 {
			 passscreenshot(driver, "NOR-TC_16", "TC-No : 16 - Address field is accepting Numerics");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_16", "TC-No : 16 - Address field is accepting Numerics");
		 }
		 
		 
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}