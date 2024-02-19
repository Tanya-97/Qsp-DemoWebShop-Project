package Funcinality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc_car_001_Test {
@Test
public void benz() {
	WebDriver driver= new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.mercedes-benz.co.in/passengercars.html?group=all&subgroup=see-all&view=BODYTYPE");
	driver.quit(); 
}
}
