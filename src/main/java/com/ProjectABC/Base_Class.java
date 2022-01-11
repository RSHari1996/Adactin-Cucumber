package com.ProjectABC;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;

	// Close
	public static void closeBrowser() {
		driver.close();
	}

	// Quit
	public static void quitBrowser() {
		driver.quit();
	}

	// Navigate To
	public static void Moveto(String link) {
		driver.navigate().to(link);
	}

	// Navigate Back
	public static void Moveback() {
		driver.navigate().back();
	}

	// Navigate Forward
	public static void Movefront() {
		driver.navigate().forward();
	}

	// Navigate Refresh
	public static void refresh() {
		driver.navigate().refresh();
	}

	// Get
	public static void openLink(String url) {
		driver.get(url);
	}

	// Alert
	public static void alert(String value) {
		if (value.equalsIgnoreCase("accept")) {
			driver.switchTo().alert().accept();
		} else if (value.equalsIgnoreCase("decline")) {
			driver.switchTo().alert().dismiss();
		}
	}

	// Action
	public static void action(WebElement ele, String act) {
		Actions a = new Actions(driver);
		if (act.equalsIgnoreCase("click")) {
			a.click(ele).perform();
		} else if (act.equalsIgnoreCase("doubleclick")) {
			a.doubleClick(ele).perform();
		} else if (act.equalsIgnoreCase("rightclick")) {
			a.contextClick(ele).perform();
		} else if (act.equalsIgnoreCase("moveelement")) {
			a.moveToElement(ele).perform();
		}
	}

	// Frame
	public static void frame(WebElement fr) {
		driver.switchTo().frame(fr);
	}

	// CheckBox
	public static void tickbox(WebElement box) {
		box.click();
	}

	// validation
	public static void validation(WebElement is, String val) {
		if (val.equalsIgnoreCase("enable")) {
			System.out.println(is.isEnabled());
		} else if (val.equalsIgnoreCase("display")) {
			System.out.println(is.isDisplayed());
		} else if (val.equalsIgnoreCase("select")) {
			System.out.println(is.isSelected());
		}
	}

	// Get Option
	public static void getoption(WebElement option) {
		Select s = new Select(option);
		List<WebElement> L = s.getOptions();
		for (int i = 0; i < L.size(); i++) {
			System.out.println(L.get(i).getText());
		}
	}

	// Get title
	public static void title() {
		System.out.println(driver.getTitle());
	}

	// Get URL
	public static void url() {
		System.out.println(driver.getCurrentUrl());
	}

	// Get Text
	public static void text(WebElement text) {
		System.out.println(text.getText());
	}

	// Get Attribute
	public static void attribute(WebElement attri) {
		System.out.println(attri.getAttribute("value"));
	}

	// wait
	public static void wait(int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}

	// ScreenShot
	public static void Screenshot(String printname) throws IOException {
		TakesScreenshot t1 = (TakesScreenshot) driver;
		File ss1 = t1.getScreenshotAs(OutputType.FILE);
		File regss1 = new File(printname);
		FileHandler.copy(ss1, regss1);
	}

	//clear
	public static void clear(WebElement clear) {
		clear.clear();
	}
	
	// Scroll
	public static void scroll(String dir) {
		JavascriptExecutor Scrool = (JavascriptExecutor) driver;
		if (dir.equalsIgnoreCase("down")) {
			Scrool.executeScript("window.scrollBy(0,300)", "");
		} else if (dir.equalsIgnoreCase("up")) {
			Scrool.executeScript("window.scrollBy(0,-300)", "");
		}
	}

	// SendKeys
	public static void entervalue(WebElement box, String data) {
		box.sendKeys(data);
	}

	// Click
	public static void go(WebElement click) {
		click.click();
	}

	// First selected Option
	public static void firstoption(WebElement fopt) {
		Select Sec = new Select(fopt);
		System.out.println(Sec.getFirstSelectedOption().getText());
	}

	// Get all Selected Option
	public static void getalloption(WebElement option) {
		Select s = new Select(option);
		List<WebElement> L = s.getAllSelectedOptions();
		for (int i = 0; i < L.size(); i++) {
			System.out.println(L.get(i).getText());
		}
	}

	// Is Multiple
	public static void multiple(WebElement mul) {
		Select s = new Select(mul);
		System.out.println(s.isMultiple());
	}

	// Windows handle
	public static void windows() {
		String mainWindowHandle = driver.getWindowHandle();
		Set<String> allWindowHandles = driver.getWindowHandles();
		Iterator<String> iterator = allWindowHandles.iterator();

		while (iterator.hasNext()) {
			String ChildWindow = iterator.next();
			if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
				driver.switchTo().window(ChildWindow);
			}
		}
	}

	// drop down
	public static void dropdown(WebElement el, String dd, String v) {
		Select S = new Select(el);
		if (dd.equalsIgnoreCase("value")) {
			S.selectByValue(v);
		} else if (dd.equalsIgnoreCase("text")) {
			S.selectByVisibleText(v);
		} else if (dd.equalsIgnoreCase("index")) {
			S.selectByIndex(Integer.parseInt(v));
		}
	}

	// browser launch
	public static WebDriver launchBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.GECKO.driver", "D:\\Selenium\\chromedriver.exe");
			driver = new FirefoxDriver();
			
		}
		return driver;
	}

}
