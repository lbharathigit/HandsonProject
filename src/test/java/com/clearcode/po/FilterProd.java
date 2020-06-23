package com.clearcode.po;

import org.openqa.selenium.By;

public class FilterProd {
	
	public static By username_ip = By.id("input-username");
	public static By pwd_ip = By.id("input-password");
	public static By login_btn = By.className("btn");
	public static By Catelog = By.xpath("//*[@id=\"catalog\"]/a/i");
	public static By Products = By.partialLinkText("Products");
	public static By ProdName = By.id("input-name");
	public static By Price = By.id("input-price");
	public static By Status = By.id("input-status");
	public static By Model = By.id("input-model");
	public static By Qty = By.id("input-quantity");
	public static By Fltr_btn = By.id("button-filter");
		
}
