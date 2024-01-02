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

WebUI.navigateToUrl('https://firefly.buudadawg.online/login')

WebUI.setText(findTestObject('Object Repository/Bill/Page_Login to Firefly III/input_email'), 'khoacraphotograph@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Bill/Page_Login to Firefly III/input_password'), 'krbqsEPTyj+/ySZvycc2bfHXjZyOJWOA')

WebUI.click(findTestObject('Object Repository/Bill/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Bill/Page_Whats playing  Firefly III/a_Bills'))

WebUI.click(findTestObject('Object Repository/Bill/Page_Bills  Firefly III/a_Create new bill'))

WebUI.setText(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/input_name'), name)

WebUI.setText(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/input_amount_min'), min_amount)

WebUI.setText(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/input_amount_max'), max_amount)

WebUI.setText(findTestObject('Bill/Page_Create new bill  Bills  Firefly III/input_date'), date)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/select_dailyweeklymonthlyquarterlyevery hal_79c7c6'), 
    repeats, true)

WebUI.setText(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/input_skip'), skip)

WebUI.setText(findTestObject('Bill/Page_Create new bill  Bills  Firefly III/input_end_date'), end_date)

WebUI.setText(findTestObject('Bill/Page_Create new bill  Bills  Firefly III/input_extension_date'), extension_date)

WebUI.setText(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/textarea_notes'), notes)
var isFileLimit=false
if (attachments) {
	String absolutePath = Paths.get(attachments).toAbsolutePath().normalize().toString()
	WebUI.uploadFile(findTestObject('Create a new asset account/Page_Create a new asset account  Accounts  _ced620/upload file'),
		absolutePath)

}
if (attachments=="Attachments File/Report_65MB.csv") {
	assert isFileLimit==true 
}



WebUI.setText(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/input_object_group'), group)

WebUI.click(findTestObject('Object Repository/Bill/Page_Create new bill  Bills  Firefly III/button_Store new bill'))

try {
	WebUI.verifyElementPresent(findTestObject('Shared_alert/text_dangers'), 1)

	WebUI.verifyElementNotPresent(findTestObject('Object Repository/Shared_alert/success_alert_bill'), 1)

	System.out.println('text danger')
}
catch (def err) {
	assert WebUI.verifyElementPresent(findTestObject('Shared_alert/success_alert_budget'), 1)==true 

	System.out.println('success')
}
if(max_amount!="" && min_amount!="" ) {
	assert Float.parseFloat(max_amount)>= Float.parseFloat(min_amount)
	
}

WebUI.closeBrowser()

