package IndependentSearchAddress;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;

import com.relevantcodes.extentreports.ExtentReports;

public class TC_153_154 extends Reuse {

	@Test
	public void tc_153_154() throws Exception {
		
		report=new ExtentReports(ReportSavingPath+"\\IndependentSearchAddress\\"+"TC_153_154.html");
		logger =report.startTest("TC_153_154");
		
		Launch();//driver launch
		Login();//open site
		UserLogin();//login as Independent user 
		 
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Independent Search Address']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='City']")).sendKeys("Hyderabad");
		 driver.findElement(By.xpath("//*[@id='googleAddress']")).sendKeys("Plot no 1177, Road, No. 86, Lotus Pond Rd, MLA Colony, Banjara Hills, Hyderabad, Telangana 500034, India");
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 String close="(//*[text()='Close Order'])";
		 waitexplicit(close);	Thread.sleep(1000);
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Select All'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])[1]")).click();
		 Thread.sleep(8000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(8000);
		 List<WebElement> Deselect1 = driver.findElements(By.xpath("(//*[@class='btn btn-select btn-danger ng-scope'])"));
		 int Deselect1n = Deselect1.size();
		 System.out.println("Deselect1n "+Deselect1n);
		 Thread.sleep(5000);
		 waitexplicit("(//*[@class='backBtn']/i)[1]");	Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[@class='backBtn']/i)[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("(//*[text()='Search Address'])");	Thread.sleep(5000);
		 
		 driver.findElement(By.xpath("(//*[text()='View Selected'])[1]")).click();
		 Thread.sleep(5000);
		 waitexplicit("//*[@class='pull-right resultsView resultsView-Results ng-binding']");	Thread.sleep(5000);
		 
		 List<WebElement> Deselect2 = driver.findElements(By.xpath("(//*[@class='btn btn-select btn-danger ng-scope'])"));
		 int Deselect2n = Deselect2.size();
		 System.out.println("Deselect2n "+Deselect2n);
		 
		 if(Deselect2n==Deselect1n)
		 {
			 passscreenshot(driver, "ISA-TC_153", "TC-No : 153 - When searched with Google Address Notices are selected and added to List");
		 }
		 else
		 {
			 failscreenshot(driver, "ISA-TC_153", "TC-No : 153 - When searched with Google Address Notices are not selected");
		 }
		 
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Close Order'])[2]")).click();
		Thread.sleep(5000);
		 report.endTest(logger);
		 report.flush();
		 driver.close();
		}
}