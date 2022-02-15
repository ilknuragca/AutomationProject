package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TC2_LoginPage;
import utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class TC2_TC3_NegativeTestStepDefs {
    ExcelUtil excelUtil;
    List<Map<String, String>> loginData;
    TC2_LoginPage loginPage= new TC2_LoginPage();


    @And("user enters wrong email_address and password via excel")
    public void userEntersWrongEmail_addressAndPasswordViaExcel() {
        String path= "./src/test/resources/testdata/test.xlsx";
        String shhetName="Sayfa1";
        excelUtil = new ExcelUtil(path,shhetName);
        loginData= excelUtil.getDataList();

        loginPage.emailBox.sendKeys(loginData.get(1).get("Email"));
        loginPage.passwordBox.sendKeys(loginData.get(1).get("Password"));



    }

    @Then("user verifies that invalid login text")
    public void userVerifiesThatInvalidLoginText() {
        Assert.assertTrue(loginPage.incorrectText.isDisplayed());
    }

}
