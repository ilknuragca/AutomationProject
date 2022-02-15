package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.TC2_LoginPage;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class TC2_LoginWithExcelStepDef {

    ExcelUtil excelUtil;
    List<Map<String, String>> loginData;
    TC2_LoginPage loginPage= new TC2_LoginPage();

    @When("user enters correct email_address and password via excel")
    public void user_enters_correct_email_address_and_password_via_excel() {
          String path= "./src/test/resources/testdata/test.xlsx";
           String shhetName="Sayfa1";
           excelUtil = new ExcelUtil(path,shhetName);
           loginData= excelUtil.getDataList();
           loginPage.emailBox.sendKeys(loginData.get(0).get("Email"));
           loginPage.passwordBox.sendKeys(loginData.get(0).get("Password"));

    }


}
