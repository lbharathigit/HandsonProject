package dataProvider;
import org.testng.annotations.DataProvider;
import com.clearcode.utils.ExcelUtils;


public class Filterby {
	int a=2;
	@DataProvider
	public Object[][] Filterby(){
		return ExcelUtils.getData("TestData1.xls", "Filter");
	}
	
	@DataProvider
	public Object[][] CreatePatient(){
		return new Object[][] { 
			new Object[] {
			ExcelUtils.data("TestData1.xls", "Sheet1", "createPatient").toArray() }
			};
	}
	
	@DataProvider
	public Object[][] SearchPatient(){
		return new Object[][] { ExcelUtils.data("SuiteData.xls", "Sheet1", "searchPatient").toArray() };
	}
}
