package IndependentSearchAddress;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_130_to_139 extends Reuse {

	@Test
	public void tc_122_to_139() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_130_to_139.html");
		logger =report.startTest("TC_130_to_139");
		
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
		 driver.findElement(By.xpath("(//*[text()='Select All'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Details'])[1]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Notice Number'])[1]");	Thread.sleep(2000);
		 Thread.sleep(2000);
		 
		WebElement Critical = driver.findElement(By.xpath("(//*[text()='Critical'])[3]"));
		WebElement Select = driver.findElement(By.xpath("(//*[text()='Select'])"));
		WebElement Save = driver.findElement(By.xpath("(//*[text()='Save'])[2]"));
		WebElement Cancel = driver.findElement(By.xpath("(//*[text()='Cancel'])"));
		 
		if(Critical.isDisplayed() && Select.isDisplayed() && Save.isDisplayed() && Cancel.isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_130", "TC-No : 130 - Critical,Select,Save,Cancel fields displayed in Details page");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_130", "TC-No : 130 - Critical,Select,Save,Cancel fields not displayed in Details page");
		 }
		 
		Thread.sleep(2000);
		Select.click();
		Thread.sleep(2000);
		Save.click();
		Thread.sleep(2000);
		waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(2000);
		Thread.sleep(5000);
		
		if(driver.findElement(By.xpath("(//*[text()='select'])[1]")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_131", "TC-No : 131 - When Notice deselected in Details page than in results page it is displaying as deselected");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_131", "TC-No : 131 - When Notice deselected in Details page than in results page it is not displaying as deselected");
		 }
		driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Select'])");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Select'])")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[2]")).click();
		 Thread.sleep(2000);
		waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	
		Thread.sleep(5000);
			try {
				if(driver.findElement(By.xpath("(//*[text()='select'])[1]")).isDisplayed())
				{
					failscreenshot(driver, "ISA-TC_132", "TC-No : 132 - When Notice selected in Details page than in results page it is not displaying as selected");
				}
			} catch (Exception e) {
			passscreenshot(driver, "ISA-TC_132", "TC-No : 132 - When Notice selected in Details page than in results page it is displaying as selected");
		}
		
		Thread.sleep(5000);
		 waitexplicit("(//*[text()='Critical'])[1]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Critical'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Details'])[1]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Critical'])[3]");	Thread.sleep(8000);
		 driver.findElement(By.xpath("(//*[text()='Critical'])[3]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[2]")).click();
		 Thread.sleep(5000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(5000);
		 
		 if(!driver.findElement(By.xpath("(//*[text()='Critical'])[1]/input")).isSelected())
			{
				passscreenshot(driver, "ISA-TC_133", "TC-No : 133 - When deselected critical checkbox in Details page than in results page it is not displaying as critical");
			}
			else
			{
				failscreenshot(driver, "ISA-TC_133", "TC-No : 133 - When deselected critical checkbox in Details page than also in results page it is displaying as critical");
			}
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Details'])[1]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Notice Number'])[1]");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Critical'])[3]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[2]")).click();
		 Thread.sleep(5000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(8000);
		 
		 if(driver.findElement(By.xpath("(//*[text()='Critical'])[1]/input")).isSelected())
			{
				passscreenshot(driver, "ISA-TC_134", "TC-No : 134 - When selected critical checkbox in Details page than in results page it is displaying as critical");
			}
			else
			{
				failscreenshot(driver, "ISA-TC_134", "TC-No : 134 - When deselected critical checkbox in Details page than also in results page it is displaying not as critical");
			}
		
		 if(driver.findElement(By.xpath("(//*[text()='Order saved successfully.'])[2]")).isDisplayed())
			{
				passscreenshot(driver, "ISA-TC_135", "TC-No : 135,136 - Order saved successfully message is displaying for Notice details page");
			}
			else
			{
				failscreenshot(driver, "ISA-TC_135", "TC-No : 135,136 - Order saved successfully message is not displaying for Notice details page");
			}
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Details'])[1]");	Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Details'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Cancel'])");	Thread.sleep(8000);
		 driver.findElement(By.xpath("(//*[text()='Cancel'])")).click();
		 Thread.sleep(5000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(5000);
		 try {
			 if(driver.findElement(By.xpath("(//*[text()='Order saved successfully.'])[2]")).isDisplayed())
				{
					failscreenshot(driver, "ISA-TC_137", "TC-No : 137 - Cancel btton is not working in Notice details page");
				}
		} catch (Exception e) {
				passscreenshot(driver, "ISA-TC_137", "TC-No : 137 - Cancel btton is working in Notice details page");
			}
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[1]");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Search Address'])");	Thread.sleep(5000);
		 if(driver.findElement(By.xpath("(//*[text()='Search Address'])")).isDisplayed())
			{
				passscreenshot(driver, "ISA-TC_138", "TC-No : 138 - Back arrow button is working");
			}
			else
			{
				failscreenshot(driver, "ISA-TC_138", "TC-No : 138 - Back arrow button is not working");
			}
		 Thread.sleep(5000);
		 
		 String city=driver.findElement(By.xpath("//*[@id='City']")).getAttribute("value");
		 String Postalcode=driver.findElement(By.xpath("//*[@id='postelcode']")).getAttribute("value");
		 String Locality=driver.findElement(By.xpath("//*[@id='locality']")).getAttribute("value");
		 String Streetname=driver.findElement(By.xpath("//*[@id='StreetName']")).getAttribute("value");
		 
		 if(city.equals("Hyderabad") && Postalcode.equals("500003") && Locality.equals("Banjarahills") && Streetname.equals("M L A Colony"))
			{
				passscreenshot(driver, "ISA-TC_139", "TC-No : 139 - Entered fields are remained in the fields");
			}
			else
			{
				failscreenshot(driver, "ISA-TC_139", "TC-No : 139 - Entered fields are not remained in the fields");
			}
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).click();
		Thread.sleep(5000);
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}