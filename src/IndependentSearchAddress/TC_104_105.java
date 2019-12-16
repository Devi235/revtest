package IndependentSearchAddress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_104_105 extends Reuse {

	@Test
	public void tc_104_105() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_104_105.html");
		logger =report.startTest("TC_104_105");
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user 
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(3000);
		 
		 WebElement ReferenceNumber=driver.findElement(By.xpath("//*[@id='refno']"));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 ReferenceNumber.clear();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 String close1="(//*[text()='Close Order'])";
		 waitexplicit(close1);	Thread.sleep(1000);
		 try {
			 if(driver.findElement(By.xpath("//*[@class='btn btn-success btn-lg pull-right ng-scope save-button margin-0']")).isDisplayed())
			 {
				 failscreenshot(driver, "ISA-TC_105", "TC-No : 105 - When no notices selected than Save button is displaying");
			 }
		} catch (Exception e) {
			passscreenshot(driver, "ISA-TC_105", "TC-No : 105 - When no notices selected than Save button is not displaying");
		 }
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='backBtn'])[1]/i")).click();
		 Thread.sleep(5000);
		 
		 try {
			 if(driver.findElement(By.xpath("//*[text()='View Selected']")).isDisplayed())
			 {
				 failscreenshot(driver, "ISA-TC_104", "TC-No : 104 - When no notices selected also View Selected button is displaying");
			 }
		} catch (Exception e) {
			passscreenshot(driver, "ISA-TC_104", "TC-No : 104 - When no notices selected than View Selected button is not displaying");
		 }
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Close Order'])")).click();
		 Thread.sleep(5000);
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}