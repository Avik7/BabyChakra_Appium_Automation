
package AndroidApp;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

import org.openqa.selenium.By;   
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;


public class installation_staging {
	

private static AndroidDriver<MobileElement> driver;


		public static void main(String[] args) throws MalformedURLException, InterruptedException {

			//File classpathRoot = new File(System.getProperty("user.dir"));;
			//File appDir = new File(classpathRoot, "/Apps/Amazon/");
			//File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");;;
		
		
			DesiredCapabilities capabilities = new DesiredCapabilities();	
				capabilities.setCapability(CapabilityType.BROWSER_NAME, ""); 
			capabilities.setCapability("deviceName", "Moto G");
			//capabilities.setCapability("deviceName", "Lenovo A2010-a");
			capabilities.setCapability("appium-version", "1.4.16.1");
			capabilities.setCapability("platformVersion", "6.0.1");
			capabilities.setCapability("platformName", "Android");
			//capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("app", "C://Users/Admin/Downloads/app-staging-debug_2.9.8.3.apk");
			capabilities.setCapability("apppackage", "app.babychakra.babychakra.staging");
			capabilities.setCapability("appactivity", ".app.babychakra.babychakra.Activities");

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

			System.out.println("Test 1:Installing babychakra apk\n");
			
	Thread.sleep(10000);
			
			AndroidDriver<MobileElement> androidDriver = (AndroidDriver<MobileElement>)driver;
		      String act = androidDriver.currentActivity();
	          System.out.println("current activity= " +act);
	               if(act.equals(".app_revamp_v2.onboarding_v2.OnboardingActivity")==true)
	                 {
	                  System.out.println("Installation successful");  
	                 }
	              else
	                 {
	 	              System.out.println("BUG-Installation failed-'.app_revamp_v2.onboarding_v2.OnboardingActivity' was not loaded");   
	                 }	
	   
	               driver.quit();
			
		}
		
}      