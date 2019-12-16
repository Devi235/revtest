package IndependentSearchAddress;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Helper.Reuse;


public class FirstRunthisScript extends Reuse {

	@Test
	public void firstRunthisScript() throws Exception {
		
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
		 driver.findElement(By.xpath("//*[@class='form-control ng-pristine ng-untouched ng-valid ng-empty']")).sendKeys("testingcustomers");
		 driver.findElement(By.xpath("//*[text()='Search']")).click();
		 Thread.sleep(5000);
		 driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
		 Thread.sleep(4000);
		 String userName="//*[@id='userName']";
		 waitexplicit(userName);Thread.sleep(4000);
		 jsx.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")));
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(1000);
		 waitexplicit("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']");	
		 
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(1000);
		 if (driver.findElement(By.xpath("(//*[@class='spnSelectall'])[1]/label/input")).isSelected()) {
			 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[1]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[1]")).click();
		}
		 else {
			
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[1]")).click();
		}
		
		 waitexplicit("//*[@class='form-control searchField ng-valid ng-pristine ng-empty ng-touched']");
		
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[1]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='Submit'])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[2]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[2]")).click();
		 Thread.sleep(2000);
		 if (driver.findElement(By.xpath("(//*[@class='spnSelectall'])[2]/label/input")).isSelected()) {
			 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[2]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[2]")).click();
		}
		 else {
			
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[2]")).click();
		}
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='Submit'])[2]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[@class='form-control divdropDown'])[3]")).click();
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[@class='divdropDownFooter text-right'])[3]")).click();
		 Thread.sleep(2000);
		 if (driver.findElement(By.xpath("(//*[@class='spnSelectall'])[3]/label/input")).isSelected()) {
			 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[3]")).click();
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[3]")).click();
		}
		 else {
			
			 Thread.sleep(1000);
			 driver.findElement(By.xpath("(//*[@class='spnSelectall'])[3]")).click();
		}
		 Thread.sleep(1000);
		 driver.findElement(By.xpath("(//*[text()='Submit'])[3]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//*[text()='Save'])")).click();
		 Thread.sleep(5000);
		 waitexplicit(search);	
		 Thread.sleep(5000);
		 driver.close();
		}
}