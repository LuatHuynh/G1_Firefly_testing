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
import java.nio.file.Paths as Paths

WebUI.openBrowser('')

WebUI.navigateToUrl('https://firefly.buudadawg.online/accounts/create/asset')

WebUI.setText(findTestObject('Object Repository/Create a new asset account/Page_Login to Firefly III/input_email'), 'huynhluat.dn@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Create a new asset account/Page_Login to Firefly III/input_password'), 
    'GDttjE7iuxOgQwNBt53tbwiiBI5Qr4kb')

WebUI.click(findTestObject('Object Repository/Create a new asset account/Page_Login to Firefly III/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Create a new asset account/Page_Create a new asset account  Accounts  _ced620/input_name'), 
    name)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create a new asset account/Page_Create a new asset account  Accounts  _ced620/select_Euro ()US Dollar ()'), 
    currency, true)

WebUI.setText(findTestObject('Object Repository/Create a new asset account/Page_Create a new asset account  Accounts  _ced620/input_iban'), 
    iban)

WebUI.setText(findTestObject('Object Repository/Create a new asset account/Page_Create a new asset account  Accounts  _ced620/input_BIC'), 
    bic)

WebUI.setText(findTestObject('Object Repository/Create a new asset account/Page_Create a new asset account  Accounts  _ced620/input_account_number'), 
    account_number)

WebUI.setText(findTestObject('Object Repository/Create a new asset account/Page_Create a new asset account  Accounts  _ced620/input_opening_balance'), 
    opening_balance)

WebUI.setText(findTestObject('Create a new asset account/Page_Create a new asset account  Accounts  _ced620/input_opening_balance_date'), 
    opening_balance_date)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create a new asset account/Page_Create a new asset account  Accounts  _ced620/select_Default asset accountShared asset ac_afbbdd'), 
    account_role, true)

WebUI.setText(findTestObject('Object Repository/Create a new asset account/Page_Create a new asset account  Accounts  _ced620/input_virtual_balance'), 
    virtual_balance)

if (include_in_net_worth == "false") {
	WebUI.click(findTestObject('Create a new asset account/Page_Create a new asset account  Accounts  _ced620/input_include_net_worth'))
}

WebUI.setText(findTestObject('Object Repository/Create a new asset account/Page_Create a new asset account  Accounts  _ced620/textarea_notes'), 
    notes)

if (attachments != '') {
	String absolutePath = Paths.get(attachments).toAbsolutePath().normalize().toString()
    WebUI.uploadFile(findTestObject('Create a new asset account/Page_Create a new asset account  Accounts  _ced620/upload file'), 
        absolutePath)
}

WebUI.click(findTestObject('Object Repository/Create a new asset account/Page_Create a new asset account  Accounts  _ced620/button_Store new asset account'))

try {
    WebUI.verifyElementPresent(findTestObject('Shared_alert/text_dangers'), 1)

    WebUI.verifyElementNotPresent(findTestObject('Shared_alert/success_alert'), 1)

    System.out.println('text danger')
}
catch (def err) {
    WebUI.verifyElementPresent(findTestObject('Shared_alert/success_alert'), 1)

    System.out.println('success')
} 

WebUI.closeBrowser()

