package Funcinality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc_car_004_Test {
	@Test
	public void audi() {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.audi.in/in/web/en.html");
		driver.quit();
		
}}
