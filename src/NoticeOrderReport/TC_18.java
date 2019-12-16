package NoticeOrderReport;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_18 extends Reuse {

	@Test
	public void tc_18() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\NoticeOrderreport\\"+"TC_18.html");
		logger =report.startTest("TC_18");
		
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
		
		 Select select = new Select(Status);
		 WebElement option = select.getFirstSelectedOption();
		 String SelectedText = option.getText();
	System.out.println(SelectedText);
	
	if(SelectedText.contains("Select Status"))
	 {
		 passscreenshot(driver, "tc_18", "TC-No : 18 - By default Select is displaying in Status dropdown");
	 }
	 else
	 {
		 failscreenshot(driver, "tc_18", "TC-No : 18 - By default Select is not displaying in Status dropdown");
	 }
	
		 
		 report.endTest(logger);
		 report.flush();
		//driver.close();
		}
}