package IndependentSearchAddress;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_83_to_88 extends Reuse {

	@Test
	public void tc_83_to_88() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_83_to_88.html");
		logger =report.startTest("TC_83_to_88");
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user  
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(3000);
		 
		 WebElement Address=driver.findElement(By.xpath("//*[@id='address']"));
		 
		 if(Address.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_83", "TC-No : 83 - Address field is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_83", "TC-No : 83 - Address field is not displaying");
		 }
		 
		Address.sendKeys("abc123@!&");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Address']")).click();
		Thread.sleep(1000);
		String add=Address.getAttribute("value");
		System.out.println(add);
		if(!add.contains("abc123@!&")){
			passscreenshot(driver, "ISA-TC_84", "TC-No : 84 - Address field is not editable");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_84", "TC-No : 84 - Address field is editable");
		 }
		
		 WebElement FlatNo=driver.findElement(By.id("flatNumber"));
		 WebElement BuildingNo=driver.findElement(By.id("buildingNumber"));
		 WebElement BuildingName=driver.findElement(By.xpath("//*[@id='BuildName']"));
		 WebElement StreetName=driver.findElement(By.xpath("//*[@id='StreetName']"));
		 WebElement Locality=driver.findElement(By.xpath("//*[@id='locality']"));
		 WebElement City=driver.findElement(By.xpath("//*[@id='City']"));
		 WebElement Postalcode=driver.findElement(By.xpath("//*[@id='postelcode']"));
		 WebElement SurveyNo=driver.findElement(By.xpath("//*[@id='SurveyNumber']"));
		 WebElement HissaNo=driver.findElement(By.xpath("//*[@id='hissaNumber']"));
		 WebElement CTSNo=driver.findElement(By.xpath("//*[@id='CSTNumber']"));
		 WebElement GoogleAdd=driver.findElement(By.xpath("//*[@id='googleAddress']"));
		 WebElement Search=driver.findElement(By.xpath("//*[text()='Search']"));
		 WebElement Clear=driver.findElement(By.xpath("//*[text()='Clear']"));
		 
		 FlatNo.sendKeys("10");
		 BuildingNo.sendKeys("11");
		 BuildingName.sendKeys("RJ");
		 StreetName.sendKeys("M L A Colony");
		 Locality.sendKeys("Banjarahills");
		 City.sendKeys("Hyderabad");
		 Postalcode.sendKeys("500003");
		 SurveyNo.sendKeys("12");
		 HissaNo.sendKeys("13");
		 CTSNo.sendKeys("14");
		 GoogleAdd.sendKeys("15");
		 
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[text()='Address']")).click();
		Thread.sleep(1000);
		String add1=Address.getAttribute("value");
		System.out.println(add1);
		if(add1.contains("10") && add1.contains("11") && add1.contains("RJ") && add1.contains("M L A Colony") && add1.contains("Banjarahills") && add1.contains("Hyderabad") && add1.contains("500003") && add1.contains("12") && add1.contains("13") && add1.contains("14") && add1.contains("15")){
			passscreenshot(driver, "ISA-TC_85", "TC-No : 85 - Address field is binded with given fields");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_85", "TC-No : 85 - Address field is not binded with given fields");
		 }
		
		 FlatNo.sendKeys("/;,");
		 BuildingNo.sendKeys("/;,");
		 BuildingName.sendKeys("/;,");
		 StreetName.sendKeys("/;,");
		 Locality.sendKeys("/;,");
		 City.sendKeys("/;,");
		 SurveyNo.sendKeys("/;,");
		 HissaNo.sendKeys("/;,");
		 CTSNo.sendKeys("/;,");
		 GoogleAdd.sendKeys("/;,");
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[text()='Address']")).click();
		Thread.sleep(1000);
		String add2=Address.getAttribute("value");
		System.out.println(add2);
		if(add2.contains("10/;,") && add2.contains("11/;,") && add2.contains("RJ/;,") && add2.contains("M L A Colony/;,") && add2.contains("Banjarahills/;,") && add2.contains("Hyderabad/;,") && add2.contains("500003") && add2.contains("12/;,") && add2.contains("13/;,") && add2.contains("14/;,") && add2.contains("15/;,")){
			passscreenshot(driver, "ISA-TC_86", "TC-No : 86 - Address field is binded with given special characters");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_86", "TC-No : 86 - Address field is not binded with given special characters");
		 }
		
		Thread.sleep(1000);
		FlatNo.clear();
		 BuildingNo.clear();
		 BuildingName.clear();
		 StreetName.clear();
		 Locality.clear();
		 City.clear();
		 Postalcode.clear();
		 SurveyNo.clear();
		 HissaNo.clear();
		 CTSNo.clear();
		 GoogleAdd.clear();
		Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[text()='Address']")).click();
		Thread.sleep(1000);
		String add3=Address.getAttribute("value");
		System.out.println(add3);
		
		if(add3.contains("")){
			passscreenshot(driver, "ISA-TC_87", "TC-No : 87 - When any value is cleared than it is getting cleared from Address field");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_87", "TC-No : 87 - When any value is cleared than it is not getting cleared from Address field");
		 }
		
		Thread.sleep(1000);
		GoogleAdd.sendKeys("h.no, 12-11-1292, Warasiguda, Boudhanagar Colony, Hyderabad, Telangana 500061, India");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Address']")).click();
		Thread.sleep(1000);
		String add4=Address.getAttribute("value");
		System.out.println(add4);
		if(add4.contains("h.no, 12-11-1292, Warasiguda, Boudhanagar Colony, Hyderabad, Telangana 500061, India")){
			passscreenshot(driver, "ISA-TC_88", "TC-No : 88 - Google Address is binding with Address field");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_88", "TC-No : 88 - Google Address is not binding with Address field");
		 }
		
		 
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}