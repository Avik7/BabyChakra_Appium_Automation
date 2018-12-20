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

public class facebook_login_staging {

		private static AndroidDriver driver;
		public static void main(String[] args) throws MalformedURLException, InterruptedException {

			///File classpathRoot = new File(System.getProperty("user.dir"));
			//File appDir = new File(classpathRoot, "/Apps/Amazon/");
			//File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");;

			DesiredCapabilities capabilities = new DesiredCapabilities();	
				capabilities.setCapability(CapabilityType.BROWSER_NAME, ""); 
			//capabilities.setCapability("deviceName", "Moto G");
			capabilities.setCapability("deviceName", "MI 3W");
			//capabilities.setCapability("deviceName", "Lenovo A2010-a");
			capabilities.setCapability("appium-version", "1.4.16.1");
			capabilities.setCapability("platformVersion", "6.0.1");
			//capabilities.setCapability("platformVersion", "5.1");
			capabilities.setCapability("platformName", "Android");
			//capabilities.setCapability("app", app.getAbsolutePath());
			capabilities.setCapability("app", "C://Users/Admin/Downloads/app-staging-debug.apk");
			capabilities.setCapability("apppackage", "app.babychakra.babychakra.staging");
			  capabilities.setCapability("appactivity", "app.babychakra.babychakra.Activities");

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
			
			System.out.println("Test 1:Installing babychakra apk\n");
			
			Thread.sleep(10000);
			
	     
	            //Clicking on Google CTA
	        System.out.println("Test 2:CLicking on Facebook CTA \n");
	        Thread.sleep(1000);
			  try 
			    {  
			    TouchAction tc = new TouchAction(driver);
				tc.tap(283,868).perform();
	            }
			     
			 catch(Exception e) 
			     {
				 System.out.println("BUG 1: unable to click on facebook CTA " + e.toString());
                 }
			    
	Thread.sleep(1000);
			
			     //Selecting google id 
			System.out.println("Test 3:Selecting google id\n");
	Thread.sleep(1000);
			 try
			    {
				TouchAction tc1= new TouchAction(driver);
				tc1.tap(60,430).perform();
			    }
			
			 catch(Exception e)
		        {
			    System.out.println("Google id could not be selected "+e.toString() );
		        }
			
	
	            //Clicking on OK
	Thread.sleep(1000);		 
	         try
	         {
			  TouchAction tc2= new TouchAction(driver);
              tc2.tap(520,912).perform();
             }
			
			
			 catch(Exception e)
			
			  {
			  System.out.println("BUG: Clicked OK - Unable to login");
			  }
////Thread.sleep(1000);         
//		    
//			  //Verifying login success - feed load
//          AndroidDriver<MobileElement> androidDriver = (AndroidDriver<MobileElement>)driver;
//	      String act = androidDriver.currentActivity();
//          System.out.println("current activity= " +act);
//               if(act.equals("app.babychakra.babychakra.app_revamp_v2.onboarding_v2.OnboardingActivity")==true)
//                 {
//                  System.out.println("Onboarding successful");  
//                 }
//              else
//                 {
// 	              System.out.println("BUG-Onboarding failed-'app.babychakra.babychakra.app_revamp_v2.onboarding_v2.OnboardingActivity' was not loaded");   
//                 }		  
//			     
			
   // driver.quit();
			    
}
}			
