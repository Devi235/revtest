package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_316_to_324 extends Reuse {

	@Test
	public void tc_316_to_324() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_316_to_324.html");
		logger =report.startTest("TC_316_to_324");
		
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
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
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
		 if (driver.findElement(By.xpath("(//*[text()=' Select All'])[2]/input")).isSelected()) {
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[2]")).click();
			 Thread.sleep(2000);
		}
		 else {
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[2]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[2]")).click();
			 Thread.sleep(2000);
		}
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='ng-binding'])[60]/input")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Submit'])[2]")).click();
		 Thread.sleep(2000);
		
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[3]")).click();
		 Thread.sleep(2000);
		 if (driver.findElement(By.xpath("(//*[text()=' Select All'])[3]/input")).isSelected()) {
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[3]")).click();
			 Thread.sleep(2000);
		}
		 else {
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[3]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[3]")).click();
			 Thread.sleep(2000);
		}
		 if(driver.findElement(By.xpath("(//*[text()='Submit'])[3]")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_316", "TC-No : 316 - Category dropdown is clickable");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_316", "TC-No : 316 - Category dropdown is not clickable");
		 }
		 if(driver.findElement(By.xpath("(//*[@class='spnSelectall'])[3]")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_318", "TC-No : 318 - Select All checkbox in Category dropdown is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_318", "TC-No : 318 - Select All checkbox in Category dropdown is not displaying");
		 }
		 Thread.sleep(2000);
		 if (!driver.findElement(By.xpath("(//*[text()=' Select All'])[3]/input")).isSelected()) {
			 driver.findElement(By.xpath("(//*[text()=' Select All'])[3]")).click();
			 Thread.sleep(2000);
		}
		 driver.findElement(By.xpath("(//*[text()='Submit'])[3]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[3]")).click();
		 Thread.sleep(2000);
		 
		 WebElement SelectAll=driver.findElement(By.xpath("(//*[@class='spnSelectall'])[3]/label/input"));
		 WebElement first=driver.findElement(By.xpath("(//*[@class='ng-binding'])[69]/input"));
		 WebElement second=driver.findElement(By.xpath("(//*[@class='ng-binding'])[70]/input"));
		 
		 if(SelectAll.isSelected() && first.isSelected() && second.isSelected())
		 {
			 passscreenshot(driver, "tc_319", "TC-No : 319 - Select All checkbox and all Categories in Category dropdown are checked");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_319", "TC-No : 319 - Select All checkbox and all Categories in Category dropdown are not checked");
		 }
		 
		 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[3]")).click();
		 Thread.sleep(2000);
		 
		 if(!SelectAll.isSelected() && !first.isSelected() && !second.isSelected())
		 {
			 passscreenshot(driver, "tc_320", "TC-No : 320 - Select All checkbox and selected Categories in Category dropdown are unchecked");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_320", "TC-No : 320 - Select All checkbox and selected Categories in Category dropdown are failed to uncheck");
		 }
		 
		 if(driver.findElement(By.xpath("(//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched'])")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_321", "TC-No : 321 - Search field in Category dropdown is displayed");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_321", "TC-No : 321 - Search field in Category dropdown is not displayed");
		 }
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched'])[3]")).clear();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched'])[3]")).sendKeys("corrigendum");
		 Thread.sleep(1000);
		 
		 if(driver.findElement(By.xpath("//*[text()=' corrigendum']")).isDisplayed())
		 {
			 passscreenshot(driver, "tc_322", "TC-No : 322,323,324 - Search results are displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_322", "TC-No : 322,323,324 - Search results are not displaying");
		 }
		 
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}