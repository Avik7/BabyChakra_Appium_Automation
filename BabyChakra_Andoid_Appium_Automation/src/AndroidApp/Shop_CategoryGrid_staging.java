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


public class shop_staging{
	
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
			
			System.out.println("Test Case 1:Installing babychakra apk\n");
			Thread.sleep(1000);
			
			System.out.println("Test Case 2: Selecting Language Preference\n");
			
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
			
		//Clicking on Google CTA
	        System.out.println("Test Case 3:Clicking on google CTA for Login \n");
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
			System.out.println("Test Case 4:Selecting google id\n");
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
                  System.out.println("Test Case 5: Onboarding successful");  
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
           	 
               //Posting a feedpost ie Share a moment
            
            TouchAction tc7= new TouchAction(driver);
            tc7.tap(288,505).perform();
           
      
            
          //Clicking on shop tab
            
            try {
            	
              	 System.out.println("Test Case 6: Click on shop");
      			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
      			 TouchAction tc8= new TouchAction(driver);
      	            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
       			tc8.tap(driver.findElement(By.id("app.babychakra.babychakra.staging:id/iv_events"))).perform();
       			System.out.println("Test Case 7: Shop tab working");
       			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
       			Thread.sleep(2000);
               }
               catch(Exception e)
                 {
              	 System.out.println("BUG: Not able to Click on shop");
                 }
            
            //Search for shop category view
            try
            
            {
                System.out.println("Test Case 8: Search for Shop Category Grid");
                String str= "In Store For You";
    			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+str+"\").instance(0))");			   
    			driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS); 
                }
                
            catch(Exception e)
            {
            	 System.out.println("BUG: Not able to Search for Question");
                         	
            }

            //Click on any shop category
            try
            
            {
            	 System.out.println("Test Case 9: Click on any Shop Category ");
            TouchAction tc9= new TouchAction(driver);
	            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
			tc9.tap(driver.findElement(By.name("Maternity Apparel"))).perform();
			
            }
            
            catch (Exception e)
            
            {
            	 System.out.println("Bug : Not able to click Shop Category ");
            	
            }
            
            //Click on sort
            try
            
            {
            	 System.out.println("Test Case 10: Click on sort ");
            TouchAction tc9= new TouchAction(driver);
	            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
			tc9.tap(driver.findElement(By.id("app.babychakra.babychakra.staging:id/tv_sort"))).perform();
			
            }
            
            catch (Exception e)
            
            {
            	 System.out.println("Bug : Not able to click on sort ");
            	
            }
            
            // Sort By
            
            try
            {
            

           	 System.out.println("Test Case 11 : Sort By Value");
            driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
            TouchAction tc10= new TouchAction(driver);
            tc10.tap(driver.findElement(By.name("Price - Low to High"))).perform();
            driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
            
            }
            
            catch (Exception e)
            
            {
            	 System.out.println("BUG: Sort by value not working");
            }

            // Scroll Up for Sort By
            try
            
            {
                System.out.println("Test Case 12: Scroll Up page for check Sort BY");
                String str= "Women's Round Neck Full Puff Sleeves ";
    			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\""+str+"\").instance(0))");			   
    			driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
                }
                
            catch(Exception e)
            {
            	 System.out.println("BUG: Scroll Up not working");
                         	
            }
            
            //Click on Filter
            try
            
            {
            	 System.out.println("Test Case 13: Click on Filter ");
            TouchAction tc11= new TouchAction(driver);
	            //driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);   
			tc11.tap(driver.findElement(By.id("app.babychakra.babychakra.staging:id/tv_filter"))).perform();
			
            }
            
            catch (Exception e)
            
            {
            	 System.out.println("Bug : Not able to click on Filter ");
            	
            }
            
            // Filter By Discount
            try
            {
            

           	 System.out.println("Test Case 14 : Filter By Discount");
            driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
            TouchAction tc12= new TouchAction(driver);
            tc12.tap(driver.findElement(By.name("Discount"))).perform();
            driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
            TouchAction tc13= new TouchAction(driver);
            tc13.tap(driver.findElement(By.name("10% and Above"))).perform();
            }
            
            catch (Exception e)
            
            {
            	 System.out.println("BUG: Filter by Discount not working");
            }
        
            
            // Apply Filter for Discount
            try
            {
            

           	 System.out.println("Test Case 15 : Apply Filter");
            driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
            TouchAction tc14= new TouchAction(driver);
            tc14.tap(driver.findElement(By.name("Apply Filters"))).perform();
            driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
            
            }
            
            catch (Exception e)
            {
            	 System.out.println("BUG: Not able to click on Apply Filter");
            }
           
	} 

	
 }	


			    


			
