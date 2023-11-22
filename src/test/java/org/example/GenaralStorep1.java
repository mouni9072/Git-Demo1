package org.example;


	
	import org.example.TestUtils.AndroidBaseTest;
	import org.openqa.selenium.By;
	import org.testng.AssertJUnit;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import io.appium.java_client.AppiumBy;
	import io.appium.java_client.android.Activity;
	public class GenaralStorep1 extends AndroidBaseTest {
	@BeforeMethod
	public void preSetup()
	{
	//screen to home page
	Activity activity = new Activity("com.androidsample.generalstore", "com.androidsample.generalstore.MainActivity");
	driver.startActivity(activity);
	}
	@Test
	public void FillForm_ErrorValidation() throws InterruptedException
	{
	driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("Mounika");
	driver.hideKeyboard();
	driver.findElement(By.xpath("//android.widget.RadioButton[@text='Female']")).click();
	driver.findElement(By.id("android:id/text1")).click();
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Argentina\"));"));
	driver.findElement(By.xpath("//android.widget.TextView[@text='Argentina']")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	driver.quit();
	}
	}
