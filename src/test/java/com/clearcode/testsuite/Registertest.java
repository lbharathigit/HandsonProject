package com.clearcode.testsuite;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.clearcode.po.HomePage;
import com.clearcode.po.HomePage1;
import com.clearcode.po.MenuBar;
import com.clearcode.po.PatientPage;
import com.clearcode.po.Register;

import dataProvider.LoginData;

public class Registertest extends TestSetup{

@Test(dataProvider="CreateStudent", dataProviderClass=Register.class)
public void CreateStudent(String desc, String fname, String lname) {

wdu.click(HomePage1.sign_up);
wdu.click(Register.student_rbutton);
wdu.type(Register.fname_ip, fname);
wdu.type(Register.lname_ip, lname);

}

}
