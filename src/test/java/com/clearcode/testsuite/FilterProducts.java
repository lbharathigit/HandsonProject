package com.clearcode.testsuite;

import org.testng.annotations.Test;
import com.clearcode.po.FilterProd;
import dataProvider.Filterby;

public class FilterProducts extends TestSetup{

	@Test(priority=1)
	public void Login() {
	wdu.type(FilterProd.username_ip, "admin");
	wdu.type(FilterProd.pwd_ip, "admin@123");
	wdu.click(FilterProd.login_btn);
	wdu.click(FilterProd.Catelog);
	wdu.click(FilterProd.Products);
	}

@Test(priority=2, dataProvider="Filterby", dataProviderClass=Filterby.class)
public void FilterbyName(String prodName, String price) {
	wdu.type(FilterProd.ProdName, prodName);
	wdu.type(FilterProd.Price, price);
	wdu.click(FilterProd.Fltr_btn);
	
}

@Test(priority=3, dataProvider="Filterby", dataProviderClass=Filterby.class)
public void FilterbyModel(String model, String status, String qty) {
	wdu.type(FilterProd.Status, status);
	wdu.type(FilterProd.Model, model);
	wdu.type(FilterProd.Qty, qty);
	wdu.click(FilterProd.Fltr_btn);
}
}
