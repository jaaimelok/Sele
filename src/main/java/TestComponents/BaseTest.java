package TestComponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import ru.stqa.selenium.framework.Landingpage;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
  public WebDriver driver;
  public Landingpage landingpage;

  public WebDriver initializeDriver() throws IOException {

    Properties prop = new Properties();
    FileInputStream fis = new FileInputStream("/Users/jaimecalderon/Desktop/sele/src/main/java/ru/stqa/selenium/resources/GlobalData.properties");
    prop.load(fis);
    String broswerName = prop.getProperty("Browser");


    if(broswerName.equalsIgnoreCase("chrome")){
      driver = new ChromeDriver();


    }
    else  if(broswerName.equalsIgnoreCase("firefox")){
      //firefox

    }

    else if(broswerName.equalsIgnoreCase("edge")){

      //edger

    }

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.manage().window().maximize();

    return driver;



    }


@BeforeMethod
    public Landingpage launchApplication() throws IOException {
    driver = initializeDriver();
      landingpage = new Landingpage(driver);
      landingpage.goURl();
      return landingpage;



    }

    @AfterMethod
  public void tearDown(){
    driver.close();
    }
}
