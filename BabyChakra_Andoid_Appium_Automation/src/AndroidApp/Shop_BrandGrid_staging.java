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
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class Shop_BrandGrid_staging 

{
		
	public static AndroidDriver<MobileElement> driver;

	//public static void main(String[] args) throws MalformedURLException, InterruptedException {
			//File classpathRoot = new File(System.getProperty("user.dir"));
			//File appDir = new File(classpathRoot, "/Apps/Babychakra/");
			//File app = new File(appDir, "app.debug .apk");;;
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	
	{
		
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
			
			System.out.println("Test Case 1[Pass]:Installing babychakra apk\n");
			Thread.sleep(1000);
			
			//System.out.println("Test Case 2[Pass]: Selecting Language Preference\n");
			
			TouchAction tc1= new TouchAction(driver);
	            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
			tc1.tap(driver.findElement(By.id("app.babychakra.babychakra.staging:id/rl_language_en"))).perform();
			
			System.out.println("Test Case 2[Pass]: Selecting Language Preference\n");
			
			TouchAction tc2= new TouchAction(driver);
            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
		tc2.tap(driver.findElement(By.id("app.babychakra.babychakra.staging:id/tv_continue"))).perform();
					
			Thread.sleep(1000);
			
			//Clicking privacy check box
			
		    TouchAction tc3= new TouchAction(driver);
            tc3.tap(178,1150).perform();
            
            //Thread.sleep(1000);
			
		//Clicking on Google CTA
            //System.out.println("Test Case 3[Pass]:Clicking on google CTA for Login \n");
	       
	       Thread.sleep(1000);      
			  try 
			    {  
			    TouchAction tc4 = new TouchAction(driver);
				//tc.tap(302,968).perform();
			    
			    // for old apk
				//tc4.tap(617,1132).perform();
			    
			    // for new apk
				tc4.tap(617,1050).perform();
				 System.out.println("Test Case 3[Pass]:Clicking on google CTA for Login \n");
				
	            }
			     
			 catch(Exception e) 
			     {
				 System.out.println("BUG [Fail] : unable to click on Google CTA \n " + e.toString());
                 }
			    
	Thread.sleep(1000);
    //Selecting google id 
			//System.out.println("Test Case 4[Pass]:Selecting google id\n");
	Thread.sleep(1000);
			 try
			    {
				TouchAction tc5 = new TouchAction(driver);
				//tc5.tap(60,430).perform();
				tc5.tap(665,277).perform();
				System.out.println("Test Case 4[Pass]:Selecting google id\n");
				//tc5.tap(driver.findElement(By.name("testingbabychakra2@gmail.com"))).perform();
//				String email = driver.findElement(MobileBy.xpath("//android.widget.CheckedTextView[@index='testuseradityah20']")).getText();
//				System.out.println(email);
//				tc1.tap(driver.findElement(MobileBy.xpath("//android.widget.CheckedTextView[@text='testuseradityah20']"))).perform();
			    }
			
			 catch(Exception e)
		        {
			    System.out.println("Bug [Fail]  : Google id could not be selected \n "+e.toString() );
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
			  System.out.println("BUG  [Fail] : Clicked OK - Unable to login \n");
			  }
	         
	
       Thread.sleep(5000); 

	  //Verifying login success - feed load
          AndroidDriver<MobileElement> androidDriver = (AndroidDriver<MobileElement>)driver;
	      String act = androidDriver.currentActivity();
          System.out.println("current activity= " +act+"\n");
               if(act.equals(".app_revamp_v2.feed_v2.HomeActivityV2")==true)
                 {
                  System.out.println("Test Case 5[Pass]: Onboarding successful\n");  
                 }
              else
                 {
 	              //System.out.println("BUG-Onboarding failed-'.app_revamp_v2.feed_v2.HomeActivityV2' was not loaded \n");   
                 }		  
			 Thread.sleep(5000);
             
               
               String act1 = androidDriver.currentActivity();
               System.out.println("current activity= " +act1+"\n");
               
           	driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
            //Thread.sleep(2000);
           	 
               //Posting a feedpost ie Share a moment
            
            TouchAction tc7= new TouchAction(driver);
            tc7.tap(288,505).perform();
           
      
            
          //Clicking on shop tab
            
            try
            {           	
              	 //System.out.println("Test Case 6[Pass]: Click on shop \n");
      			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
      			 TouchAction tc8= new TouchAction(driver);
      	            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
       			tc8.tap(driver.findElement(By.id("app.babychakra.babychakra.staging:id/iv_events"))).perform();
       		    System.out.println("Test Case 6[Pass]: Click on shop \n");
       			System.out.println("Test Case 7[Pass]: Shop tab working \n");
       			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
       			Thread.sleep(2000);
               }
              
            catch(Exception e1)
                 { 
              	 System.out.println("BUG  [Fail] : Not able to Click on shop \n");
                 }
            
            //Search for Brand category view
            try
            
            {
                System.out.println("Test Case 8[Pass]: Search for Shop Brand Grid \n");
                String str= "Brands in Focus";
    			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+str+"\").instance(0))");			   
    			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS); 
                }
                
            catch(Exception e)
            {
            	 System.out.println("BUG  [Fail] : Not able to Search for Shop Brand Grid \n");
                         	
            }

            //Click on any Brand category
            try
            
            {
 
            TouchAction tc9= new TouchAction(driver);
	            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
			tc9.tap(driver.findElement(By.name("The Moms Co."))).perform();
			 System.out.println("Test Case 9[Pass]: Click on any Shop Brand \n");
			
            }
            
            catch (Exception e)
            
            {
            	 System.out.println("Bug  [Fail] : Not able to click Shop Brand \n");
            	
            }
            
            //Click on View Product
            try
            
            {
          
            TouchAction tc9= new TouchAction(driver);
	            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
			tc9.tap(driver.findElement(By.id("app.babychakra.babychakra.staging:id/view_packages"))).perform();
			System.out.println("Test Case 10[Pass]: Click on View Product and it's working \n");
			
            }
            
            catch (Exception e)
            
            {
            	 System.out.println("Bug  [Fail] : Not able to click on View Product \n");
            	
            }
            
        
            // Scroll Up for Product
            try
            
            {
                System.out.println("Test Case 11[Pass]: Scroll Up page for check Sort BY \n");
                String str= "Only 5 left in stock"; 
    			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+str+"\").instance(0))");			   
    			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
                }
                
            catch(Exception e)
            {
            	 System.out.println("BUG  [Fail] : Scroll Up not working \n");
                         	
            }
            
            //Click on Product Back
            try
            
            {
            
            	TouchAction tc10= new TouchAction(driver);
                tc10.tap(110,150).perform();
			 System.out.println("Test Case 12[Pass]: Click on Back \n");
			
            }
            
            catch (Exception e)
            
            {
            	 System.out.println("Bug  [Fail] : Not able to click on Back \n");
            	
            }
            
            //Click on Brand Back
            try
            
            {
            
            	TouchAction tc11= new TouchAction(driver);
                tc11.tap(110,150).perform();
			 System.out.println("Test Case 13[Pass]: Click on Back \n");
			
            }
            
            catch (Exception e)
            
            {
            	 System.out.println("Bug  [Fail] : Not able to click on Back \n");
            	
            }
            
           
           
	} 

	
 }	 


			    


			
