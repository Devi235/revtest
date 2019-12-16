package IndependentSearchAddress;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_117_to_121 extends Reuse {

	@Test
	public void tc_117_to_121() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_117_to_121.html");
		logger =report.startTest("TC_117_to_121");
		
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
		 
		String OrderNumber1=driver.findElement(By.xpath("//*[@class='content-Oder ng-binding']")).getText();
		String OrderNo1=OrderNumber1.replace("Order number : ", "");
		System.out.println(OrderNo1);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Close Order'])")).click();
		Thread.sleep(5000);
		waitexplicit("//*[text()='Independent Search Address']");	Thread.sleep(1000);
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
		 waitexplicit(close);	Thread.sleep(1000);
		 
		String OrderNumber2=driver.findElement(By.xpath("//*[@class='content-Oder ng-binding']")).getText();
		String OrderNo2=OrderNumber2.replace("Order number : ", "");
		System.out.println(OrderNo2);
		 
		 if(OrderNo2!=OrderNo1)
		 {
			 passscreenshot(driver, "ISA-TC_117", "TC-No : 117 - Order number displaying is unique");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_117", "TC-No : 117 - Order number displaying is same");
		 }
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Select All'])[1]")).click();
		 Thread.sleep(2000);
		 
		 List<WebElement> Deselect1 = driver.findElements(By.xpath("(//*[@class='btn btn-select btn-danger ng-scope'])"));
		 int Deselect1n = Deselect1.size();
		 System.out.println(Deselect1n);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Order saved successfully.'])[2]");	Thread.sleep(1000);
		 if(driver.findElement(By.xpath("(//*[text()='Order saved successfully.'])[2]")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_118", "TC-No : 118 - Order saved successfully message displayed");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_118", "TC-No : 118 - Order saved successfully message not displayed");
		 }
		 Thread.sleep(2000);
		 waitexplicit("(//*[@class='backBtn']/i)[1]");	Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='View Selected'])[1]");	Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='View Selected'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(1000);
		 
		 Thread.sleep(2000);
		 
		 List<WebElement> Deselect2 = driver.findElements(By.xpath("(//*[@class='btn btn-select btn-danger ng-scope'])"));
		 int Deselect2n = Deselect2.size();
		 System.out.println(Deselect2n);
		 Thread.sleep(2000);
		 
		 if(Deselect2n==Deselect1n)
		 {
			 passscreenshot(driver, "ISA-TC_119", "TC-No : 119,120 - Selected Notices and its count displayed");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_119", "TC-No : 119,120 - Selected Notices and its count not displayed");
		 }
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='btn btn-select btn-danger ng-scope'])[1]")).click();
		 Thread.sleep(2000);
		 
		 List<WebElement> Deselect3 = driver.findElements(By.xpath("(//*[@class='btn btn-select btn-danger ng-scope'])"));
		 int Deselect3n = Deselect3.size();
		 System.out.println(Deselect3n);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Order saved successfully.'])[2]");	Thread.sleep(1000);
		
		 Thread.sleep(2000);
		 waitexplicit("(//*[@class='backBtn']/i)[1]");	Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='View Selected'])[1]");	Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='View Selected'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(1000);
		 
		 Thread.sleep(2000);
		 
		 List<WebElement> Deselect4 = driver.findElements(By.xpath("(//*[@class='btn btn-select btn-danger ng-scope'])"));
		 int Deselect4n = Deselect4.size();
		 System.out.println(Deselect4n);
		 Thread.sleep(2000);
		 
		 if(Deselect3n==Deselect4n)
		 {
			 passscreenshot(driver, "ISA-TC_121", "TC-No : 121 - Deselected Notices are getting removed");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_121", "TC-No : 121 - Deselected Notices are not getting removed");
		 }
		 
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Close Order'])[2]")).click();
		Thread.sleep(5000);
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}