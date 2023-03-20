package walmart.com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DummyBaseClass {
	public static WebDriver driver;
	public static Select select;
	public static JavascriptExecutor js;
	public static WebElement element;
	
	public static void browserLaunch(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		}
	}

	public static void loadUrl(String url) {
		driver.get(url);
	}

	public static String readPropertyFile(String key)throws IOException {
		File f = new File("E:\\Tharini\\Eclips WorkSpace\\ClassOne\\src\\test\\resources\\SupportFiles\\creden.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties po= new Properties();
		po.load(fis);
		String value = po.getProperty(key);
		return value;
	}

	public static void excelRead( WebElement wel,int rowNumber,int cellNumber)throws IOException {
		File f = new File("C:\\Users\\Tharini\\Desktop\\Marksheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wk = new XSSFWorkbook(fis);
		Sheet sht = wk.getSheet("Sheet1");
		Row rw = sht.getRow(rowNumber);
		Cell cl = rw.getCell(cellNumber);
		CellType ct =cl.getCellType();
		if(ct==CellType.STRING) {
			String clValue= cl.getStringCellValue();
			wel.sendKeys(clValue);
		}
		else if(ct==CellType.NUMERIC) {
			if(DateUtil.isCellDateFormatted(cl)) {
				Date dClValue = cl.getDateCellValue();
				SimpleDateFormat sc= new SimpleDateFormat("dd-mm-yyyy");
				String sstr =sc.format(dClValue);
				System.out.println(sstr);
				wel.sendKeys(sstr);
			}
			else {

				double	num = cl.getNumericCellValue();
				String number=String.valueOf(num);
				wel.sendKeys(number);
			}
		}
	}
	
	public static String excelRead(int row1,int cell1) throws IOException 
	{
		String s = null;
		File file = new File("C:\\Users\\Tharini\\Desktop\\Marksheet.xlsx");
		FileInputStream fls = new FileInputStream(file);
		Workbook wk = new XSSFWorkbook(fls);
		Sheet sh =  wk.getSheet("Sheet3");
		Row row =  sh.getRow(row1);
		Cell cell = row.getCell(cell1);
		CellType ct = cell.getCellType();
		if(ct==ct.STRING)
		{
			s = cell.getStringCellValue();
		}
		else if(ct==ct.NUMERIC)
		{
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sd = new SimpleDateFormat("dd-MMM-YYYY");
				s = sd.format(dateCellValue);
			}
			else
			{
				double numericCellValue = cell.getNumericCellValue();
				long s1 = (long) numericCellValue;
				s = String.valueOf(s1);
			}
		}
		return s;
	}
	public static void excelWrite (WebElement webel,int rowNumber, int cellNumber) throws IOException{
		File f = new File("C:\\\\Users\\\\Tharini\\\\Desktop\\\\Marksheet.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wk = new XSSFWorkbook(fis);
		Sheet sht = wk.getSheet("Sheet3");
		Row rw = sht.getRow(rowNumber);
		Cell cl = rw.getCell(cellNumber);
		String str= webel.getAttribute("Value");
		System.out.println("Order Number is "+str);
		cl.setCellValue(str);
		FileOutputStream fos = new FileOutputStream(f);
		wk.write(fos);
	}
 
	public String getText(WebElement ele) {
		String text = ele.getText();
		return text;
	}
	
	
  
	public static void selectElem(WebElement wel,int inx) {
		wel.click();
		Select sele = new Select(wel);
		sele.selectByIndex(inx);
	}
	public static void click(WebElement element) {
		element.click();

	}
	
	public static WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;
	}
	public static WebElement findElementByID(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;

	}
	public static WebElement findElementByName(String name){
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	public static WebElement findElementByClass(String popup){
		WebElement element = driver.findElement(By.className(popup));
		return element;
	}
	public static WebElement findElementBytagName(String tagName){
		WebElement element = driver.findElement(By.tagName(tagName));
		return element;

	}
	public static List<WebElement> findElementsBytagName(String tagName){
		List<WebElement> element = driver.findElements(By.tagName(tagName));
		return element;

	}
	public static List<WebElement> findElementsByxpath(String xpath){
		List<WebElement> element = driver.findElements(By.tagName(xpath));
		return element;

	}


	public static WebElement findElementBylinkText(String linkText){
		WebElement element = driver.findElement(By.linkText(linkText));
		return element;

	}

	public static WebElement findElementBypartiallyLinkText(String partiallyLinkText){
		WebElement element = driver.findElement(By.partialLinkText(partiallyLinkText));
		return element;

	}
	public static WebElement findElementBycssSelector(String cssSelector){
		WebElement element = driver.findElement(By.cssSelector(cssSelector));
		return element;
	}

	public static void threadSleep(int time) throws InterruptedException {
		Thread.sleep(time);
	}

	public static void waits(int i) {
		driver.manage().timeouts().implicitlyWait(i,TimeUnit.SECONDS);
	}

	public static void  dataSend(WebElement element, String data) {
		element.sendKeys(data);

		
	}
	
	public static String getwindowHandleID () {
		String windID = driver.getWindowHandle();
		System.out.println(windID);
		return windID;
	}
	public static void selectByValue(WebElement element,String text) {
		select = new Select(element);
		select.selectByVisibleText(text);

	}
	public static void inputvalue(WebElement element,String text) {
		element.sendKeys(text);
		

	}
	public static void selectByText(WebElement element, String text) {
		select = new Select(element);
		select.selectByVisibleText(text);
	}
	public static void dropDownAllOptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i < options.size(); i++) {
			String data = options.get(i).getText();
			System.out.println(data);
		}

	}

	public static void radio(WebElement element) {
		WebElement radio = element;
		if (!radio.isSelected()) {
			radio.click();
		}
	}

	public static String Attribute(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;
	}
	public static void close() {
		driver.close();
	}

	public static void getWebName() {
		String ttl= driver.getTitle();
		System.out.println(ttl);
	}

	public static void screenshot(String image) throws InterruptedException,IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File src= tk.getScreenshotAs(OutputType.FILE);
		File dest =new File("C:\\Users\\ragsu\\OneDrive\\Desktop\\Screns" +image+".png");
		FileUtils.copyFile(src, dest);
		//FileHandler.copy(srcFile, dest);

	}
	
	public static void scrollToView(By a) {
		element = driver.findElement(a);
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)", element);
	}
	
	public static Object[][] dataProvider() throws IOException {
		File file = new File("C:\\Users\\Tharini\\Desktop\\Marksheet.xlsx");
		FileInputStream fis = new FileInputStream(file);
		Workbook wk = new XSSFWorkbook(fis);
		Sheet sheet = wk.getSheet("Sheet3");
		int rows = sheet.getPhysicalNumberOfRows();
		int lastCell = sheet.getRow(0).getLastCellNum();
		String[][]data = new String[rows][lastCell];
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < lastCell; j++) {
				Cell dat = sheet.getRow(i).getCell(j);
				data[i][j] = dat.getStringCellValue();
			}
		}
		return data;
}

}

