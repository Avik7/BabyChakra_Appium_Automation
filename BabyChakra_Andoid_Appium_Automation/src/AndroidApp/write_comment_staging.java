package AndroidApp;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;

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


public class write_comment_staging{
	
	public static AndroidDriver<MobileElement> driver;

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

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
			capabilities.setCapability("app", "C://Users/Admin/Downloads/app-staging-debug.apk");
			capabilities.setCapability("apppackage", "app.babychakra.babychakra.staging");
			  capabilities.setCapability("appactivity", ".app.babychakra.babychakra.Activities");
			  capabilities.setCapability("autoGrantPermission", true);

			driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
       
			//New Code 
			
			System.out.println("Test 1:Installing babychakra apk\n");
			
			Thread.sleep(1000);
			
			System.out.println("Test 2: Selecting Language Preference\n");
			
			TouchAction tc1= new TouchAction(driver);
	            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
			tc1.tap(driver.findElement(By.id("app.babychakra.babychakra.staging:id/rl_language_en"))).perform();
			
			TouchAction tc2= new TouchAction(driver);
            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
		tc2.tap(driver.findElement(By.id("app.babychakra.babychakra.staging:id/tv_continue"))).perform();
					
			Thread.sleep(1000);
			
			//Clicking privacy check box
			
		    TouchAction tc3= new TouchAction(driver);
            tc3.tap(178,1150).perform();
            
            //Thread.sleep(1000);
			
		//Clicking on Google CTA.
	        System.out.println("Test 3:Clicking on google CTA for Login \n");
	       Thread.sleep(1000);    
			  try 
			    {  
			    TouchAction tc4 = new TouchAction(driver);
				//tc.tap(302,968).perform();
			    
			    // for old apk
				//tc4.tap(617,1132).perform();
			    
			    // for new apk
				tc4.tap(617,1050).perform();
				
	            }
			     
			 catch(Exception e) 
			     {
				 System.out.println("BUG : unable to click on Google CTA " + e.toString());
                 }
			    
	Thread.sleep(1000);
    //Selecting google id 
			System.out.println("Test 4:Selecting google id\n");
	Thread.sleep(1000);
			 try
			    {
				TouchAction tc5 = new TouchAction(driver);
				//tc5.tap(60,430).perform();
				tc5.tap(660,275).perform();
				//tc5.tap(driver.findElement(By.name("testingbabychakra2@gmail.com"))).perform();
//				String email = driver.findElement(MobileBy.xpath("//android.widget.CheckedTextView[@index='testuseradityah20']")).getText();
//				System.out.println(email);
//				tc1.tap(driver.findElement(MobileBy.xpath("//android.widget.CheckedTextView[@text='testuseradityah20']"))).perform();
			    }
			
			 catch(Exception e)
		        {
			    System.out.println("Bug : Google id could not be selected "+e.toString() );
		        }
			
	            //Clicking on OK
	Thread.sleep(5000);		 
	         try
	         {
			  TouchAction tc6= new TouchAction(driver);
              //tc6.tap(646,1143).perform();
              tc6.tap(driver.findElement(By.id("android:id/button1"))).perform();
	        	//
             }
						
			 catch(Exception e)
			
			  {
			  System.out.println("BUG: Clicked OK - Unable to login");
			  }
	         
	
       Thread.sleep(5000); 


	  //Verifying login success - feed load
          AndroidDriver<MobileElement> androidDriver = (AndroidDriver<MobileElement>)driver;
	      String act = androidDriver.currentActivity();
          System.out.println("current activity= " +act);
               if(act.equals(".app_revamp_v2.feed_v2.HomeActivityV2")==true)
                 {
                  System.out.println("Test 5: Onboarding successful");  
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
            
            TouchAction tc7= new TouchAction(driver);
            tc7.tap(288,505).perform();
           
      
            
          //Clicking on comment and entering comment
            try
            {
            System.out.println("Test 6: Search for Post");
            String str= "Write comment here...";
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+str+"\").instance(0))");			   
			 
            }
            
            catch(Exception e)
            {
            	 System.out.println("BUG: Not able to Search for Post");
                
            	
            }
            
            try {
            	
              	 System.out.println("Test 7: Click on Like");
      			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
      			 TouchAction tc8= new TouchAction(driver);
      	            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
       			tc8.tap(driver.findElement(By.id("app.babychakra.babychakra.staging:id/icon"))).perform();
       			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
               }
               catch(Exception e)
                 {
              	 System.out.println("BUG: Not able to Click for Like");
                 }
            
            try {
            	
           	 System.out.println("Test 8: Click on comment");
   			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
    			//driver.findElement(By.xpath("//*[@class='android.widget.ImageView'][1]")).click();
   			 TouchAction tc9= new TouchAction(driver);
   	            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
    			tc9.tap(driver.findElement(By.id("app.babychakra.babychakra.staging:id/tv_add_comment"))).perform();
    			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
            }
            catch(Exception e)
              {
           	 System.out.println("BUG: Not able to Click on comment");
              }
             
            //verifying details screen open
            try
            {     System.out.println("test 9: details page opened"); 
            	String act2 = androidDriver.currentActivity();
            	System.out.println("current activity= " +act2);
            	if(act2.equals(".app.babychakra.babychakra.app_revamp_ve.details_v2.UGCDetailFragment")==true)
            	{
                 System.out.println("details page opened"); 
            	}
            	
            	else
            	{System.out.println("Bug: Details page did not open");
            	}
            }
            catch(Exception e)
            {
            	
            	System.out.println("BUG:details screen did not open");
            }
            
            try
            {
            	 Thread.sleep(1000);
            	System.out.println("Test 10: Write a comment");
            	TouchAction tc10= new TouchAction(driver);
   	            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
    			tc10.tap(driver.findElement(By.id("app.babychakra.babychakra.staging:id/ll_post"))).perform();
    			((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.KEYCODE_1);
    			((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.KEYCODE_2);
    			((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.KEYCODE_3); 
    			((AndroidDriver) driver).pressKeyCode(AndroidKeyCode.KEYCODE_4);

            	//driver.findElement(By.id("app.babychakra.babychakra.staging:id/ll_post")).sendKeys("Testing");
            	
            	TouchAction tc11= new TouchAction(driver);
   	            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
    			tc11.tap(driver.findElement(By.id("app.babychakra.babychakra.staging:id/btn_send"))).perform();
    			//driver.findElement(By.id("driverapp.babychakra.babychakra.staging:id/btn_send")).click();
    			Thread.sleep(1000);
    			TouchAction tc12= new TouchAction(driver);
   	            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
    			tc12.tap(driver.findElement(By.id("app.babychakra.babychakra.staging:id/ivMenu_home"))).perform();
    			//driver.findElement(By.id("app.babychakra.babychakra.staging:id/ivMenu_home")).click();
              
            }
            catch(Exception e)
            {
            	
            	System.out.println("BUG:Not able to make comment");
            }
	}
}
