package com.autolib.pages;

import org.openqa.selenium.WebDriver;
import com.autolib.components.ChapterNavigation;

public class Category{
	
	ChapterNavigation chapterNavigation;

	public Category(final WebDriver driver) {
		chapterNavigation = new ChapterNavigation(driver);
	}

	public ChapterNavigation getChapterNavigation() {
		return chapterNavigation;
	}

}
