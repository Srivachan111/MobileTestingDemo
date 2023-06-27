import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.nio.file.Path as Path
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
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.util.KeywordUtil as Keys
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

def Path = (RunConfiguration.getProjectDir() + '/apk_file/') + GlobalVariable.Stbapk_name

Mobile.startApplication(Path, false)

if (Mobile.verifyElementVisible(findTestObject('Object Repository/StarBucks/Btn Login'), 2)) {
    assert true

    KeywordUtil.markPassed('Desired element is present')
} else {
    assert false

    KeywordUtil.markFailed('Desired element is not present')
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/StarBucks/Btn Sign up'), 2)) {
    assert true

    KeywordUtil.markPassed('Desired element is present')
} else {
    assert false

    KeywordUtil.markFailed('Desired element is not present')
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/StarBucks/Btn SKIP'), 2)) {
    assert true

    KeywordUtil.markPassed('Desired element is present')
} else {
    assert false

    KeywordUtil.markFailed('Desired element is not present')
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/StarBucks/Inp Enter Email ID or Mobile Number'), 2)) {
    assert true

    KeywordUtil.markPassed('Desired element is present')
} else {
    assert false

    KeywordUtil.markFailed('Desired element is not present')
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/StarBucks/Inp Enter Password'), 2)) {
    assert true

    KeywordUtil.markPassed('Desired element is present')
} else {
    assert false

    KeywordUtil.markFailed('Desired element is not present')
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/StarBucks/Lbl Login'), 2)) {
    assert true

    KeywordUtil.markPassed('Desired element is present')
} else {
    assert false

    KeywordUtil.markFailed('Desired element is not present')
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/StarBucks/Lnk Get Help'), 2)) {
    assert true

    KeywordUtil.markPassed('Desired element is present')
} else {
    assert false

    KeywordUtil.markFailed('Desired element is not present')
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/StarBucks/Txt Dont have an account'), 2)) {
    assert true

    KeywordUtil.markPassed('Desired element is present')
} else {
    assert false

    KeywordUtil.markFailed('Desired element is not present')
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/StarBucks/Txt Facing trouble logging in'), 2)) {
    assert true

    KeywordUtil.markPassed('Desired element is present')
} else {
    assert false

    KeywordUtil.markFailed('Desired element is not present')
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/StarBucks/Txt PASSWORD'), 2)) {
    assert true

    KeywordUtil.markPassed('Desired element is present')
} else {
    assert false

    KeywordUtil.markFailed('Desired element is not present')
}

if (Mobile.verifyElementVisible(findTestObject('Object Repository/StarBucks/Txt USERNAME'), 2)) {
    assert true

    KeywordUtil.markPassed('Desired element is present')
} else {
    assert false

    KeywordUtil.markFailed('Desired element is not present')
}