package AndroidApp;
import io.appium.java_client.AppiumDriver;
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
import org.openqa.selenium.remote.RemoteWebDriver;

import org.testng.annotations.Test;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.AfterMethod;

public class google_login_staging_TestNG {
	
	public static AndroidDriver<MobileElement> driver;
	
	@Test (priority=0)

    public void setup() throws MalformedURLException
    {

			//File classpathRoot = new File(System.getProperty("user.dir"));
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
			  capabilities.setCapability("autoGrantPermission", true);

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
                }
			 
		@Test(priority=1)
		
		public void install() throws InterruptedException
		
		{
			//System.out.println("Test 1:Installing babychakra apk\n");
			
			Thread.sleep(10000);
			
		}
	       
		@Test(priority=2)
		
		public void GoogleCTA() throws InterruptedException
		
		{
		//Clicking on Google CTA
	        System.out.println("Test 1:CLicking on google CTA for Login \n");
	       // Thread.sleep(1000);    
			  try 
			    {  
			    TouchAction tc1 = new TouchAction(driver);
				//tc.tap(302,968).perform();
				tc1.tap(617,1132).perform();
	            }
			     
			 catch(Exception e) 
			     {
				 System.out.println("BUG : unable to click on Google CTA " + e.toString());
                 }
			    
	Thread.sleep(1000);
		}	
	@Test(priority=3)
	
	public void slectgoogle() throws InterruptedException
	
	{
			     //Selecting google id 
			System.out.println("Test 2:Selecting google id\n");
	//Thread.sleep(1000);
			 try
			    {
				TouchAction tc2 = new TouchAction(driver);
				//tc2.tap(60,430).perform();
				tc2.tap(665,460).perform();
//				String email = driver.findElement(MobileBy.xpath("//android.widget.CheckedTextView[@index='testuseradityah20']")).getText();
//				System.out.println(email);
//				tc1.tap(driver.findElement(MobileBy.xpath("//android.widget.CheckedTextView[@text='testuseradityah20']"))).perform();
			    }
			
			 catch(Exception e)
		        {
			    System.out.println("Bug : Google id could not be selected "+e.toString() );
		        }
			
	
	            //Clicking on OK
	Thread.sleep(1000);		 
	         try
	         {
			  TouchAction tc3= new TouchAction(driver);
              tc3.tap(640,950).perform();
	        	//
 
             }
			
			
			 catch(Exception e)
			
			  {
			  System.out.println("BUG: Clicked OK - Unable to login");
			  }
	         
	
Thread.sleep(5000); 
}
		    
	 @Test(priority=4)
	
	public void onboarding() throws InterruptedException
	
	{
			  //Verifying login success - feed load
          AndroidDriver<MobileElement> androidDriver = (AndroidDriver<MobileElement>)driver;
	      String act = androidDriver.currentActivity();
          System.out.println("current activity= " +act);
               if(act.equals(".app_revamp_v2.feed_v2.HomeActivityV2")==true)
                 {
                  System.out.println("Test 3: Onboarding successful");  
                 }
              else
                 {
 	              System.out.println("BUG-Onboarding failed-'.app_revamp_v2.feed_v2.HomeActivityV2' was not loaded");   
                 }		  
			 Thread.sleep(5000);
             
               
               String act1 = androidDriver.currentActivity();
               System.out.println("current activity= " +act1);
               
           	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
            //Thread.sleep(2000);
           	
          // 	TouchAction tc4= new TouchAction(driver);
           // tc4.tap(510,642).perform();
            
           //	if (driver.findElement(MobileBy.xpath("//*[@class='android.widget.Button'][1]")) != null)
          		
          //	{
           		//driver.findElement(MobileBy.xpath("//android.widget.Button[@index=1]")).click();
           		
          //	}
           	
          // 	driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
          
               //Posting a feedpost ie Share a moment
            
            TouchAction tc5= new TouchAction(driver);
            tc5.tap(288,505).perform();
           
            
            try
            {
            System.out.println("Test 4: Seach for Interest");
            String str= "Write answer here...";
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+str+"\").instance(0))");			   
			 
            }
            
            catch(Exception e)
            {
            	 System.out.println("BUG: Not able to Seach for Interest");
                
            	
            }
            
            try {
            	
            	 System.out.println("Test 5: Click for Interest");
            	// String str1 = driver.findElement(By.name("1 Interested")).getText();
     			//System.out.println("Like count :" + str1);
    			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
     			//driver.findElement(By.xpath("//*[@class='android.widget.ImageView'][1]")).click();
    			 TouchAction tc6= new TouchAction(driver);
    	            tc6.tap(29,568).perform();
    	            driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
     			String str2 = driver.findElement(By.name("1 Interested")).getText();
    			System.out.println("After Click Interested, current Interested count :" + str2);
    		  
            	
            }
              

            catch(Exception e)
            {
            	 System.out.println("BUG: Not able to Click for Interested");
                
            	
            }
			
			
		}
	 
	 
//	 @AfterMethod
//	 
//	 public void end ()
//	 
//	 {
//		 driver.quit();
//
//	 }
}
		


			    


			
