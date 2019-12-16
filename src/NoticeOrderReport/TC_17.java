package NoticeOrderReport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_17 extends Reuse {

	@Test
	public void tc_17() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_17.html");
		logger =report.startTest("TC_17");
		
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
		 
		 WebElement Status=driver.findElement(By.id("category"));
		 Status.click();
		 Thread.sleep(1000);
		 if(driver.findElement(By.xpath("//*[text()='New']")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_17", "TC-No : 17 - Status results are displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_17", "TC-No : 17 - Status results are not displaying");
		 }
		 report.endTest(logger);
		 report.flush();
		 //driver.close();
		}
}