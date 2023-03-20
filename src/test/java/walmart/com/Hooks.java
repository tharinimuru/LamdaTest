package walmart.com;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends DummyBaseClass {
	
	@Before 
	public void beforeMethod() {
		System.out.println("beforeMethod");
	}
	
	@After
	public void AfterMethod() {
		System.out.println("AfterMethod");
		driver.close();
	}


}
