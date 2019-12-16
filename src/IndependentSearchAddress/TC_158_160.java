package IndependentSearchAddress;


import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_158_160 extends Reuse {

	@Test
	public void tc_158_160() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_158_160.html");
		logger =report.startTest("TC_158_160");
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user 
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(3000);
		 
		 Thread.sleep(2000);
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
		 String close="(//*[text()='Close Order'])";
		 waitexplicit(close);	Thread.sleep(1000);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Select All'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[1]");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		 
		 Thread.sleep(5000);
		 waitexplicit("//*[@id='City']");	Thread.sleep(5000);
		 driver.findElement(By.xpath("//*[@id='City']")).clear();
		 driver.findElement(By.xpath("//*[@id='postelcode']")).clear();
		 driver.findElement(By.xpath("//*[@id='locality']")).clear();
		 driver.findElement(By.xpath("//*[@id='StreetName']")).clear();
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Ahmedabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("645645");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("test street");
		 driver.findElement(By.xpath("//*[@id='buildingNumber']")).sendKeys("6789");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 waitexplicit(close);	Thread.sleep(1000);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Select All'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[1]");	Thread.sleep(8000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		 Thread.sleep(5000);
		 if(driver.findElement(By.xpath("(//*[@class='searchedItem ng-binding ng-scope'])[2]")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_158", "TC-No : 158 - Before closing order user is not able to place another order");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_158", "TC-No : 158 - Before closing order also user is able to place another order");
		 }
		 
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).click();
		Thread.sleep(5000);
		
		try {
			if(driver.findElement(By.xpath("(//*[@class='searchedItem ng-binding ng-scope'])[2]")).isDisplayed())
			 {
				failscreenshot(driver, "ISA-TC_160", "TC-No : 160 - After closing order also search variation field is displaying");
			 }
		} catch (Exception e) {
			
			 passscreenshot(driver, "ISA-TC_160", "TC-No : 160 - After closing order search variation field is not displaying");
		 }
		
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}