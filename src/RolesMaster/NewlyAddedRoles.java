package RolesMaster;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class NewlyAddedRoles extends Reuse {

	@Test
	public void newlyAddedRoles() throws Exception {
		report=new ExtentReports(ReportSavingPath+"NewlyAddedRoles.html");
		logger =report.startTest("NewlyAddedRoles");
		Launch();//driver launch
		Login();//open site
		AdminLogin();//login as admin 
		  
		driver.findElement(By.xpath("//*[text()='Masters ']")).click();
		 Thread.sleep(1000);
		 JavascriptExecutor jsx=(JavascriptExecutor)driver;
		 WebElement roles=driver.findElement(By.xpath("//*[text()='Roles']"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", roles);
		 roles.click();
		
		String search="//*[text()='Add New']";
		 waitexplicit(search);	Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Add New']")).click();
		 
		 String Rolename="//*[@id='roleName']";
		 waitexplicit(Rolename);Thread.sleep(5000);
		 
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='checkbox ng-binding'])[82]")));
		 Thread.sleep(1000);
		 String IndependentSearchAddress = driver.findElement(By.xpath("(//*[@class='checkbox ng-binding'])[82]")).getText();
		 System.out.println(IndependentSearchAddress);
		 String ViewOrders = driver.findElement(By.xpath("(//*[@class='checkbox ng-binding'])[89]")).getText();
		 System.out.println(ViewOrders);
		 String NoticeOrderReport = driver.findElement(By.xpath("(//*[@class='checkbox ng-binding'])[95]")).getText();
		 System.out.println(NoticeOrderReport);
		 
		 if(IndependentSearchAddress.contains("Independent Search Address"))
		 {
			 passscreenshot(driver, "IndependentSearchAddress", "TC-No : 32 - Independent Search Address role is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "IndependentSearchAddress", "TC-No : 32 - Independent Search Address role is not displaying");
		 }
	     
		 if(ViewOrders.contains("View Orders"))
		 {
			 passscreenshot(driver, "ViewOrders", "TC-No : 32 - View Orders role is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ViewOrders", "TC-No : 32 - View Orders role is not displaying");
		 }
		 
		 if(NoticeOrderReport.contains("Notice Order Report"))
		 {
			 passscreenshot(driver, "NoticeOrderReport", "TC-No : 32 - Notice Order Report role is displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NoticeOrderReport", "TC-No : 32 - Notice Order Report role is not displaying");
		 }
		 
		 WebElement IndependentSearchAddressView=driver.findElement(By.xpath("((//*[@class='checkbox ng-binding'])[82]/following::div)[1]"));
		 WebElement ViewOrdersView=driver.findElement(By.xpath("((//*[@class='checkbox ng-binding'])[89]/following::div)[1]"));
		 WebElement NoticeOrderReportView=driver.findElement(By.xpath("((//*[@class='checkbox ng-binding'])[95]/following::div)[1]"));
		 
		 if(IndependentSearchAddressView.isDisplayed())
		 {
			 passscreenshot(driver, "IndependentSearchAddressView", "TC-No : 33 - Independent Search Address role permissions are displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "IndependentSearchAddressView", "TC-No : 33 - Independent Search Address role permissions are not displaying");
		 }
	     
		 if(ViewOrdersView.isDisplayed())
		 {
			 passscreenshot(driver, "ViewOrdersView", "TC-No : 33 - View Orders role permissions are displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "ViewOrdersView", "TC-No : 33 - View Orders role permissions are not displaying");
		 }
		 
		 if(NoticeOrderReportView.isDisplayed())
		 {
			 passscreenshot(driver, "NoticeOrderReportView", "TC-No : 33 - Notice Order Report role permissions are displaying");
		 }
		 else
		 {
			 failscreenshot(driver, "NoticeOrderReportView", "TC-No : 33 - Notice Order Report role permissions are not displaying");
		 }
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}