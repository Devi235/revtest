package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_295_to_303 extends Reuse {

	@Test
	public void tc_274_to_303() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_295_to_303.html");
		logger =report.startTest("TC_295_to_303");
		
		Launch();//driver launch
		Login();//open site
		AdminLogin();//login as admin 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Masters ']")).click();
		 Thread.sleep(3000);
		 JavascriptExecutor jsx=(JavascriptExecutor)driver;
		 WebElement User=driver.findElement(By.xpath("//*[text()='User']"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", User);
		 User.click();
		 String search="//*[text()='Add New']";
		 waitexplicit(search);	
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 Thread.sleep(5000);
		 String userName="//*[@id='userName']";
		 waitexplicit(userName);Thread.sleep(5000);
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).click();
		 Thread.sleep(2000);
		 
		 
		 if (driver.findElement(By.xpath("(//*[text()=' Select All'])[1]/input")).isSelected()) {
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[1]")).click();
			 Thread.sleep(2000);
		}
		 else {
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[1]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[1]")).click();
			 Thread.sleep(2000);
		}
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]/input")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Submit'])[1]")).click();
		 Thread.sleep(2000);
		 
		 
		 
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[2]")).click();
		 Thread.sleep(2000);
		 if(driver.findElement(By.xpath("(//*[text()='Submit'])[2]")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_295", "TC-No : 295 - Editions dropdown is clickable");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_295", "TC-No : 295 - Editions dropdown is not clickable");
		 }
		 if(driver.findElement(By.xpath("(//*[@class='spnSelectall'])[2]")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_297", "TC-No : 297 - Select All checkbox in Editions dropdown is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_297", "TC-No : 297 - Select All checkbox in Editions dropdown is displaying");
		 }
		 
		 if (!driver.findElement(By.xpath("(//*[@class='spnSelectall'])[2]/label/input")).isSelected()) {
			 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[2]")).click();
			 Thread.sleep(1000);
		}
		 WebElement SelectAll=driver.findElement(By.xpath("(//*[@class='spnSelectall'])[2]/label/input"));
		 WebElement first=driver.findElement(By.xpath("(//*[@class='ng-binding'])[60]/input"));
		 WebElement second=driver.findElement(By.xpath("(//*[@class='ng-binding'])[61]/input"));
		 
		 if(SelectAll.isSelected() && first.isSelected() && second.isSelected())
		 {
			 passscreenshot(driver, "tc_298", "TC-No : 298 - Select All checkbox and all Editions in Editions dropdown are checked");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_298", "TC-No : 298 - Select All checkbox and all Editions in Editions dropdown are not checked");
		 }
		 
		 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[2]")).click();
		 Thread.sleep(1000);
		 
		 if(!SelectAll.isSelected() && !first.isSelected() && !second.isSelected())
		 {
			 passscreenshot(driver, "tc_299", "TC-No : 299 - Select All checkbox and selected Editions in Editions dropdown are unchecked");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_299", "TC-No : 299 - Select All checkbox and selected Editions in Editions dropdown are failed to uncheck");
		 }
		 
		 if(driver.findElement(By.xpath("(//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched'])")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_300", "TC-No : 300 - Search field in Editions dropdown is displayed");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_300", "TC-No : 300 - Search field in Editions dropdown is not displayed");
		 }
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched'])")).clear();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched'])")).sendKeys("daily post-delhi-english");
		 Thread.sleep(1000);
		 
		 if(driver.findElement(By.xpath("//*[text()=' daily post-delhi-english']")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_301", "TC-No : 301,302,303 - Search results are displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_301", "TC-No : 301,302,303 - Search results are not displaying");
		 }
		 
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}