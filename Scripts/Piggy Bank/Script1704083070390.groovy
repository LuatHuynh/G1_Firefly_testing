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

WebUI.setText(findTestObject('Object Repository/Piggy Bank/Page_Login to Firefly III/input_email'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Repository/Piggy Bank/Page_Login to Firefly III/input_password'), GlobalVariable.password)

WebUI.sendKeys(findTestObject('Object Repository/Piggy Bank/Page_Login to Firefly III/input_password'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Piggy Bank/Page_Whats playing  Firefly III/a_Piggy banks'))

WebUI.click(findTestObject('Object Repository/Piggy Bank/Page_Piggy banks  Firefly III/a_Create new piggy bank'))

WebUI.setText(findTestObject('Object Repository/Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/input_name'), name)

WebUI.selectOptionByLabel(findTestObject('Object Repository/Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/select_My Savings AccountMy Asset Account'), 
    save_on_account, true)

WebUI.setText(findTestObject('Object Repository/Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/input_targetamount'), 
    target_amount)

WebUI.setText(findTestObject('Object Repository/Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/textarea_notes'), 
    notes)

WebUI.setText(findTestObject('Object Repository/Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/input_object_group'), 
    group)

WebUI.setText(findTestObject('Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/input_date'), target_date)

WebUI.uploadFile(findTestObject('Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/button_upload'), 'D:\\65MiB.bin')

WebUI.click(findTestObject('Object Repository/Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/div_Mandatory fields                       _ed7e9e'))

WebUI.click(findTestObject('Object Repository/Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/button_Store new piggy bank'))

try {
	WebUI.verifyElementPresent(findTestObject('Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/text_dangers'), 1)
	WebUI.verifyElementNotPresent(findTestObject('Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/success_alert'), 1)
	System.out.println("text danger");
} catch(err) {
	WebUI.verifyElementPresent(findTestObject('Piggy Bank/Page_New piggy bank  Piggy banks  Firefly III/success_alert'), 1)
	System.out.println("success");
}

WebUI.closeBrowser()




