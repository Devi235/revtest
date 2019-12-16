package IndependentSearchAddress;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_155_to_157 extends Reuse {

	@Test
	public void tc_155_to_157() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_155_to_157.html");
		logger =report.startTest("TC_155_to_157");
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user  
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(5000);
		 waitexplicit("//*[@id='addressName']");	Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@id='addressName']")).sendKeys("Rj");
		driver.findElement(By.xpath("//*[@id='refno']")).sendKeys("09");
		driver.findElement(By.id("flatNumber")).sendKeys("10");
		driver.findElement(By.id("buildingNumber")).sendKeys("11");
		driver.findElement(By.xpath("//*[@id='BuildName']")).sendKeys("RJ");
		driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		driver.findElement(By.xpath("//*[@id='SurveyNumber']")).sendKeys("12");
		driver.findElement(By.xpath("//*[@id='hissaNumber']")).sendKeys("13");
		driver.findElement(By.xpath("//*[@id='CSTNumber']")).sendKeys("14");
		driver.findElement(By.xpath("//*[@id='googleAddress']")).sendKeys("15");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='Clear']")).click();
		Thread.sleep(2000);
		 String Name=driver.findElement(By.xpath("//*[@id='addressName']")).getAttribute("value");
		 String RefNo=driver.findElement(By.xpath("//*[@id='refno']")).getAttribute("value");
		 String FlatNo=driver.findElement(By.id("flatNumber")).getAttribute("value");
		 String BuildingNo=driver.findElement(By.id("buildingNumber")).getAttribute("value");
		 String BuildingName=driver.findElement(By.xpath("//*[@id='BuildName']")).getAttribute("value");
		 String StreetName=driver.findElement(By.xpath("//*[@id='StreetName']")).getAttribute("value");
		 String Locality=driver.findElement(By.xpath("//*[@id='locality']")).getAttribute("value");
		 String City=driver.findElement(By.xpath("//*[@id='City']")).getAttribute("value");
		 String Postalcode=driver.findElement(By.xpath("//*[@id='postelcode']")).getAttribute("value");
		 String SurveyNo=driver.findElement(By.xpath("//*[@id='SurveyNumber']")).getAttribute("value");
		 String HissaNo=driver.findElement(By.xpath("//*[@id='hissaNumber']")).getAttribute("value");
		 String CTSNo=driver.findElement(By.xpath("//*[@id='CSTNumber']")).getAttribute("value");
		 String GoogleAdd=driver.findElement(By.xpath("//*[@id='googleAddress']")).getAttribute("value");
		 Thread.sleep(2000);
		if(Name.equals("") && RefNo.equals("") && FlatNo.equals("") && BuildingNo.equals("") && BuildingName.equals("") && StreetName.equals("") && Locality.equals("") && City.equals("") && Postalcode.equals("") && SurveyNo.equals("") && HissaNo.equals("") && CTSNo.equals("") && GoogleAdd.equals("")){
			passscreenshot(driver, "ISA-TC_155", "TC-No : 155 - Fields are getting cleared");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_155", "TC-No : 155 - Fields are not getting cleared");
		 }
		
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
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[1]");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Search Address'])");	Thread.sleep(8000);
		driver.findElement(By.xpath("//*[text()='Clear']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(5000);
		
		String RefNo1=driver.findElement(By.xpath("//*[@id='refno']")).getAttribute("value");
		String Address=driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid ng-valid-pattern ng-not-empty']")).getAttribute("value");
		String Searchvaration=driver.findElement(By.xpath("//*[@class='searchedItem ng-binding ng-scope']")).getAttribute("value");
		if(!RefNo1.equals("") && !Address.equals("") && !Searchvaration.equals("")){
			passscreenshot(driver, "ISA-TC_156", "TC-No : 156 - Reference number,Address and Search variation Fields are not getting cleared");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_156", "TC-No : 156 - Reference number,Address and Search variation Fields are getting cleared");
		 }
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='View Orders']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Reports ']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(5000);
		WebElement OrderNumber = driver.findElement(By.xpath("(//*[@class='content-Oder ng-binding'])[1]"));
		WebElement CloseOrder = driver.findElement(By.xpath("(//*[text()='Close Order'])[1]"));
		WebElement ViewSelected = driver.findElement(By.xpath("(//*[text()='View Selected'])[1]"));
		Thread.sleep(5000);
		if(OrderNumber.isDisplayed() && CloseOrder.isDisplayed() && ViewSelected.isDisplayed()){
			passscreenshot(driver, "ISA-TC_157", "TC-No : 157 - OrderNumber,CloseOrder and ViewSelected Fields are displayed");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_157", "TC-No : 157 - OrderNumber,CloseOrder and ViewSelected Fields are not displayed");
		 }
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).click();
		Thread.sleep(5000);
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}