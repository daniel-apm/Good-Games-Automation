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
import com.kms.katalon.core.appium.driver.AppiumDriverManager
import io.appium.java_client.android.AndroidDriver
import org.openqa.selenium.remote.DesiredCapabilities
import com.kms.katalon.core.mobile.driver.MobileDriverType

String userName = System.getenv("BROWSERSTACK_USERNAME");
String accessKey = System.getenv("BROWSERSTACK_ACCESS_KEY");
String buildName = System.getenv("BROWSERSTACK_BUILD_NAME");
String app = System.getenv("BROWSERSTACK_APP_ID");

DesiredCapabilities caps = new DesiredCapabilities();
caps.setCapability("app", app);
caps.setCapability("device", "Samsung Galaxy S8");
caps.setCapability("build", buildName);
driver = new AndroidDriver(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub", caps));

Mobile.waitForElementPresent(findTestObject('Object Repository/android.widget.ImageButton - Profile'), 60)
Mobile.delay(1)
Mobile.tap(findTestObject('Object Repository/android.widget.ImageButton - Profile'), 60)
Mobile.delay(1)
Mobile.tap(findTestObject('Object Repository/android.widget.Button - RATE THIS APP'), 60)
Mobile.delay(3)
Mobile.pressBack()
Mobile.delay(1)
Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Search'), 60)
Mobile.delay(1)
Mobile.pressBack()
Mobile.delay(1)
Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Search game here'), 'Apex Legends', 0)
Mobile.delay(1)
Mobile.tap(findTestObject('Object Repository/android.widget.LinearLayout - Search Result'), 60)
Mobile.delay(1)
Mobile.scrollToText('BUY OR DOWNLOAD THIS GAME')
Mobile.delay(1)
Mobile.pressBack()
Mobile.delay(1)
Mobile.pressBack()
Mobile.delay(1)
Mobile.closeApplication()