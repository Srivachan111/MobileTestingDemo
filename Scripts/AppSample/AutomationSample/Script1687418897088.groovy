import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import javax.xml.bind.annotation.XmlElementDecl.GLOBAL as GLOBAL
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
import net.sf.jasperreports.engine.data.ExcelDataSource as ExcelDataSource
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.testdata.ExcelData as ExcelData
import com.kms.katalon.core.testdata.reader.ExcelFactory as ExcelFactory
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import org.openqa.selenium.WebElement as WebElement

def path = (RunConfiguration.getProjectDir() + '/apk_file/') + GlobalVariable.Autosample

Passed = GlobalVariable.passmsg

Failed = GlobalVariable.failmsg

ValidCreds = GlobalVariable.ValidCreds

InvalidCreds = GlobalVariable.wrongCreds

data = findTestData('Data Files/AutoSample Data')

rownum = data.getRowNumbers()

Username = GlobalVariable.userName

Password = GlobalVariable.password

index = GlobalVariable.index

String errmsg = GlobalVariable.errmsg
Validation = GlobalVariable.valid
for (index = 1; index <= rownum; index++) {
    if (data.getValue('Tc ID', index).equals(GlobalVariable.TC)) {
        Username = data.getValue('Username', index)

        Password = data.getValue('Password', index)

        ValidCreds = data.getValue('Valid Creds', index)

        InvalidCreds = data.getValue('Invalid Creds', index)

        Passed = data.getValue('Passed', index)

        Failed = data.getValue('Failed', index)

        errmsg = data.getValue('error msg', index)
		Validation = data.getValue('Validation',index)
        break
    }
}

println(Username)

println(Password)

Mobile.startApplication(path, false)

if (Mobile.verifyElementVisible(findTestObject('Object Repository/AutoSample/Lbl AutomationSample'), 3, FailureHandling.CONTINUE_ON_FAILURE)) {
    assert true

    KeywordUtil.markPassed(Passed)
} else {
    assert true

    KeywordUtil.markFailed(Failed)
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/AutoSample/Lbl Check for an update'), 3, FailureHandling.CONTINUE_ON_FAILURE)) {
    assert true

    KeywordUtil.markPassed(Passed)
} else {
    assert true

    KeywordUtil.markFailed(Failed)

    FailureHandling.CONTINUE_ON_FAILURE
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/AutoSample/android.widget.Button - OK'), 3, FailureHandling.CONTINUE_ON_FAILURE)) {
    Mobile.tap(findTestObject('Object Repository/AutoSample/android.widget.Button - OK'), 3)
} else {
    assert true

    KeywordUtil.markFailed(Failed)

    FailureHandling.CONTINUE_ON_FAILURE
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/AutoSample/Inp User Name'), 3)) {
    Mobile.tap(findTestObject('Object Repository/AutoSample/Inp User Name'), 3)

    Mobile.setText(findTestObject('Object Repository/AutoSample/Inp User Name'), Username, 3)

    assert true

    KeywordUtil.markPassed(Passed)
} else {
    assert false

    KeywordUtil.markFailed(Failed)
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/AutoSample/Inp Password'), 3)) {
    assert true

    Mobile.tap(findTestObject('Object Repository/AutoSample/Inp Password'), 3)

    Mobile.setEncryptedText(findTestObject('Object Repository/AutoSample/Inp Password'), Password, 3)

    KeywordUtil.markPassed(Passed)
} else {
    assert false

    KeywordUtil.markFailed(Failed)
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/AutoSample/Btn LOGIN'), 3)) {
    assert true

    Mobile.tap(findTestObject('Object Repository/AutoSample/Btn LOGIN'), 3)

    KeywordUtil.markPassed(Passed)
} else {
    assert false

    KeywordUtil.markFailed(Failed)
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/AutoSample/Txt Wrong username or password'), 3)) {
    assert true

    failureTxt = Mobile.getText(findTestObject('Object Repository/AutoSample/Txt Wrong username or password'), 3)

    KeywordUtil.markPassed(ValidCreds)

    println(failureTxt)
} else {
    assert false

    KeywordUtil.markFailed(InvalidCreds)
}
if(Validation.equals('Yes')) {
CustomKeywords.'mobileKeys.validation.validationErroMsg'(errmsg)
}

Mobile.delay(3)

Mobile.closeApplication()