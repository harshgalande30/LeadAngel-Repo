package com.leadAngel.testCases;
import java.io.File;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.asynchttpclient.config.AsyncHttpClientConfigHelper.Config;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.bidi.log.LogEntry;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.leadAngel.pageObjects.LoginPage;
import com.leadAngel.utilities.ReadConfig;


import com.google.common.collect.ImmutableMap;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseClass {
    static {
        try {
            Configurator.initialize(null, "log4j2.xml");
        } catch (Exception ex) {
            // Handle here
        }
    }

    ReadConfig readconfig = new ReadConfig();
    public String baseURL = readconfig.getApplicationURL();
    public String signupURL = readconfig.getsignUpURL();
    public String verifyURL = readconfig.verifyApplicationURL();
    public String clientid = readconfig.getClientid();
    public String clientidNsso = readconfig.cidNotsso();
    public String Wclientid = readconfig.setWclientid();
    public String emailid = readconfig.getEmail();
    public String emailidstandard = readconfig.getEmailStandard();
    public String Wemailid = readconfig.getWemail();
    public String password = readconfig.getPassword();
    public String Wpassword = readconfig.getWPassword();
    public static WebDriver driver;
    private final static Logger logger = org.apache.logging.log4j.LogManager.getLogger(BaseClass.class);
    private String roleName;
    @SuppressWarnings("static-access")
    @Parameters({ "browser", "roleName" })
    @BeforeClass
    public void setup(@Optional("chrome") String br, @Optional("admin") String roleName) throws MalformedURLException, InterruptedException {
        this.roleName = roleName;
        

        if (br.equals("chrome")) {
        	
         	ChromeOptions options = new ChromeOptions();
         	options.addArguments("--remote-allow-origins=*");//without headless mode
         	//options.addArguments("--headless=new");//headless mode
           	System.setProperty("webdriver.http.factory", "jdk-http-client");
           	System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
           	//	driver = new ChromeDriver(options);//headless mode
           	driver=new ChromeDriver();//without headless mode
           	driver.manage().deleteAllCookies();
        	
        	//********************************  Use bellow code to run test case via docker ******************************
        	//            ChromeOptions options = new ChromeOptions();
        	//            options.addArguments("--no-sandbox");
        	//            options.addArguments("--headless");
        	//            options.addArguments("--disable-dev-shm-usage");
        	//            options.addArguments("--remote-debugging-port=9223");
        	//            options.addArguments("--remote-allow-origins=*");
        	//            options.addArguments("--window-size=1920,1200");
        	//            System.setProperty("webdriver.http.factory", "jdk-http-client");
        	//            System.setProperty("webdriver.chrome.driver", readconfig.getChromePath());
        	//            driver = new ChromeDriver(options);
        	//            driver.manage().deleteAllCookies();
        	//                      
        	//            Provide this path in Config.properties file "chromepath=/usr/local/bin/chromedriver"
        	//   ******************************************************************************************************         

        	// driver=new RemoteWebDriver(new URL("http://localhost:4444"),options);

        } else if (br.equals("firefox")) {
        	 Logger Logger = LogManager.getLogger(BaseClass.class);
             PropertyConfigurator.configure("Log4j.properties");
   
            System.setProperty("webdriver.gecko.driver", readconfig.getFirefoxPath());
            driver = new FirefoxDriver();
            driver.manage().deleteAllCookies();
            
        } else if (br.equals("edge")) {
            System.setProperty("webdriver.edge.driver", readconfig.getEdgePath());
            driver = new EdgeDriver();
            driver.manage().deleteAllCookies();
        }

        driver.manage().window().maximize();
        driver.get(baseURL);

        logger.info("======================================= INFORMATION ======================================");
       

        LoginPage lp = new LoginPage(driver); // Move the initialization here

        if (roleName.equals("admin")) {

        	logger.info("Login Scenario Started for ADMIN-USER");
        	logger.info(baseURL);
        	logger.info(clientid);
        	logger.info(emailid);
            lp.setClientId(clientid);
            logger.info("Entered ClientID");
            lp.setEmail(emailid);
            logger.info("Entered Email");
            lp.setPassword(password);
            logger.info("Entered Password");
            lp.clickSubmit();
            logger.info("Click on Submit");
        
        } else if (roleName.equals("standard")) {
        	logger.info("Login Scenario Started for STANDARD-USER");
            logger.info(baseURL);
            logger.info(clientid);
            logger.info(emailidstandard);
            lp.setClientId(clientid);
            logger.info("Entered ClientID");
            lp.setEmail(emailidstandard);
            logger.info("Entered Email");
            lp.setPassword(password);
            logger.info("Entered Password");
            lp.clickSubmit();
            logger.info("Click on Submit");
        }
    }

    @AfterClass
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }

    public void captureScreen(WebDriver driver, String tname) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File target = new File(System.getProperty("user.dir") + "/Screenshots/" + tname + ".png");
        FileUtils.copyFile(source, target);
        System.out.println("Screenshot Taken");
    }
}