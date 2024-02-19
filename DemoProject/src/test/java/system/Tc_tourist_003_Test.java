package system;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc_tourist_003_Test {
	@Test
	public void makemytrip() {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.quit();
}
}