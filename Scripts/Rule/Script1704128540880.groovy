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

WebUI.setText(findTestObject('Object Repository/Rule/Page_Login to Firefly III/input_email'), 'klot12022002@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Rule/Page_Login to Firefly III/input_password'), 'A0OWLKT5igxVrUm1hOyDrVf3RsK4FPOM')

WebUI.click(findTestObject('Object Repository/Rule/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Rule/Page_Whats playing  Firefly III/span_Automation'))

WebUI.click(findTestObject('Object Repository/Rule/Page_Whats playing  Firefly III/span_Rules'))

WebUI.click(findTestObject('Object Repository/Rule/Page_Rules  Firefly III/a_New rule'))

WebUI.setText(findTestObject('Object Repository/Rule/Page_Make a new rule in rule group Default _06afff/input_title'), title)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rule/Page_Make a new rule in rule group Default _06afff/select_When a transaction is createdWhen a _cb5a5f'), 
    trigger, true)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Rule/Page_Make a new rule in rule group Default _06afff/select_Default rulesFirst group'), 
    rule_group, true)

WebUI.setText(findTestObject('Object Repository/Rule/Page_Make a new rule in rule group Default _06afff/textarea_description'), 
    description)

WebUI.setText(findTestObject('Object Repository/Rule/Page_Make a new rule in rule group Default _06afff/input_triggers1value'), 
    trigger_value)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rule/Page_Make a new rule in rule group Default _06afff/select_Amount is less than or equal to .   _e8698f'), 
    trigger_condition, true)

WebUI.setText(findTestObject('Object Repository/Rule/Page_Make a new rule in rule group Default _06afff/input_actions1value'), 
    action_value)

WebUI.selectOptionByValue(findTestObject('Object Repository/Rule/Page_Make a new rule in rule group Default _06afff/select_Add  remove transaction amount in pi_3c959d'), 
    action, true)

WebUI.click(findTestObject('Object Repository/Rule/Page_Make a new rule in rule group Default _06afff/button_Store new rule'))

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

