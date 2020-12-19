package docker_project.docker_test;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class DockerChromeTest 
{
    /**
     * Rigorous Test :-)
     * @throws MalformedURLException 
     */
    @Test
    public void shouldAnswerWithTrue() throws MalformedURLException
    {
    	URL url = new URL("http://localhost:4444/wd/hub");
    	DesiredCapabilities dc = DesiredCapabilities.chrome();
        RemoteWebDriver driver = new RemoteWebDriver(url, dc);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Title is "+driver.getTitle());
        
    }
}
