package IndependentSearchAddress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_95_101 extends Reuse {

	@Test
	public void tc_95_101() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_95_101.html");
		logger =report.startTest("TC_95_101");
		
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
		 String close="//*[text()='Close Order']";
			waitexplicit(close);	Thread.sleep(1000);
		 
		 if(driver.findElement(By.xpath("//*[text()='Close Order']")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_95", "TC-No : 95,101 - It is able to place order without giving any Reference Number");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_95", "TC-No : 95,101 - It is not able to place order without giving any Reference Number");
		 }
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Close Order']")).click();
		 Thread.sleep(4000);
		 String logout="(//*[text()='Search Address'])[1]";
		waitexplicit(logout);	Thread.sleep(1000);
		 
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}