package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_285_to_289 extends Reuse {

	@Test
	public void tc_285_to_289() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_285_to_289.html");
		logger =report.startTest("TC_285_to_289");
		
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
		 WebElement first=driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]/input"));
		 WebElement second=driver.findElement(By.xpath("(//*[@class='ng-binding'])[4]/input"));
		 
		 first.click();
		 Thread.sleep(1000);
		 if(first.isSelected())
		 {
			 passscreenshot(driver, "tc_285", "TC-No : 285 - Individual Newspaper is selected");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_285", "TC-No : 285 - Individual Newspaper is not selected");
		 }
		 second.click();
		 Thread.sleep(1000);
		 if(first.isSelected() && second.isSelected())
		 {
			 passscreenshot(driver, "tc_286", "TC-No : 286 - Individually Multiple Newspaper are selected");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_286", "TC-No : 286 - Individually Multiple Newspaper are not selected");
		 }
		 
		 first.click();
		 Thread.sleep(1000);
		 second.click();
		 Thread.sleep(1000);
		 if(!first.isSelected() && !second.isSelected())
		 {
			 passscreenshot(driver, "tc_287", "TC-No : 287 - Selected Newspapers are deselected");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_287", "TC-No : 287 - Selected Newspapers are failed to deselect");
		 }
		 
		 first.click();
		 Thread.sleep(1000);
		 second.click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']")).sendKeys("Asian age");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='clear'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).click();
		 Thread.sleep(1000);
		 
		 WebElement first1=driver.findElement(By.xpath("(//*[@class='ng-binding'])[3]/input"));
		 WebElement second1=driver.findElement(By.xpath("(//*[@class='ng-binding'])[4]/input"));
		 waitexplicit("//*[@class='form-control searchField ng-valid ng-touched ng-dirty ng-empty']");
		 String search1=driver.findElement(By.xpath("//*[@class='form-control searchField ng-valid ng-touched ng-dirty ng-empty']")).getAttribute("value");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(1000);
		 if(!first1.isSelected() && !second1.isSelected() && !search1.equals("Asian age"))
		 {
			 passscreenshot(driver, "tc_288", "TC-No : 288,289 - Clear all is working");
		 }
		 else
		 {
			 failscreenshot(driver, "tc_288", "TC-No : 288,289 - Clear all is not working");
		 }
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}