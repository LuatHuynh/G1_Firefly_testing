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

WebUI.setText(findTestObject('Object Repository/Bill/Page_Login to Firefly III/input_email'), 'khoacraphotograph@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Bill/Page_Login to Firefly III/input_password'), 'krbqsEPTyj+/ySZvycc2bfHXjZyOJWOA')

WebUI.click(findTestObject('Object Repository/Bill/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Bill/Page_Whats playing  Firefly III/a_Bills'))

WebUI.click(findTestObject('Object Repository/Bill/Page_Bills  Firefly III/a_Create new bill'))

WebUI.setText(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/input_name'), name)

WebUI.setText(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/input_amount_min'), min_amount)

WebUI.setText(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/input_amount_max'), max_amount)

WebUI.selectOptionByValue(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/select_dailyweeklymonthlyquarterlyevery hal_79c7c6'), 
    repeats, true)

WebUI.setText(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/input_skip'), skip)

WebUI.setText(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/textarea_notes'), notes)

WebUI.setText(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/input_object_group'), group)

WebUI.click(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/button_Store new bill'))

WebUI.closeBrowser()

