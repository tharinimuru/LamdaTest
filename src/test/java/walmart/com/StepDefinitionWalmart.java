package walmart.com;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinitionWalmart extends PageFactoryWalmart {

	@Given("Launch chrome browser and load url")
	public void launch_chrome_browser_and_load_url() {
		DummyBaseClass.browserLaunch("chrome");
		DummyBaseClass.loadUrl("https://magento.softwaretestingboard.com/");
	}
	
	@When("Click women and hoodies")
	public void click_women_and_hoodies() {
		PageFactoryWalmart pg  = new PageFactoryWalmart();
	   click(pg.womens);
	   click(pg.hoodies);
	}

	@Then("click size and choose s")
	public void click_size_and_choose_s() {
		PageFactoryWalmart pg  = new PageFactoryWalmart();
		click(pg.size);
		click(pg.small);    
	}

	@Then("Click autumn and click purple")
	public void click_autumn_and_click_purple() {
		PageFactoryWalmart pg  = new PageFactoryWalmart();
		click(pg.autumn);
		click(pg.purple);
		click(pg.addtoCart);
	}
	
	@When("Click men and tees")
	public void click_men_and_tees() {
		PageFactoryWalmart pg  = new PageFactoryWalmart();
		click(pg.men);
		click(pg.Tees);
	}

	@Then("click colour and size s")
	public void click_colour_and_size_s() {
		PageFactoryWalmart pg  = new PageFactoryWalmart();
		click(pg.size);
		click(pg.small);
		click(pg.colour);
		Assert.assertTrue(false);

		
	}


}
