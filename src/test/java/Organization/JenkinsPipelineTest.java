package Organization;

import org.testng.annotations.Test;

public class JenkinsPipelineTest {

	@Test
	public void jenkinsPipelineTest()
	{
		String BROWSER = System.getProperty("browser");
		String ENV = System.getProperty("Env");
		
		System.out.println(BROWSER);
		System.out.println(ENV);
	}
}
