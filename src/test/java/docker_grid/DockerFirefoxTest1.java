package docker_grid;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class DockerFirefoxTest1 
{
    /**
     * Rigorous Test :-)
     * @throws MalformedURLException 
     */
    @Test
    public void dockerFirefox1() throws MalformedURLException
    {
    	URL url = new URL("http://localhost:4444/wd/hub");
    	DesiredCapabilities dc = DesiredCapabilities.firefox();
        RemoteWebDriver driver = new RemoteWebDriver(url, dc);
        driver.get("https://www.google.com/");
        System.out.println("Title is "+driver.getTitle());
        
    }
}
