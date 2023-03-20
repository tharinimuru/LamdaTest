package walmart.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryWalmart extends DummyBaseClass{

	public PageFactoryWalmart() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (xpath ="//span[text()=\"Women\"]")
	public WebElement womens;	

	@FindBy (linkText ="Hoodies & Sweatshirts")
	public WebElement hoodies;

	@FindBy (xpath ="//div[text()='Size']")
	public WebElement size;

	@FindBy (xpath ="(//div[text()='S'])[13]")
	public WebElement small;

	@FindBy(xpath = "(//*[@class=\"product name product-item-name\"])[10] ")
	public WebElement autumn;

	@FindBy (id ="option-label-color-93-item-57")
	public WebElement purple;

	@FindBy(xpath ="//span[text()='Add to Cart']")
	public WebElement addtoCart;

	@FindBy (xpath ="//span[text()='Men']")
	public WebElement men;

	@FindBy (linkText ="Tees")
	public WebElement Tees;

	@FindBy (className = "filter-options-title")
	public WebElement colour;
	
//	@FindBy (linkText ="Brown")
//	public WebElement brown ;

}