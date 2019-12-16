package IndependentSearchAddress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_100_to_103 extends Reuse {

	@Test
	public void tc_100_to_103() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_100_to_103.html");
		logger =report.startTest("TC_100_to_103");
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user 
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("000000");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Test");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("Test");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 String close="(//*[text()='No Records are Found.'])[1]";
			waitexplicit(close);	Thread.sleep(1000);
		 
		 if(driver.findElement(By.xpath("(//*[text()='No Records are Found.'])[1]")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_100", "TC-No : 100 - When searched with address which has no records than No records found error message displayed");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_100", "TC-No : 100 - When searched with address which has no records than No records found error message not displayed");
		 }
		 
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
		 String close1="(//*[text()='Close Order'])[2]";
		 waitexplicit(close1);	Thread.sleep(1000);
		 
		 if(driver.findElement(By.xpath("(//*[text()='Close Order'])[2]")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_102", "TC-No : 102 - Independent search address page is opened");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_102", "TC-No : 102 - Failed to open Independent search address page");
		 }
		 
		 WebElement Ordernumber=driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])[2]"));
		 WebElement CloseOrder=driver.findElement(By.xpath("(//*[text()='Close Order'])[2]"));
		 WebElement Resultsfound=driver.findElement(By.xpath("(//*[@class='pull-right resultsView resultsView-Results ng-binding'])"));
		 WebElement Map=driver.findElement(By.xpath("(//*[@class='col-xs-12 col-sm-5 search-map-right padding-0'])"));
		 WebElement SelectAll=driver.findElement(By.xpath("//*[text()='Select All']"));
		 WebElement Newseapername=driver.findElement(By.xpath("(//*[@class='ng-binding'])[2]"));
		 WebElement Newseaperdate=driver.findElement(By.xpath("//*[@class='search-date ng-binding']"));
		 WebElement Scoring=driver.findElement(By.xpath("//*[@class='circlechart']"));
		 WebElement Matched=driver.findElement(By.xpath("//*[text()='matched:']"));
		 WebElement Category=driver.findElement(By.xpath("//*[text()='category:']"));
		 WebElement Select=driver.findElement(By.xpath("//*[text()='select']"));
		 WebElement Details=driver.findElement(By.xpath("//*[text()='Details']"));
		 WebElement Critical=driver.findElement(By.xpath("(//*[text()='Critical'])[1]"));
		 WebElement BackArrow=driver.findElement(By.xpath("(//*[@class='backBtn'])[1]"));
		 
		 if(Ordernumber.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_103-1", "TC-No : 103 - Order Number is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_103-1", "TC-No : 103 - Order Number is not displaying");
		 }
		 
		 if(CloseOrder.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_103-2", "TC-No : 103 - Close Order button is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_103-2", "TC-No : 103 - Close Order button is not displaying");
		 }
		 
		 if(Resultsfound.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_103-3", "TC-No : 103 - Results found message is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_103-3", "TC-No : 103 - Results found message is not displaying");
		 }
		 
		 if(Map.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_103-4", "TC-No : 103 - Map is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_103-4", "TC-No : 103 - Map is not displaying");
		 }
		 
		 if(SelectAll.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_103-5", "TC-No : 103 - SelectAll button is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_103-5", "TC-No : 103 - SelectAll button is not displaying");
		 }
		 
		 if(Newseapername.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_103-6", "TC-No : 103 - Newseapername is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_103-6", "TC-No : 103 - Newseapername is not displaying");
		 }
		 
		 if(Newseaperdate.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_103-7", "TC-No : 103 - Newseaperdate is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_103-7", "TC-No : 103 - Newseaperdate is not displaying");
		 }
		
		 if(Scoring.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_103-8", "TC-No : 103 - Scoring is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_103-8", "TC-No : 103 - Scoring is not displaying");
		 }
		 
		 if(Matched.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_103-9", "TC-No : 103 - Matched is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_103-9", "TC-No : 103 - Matched is not displaying");
		 }
		 
		 if(Category.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_103-10", "TC-No : 103 - Category is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_103-10", "TC-No : 103 - Category is not displaying");
		 }
		 
		 if(Select.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_103-11", "TC-No : 103 - Select button is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_103-11", "TC-No : 103 - Select button is not displaying");
		 }
		 
		 if(Details.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_103-12", "TC-No : 103 - Details button is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_103-12", "TC-No : 103 - Details button is not displaying");
		 }
		 
		 if(Critical.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_103-13", "TC-No : 103 - Critical checkbox is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_103-13", "TC-No : 103 - Critical checkbox is not displaying");
		 }
		 
		 if(BackArrow.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_103-14", "TC-No : 103 - BackArrow button is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_103-14", "TC-No : 103 - BackArrow button is not displaying");
		 }
		 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Close Order'])[2]")).click();
		 Thread.sleep(5000);
		 
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}