package com.clearcode.testsuite;

import org.testng.annotations.Test;
import com.clearcode.po.AddCategorypo;
import dataProvider.Category;

public class AddCategory extends TestSetup{

	@Test(priority=1)
	public void Login() {
	wdu.type(AddCategorypo.username_ip, "admin");
	wdu.type(AddCategorypo.pwd_ip, "admin@123");
	wdu.click(AddCategorypo.login_btn);
	wdu.click(AddCategorypo.Catelog);
	wdu.click(AddCategorypo.Category);
	wdu.click(AddCategorypo.Add_btn);
	}

@Test(priority=2, dataProvider="AddCategory", dataProviderClass=Category.class)
public void AddCategory(String Catname, String Desc, String MetaTitle, String MetaDesc) {
	wdu.type(AddCategorypo.Catname_ip, Catname);
	wdu.type(AddCategorypo.Desc_ip, Desc);
	wdu.type(AddCategorypo.MetaTitle_ip, MetaTitle);
	wdu.type(AddCategorypo.MetaDesc_ip, MetaDesc);
	wdu.click(AddCategorypo.Save_btn);
	wdu.assertText(AddCategorypo.Message, "Success: You have modified categories!");
}
}
