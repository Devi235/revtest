package IndependentSearchAddress;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_125_to_129 extends Reuse {

	@Test
	public void tc_122_to_129() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_125_to_129.html");
		logger =report.startTest("TC_125_to_129");
		
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
		 driver.findElement(By.xpath("(//*[text()='select'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Details'])[1]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Notice Number'])[1]");	Thread.sleep(2000);
		 if(driver.findElement(By.xpath("(//*[text()='Select'])/input")).isSelected())
		 {
			 passscreenshot(driver, "ISA-TC_125", "TC-No : 125,126 - Selected notice in results page than checkbox is selected for selected notice in Details page");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_125", "TC-No : 125,126 - Selected notice in results page than checkbox is not selected for selected notice in Details page");
		 }
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[2]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[2]")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(2000);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Deselect'])")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Details'])[1]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Notice Number'])[1]");	Thread.sleep(5000);
		 if(!driver.findElement(By.xpath("(//*[text()='Select'])/input")).isSelected())
		 {
			 passscreenshot(driver, "ISA-TC_127", "TC-No : 127 - Deselected notice in results page than checkbox is deselected for selected notice in Details page");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_127", "TC-No : 127 - Deselected notice in results page than checkbox is not deselected for selected notice in Details page");
		 }
		 
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[2]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[2]")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(2000);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Critical'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Details'])[1]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Notice Number'])[1]");	Thread.sleep(5000);
		 if(driver.findElement(By.xpath("(//*[text()='Critical'])[3]/input")).isSelected() && driver.findElement(By.xpath("(//*[text()='Select'])[1]/input")).isSelected())
		 {
			 passscreenshot(driver, "ISA-TC_128", "TC-No : 128 - When notice is selected as critical than critical checkbox is selected in Details page");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_128", "TC-No : 128 - When notice is selected as critical than critical checkbox is not selected in Details page");
		 }
		 
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[2]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[2]")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(2000);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Deselect'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Details'])[1]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Notice Number'])[1]");	Thread.sleep(5000);
		 if(!driver.findElement(By.xpath("(//*[text()='Critical'])[3]/input")).isSelected() && !driver.findElement(By.xpath("(//*[text()='Select'])[1]/input")).isSelected())
		 {
			 passscreenshot(driver, "ISA-TC_129", "TC-No : 129 - When notice is deselected for critical than  critical checkbox is not selected in Details page");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_129", "TC-No : 129 - When notice is selected as critical than critical checkbox is selected in Details page");
		 }
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[2]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[2]")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(2000);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Close Order'])[2]")).click();
		Thread.sleep(5000);
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}