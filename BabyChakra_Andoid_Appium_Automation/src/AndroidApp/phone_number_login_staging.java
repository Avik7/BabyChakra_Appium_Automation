package AndroidApp;
		
			import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
			import java.io.File;
			import java.net.MalformedURLException;
			import java.net.URL;
			import java.util.concurrent.TimeUnit;
			import java.util.Scanner;

import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
            import org.openqa.selenium.remote.CapabilityType;
			import org.openqa.selenium.remote.DesiredCapabilities;

			public class phone_number_login_staging {

					private static AndroidDriver driver;
					public static void main(String[] args) throws MalformedURLException, InterruptedException {

						//File classpathRoot = new File(System.getProperty("user.dir"));;
						//File appDir = new File(classpathRoot, "/Apps/Amazon/");
						//File app = new File(appDir, "in.amazon.mShop.android.shopping.apk");;;

						DesiredCapabilities capabilities = new DesiredCapabilities();	
						capabilities.setCapability(CapabilityType.BROWSER_NAME, ""); 
						//capabilities.setCapability("deviceName", "Samsung Galaxy S4");
						//capabilities.setCapability("deviceName", "Moto G");
						capabilities.setCapability("deviceName", "MI 3W");
						capabilities.setCapability("appium-version", "1.4.16.1");
						//capabilities.setCapability("platformVersion", "5.0.1");
						capabilities.setCapability("platformVersion", "6.0.1");
						capabilities.setCapability("platformName", "Android");
						//capabilities.setCapability("app", app.getAbsolutePath());
						capabilities.setCapability("app", "C://Users/Admin/Desktop/app-staging-debug.apk");
						capabilities.setCapability("apppackage", "app.babychakra.babychakra.staging");
						//capabilities.setCapability("appActivity", "");
						capabilities.setCapability("appactivity", "app.babychakra.babychakra.Activities");
						

						driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
						driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
						
						System.out.println("Test 1: Installing babychakra apk\n");
						Thread.sleep(2000);
						
						try 
						    {  
						
							//System.out.println("Checking sign in through Phone Number\n");
							System.out.println("Test 2: Clicking on Phone Number CTA \n");
							//System.out.println("Checking sign in through Google\n");
							Thread.sleep(5000);
							driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
							//driver.findElement(By.name("Phone Number")).click();
							//driver.switchTo().parentFrame();
							//driver.findElement(By.id("app.babychakra.babychakra.staging:id/llGoogleContainer")).click();
							TouchAction tc1= new TouchAction(driver);
				            tc1.tap(242,768).perform();
				            
	
						    }
						
						catch(Exception e)
						
						    {
							System.out.println("BUG: unable to Click on Phone Number CTA \n");
						    }
						try
						
						{   Thread.sleep(1000);
							System.out.println("Test 3: Selecting India Code \n");
							//TouchAction tc2 = new TouchAction(driver);
				            //tc2.tap(48,328).perform();
				            
				            Select sc1 = new Select(driver.findElement(By.id("app.babychakra.babychakra.staging:id/com_accountkit_country_code_image")));
				            sc1.selectByVisibleText("+91");
				            
						}    
						
						catch (Exception e)
						
						{
							System.out.println("BUG: unable to Select India Code \n");
						
						}
						
						
						try
						{
						  
							System.out.println("Test 3: Entering Phone Number\n");
							Thread.sleep(1000);
							TouchAction tc3 = new TouchAction(driver);
				            tc3.tap(48,328).perform();
							driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
							System.out.println("Enter phone number");
							Scanner sc1 = new Scanner (System.in);
							String f1 = sc1.nextLine();
							driver.findElement(By.id("app.babychakra.babychakra.staging:id/com_accountkit_phone_number")).sendKeys(f1);
							driver.findElement(By.name("Next")).click();
							
							Thread.sleep(1000);
							
							System.out.println("Enter Code for first box\n");
							Scanner sc2 = new Scanner (System.in);
							String f2 = sc2.nextLine();
							driver.findElement(By.id("app.babychakra.babychakra.staging:id/com_accountkit_confirmation_code_1")).sendKeys(f2);
							
							System.out.println("Enter Code for second box\n");
							Scanner sc3 = new Scanner (System.in);
							String f3 = sc3.nextLine();
							driver.findElement(By.id("app.babychakra.babychakra.staging:id/com_accountkit_confirmation_code_2")).sendKeys(f3);
							
							System.out.println("Enter Code for third box\n");
							Scanner sc4 = new Scanner (System.in);
							String f4 = sc4.nextLine();
							driver.findElement(By.id("app.babychakra.babychakra.staging:id/com_accountkit_confirmation_code_3")).sendKeys(f4);
							
							System.out.println("Enter Code for fourth box\n");
							Scanner sc5 = new Scanner (System.in);
							String f5 = sc5.nextLine();
							driver.findElement(By.id("app.babychakra.babychakra.staging:id/com_accountkit_confirmation_code_4")).sendKeys(f5);
							
							System.out.println("Enter Code for fifth box\n");
							Scanner sc6 = new Scanner (System.in);
							String f6 = sc6.nextLine();
							driver.findElement(By.id("app.babychakra.babychakra.staging:id/com_accountkit_confirmation_code_5")).sendKeys(f6);
							
							System.out.println("Enter Code for sixth fox\n");
							Scanner sc7 = new Scanner (System.in);
							String f7 = sc7.nextLine();
							driver.findElement(By.id("app.babychakra.babychakra.staging:id/com_accountkit_confirmation_code_6")).sendKeys(f6);
							
						    }
						
						catch(Exception e)
						
						    {
							System.out.println("BUG: Phone Number Not Valid");
						    }
						driver.findElement(By.id("app.babychakra.babychakra.staging:id/et_name")).sendKeys("baby");
						driver.findElement(By.id("app.babychakra.babychakra.staging:id/tv_planningbaby")).click();
						driver.findElement(By.id("app.babychakra.babychakra.staging:id/tv_submit")).click();
						driver.findElement(By.id("app.babychakra.babychakra.staging:id/rb_planning_three_months")).click();
						driver.findElement(By.id("app.babychakra.babychakra.staging:id/tv_getstarted")).click();
						driver.findElement(By.id("app.babychakra.babychakra.staging:id/tv_skip")).click();
						
						driver.quit();

				}
 
	}
