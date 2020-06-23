package com.clearcode.po;

import org.openqa.selenium.By;

public class AddCategorypo {
	
	public static By username_ip = By.id("input-username");
	public static By pwd_ip = By.id("input-password");
	public static By login_btn = By.className("btn");
	public static By Catelog = By.xpath("//*[@id=\"catalog\"]/a/i");
	public static By Category = By.partialLinkText("Categories");
	public static By Add_btn = By.className("fa-plus");
	public static By Catname_ip = By.id("input-name1");
	public static By Desc_ip = By.className("panel-body");
	public static By MetaTitle_ip = By.id("input-meta-title1");
	public static By MetaDesc_ip = By.id("input-meta-description1");
	public static By Save_btn = By.xpath("//*[@id=\"content\"]/div[1]/div/div/button");
	public static By Message = By.xpath("//*[@id=\"content\"]/div[2]/div[1]");

	
}
