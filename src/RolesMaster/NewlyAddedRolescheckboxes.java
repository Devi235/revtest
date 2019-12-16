package RolesMaster;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class NewlyAddedRolescheckboxes extends Reuse {

	@Test
	public void newlyAddedRolescheckboxes() throws Exception {
		 report=new ExtentReports(ReportSavingPath+"NewlyAddedRolescheckboxes.html");
		  logger =report.startTest("NewlyAddedRolescheckboxes");
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
		 a.click(driver.findElement(By.xpath("(//*[@class='checkbox ng-binding'])[82]/input"))).build().perform();
		 Thread.sleep(2000);
		 WebElement View=driver.findElement(By.xpath("((//*[@class='checkbox ng-binding'])[82]/following::div/label/input)[1]"));
		 WebElement CreateOrder=driver.findElement(By.xpath("((//*[@class='checkbox ng-binding'])[82]/following::div/label/input)[2]"));
		 WebElement CloseOrder=driver.findElement(By.xpath("((//*[@class='checkbox ng-binding'])[82]/following::div/label/input)[3]"));
		 WebElement ViewSelected=driver.findElement(By.xpath("((//*[@class='checkbox ng-binding'])[82]/following::div/label/input)[4]"));
		 WebElement SaveSelected=driver.findElement(By.xpath("((//*[@class='checkbox ng-binding'])[82]/following::div/label/input)[5]"));
		 WebElement Extract=driver.findElement(By.xpath("((//*[@class='checkbox ng-binding'])[82]/following::div/label/input)[6]"));
		 
		 if(View.isSelected())
		 {
			 passscreenshot(driver, "Viewcheckbox", "TC-No : 35 - View checkbox Selected automatically");
		 }
		 else
		 {
			 failscreenshot(driver, "Viewcheckbox", "TC-No : 35 - View checkbox Selected automatically");
		 }
		 if(CreateOrder.isSelected())
		 {
			 passscreenshot(driver, "CreateOrdercheckbox", "TC-No : 35 - CreateOrder checkbox Selected automatically");
		 }
		 else
		 {
			 failscreenshot(driver, "CreateOrdercheckbox", "TC-No : 35 - CreateOrder checkbox Selected automatically");
		 }
		 if(CloseOrder.isSelected())
		 {
			 passscreenshot(driver, "CloseOrdercheckbox", "TC-No : 35 - CloseOrder checkbox Selected automatically");
		 }
		 else
		 {
			 failscreenshot(driver, "CloseOrdercheckbox", "TC-No : 35 - CloseOrder checkbox Selected automatically");
		 }
		 if(ViewSelected.isSelected())
		 {
			 passscreenshot(driver, "ViewSelectedcheckbox", "TC-No : 35 - View Selected checkbox Selected automatically");
		 }
		 else
		 {
			 failscreenshot(driver, "ViewSelectedcheckbox", "TC-No : 35 - View Selected checkbox Selected automatically");
		 }
		 if(SaveSelected.isSelected())
		 {
			 passscreenshot(driver, "SaveSelectedcheckbox", "TC-No : 35 - Save Selected checkbox Selected automatically");
		 }
		 else
		 {
			 failscreenshot(driver, "SaveSelectedcheckbox", "TC-No : 35 - Save Selected checkbox Selected automatically");
		 }
		 if(Extract.isSelected())
		 {
			 passscreenshot(driver, "Extractcheckbox", "TC-No : 35 - Extract checkbox Selected automatically");
		 }
		 else
		 {
			 failscreenshot(driver, "Extractcheckbox", "TC-No : 35 - Extract checkbox Selected automatically");
		 }
		 
		 a.click(driver.findElement(By.xpath("(//*[@class='checkbox ng-binding'])[82]/input"))).build().perform();
		 Thread.sleep(2000);
		
		 if(!View.isSelected())
		 {
			 passscreenshot(driver, "Viewcheckbox1", "TC-No : 36 - View checkbox deselected automatically");
		 }
		 else
		 {
			 failscreenshot(driver, "Viewcheckbox1", "TC-No : 36 - View checkbox deselected automatically");
		 }
		 if(!CreateOrder.isSelected())
		 {
			 passscreenshot(driver, "CreateOrdercheckbox1", "TC-No : 36 - CreateOrder checkbox deselected automatically");
		 }
		 else
		 {
			 failscreenshot(driver, "CreateOrdercheckbox1", "TC-No : 36 - CreateOrder checkbox deselected automatically");
		 }
		 if(!CloseOrder.isSelected())
		 {
			 passscreenshot(driver, "CloseOrdercheckbox1", "TC-No : 36 - CloseOrder checkbox deselected automatically");
		 }
		 else
		 {
			 failscreenshot(driver, "CloseOrdercheckbox1", "TC-No : 36 - CloseOrder checkbox deselected automatically");
		 }
		 if(!ViewSelected.isSelected())
		 {
			 passscreenshot(driver, "ViewSelectedcheckbox1", "TC-No : 36 - View Selected checkbox deselected automatically");
		 }
		 else
		 {
			 failscreenshot(driver, "ViewSelectedcheckbox1", "TC-No : 36 - View Selected checkbox deselected automatically");
		 }
		 if(!SaveSelected.isSelected())
		 {
			 passscreenshot(driver, "SaveSelectedcheckbox1", "TC-No : 36 - Save Selected checkbox deselected automatically");
		 }
		 else
		 {
			 failscreenshot(driver, "SaveSelectedcheckbox1", "TC-No : 36 - Save Selected checkbox deselected automatically");
		 }
		 if(!Extract.isSelected())
		 {
			 passscreenshot(driver, "Extractcheckbox1", "TC-No : 36 - Extract checkbox deselected automatically");
		 }
		 else
		 {
			 failscreenshot(driver, "Extractcheckbox1", "TC-No : 36 - Extract checkbox deselected automatically");
		 }
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}