package integration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Tc_Beauty_005_Test {
	@Test
	public void mac() {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.maccosmetics.in/");
		driver.quit();
		
}}
