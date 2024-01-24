package practice_package;

import org.testng.annotations.Test;

public class PracticeTest {

	@Test(groups = "regression")
	public void pract1Test()
	{
		System.out.println("-- Testscript-5 --");
	}
	
	@Test(groups = {"smoke", "regression"})
	public void pract2Test()
	{
		System.out.println("-- Testscript-6 --");
	}
}
