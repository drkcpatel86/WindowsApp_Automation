package TestCalculator;

import java.net.MalformedURLException;

import java.net.URL;
 
import org.openqa.selenium.By;
 
import org.openqa.selenium.winium.DesktopOptions;
 
import org.openqa.selenium.winium.WiniumDriver;
 
public class FirstWindowAppTest {
 
public static void main(String[] args) throws MalformedURLException, InterruptedException {
 
DesktopOptions option = new DesktopOptions();
 
option.setApplicationPath("C:\\Windows\\System32\\calc.exe");

WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"), option);
Thread.sleep(5000);
driver.findElement(By.name("Three")).click();
Thread.sleep(1000);
//driver.findElement(By.id("12679")).click();
driver.findElement(By.name("Close Calculator")).click();
//driver.findElement(By.id("790350")).click();


String output = driver.findElement(By.id("CalculatorResults")).getAttribute("Name");

System.out.println("Result after addition is: "+output);
//driver.close();
}
 
}

