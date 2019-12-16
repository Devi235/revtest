package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_274_to_282 extends Reuse {

	@Test
	public void tc_274_to_282() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_274_to_282.html");
		logger =report.startTest("TC_274_to_282");
		
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
		 Thread.sleep(4000);
		 String userName="//*[@id='userName']";
		 waitexplicit(userName);Thread.sleep(4000);
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).click();
		 Thread.sleep(1000);
		 if(driver.findElement(By.xpath("(//*[text()='Submit'])[1]")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_274_1", "TC-No : 274 - Newspaper dropdown is clickable");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_274_1", "TC-No : 274 - Newspaper dropdown is not clickable");
		 }
		 if(driver.findElement(By.xpath("(//*[@class='spnSelectall'])[1]")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_276", "TC-No : 276 - Select All checkbox in Newspaper dropdown is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_276", "TC-No : 276 - Select All checkbox in Newspaper dropdown is not displaying");
		 }
		 
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
		 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[1]")).click();
		 Thread.sleep(1000);
		 WebElement SelectAll=driver.findElement(By.xpath("(//*[@class='spnSelectall'])[1]/label/input"));
		 WebElement first=driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]/input"));
		 WebElement second=driver.findElement(By.xpath("(//*[@class='ng-binding'])[4]/input"));
		 
		 if(SelectAll.isSelected() && first.isSelected() && second.isSelected())
		 {
			 passscreenshot(driver, "tc_277", "TC-No : 277 - Select All checkbox and all Newspapers in Newspaper dropdown are checked");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_277", "TC-No : 277 - Select All checkbox and all Newspapers in Newspaper dropdown are not checked");
		 }
		 
		 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[1]")).click();
		 Thread.sleep(1000);
		 
		 if(!SelectAll.isSelected() && !first.isSelected() && !second.isSelected())
		 {
			 passscreenshot(driver, "tc_278", "TC-No : 278 - Select All checkbox and selected Newspapers in Newspaper dropdown are unchecked");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_278", "TC-No : 278 - Select All checkbox and selected Newspapers in Newspaper dropdown are failed to uncheck");
		 }
		 
		 if(driver.findElement(By.xpath("(//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched'])[1]")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_279", "TC-No : 279 - Search field in Newspaper dropdown is displayed");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_279", "TC-No : 279 - Search field in Newspaper dropdown is not displayed");
		 }
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']")).clear();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']")).sendKeys("Asian age");
		 Thread.sleep(1000);
		 
		 if(driver.findElement(By.xpath("//*[text()=' asian age']")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_280", "TC-No : 280,281,282 - Search results are displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_280", "TC-No : 280,281,282 - Search results are not displaying");
		 }
		 
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}