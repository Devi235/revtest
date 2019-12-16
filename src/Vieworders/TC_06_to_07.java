package Vieworders;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC_06_to_07 extends Reuse{
	public ExtentReports report=new ExtentReports(ReportSavingPath+"\\Vieworders\\"+"TC_06_to_07.html");
	public ExtentTest logger =report.startTest("TC_06_to_07");
	
	@Test(priority=0)
	  public void TC_06_view() throws Exception {
		    Launch();//driver launch
		    Login();//open site
		    UserLogin();//login as Independent user 
		   
			driver.findElement(By.xpath("(//*[text()='View Orders'])[1]")).click();
			Thread.sleep(5000);
			try{
			for(int i=0;i<10;i++){
			String random =RandomStringUtils.randomAlphabetic(5);
			driver.findElement(By.xpath("//*[@id='flatNumber']")).sendKeys(random);
			driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
			Thread.sleep(5000);
			WebElement norecords=driver.findElement(By.xpath("//*[text()='No Records are Found.']"));
			screenshot(ScreenshotSavingPath+"norecords");
			
			if(norecords.isDisplayed())
			{
				logger.log(LogStatus.PASS,"when user searched with word which does not exists",logger.addScreenCapture(ScreenshotSavingPath+"norecords"));
				break;	
			}
			else
			{
				
			}//else close
			}//for close
			}//try close
			catch(Exception e)
			{
				logger.log(LogStatus.FAIL,"when user searched with word which does not exists");
			}
			report.endTest(logger);
			report.flush();  
	  }
	
	@Test(priority=1)
	  public void TC_07_view() throws Exception {
		   
			driver.findElement(By.xpath("(//*[text()='View Orders'])[1]")).click();
			Thread.sleep(5000);
			try{
			
			String random =RandomStringUtils.randomAlphabetic(5);
			driver.findElement(By.xpath("//*[@id='flatNumber']")).sendKeys(random+"!");
			driver.findElement(By.xpath("(//*[text()='Search'])[1]")).click();
			Thread.sleep(5000);
			WebElement norecords=driver.findElement(By.xpath("//*[text()='Invalid searchword']"));
			screenshot(ScreenshotSavingPath+"TC_07_view");
			
			if(norecords.isDisplayed())
			{
				logger.log(LogStatus.PASS,"when user searched with word which is invalid",logger.addScreenCapture(ScreenshotSavingPath+"TC_07_view"));
				
			}
			else
			{
				
			}//else close
		
			}//try close
			catch(Exception e)
			{
				logger.log(LogStatus.FAIL,"when user searched with word which is invalid");
			}
			report.endTest(logger);
			report.flush();  
			driver.close();
	  }
}
