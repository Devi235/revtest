package NoticeOrderReport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_19_20_36 extends Reuse {

	@Test
	public void tc_19_20_36() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_19_20_36.html");
		logger =report.startTest("TC_19_20_36");
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as admin 
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//*[text()='Reports '])[1]")).click();
		 Thread.sleep(3000);
		 JavascriptExecutor jsx=(JavascriptExecutor)driver;
		 WebElement User=driver.findElement(By.xpath("(//*[text()='Notice Order Report'])[1]"));
		 jsx.executeScript("arguments[0].scrollIntoView(true);", User);
		 User.click();
		 String search="(//*[text()='Notice Order Report'])[2]";
		 waitexplicit(search);	
		 Thread.sleep(2000);
		 
		WebElement Status=driver.findElement(By.id("category"));
		Select sel=new Select(Status);
		sel.selectByVisibleText("In Progress");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		Thread.sleep(2000);
		 
		 if(driver.findElement(By.xpath("(//*[text()='InProgress'])[1]")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_19", "TC-No : 19 - Results are displaying for selected status only");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_19", "TC-No : 19 - Results are displaying for selected status only");
		 }
		 
		Thread.sleep(2000);
		sel.selectByVisibleText("Completed");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[text()='Search']")).click();
		Thread.sleep(2000);
		if(driver.findElement(By.xpath("(//*[text()='Completed'])[2]")).isDisplayed())
		 {
			 passscreenshot(driver, "NOR-TC_20", "TC-No : 20,36 - Results are displaying for only one status when tried to select multiple");
		 }
		 else
		 {
			 failscreenshot(driver, "NOR-TC_20", "TC-No : 20,36 - Results are not displaying for only one status when tried to select multiple");
		 }
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}