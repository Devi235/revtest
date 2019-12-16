package IndependentSearchAddress;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_89 extends Reuse {

	@Test
	public void tc_89() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_89.html");
		logger =report.startTest("TC_89");
		
		Launch();//driver launch
		Login();//open site
		
		driver.findElement(By.xpath("//*[@name='userName']")).sendKeys("rj");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("password");
		
		driver.findElement(By.xpath("//*[text()='Login']")).click();
		String logout="(//*[text()='Search Address'])[1]";
		waitexplicit(logout);	Thread.sleep(1000);
		 
		 try {
			 if(driver.findElement(By.xpath("//*[@id='refno']")).isDisplayed()){
				 failscreenshot(driver, "ISA-TC_89", "TC-No : 89 - Reference Number field is displayed for normal customer");
				 }
		} catch (Exception e) {
			passscreenshot(driver, "ISA-TC_89", "TC-No : 89 - Reference Number field is not displayed for normal customer");
		 }
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}