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
import java.util.Date as Date
import java.text.SimpleDateFormat

Date today = new Date()
SimpleDateFormat dateFormat = new SimpleDateFormat('ddMMyyyy')
String todaysDate = dateFormat.format(today)
SimpleDateFormat timeFormat = new SimpleDateFormat('HHmm')
String nowTime = timeFormat.format(today)

WebUI.callTestCase(findTestCase('1. Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Checkout Order/button_ADD TO CART'))
WebUI.click(findTestObject('Object Repository/Checkout Order/button_cart'))
WebUI.click(findTestObject('Object Repository/Checkout Order/button_CHECKOUT'))

WebUI.setText(findTestObject('Object Repository/Checkout Order/input_first-name'), ('restri' + todaysDate) + nowTime)
WebUI.setText(findTestObject('Object Repository/Checkout Order/input_last-name'), ('oktalasa' + todaysDate) + nowTime)
WebUI.setText(findTestObject('Object Repository/Checkout Order/input_postal-code'), ('10000' + todaysDate) + nowTime)

WebUI.click(findTestObject('Object Repository/Checkout Order/button_Continue'))
WebUI.click(findTestObject('Object Repository/Checkout Order/button_FINISH'))

String currentUrl = WebUI.getUrl()
WebUI.verifyMatch(currentUrl, 'https://www.saucedemo.com/v1/checkout-complete.html', false)
