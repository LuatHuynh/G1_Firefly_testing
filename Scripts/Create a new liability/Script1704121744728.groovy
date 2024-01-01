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

WebUI.navigateToUrl('https://firefly.buudadawg.online/accounts/create/liabilities')

WebUI.setText(findTestObject('Object Repository/Create a new liability/Page_Login to Firefly III/input_email'), 'huynhluat.dn@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Create a new liability/Page_Login to Firefly III/input_password'), 
    'GDttjE7iuxOgQwNBt53tbwiiBI5Qr4kb')

WebUI.click(findTestObject('Object Repository/Create a new liability/Page_Login to Firefly III/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/Create a new liability/Page_Create a new liability  Accounts  Firefly III/input_name'), 
    name)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create a new liability/Page_Create a new liability  Accounts  Firefly III/select_Euro ()US Dollar ()'), 
    currency, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create a new liability/Page_Create a new liability  Accounts  Firefly III/select_DebtLoanMortgage'), 
    liability_type, true)

WebUI.setText(findTestObject('Object Repository/Create a new liability/Page_Create a new liability  Accounts  Firefly III/input_opening_balance'), 
    i_owe_amount)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create a new liability/Page_Create a new liability  Accounts  Firefly III/select_I owe this debt to somebody elseI am_93cb18'), 
    liability_inout, true)

WebUI.setText(findTestObject('Create a new liability/Page_Create a new liability  Accounts  Firefly III/input_opening_balance_date'), 
    start_date_of_debt)

WebUI.setText(findTestObject('Object Repository/Create a new liability/Page_Create a new liability  Accounts  Firefly III/input_interest'), 
    interest)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create a new liability/Page_Create a new liability  Accounts  Firefly III/select_Per dayPer monthPer year'), 
    interest_period, true)

WebUI.setText(findTestObject('Object Repository/Create a new liability/Page_Create a new liability  Accounts  Firefly III/input_iban'), 
    iban)

WebUI.setText(findTestObject('Object Repository/Create a new liability/Page_Create a new liability  Accounts  Firefly III/input_BIC'), 
    bic)

WebUI.setText(findTestObject('Object Repository/Create a new liability/Page_Create a new liability  Accounts  Firefly III/input_account_number'), 
    account_number)

if (include_in_net_worth == "false") {
	WebUI.click(findTestObject('Object Repository/Create a new liability/Page_Create a new liability  Accounts  Firefly III/input_include_net_worth'))
}

WebUI.setText(findTestObject('Object Repository/Create a new liability/Page_Create a new liability  Accounts  Firefly III/textarea_notes'), 
    notes)

if (attachments != '') {
	String absolutePath = Paths.get(attachments).toAbsolutePath().normalize().toString()
	WebUI.uploadFile(findTestObject('Create a new liability/Page_Create a new liability  Accounts  Firefly III/upload file'), 
    absolutePath)
}

WebUI.click(findTestObject('Object Repository/Create a new liability/Page_Create a new liability  Accounts  Firefly III/button_Store new liability'))

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
