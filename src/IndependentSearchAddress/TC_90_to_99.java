package IndependentSearchAddress;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_90_to_99 extends Reuse {

	@Test
	public void tc_90_to_99() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_90_to_99.html");
		logger =report.startTest("TC_90_to_99");
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user 
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(3000);
		 
		 WebElement ReferenceNumber=driver.findElement(By.xpath("//*[@id='refno']"));
		 
		 if(ReferenceNumber.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_90", "TC-No : 90 - Reference Number field is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_90", "TC-No : 90 - Reference Number field is not displaying");
		 }
		 
		 Thread.sleep(2000);
		 ReferenceNumber.clear();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Ref no']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 ReferenceNumber.clear();
		 Thread.sleep(1000);
		 String Rfno=RandomStringUtils.randomNumeric(6);
		 Thread.sleep(1000);
		 ReferenceNumber.sendKeys(Rfno);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 String close="//*[text()='Close Order']";
			waitexplicit(close);	Thread.sleep(1000);
		 
		 if(driver.findElement(By.xpath("//*[text()='Close Order']")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_91", "TC-No : 91,96 - Reference Number field is accepting Numbers and Order is getting placed by giving Numerics");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_91", "TC-No : 91,96 - Reference Number field is not accepting Numbers");
		 }
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Close Order']")).click();
		 Thread.sleep(4000);
		 String logout="(//*[text()='Search Address'])[1]";
		waitexplicit(logout);	Thread.sleep(1000);
		 
		 
		driver.findElement(By.xpath("//*[@id='refno']")).clear();
		driver.findElement(By.xpath("//*[@id='refno']")).sendKeys("!@%$&");
		 driver.findElement(By.xpath("//*[text()='Ref no']")).click();
		 Thread.sleep(1000);
		 if(driver.findElement(By.xpath("//*[@class='normal-error ng-scope']")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_92", "TC-No : 92 - Reference Number field is not accepting Special characters");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_92", "TC-No : 92 - Reference Number field is accepting Special characters");
		 }
		 
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 driver.findElement(By.xpath("//*[@id='refno']")).clear();
		 Thread.sleep(1000);
		 String Rfno1=RandomStringUtils.randomAlphabetic(6);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='refno']")).sendKeys(Rfno1);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
			waitexplicit(close);	Thread.sleep(1000);
		 if(driver.findElement(By.xpath("//*[text()='Close Order']")).isDisplayed())
		 {
			 failscreenshot(driver, "ISA-TC_92", "TC-No : 92 - Reference Number field is accepting Alphabets");
		 }
		 else
		 {
			 passscreenshot(driver, "ISA-TC_92", "TC-No : 92 - Reference Number field is not accepting Alphabets");
		 }
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Close Order']")).click();
		 Thread.sleep(4000);
		waitexplicit(logout);	Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id='refno']")).clear();
		driver.findElement(By.xpath("//*[@id='refno']")).sendKeys("12345678901234567890");
		 driver.findElement(By.xpath("//*[text()='Ref no']")).click();
		 Thread.sleep(1000);
		 String ReferenceNumber4=driver.findElement(By.xpath("//*[@id='refno']")).getAttribute("value");
		 System.out.println(ReferenceNumber4);
		 if(ReferenceNumber4.equals("1234567890123456") && !ReferenceNumber4.equals("12345678901234567"))
		 {
			 passscreenshot(driver, "ISA-TC_93", "TC-No : 93,94 - Reference Number field is accepting only 16 characters");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_93", "TC-No : 93,94 - Reference Number field is accepting more than 16 characters");
		 }
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id='refno']")).clear();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Ref no']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='refno']")).sendKeys(Rfno);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 String Refnoexists="(//*[text()='Reference number already exist.'])[1]";
		waitexplicit(Refnoexists);	Thread.sleep(1000);
		if(driver.findElement(By.xpath("(//*[text()='Reference number already exist.'])[1]")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_97", "TC-No : 97 - Error displayed for existing Reference Number");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_97", "TC-No : 97 - Error not displayed for existing Reference Number");
		 }
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id='refno']")).clear();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Ref no']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 Thread.sleep(1000);
		 String Rfno2=RandomStringUtils.randomNumeric(16);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='refno']")).sendKeys(Rfno2);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 waitexplicit(close);	Thread.sleep(1000);
		 if(driver.findElement(By.xpath("//*[text()='Close Order']")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_99", "TC-No : 99 - Order is getting placed with 16 digit max reference number");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_99", "TC-No : 99 - Order is getting placed with 16 digit max reference number");
		 }
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Close Order']")).click();
		 Thread.sleep(4000);
		waitexplicit(logout);	Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//*[text()='Logout'])")).click();
		Thread.sleep(4000);
		
		String launch="//*[@name='userName']";
		waitexplicit(launch);	Thread.sleep(500);
		
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("testingcustomer");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		String logout1="(//*[text()='Search Address'])[1]";
		waitexplicit(logout1);	Thread.sleep(1000);
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id='refno']")).clear();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Ref no']")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 Thread.sleep(1000);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='refno']")).sendKeys(Rfno2);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 waitexplicit(close);	Thread.sleep(1000);
		 if(driver.findElement(By.xpath("//*[text()='Close Order']")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_98", "TC-No : 98 - Order is getting placed with same reference number for another user");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_98", "TC-No : 98 - Order is not getting placed with same reference number for another user");
		 }
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Close Order']")).click();
		 Thread.sleep(4000);
		waitexplicit(logout);	Thread.sleep(1000);
		
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}