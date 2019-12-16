package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_306_to_310 extends Reuse {

	@Test
	public void tc_306_to_310() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_306_to_310.html");
		logger =report.startTest("TC_306_to_310");
		
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
		 WebElement first=driver.findElement(By.xpath("(//*[@class='ng-binding'])[60]/input"));
		 WebElement second=driver.findElement(By.xpath("(//*[@class='ng-binding'])[61]/input"));
		 
		 first.click();
		 Thread.sleep(1000);
		 if(first.isSelected())
		 {
			 passscreenshot(driver, "tc_306", "TC-No : 306 - Individual Edition is selected");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_306", "TC-No : 306 - Individual Edition is not selected");
		 }
		 second.click();
		 Thread.sleep(1000);
		 if(first.isSelected() && second.isSelected())
		 {
			 passscreenshot(driver, "tc_307", "TC-No : 307 - Individually Multiple Editions are selected");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_307", "TC-No : 307 - Individually Multiple Editions are not selected");
		 }
		 
		 first.click();
		 Thread.sleep(1000);
		 second.click();
		 Thread.sleep(1000);
		 if(!first.isSelected() && !second.isSelected())
		 {
			 passscreenshot(driver, "tc_308", "TC-No : 308 - Selected Editions are deselected");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_308", "TC-No : 308 - Selected Editions are failed to deselect");
		 }
		 
		 first.click();
		 Thread.sleep(1000);
		 second.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched'])[2]")).sendKeys("amar");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='clear'])[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[2]")).click();
		 Thread.sleep(2000);
		 
		 WebElement first1=driver.findElement(By.xpath("(//*[@class='ng-binding'])[60]/input"));
		 WebElement second1=driver.findElement(By.xpath("(//*[@class='ng-binding'])[61]/input"));
		 waitexplicit("//*[@class='form-control searchField ng-valid ng-touched ng-dirty ng-empty']");
		 String search1=driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-touched ng-dirty ng-empty']")).getAttribute("value");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[2]")).click();
		 Thread.sleep(1000);
		 if(!first1.isSelected() && !second1.isSelected() && !search1.equals("amar"))
		 {
			 passscreenshot(driver, "tc_309", "TC-No : 309,310 - Clear all is working");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_309", "TC-No : 309,310 - Clear all is not working");
		 }
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}