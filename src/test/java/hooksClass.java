import java.io.IOException;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import walmart.com.DummyBaseClass;

public class hooksClass extends DummyBaseClass {
	
	@Before 
	public void beforeMethod() throws IOException {
		browserLaunch("chrome");
		loadUrl(readPropertyFile("url"));
	}
	
	@After
	public void AfterMethod() {
		driver.close();
	}


}
