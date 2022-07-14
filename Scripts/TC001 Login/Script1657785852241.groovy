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

WebUI.navigateToUrl('https://demo-store.katalon.com./')

WebUI.click(findTestObject('Object Repository/Page_Zack Market/span_Ascending'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/span_Descending'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/label_Men'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/span_Women'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/a_Kids'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/a_Girl'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/img_Clear All_card-img-top'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/button_XS'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/a_M'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/svg_Add to Bag_svg-inline--fa fa-shopping-c_551a00'))

WebUI.click(findTestObject('Object Repository/Page_Zack Market/input_Email_email'))

WebUI.closeBrowser()

