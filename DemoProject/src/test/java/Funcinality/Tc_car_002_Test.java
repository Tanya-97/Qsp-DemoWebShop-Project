package Funcinality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc_car_002_Test {
	@Test
	public void roycemotorscar() {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rolls-roycemotorcars.com/en_GB/home.html");
		driver.quit();
}}
