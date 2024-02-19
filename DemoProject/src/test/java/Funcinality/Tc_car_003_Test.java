package Funcinality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc_car_003_Test {
	@Test
	public void ferrari() {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ferrari.com/en-IN");
		driver.quit();
}}
