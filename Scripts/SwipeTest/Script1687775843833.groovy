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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword as MobileAbstractKeyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import org.openqa.selenium.WebElement as WebElementimport
import org.openqa.selenium.WebElement as WebElement

def AppPath = (RunConfiguration.getProjectDir() + '/apk_file/') + GlobalVariable.SwipeDemo

Mobile.startApplication(AppPath, false)
if(Mobile.verifyElementVisible(findTestObject('Object Repository/SwipeDemo/AboutScreenPopUp/Txt  About'), 5)) {
	Mobile.tap(findTestObject('Object Repository/SwipeDemo/AboutScreenPopUp/Btn Ok'), 3)
}
Mobile.waitForElementPresent(findTestObject('Object Repository/SwipeDemo/Txt SwipeListView Demo'), 5)
	

def startx = Mobile.getDeviceWidth()/2
println(startx)
def endx = startx
def starty =Mobile.getDeviceHeight()*0.3
def endy =Mobile.getDeviceHeight()*0.7

LastElement = Mobile.getText(findTestObject('Object Repository/SwipeDemo/Txt YouTube Music'), 3)
Mobile.scrollToText(LastElement)
 
FirstElement = Mobile.getText(findTestObject('Object Repository/SwipeDemo/Txt Android Auto'), 3)
Mobile.scrollToText(FirstElement)
