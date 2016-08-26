package seleniumGomez;

import static org.testng.AssertJUnit.assertEquals;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.ParserConfigurationException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class TestClass {

	 private WebDriver driver;
	
	
	@Test
	  public void pageTest() {
		{
	driver.navigate().to("http://localhost:8082/WebAppCalcu-0.0.1-SNAPSHOT/");
    driver.manage().window().maximize();
    
    driver.findElement(By.name("one")).click();
    driver.findElement(By.name("plus")).click();
    driver.findElement(By.name("two")).click();
    driver.findElement(By.name("DoIt")).click();
    assertEquals(driver.findElement(By.name("Input")).getAttribute("value"), "2");
		}
	
	}
	
	
	
	 @BeforeMethod
	  public void Setup() {
			try
			{
			  driver=new FirefoxDriver();
			  String windowsHandle=driver.getWindowHandle();
			  assertEquals(true, windowsHandle.length()>0);
			}
			catch(Exception e)
			{
			     
			}
	 
	   }
	 
	 
	 @AfterMethod
	  public void TearDown() throws IOException, ParserConfigurationException {
	 driver.close();
	 driver.quit();
	  }
	
	
}
