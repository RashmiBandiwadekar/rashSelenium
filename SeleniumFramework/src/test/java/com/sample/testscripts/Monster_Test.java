package com.sample.testscripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Monster_Test {
	@Test
	public void executescript() {
		System.out.println("Hii");
		String browsername = System.getProperty("bname");
		System.out.println(browsername);
		String username = System.getProperty("user");
		System.out.println(username);
	}

}
