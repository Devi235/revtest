package User;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_260_261 extends Reuse {

	@Test
	public void tc_260_261() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"TC_260_261.html");
		logger =report.startTest("TC_260_261");
		
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
		 waitexplicit(search);	Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Add New']")).click();
		 
		 String userName="//*[@id='userName']";
		 waitexplicit(userName);Thread.sleep(5000);
		 
		 Select s=new Select(driver.findElement(By.id("userRole")));
		 s.selectByVisibleText("IndependentCustomer");Thread.sleep(2000);
		 
		 ScrollDown(400);
		 
		 Thread.sleep(2000);
		 
		 WebElement DisplayNamecheckbox=driver.findElement(By.xpath("//*[text()='Display name field in search']"));
		 WebElement TAT=driver.findElement(By.xpath("//*[@id='TAT']"));
		 WebElement Newspaper=driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]"));
		 WebElement Edition=driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[2]"));
		 WebElement Category=driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[3]"));
		 
		 if(DisplayNamecheckbox.isDisplayed())
		 {
			 passscreenshot(driver, "DisplayNamecheckbox1", "TC-No : 260 - Display Name checkbox is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "DisplayNamecheckbox1", "TC-No : 260 - Display Name checkbox is not displaying");
		 }
	     
		 if(TAT.isDisplayed())
		 {
			 passscreenshot(driver, "TAT1", "TC-No : 260 - TAT field is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "TAT1", "TC-No : 260 - TAT field is not displaying");
		 }
		 
		 if(Newspaper.isDisplayed())
		 {
			 passscreenshot(driver, "Newspaper1", "TC-No : 260 - Newspaper dropdown is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "Newspaper1", "TC-No : 260 - Newspaper dropdown is not displaying");
		 }
		 
		 if(Edition.isDisplayed())
		 {
			 passscreenshot(driver, "Edition1", "TC-No : 260 - Edition dropdown is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "Edition1", "TC-No : 260 - Edition dropdown is not displaying");
		 }
		 
		 if(Category.isDisplayed())
		 {
			 passscreenshot(driver, "Category1", "TC-No : 260 - Category dropdown is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "Category1", "TC-No : 260 - Category dropdown is not displaying");
		 }
		 
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.id("userRole")));
		 s.selectByIndex(0);
		 Thread.sleep(2000);
		 
		 try {
			 if(DisplayNamecheckbox.isDisplayed())
			 {
				 failscreenshot(driver, "DisplayNamecheckbox1", "TC-No : 261 - Display Name checkbox is displaying");
			 }
		} catch (Exception e) {
			passscreenshot(driver, "DisplayNamecheckbox1", "TC-No : 261 - Display Name checkbox is not displaying");
		}
		 
		 try {
			 if(TAT.isDisplayed())
			 {
				 failscreenshot(driver, "TAT1", "TC-No : 261 - TAT field is displaying");
			 }
		} catch (Exception e) {
			passscreenshot(driver, "TAT1", "TC-No : 261 - TAT field is not displaying");
		}
		 
		 try {
			 if(Newspaper.isDisplayed())
			 {
				 failscreenshot(driver, "Newspaper1", "TC-No : 261 - Newspaper dropdown is displaying");
			 }
		} catch (Exception e) {
			passscreenshot(driver, "Newspaper1", "TC-No : 261 - Newspaper dropdown is not displaying");
		}
		 
		 try {
			 if(Edition.isDisplayed())
			 {
				 failscreenshot(driver, "Edition1", "TC-No : 261 - Edition dropdown is displaying");
			 }
		} catch (Exception e) {
			 passscreenshot(driver, "Edition1", "TC-No : 261 - Edition dropdown is not displaying");
		}
		 try {
			 if(Category.isDisplayed())
			 {
				 failscreenshot(driver, "Category1", "TC-No : 261 - Category dropdown is displaying");
			 }
		} catch (Exception e) {
			passscreenshot(driver, "Category1", "TC-No : 261 - Category dropdown is not displaying");
		}
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}