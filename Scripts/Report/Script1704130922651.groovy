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

WebUI.click(findTestObject('Object Repository/Report/Page_Login to Firefly III/p_Sign in to start your session'))

WebUI.setText(findTestObject('Object Repository/Report/Page_Login to Firefly III/input_email'), 'klot12022002@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Report/Page_Login to Firefly III/input_password'), 'A0OWLKT5igxVrUm1hOyDrVf3RsK4FPOM')

WebUI.click(findTestObject('Object Repository/Report/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Report/Page_Whats playing  Firefly III/span_Reports'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Report/Page_Reports  Firefly III/select_Default financial report            _3699a2'), 
    report_type, true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Report/Page_Reports  Firefly III/input_checkbox'), included_amount, 
    false)

WebUI.setText(findTestObject('Object Repository/Report/Page_Reports  Firefly III/input_daterange'), (date_from + ' - ') + 
    date_to)

if(extra_budget && WebUI.waitForElementPresent(findTestObject('Object Repository/Report/Page_Reports  Firefly III/input_extra_budget'), 1)) {	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Report/Page_Reports  Firefly III/input_extra_budget'), extra_budget, false)
} else {	
	System.out.println('no extras budget value')
}

if(extra_category && WebUI.waitForElementPresent(findTestObject('Object Repository/Report/Page_Reports  Firefly III/input_extra_category'), 1)) {	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Report/Page_Reports  Firefly III/input_extra_category'), extra_category, false)
} else {	
	System.out.println('no extras category value')
}

if(extra_tag && WebUI.waitForElementPresent(findTestObject('Object Repository/Report/Page_Reports  Firefly III/input_extra_tag'), 1)) {	
	WebUI.selectOptionByValue(findTestObject('Object Repository/Report/Page_Reports  Firefly III/input_extra_tag'), extra_tag, false)
} else {	
	System.out.println('no extras tag value')
}

if(extra_expense && WebUI.waitForElementPresent(findTestObject('Object Repository/Report/Page_Reports  Firefly III/input_extra_expense'), 1)) {
	WebUI.selectOptionByValue(findTestObject('Object Repository/Report/Page_Reports  Firefly III/input_extra_expense'), extra_expense, false)
} else {
	System.out.println('no extras expense value')
}

WebUI.click(findTestObject('Object Repository/Report/Page_Reports  Firefly III/button_Submit'))

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

