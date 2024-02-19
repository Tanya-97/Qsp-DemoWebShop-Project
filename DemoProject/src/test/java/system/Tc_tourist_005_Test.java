package system;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc_tourist_005_Test {
	@Test
	public void e() {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/hotels");
		driver.quit();
}}
