package Funcinality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc_run_006_Test {
@Test
public void run() throws InterruptedException {
	String url = System.getProperty("url");
	System.out.println(url);
	System.out.println("Hello Maven");
	Reporter.log("Hello",true);
	
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.get(url);
	Thread.sleep(3000);
	driver.quit(); 

}
}
