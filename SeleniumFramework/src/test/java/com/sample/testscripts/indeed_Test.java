package com.sample.testscripts;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class indeed_Test {
	@Test
	public void executeScript() {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.indeed.com/");
		driver.close();

}
}
