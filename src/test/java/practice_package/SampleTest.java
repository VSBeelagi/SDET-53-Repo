package practice_package;

import org.testng.annotations.Test;

public class SampleTest {

	@Test(groups = {"smoke", "regression"})
	public void sample1Test()
	{
		System.out.println("-- Testscript-3 --");
	}
	
	@Test(groups = "smoke")
	public void sampleTest()
	{
		System.out.println("-- Testscript-4 --");
	}
}
