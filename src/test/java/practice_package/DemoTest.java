package practice_package;

import org.testng.annotations.Test;

public class DemoTest {

	@Test(groups = "smoke")
	public void demo1Test()
	{
		System.out.println("-- Testscript-1 --");
	}
	
	@Test
	public void demo2Test()
	{
		System.out.println("-- Testscript-2 --");
	}
}
