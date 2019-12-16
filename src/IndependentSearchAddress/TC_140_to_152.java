package IndependentSearchAddress;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_140_to_152 extends Reuse {

	@Test
	public void tc_140_to_152() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_140_to_152.html");
		logger =report.startTest("TC_140_to_152");
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user 
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(3000);
		 
		 Thread.sleep(2000);
		 String Rfno=RandomStringUtils.randomNumeric(6);
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='refno']")).sendKeys(Rfno);
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
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(8000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(8000);
		 List<WebElement> Deselect1 = driver.findElements(By.xpath("(//*[@class='btn btn-select btn-danger ng-scope'])"));
		 int Deselect1n = Deselect1.size();
		 System.out.println("Deselect1n "+Deselect1n);
		 Thread.sleep(2000);
		 String OrderNo = driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])")).getText();
		 String OrderNum=OrderNo.replace("Order number : ", "");
		 System.out.println(OrderNum);
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Details'])[1]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty'])[1]");	Thread.sleep(8000);
		 String NoticeNo1 = driver.findElement(By.xpath("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty'])[1]")).getAttribute("value");
		 System.out.println("NoticeNo1 "+NoticeNo1);
		 Thread.sleep(2000);
		 waitexplicit("(//*[@class='backBtn']/i)[2]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[2]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Details'])[2]");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[2]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty'])[1]");	Thread.sleep(8000);
		 String NoticeNo2 = driver.findElement(By.xpath("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty'])[1]")).getAttribute("value");
		 System.out.println("NoticeNo2 "+NoticeNo2);
		 Thread.sleep(2000);
		 waitexplicit("(//*[@class='backBtn']/i)[2]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[2]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[@class='backBtn']/i)[1]");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Search Address'])");	Thread.sleep(5000);
		 
		WebElement OrderNumber = driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])[1]"));
		WebElement CloseOrder = driver.findElement(By.xpath("(//*[text()='Close Order'])[1]"));
		WebElement ViewSelected = driver.findElement(By.xpath("(//*[text()='View Selected'])[1]"));
		 
		if(OrderNumber.isDisplayed() && CloseOrder.isDisplayed() && ViewSelected.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_140", "TC-No : 140 - OrderNumber,CloseOrder,ViewSelected fields displayed in Search Address page");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_140", "TC-No : 140 - OrderNumber,CloseOrder,ViewSelected fields not displayed in Search Address page");
		 }
		
		String OrderNumber1=OrderNumber.getText();
		String OrderNum1=OrderNumber1.replace("Order number : ", "");
		System.out.println(OrderNum1);
		if(OrderNum1.equals(OrderNum))
		 {
			 passscreenshot(driver, "ISA-TC_141", "TC-No : 141 - OrderNumber displaying correctly in Search Address page");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_141", "TC-No : 141 - OrderNumber displaying correctly in Search Address page");
		 }
		
		ViewSelected.click();
		Thread.sleep(5000);
		waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");Thread.sleep(5000);
		
		Thread.sleep(2000);
		 waitexplicit("(//*[text()='Details'])[1]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty'])[1]");	Thread.sleep(8000);
		 String NoticeNo3 = driver.findElement(By.xpath("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty'])[1]")).getAttribute("value");
		 System.out.println("NoticeNo3 "+NoticeNo3);
		 Thread.sleep(2000);
		 waitexplicit("(//*[@class='backBtn']/i)[2]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[2]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Details'])[2]");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[2]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty'])[1]");	Thread.sleep(8000);
		 String NoticeNo4 = driver.findElement(By.xpath("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-not-empty'])[1]")).getAttribute("value");
		 System.out.println("NoticeNo4 "+NoticeNo4);
		 Thread.sleep(2000);
		 waitexplicit("(//*[@class='backBtn']/i)[2]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[2]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[@class='backBtn']/i)[1]");	Thread.sleep(5000);
		 
		 if(NoticeNo1.equals(NoticeNo4) && NoticeNo2.equals(NoticeNo3))
		 {
			 passscreenshot(driver, "ISA-TC_142", "TC-No : 142 - Selected Notices are displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_142", "TC-No : 142 - Selected Notices are not displaying correctly");
		 }
		 
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='form-control temp-address-search ng-valid ng-valid-pattern ng-valid-maxlength ng-not-empty ng-dirty ng-valid-parse ng-touched'])[1]");	Thread.sleep(5000);
		 String Refno = driver.findElement(By.xpath("(//*[@class='form-control temp-address-search ng-valid ng-valid-pattern ng-valid-maxlength ng-not-empty ng-dirty ng-valid-parse ng-touched'])[1]")).getAttribute("value");
		 System.out.println(Refno);
		 if(Refno.equals(Rfno))
		 {
			 passscreenshot(driver, "ISA-TC_143", "TC-No : 143 - Selected Notices are displaying correctly");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_143", "TC-No : 143 - Selected Notices are not displaying correctly");
		 }
		 
		 if(driver.findElement(By.xpath("//*[text()='Search Variation']")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_145", "TC-No : 145 - Search Variation is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_145", "TC-No : 145 - Search Variation is displaying");
		 }
		 Thread.sleep(5000);
		 String SearchvaariationAddress1 = driver.findElement(By.xpath("(//*[@class='searchedItem ng-binding ng-scope'])[1]")).getText();
		 System.out.println("SearchvaariationAddress1 "+SearchvaariationAddress1);
		 if(SearchvaariationAddress1.contains("m l a colony") && SearchvaariationAddress1.contains("banjarahills") && SearchvaariationAddress1.contains("hyderabad") && SearchvaariationAddress1.contains("500003"))
		 {
			 passscreenshot(driver, "ISA-TC_146", "TC-No : 146 - Address binding correctly in Search Variation field");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_146", "TC-No : 146 - Address not binding correctly in Search Variation field");
		 }
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@id='City']")).clear();
		 driver.findElement(By.xpath("//*[@id='postelcode']")).clear();
		 driver.findElement(By.xpath("//*[@id='locality']")).clear();
		 driver.findElement(By.xpath("//*[@id='StreetName']")).clear();
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Ahmedabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("645645");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("test street");
		 driver.findElement(By.xpath("//*[@id='buildingNumber']")).sendKeys("6789");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Select All'])[1]");	Thread.sleep(1000);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Select All'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[1]");	Thread.sleep(8000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Search Address'])");	Thread.sleep(5000);
		 
		 String SearchvaariationAddress2 = driver.findElement(By.xpath("(//*[@class='searchedItem ng-binding ng-scope'])[2]")).getText();
		 System.out.println("SearchvaariationAddress2 "+SearchvaariationAddress2);
		 if(SearchvaariationAddress2.contains("ahmedabad") && SearchvaariationAddress2.contains("645645") && SearchvaariationAddress2.contains("test street") && SearchvaariationAddress2.contains("6789"))
		 {
			 passscreenshot(driver, "ISA-TC_147", "TC-No : 147,148 - After placing order respective search Address is displaying correctly in Search Variation field");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_147", "TC-No : 147,148 - After placing order respective search Address is not displaying correctly in Search Variation field");
		 }
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='View Selected'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(5000);
		 
		 List<WebElement> Deselect2 = driver.findElements(By.xpath("(//*[@class='btn btn-select btn-danger ng-scope'])"));
		 int Deselect2n = Deselect2.size();
		 System.out.println("Deselect2n "+Deselect2n);
		 
		 if(Deselect2n!=Deselect1n)
		 {
			 passscreenshot(driver, "ISA-TC_150", "TC-No : 150 - New Notices are added to existing Notices");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_150", "TC-No : 150 - New Notices are not added to existing Notices");
		 }
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Deselect'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='View Selected'])[2]")).click();
		 Thread.sleep(5000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(5000);
		 
		 
		 List<WebElement> Deselect3 = driver.findElements(By.xpath("(//*[@class='btn btn-select btn-danger ng-scope'])"));
		 int Deselect3n = Deselect3.size();
		 System.out.println("Deselect3n "+Deselect3n);
		 
		 if(Deselect3n==Deselect1n)
		 {
			 passscreenshot(driver, "ISA-TC_151", "TC-No : 151 - Deselected Notice is removed from existing Notices");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_151", "TC-No : 151 - Deselected Notice is not removed from existing Notices");
		 }
		 
		driver.findElement(By.xpath("(//*[text()='View Selected'])[2]")).click();
		Thread.sleep(5000);
		waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");Thread.sleep(5000);
		 
		driver.findElement(By.xpath("(//*[text()='Critical'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		Thread.sleep(5000);
		waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='View Selected'])[2]")).click();
		Thread.sleep(5000);
		waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");Thread.sleep(5000);
		if(driver.findElement(By.xpath("(//*[text()='Critical'])[1]/input")).isSelected())
		 {
			 passscreenshot(driver, "ISA-TC_152", "TC-No : 152 - Selected Critical Notice is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_152", "TC-No : 152 - Selected Critical Notice is not displaying");
		 }
		 
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Close Order'])[2]")).click();
		Thread.sleep(5000);
		 waitexplicit("(//*[text()='Search Address'])");	Thread.sleep(5000);
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}