package com.autolib.components;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.util.concurrent.Uninterruptibles;

public class GlobalNavigation implements Component {

	private WebDriver driver;

	private WebDriverWait wait;

	private By navBar = By.id("globalnav");

	private String navigationLink_Loc = "//span[@class='globalnav-link-text'][text()='%s']/../../..";

	public GlobalNavigation(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
	}

	@Override
	public void waitUntilVisible() {
		this.wait.until(ExpectedConditions.visibilityOf(driver.findElement(navBar)));
	}

	@Override
	public boolean isDisplayed() {
		waitUntilVisible();
		return driver.findElement(navBar).isDisplayed();
	}

	public void hoverOnNavigationLink(String linkText) {
		Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
		WebElement ele = driver.findElement(By.xpath(String.format(navigationLink_Loc, linkText)));
		scrollIntoView(ele);
		moveToElement(ele);
		Uninterruptibles.sleepUninterruptibly(Duration.ofSeconds(5));
	}

	public void clickOnMainMenuNavigationLink(String linkText) {
		WebElement ele = driver.findElement(By.xpath(String.format(navigationLink_Loc, linkText)));
		ele.click();
	}

	public void clickOnSubMenuNavigationLink(String linkText) {
		WebElement ele = driver.findElement(By.linkText(linkText));
		wait.until(ExpectedConditions.visibilityOf(ele)).click();
	}

	private void moveToElement(WebElement ele) {
		Actions action = new Actions(driver);
		action.moveToElement(ele).build().perform();
	}
	
	private void scrollIntoView(WebElement ele) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true);", ele);
	}

	public void selectSubLink(String mainLink, String subLink) {
		hoverOnNavigationLink(mainLink);
		clickOnSubMenuNavigationLink(subLink);
	}

}
