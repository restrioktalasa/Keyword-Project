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
import java.util.Date
import java.text.SimpleDateFormat

Date today = new Date()
SimpleDateFormat dateFormat = new SimpleDateFormat('ddMMyyyy')
String todaysDate = dateFormat.format(today)
SimpleDateFormat timeFormat = new SimpleDateFormat('HHmm')
String nowTime = timeFormat.format(today)


CustomKeywords.'testKeywords.login.loginTest'('standard_user', 'secret_sauce')
CustomKeywords.'testKeywords.additemtocart.addShopping'()
CustomKeywords.'testKeywords.checkoutorder.checkoutOrder'()
CustomKeywords.'testKeywords.inputdatacustomer.inputDataUser'('restri' + todaysDate + nowTime,'oktalasa' + todaysDate + nowTime, '1000' + todaysDate + nowTime)
CustomKeywords.'testKeywords.completeorder.completecheckout'()

