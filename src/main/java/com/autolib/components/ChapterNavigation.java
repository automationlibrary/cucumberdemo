package com.autolib.components;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ChapterNavigation implements Component {

	WebDriver driver;

	private WebDriverWait wait;

	private By chapterNav = By.id("chapternav");

	private String chapterItemLink_Loc = "//a[@class='chapternav-link'][contains(@href,'%s')]";

	public ChapterNavigation(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(this.driver, Duration.ofSeconds(30));
	}

	public boolean isItemAvailableInChapterNavList(String item) {
		String link = item.replaceAll(" ", "-").toLowerCase();
		WebElement ele = driver.findElement(By.xpath(String.format(chapterItemLink_Loc, link)));
		return ele.isDisplayed();
	}

	@Override
	public void waitUntilVisible() {
		this.wait.until(ExpectedConditions.visibilityOf(driver.findElement(chapterNav)));
	}

	@Override
	public boolean isDisplayed() {
		waitUntilVisible();
		return driver.findElement(chapterNav).isDisplayed();
	}

}
