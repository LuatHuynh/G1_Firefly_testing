import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://firefly.buudadawg.online/login')

WebUI.setText(findTestObject('Object Repository/Transaction/Page_Login to Firefly III/input_email'), GlobalVariable.username)

WebUI.setEncryptedText(findTestObject('Object Repository/Transaction/Page_Login to Firefly III/input_password'), GlobalVariable.password)

WebUI.sendKeys(findTestObject('Object Repository/Transaction/Page_Login to Firefly III/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Transaction/Page_Whats playing  Firefly III/a_Transactions'))

WebUI.click(findTestObject('Object Repository/Transaction/Page_Whats playing  Firefly III/a_Expenses'))

WebUI.click(findTestObject('Object Repository/Transaction/Page_All expenses between January 1st, 2024_d388e7/a_Create a new transaction'))

WebUI.setText(findTestObject('Transaction/Page_Create new withdrawal  Transactions  F_057ce1/input_description'), description)

WebUI.setText(findTestObject('Object Repository/Transaction/Page_Create new withdrawal  Transactions  F_057ce1/input_source'), 
    source_account, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Transaction/Page_Create new withdrawal  Transactions  F_057ce1/input_destination'), 
    destination_account, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Transaction/Page_Create new withdrawal  Transactions  F_057ce1/input_date'), date)

WebUI.setText(findTestObject('Object Repository/Transaction/Page_Create new withdrawal  Transactions  F_057ce1/input_amount'), 
    amount)

if (WebUI.getText(findTestObject('Object Repository/Transaction/Page_Create new withdrawal  Transactions  F_057ce1/select_foreign_currency')) == 
'') {
    System.out.println('select 0') //    WebUI.setText(findTestObject('Object Repository/Transaction/Page_Create new withdrawal  Transactions  F_057ce1/input_foreign_amount'), 
    //        foreign_amount)
}

try {
    WebUI.waitForElementPresent(findTestObject('Object Repository/Transaction/Page_Create new withdrawal  Transactions  F_057ce1/select_(none)      My Budget', 
            0.5))

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Transaction/Page_Create new withdrawal  Transactions  F_057ce1/select_(none)      My Budget'), 
        budget, true)
}
catch (def err) {
    System.out.println('not found budget')
} 

WebUI.setText(findTestObject('Object Repository/Transaction/Page_Create new withdrawal  Transactions  F_057ce1/input_category'), 
    category)

WebUI.selectOptionByValue(findTestObject('Object Repository/Transaction/Page_Create new withdrawal  Transactions  F_057ce1/select_(no piggy bank)                  1 (_6b16ef'), 
    piggy_bank, true)

WebUI.setText(findTestObject('Object Repository/Transaction/Page_Create new withdrawal  Transactions  F_057ce1/input_ti-new-tag-input ti-valid'), 
    tags)

try {
    WebUI.waitForElementPresent(findTestObject('Object Repository/Transaction/Page_Create new withdrawal  Transactions  F_057ce1/select_(none)      Name'), 
        0.5)

    WebUI.selectOptionByLabel(findTestObject('Object Repository/Transaction/Page_Create new withdrawal  Transactions  F_057ce1/select_(none)      Name'), 
        bill, true)
}
catch (def err) {
    System.out.println('not found bill')
} 

WebUI.click(findTestObject('Object Repository/Transaction/Page_Create new withdrawal  Transactions  F_057ce1/button_Submit'))

try {
    WebUI.verifyElementPresent(findTestObject('Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/text_dangers'), 
        1)

    WebUI.verifyElementNotPresent(findTestObject('Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/success_alert'), 
        1)

    System.out.println('text danger')
}
catch (def err) {
    WebUI.verifyElementPresent(findTestObject('Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/success_alert'), 
        1)

    System.out.println('success')
} 

WebUI.closeBrowser()
