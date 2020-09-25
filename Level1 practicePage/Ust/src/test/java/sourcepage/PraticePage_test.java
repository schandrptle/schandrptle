package sourcepage;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import objects.PracticePage_obj;

public class PraticePage_test extends Baseclass {

	@Test
	
		public void test() throws Throwable {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			 act = new Actions(driver);
			driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
			
			PracticePage_obj.title();
			PracticePage_obj.Homepage();
			PracticePage_obj.Blinking();
			PracticePage_obj.RadioButton();
			PracticePage_obj.SuggessionClass();
			PracticePage_obj.Dropdown();
			PracticePage_obj.Checkbox();
			PracticePage_obj.SwitchWindow();
			PracticePage_obj.SwitchTab();
			PracticePage_obj.SwitchAlert();
			PracticePage_obj.ElementDisplayed();
			PracticePage_obj.Mousehover();
			PracticePage_obj.Frame();
			PracticePage_obj.Webtable();
			
			
			
	}

}
