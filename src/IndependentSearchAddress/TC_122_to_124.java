package IndependentSearchAddress;


import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_122_to_124 extends Reuse {

	@Test
	public void tc_122_to_124() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_122_to_124.html");
		logger =report.startTest("TC_122_to_124");
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user 
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(3000);
		 
		 Thread.sleep(2000);
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
		 driver.findElement(By.xpath("(//*[text()='Critical'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[1]");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='View Selected'])[1]");	Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='View Selected'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Notice Number'])[1]");	Thread.sleep(2000);
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[2]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[2]")).click();
		 Thread.sleep(5000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(2000);
		 if(driver.findElement(By.xpath("(//*[text()='Critical'])[1]/input")).isSelected())
		 {
			 passscreenshot(driver, "ISA-TC_122", "TC-No : 122 - Critical checkbox is selected for selected notice");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_122", "TC-No : 122 - Critical checkbox is not selected for selected notice");
		 }
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Critical'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[1]");	Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='View Selected'])[1]");	Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='View Selected'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Notice Number'])[1]");	Thread.sleep(2000);
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[2]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[2]")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(2000);
		 if(!driver.findElement(By.xpath("(//*[text()='Critical'])[1]/input")).isSelected())
		 {
			 passscreenshot(driver, "ISA-TC_123", "TC-No : 123 - Critical checkbox is deselected for selected notice");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_123", "TC-No : 123 - Critical checkbox is not deselected for selected notice");
		 }
		 
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Close Order'])[2]")).click();
		Thread.sleep(5000);
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}