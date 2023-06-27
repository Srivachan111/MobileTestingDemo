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
import io.appium.java_client.AppiumDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileAbstractKeyword
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import org.openqa.selenium.WebElement as WebElementimport
import org.openqa.selenium.WebElement as WebElement

def AppPath = (RunConfiguration.getProjectDir() + '/apk_file/') + GlobalVariable.apidemos

Mobile.startApplication(AppPath, false)

AppiumDriver driver = MobileDriverFactory.getDriver()

List<WebElement> ListMenu = driver.findElementsByClassName('android.widget.TextView')

for (WebElement option : ListMenu) {
    if (option.getText().equals(GlobalVariable.ListOption)) {
        option.click()

        break
    }
}

List<WebElement> AccMenu = driver.findElementsByClassName('android.widget.TextView')

for (WebElement AccOption : AccMenu) {
    if (AccOption.getText().contains(GlobalVariable.AccOption)) {
        AccOption.click()
		break
    }
}

Mobile.closeApplication()