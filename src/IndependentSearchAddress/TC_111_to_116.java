package IndependentSearchAddress;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_111_to_116 extends Reuse {

	@Test
	public void tc_111_to_116() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_111_to_116.html");
		logger =report.startTest("TC_111_to_116");
		
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
		 String close="(//*[text()='select'])[1]";
		 waitexplicit(close);	Thread.sleep(1000);
		 
		 driver.findElement(By.xpath("(//*[text()='select'])[1]")).click();
		 Thread.sleep(2000);
		 if(driver.findElement(By.xpath("(//*[text()='Save'])[1]")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_111", "TC-No : 111 - Save button is displaying when any one notice is selected");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_111", "TC-No : 111 - Save button is not displaying when any one notice is selected");
		 }
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Select All'])[1]")).click();
		 Thread.sleep(2000);
		 if(driver.findElement(By.xpath("(//*[text()='Save'])[1]")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_112", "TC-No : 112 - Save button is displaying when all notices are selected");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_112", "TC-No : 112 - Save button is not displaying when all notices are selected");
		 }
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Deselect All'])[1]")).click();
		 Thread.sleep(4000);
		 try {
			 if(driver.findElement(By.xpath("(//*[text()='Save'])[1]")).isDisplayed())
			 {
				 failscreenshot(driver, "ISA-TC_113", "TC-No : 113 - Save button is displaying when all notices are Deselected");
			 }
		} catch (Exception e) {
			Thread.sleep(2000);
			passscreenshot(driver, "ISA-TC_113", "TC-No : 113 - Save button is not displaying when all notices are Deselected");
		 }
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Select All'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Deselect'])[1]")).click();
		 Thread.sleep(2000);
		 if(driver.findElement(By.xpath("(//*[text()='Save'])[1]")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_114", "TC-No : 114 - Save button is displaying when Deselect only one notice from multiple notices");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_114", "TC-No : 114 - Save button is not displaying when Deselect only one notice from multiple notices");
		 }
		 Thread.sleep(2000);
		 try {
			 if(driver.findElement(By.xpath("(//*[text()='Deselect All'])[1]")).isDisplayed())
			 {
				 driver.findElement(By.xpath("(//*[text()='Deselect All'])[1]")).click();
				 Thread.sleep(2000);
			 }
		} catch (Exception e) {
			 driver.findElement(By.xpath("(//*[text()='Select All'])[1]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[text()='Deselect All'])[1]")).click();
			 Thread.sleep(2000);
		 }
		 Thread.sleep(2000);
		 String select="(//*[@class='btn btn-select bgt-color2 btn-success ng-scope'])[1]";
		 waitexplicit(select);	Thread.sleep(1000);
		 
		 List<WebElement> Select = driver.findElements(By.xpath("(//*[@class='btn btn-select bgt-color2 btn-success ng-scope'])"));
		 int Selectn = Select.size();
		 System.out.println(Selectn);
		 driver.findElement(By.xpath("(//*[text()='Select All'])[1]")).click();
		 Thread.sleep(2000);
		 List<WebElement> Deselect = driver.findElements(By.xpath("(//*[@class='btn btn-select btn-danger ng-scope'])"));
		 int Deselectn = Deselect.size();
		 System.out.println(Deselectn);
		 
		 if(Selectn==Deselectn)
		 {
			 passscreenshot(driver, "ISA-TC_115", "TC-No : 115 - When clicked on Select All than all notices are getting selected");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_115", "TC-No : 115 - When clicked on Select All than all notices are not getting selected");
		 }
		 
		 List<WebElement> Deselect1 = driver.findElements(By.xpath("(//*[@class='btn btn-select btn-danger ng-scope'])"));
		 int Deselect1n = Deselect1.size();
		 System.out.println(Deselect1n);
		 driver.findElement(By.xpath("(//*[text()='Deselect All'])[1]")).click();
		 Thread.sleep(2000);
		 List<WebElement> Select1 = driver.findElements(By.xpath("(//*[@class='btn btn-select bgt-color2 btn-success ng-scope'])"));
		 int Select1n = Select1.size();
		 System.out.println(Select1n);
		 
		 
		 if(Deselect1n==Select1n)
		 {
			 passscreenshot(driver, "ISA-TC_116", "TC-No : 116 - When clicked on Deselect All than all selected notices are getting Deselected");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_116", "TC-No : 116 - When clicked on Deselect All than all selected notices are not getting Deselected");
		 }
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Close Order'])")).click();
		 Thread.sleep(5000);
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}