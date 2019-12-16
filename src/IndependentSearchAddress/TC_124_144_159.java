package IndependentSearchAddress;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_124_144_159 extends Reuse {

	@Test
	public void tc_124() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_124_144_159.html");
		logger =report.startTest("TC_124_144_159");
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user 
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(3000);
		 
		 driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='postelcode']")).sendKeys("500003");
		 driver.findElement(By.xpath("//*[@id='locality']")).sendKeys("Banjarahills");
		 driver.findElement(By.xpath("//*[@id='StreetName']")).sendKeys("M L A Colony");
		 Thread.sleep(2000);
		 JavascriptExecutor jsx=(JavascriptExecutor)driver;
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-empty'])[1]")));
		 Thread.sleep(1000);
		 Select sel=new Select(driver.findElement(By.xpath("(//*[@class='form-control ng-pristine ng-untouched ng-valid ng-empty'])[1]")));
		 sel.selectByVisibleText("business standard");
		 Thread.sleep(1000);
		 
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 String close="(//*[text()='Close Order'])";
		 waitexplicit(close);	Thread.sleep(1000);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Critical'])[1]")).click();
		 Thread.sleep(2000);
		 
		if(driver.findElement(By.xpath("(//*[text()='Deselect'])[1]")).isDisplayed())
		 {
			 passscreenshot(driver, "ISA-TC_124", "TC-No : 124 - Automatically Notice is getting selected when clicked on critical");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_124", "TC-No : 124 - Automatically Notice is not getting selected when clicked on critical");
		 }
		
		waitexplicit("(//*[@class='backBtn'])[1]/i");	Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[@class='backBtn'])[1]/i")).click();
		 Thread.sleep(2000);
		 waitexplicit("(//*[text()='Search Address'])[1]");	Thread.sleep(1000);
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("//*[@class='form-control ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched']")));
		 Thread.sleep(1000);
		 WebElement Status=driver.findElement(By.xpath("//*[@class='form-control ng-valid ng-not-empty ng-dirty ng-valid-parse ng-touched']"));
			
		 Select select = new Select(Status);
		 WebElement option = select.getFirstSelectedOption();
		 String SelectedText = option.getText();
	System.out.println(SelectedText);
	
	if(SelectedText.contains("business standard"))
	 {
		 passscreenshot(driver, "tc_144", "TC-No : 144 - Selected Newspaper remained as selected after placing order also");
	 }
	 else
	 {
		 failscreenshot(driver, "tc_144", "TC-No : 144 - Selected Newspaper not remained as selected after placing order");
	 }
		 
		 
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Close Order'])[1]")).click();
		 waitexplicit("(//*[text()='Order closed successfully.'])[1]");	
		 if(driver.findElement(By.xpath("(//*[text()='Order closed successfully.'])[1]")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_159", "TC-No : 159 - Order closed successfully message is displayed");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_159", "TC-No : 159 - Order closed successfully message is not displayed");
		 }
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}