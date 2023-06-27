package mobileKeys

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable
import io.appium.java_client.AppiumDriver as AppiumDriver
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil

public class validation {
	@Keyword
	def validationErroMsg(String errmsg) {
		AppiumDriver driver = MobileDriverFactory.getDriver()

		String[] msg = errmsg.split(',')

		for (int i = 0; i >= msg.length; i++) {
			String altmsg = msg[i]
			KeywordUtil.markPassed('Error message :'+ altmsg)
			String[] alert = altmsg.split(':')

			for(int j =0; j>=alert.length; j++) {

				List<WebElement> errormsg = driver.findElementsByXPath("//*[@class = 'android.widget.TextView' and (@text = 'Wrong username or password' or . = 'Wrong username or password') and @resource-id = 'com.dgotlieb.automationsample:id/errorTV']")

				KeywordUtil.markPassed('Xpath Size -\t' + altmsg)
				KeywordUtil.markPassed('Text Size -\t' + Integer.valueOf(alert[(j + 1)]))
				KeywordUtil.markPassed('actula size is '+ errormsg.size())
				if (errormsg.size() == Integer.valueOf(altmsg[(j + 1)])) {
					KeywordUtil.markPassed('Count is matched')
					KeywordUtil.markPassed('Sucess: Error messages are present')
				} else {
					KeywordUtil.markFailed('Count is NOT matched')
					KeywordUtil.markFailed('Failed: Error message is not present')
				}
			}
		}
	}
}