package RolesMaster;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class NewlyAddedRoles_Permissionscheckboxes extends Reuse {

	@Test
	public void newlyAddedRolescheckboxes() throws Exception {
		 report=new ExtentReports(ReportSavingPath+"NewlyAddedRoles_Permissionscheckboxes.html");
		  logger =report.startTest("NewlyAddedRoles_Permissionscheckboxes");
		Launch();//driver launch
		Login();//open site
		AdminLogin();//login as admin 
		  
		WebDriverWait wait = new WebDriverWait(driver, 20); 
		Actions a=new Actions(driver);
		
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
		 
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='checkbox ng-binding'])[82]/input")));
		 Thread.sleep(2000);
		 WebElement IndependentSearchAddress=driver.findElement(By.xpath("(//*[@class='checkbox ng-binding'])[82]/input"));
		 WebElement View=driver.findElement(By.xpath("((//*[@class='checkbox ng-binding'])[82]/following::div/label/input)[1]"));
		 WebElement CreateOrder=driver.findElement(By.xpath("((//*[@class='checkbox ng-binding'])[82]/following::div/label/input)[2]"));
		 WebElement CloseOrder=driver.findElement(By.xpath("((//*[@class='checkbox ng-binding'])[82]/following::div/label/input)[3]"));
		 
		 a.click(View).build().perform();
		 Thread.sleep(2000);
		 
		 if(IndependentSearchAddress.isSelected() && View.isSelected())
		 {
			 passscreenshot(driver, "Permissioncheckbox1", "TC-No : 37 - When Permission checkbox is clicked than Role checkbox Selected automatically");
		 }
		 else
		 {
			 failscreenshot(driver, "Permissioncheckbox1", "TC-No : 37 - When Permission checkbox is clicked than Role checkbox not Selected automatically");
		 }
		 
		 a.click(CreateOrder).build().perform();
		 Thread.sleep(2000);
		 a.click(CloseOrder).build().perform();
		 Thread.sleep(2000);
		 if(IndependentSearchAddress.isSelected() && View.isSelected() && CreateOrder.isSelected() && CloseOrder.isSelected())
		 {
			 passscreenshot(driver, "Permissioncheckbox2", "TC-No : 38 - It is able to select multiple permissions individually for a particular role");
		 }
		 else
		 {
			 failscreenshot(driver, "Permissioncheckbox2", "TC-No : 38 - It is not able to select multiple permissions individually for a particular role");
		 }
		 
		 a.click(View).build().perform();
		 Thread.sleep(2000);
		 a.click(CreateOrder).build().perform();
		 Thread.sleep(2000);
		 a.click(CloseOrder).build().perform();
		 Thread.sleep(2000);
		 
		 if(!IndependentSearchAddress.isSelected() && !View.isSelected() && !CreateOrder.isSelected() && !CloseOrder.isSelected())
		 {
			 passscreenshot(driver, "Permissioncheckbox3", "TC-No : 39 - It is able to deselect permissions and when all permissions are deselcted than automatically role got deselected");
		 }
		 else
		 {
			 failscreenshot(driver, "Permissioncheckbox3", "TC-No : 39 - It is not able to deselect permissions");
		 }
		 
		 
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}