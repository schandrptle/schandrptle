package objects;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import sourcepage.Baseclass;

public class PracticePage_obj extends Baseclass {
	
	public static By Radiobuttons=By.xpath("//div[@id='radio-btn-example']//label");
	public static By radio1=By.xpath("//div[@id='radio-btn-example']//label[1]//input[1]");
	public static By radio2=By.xpath("//div[@id='radio-btn-example']//label[2]//input[1]");
    public static By radio3=By.xpath("//div[@id='radio-btn-example']//label[3]//input[1]");
    public static By Suggession=By.xpath("//input[@id='autocomplete']");
    public static By dropdown=By.xpath("//select[@id='dropdown-class-example']");
    public static By Checkboxe=By.xpath("//div[@id='checkbox-example']//label//input[@type='checkbox']");
    public static By Switchwindow=By.xpath("//button[@id='openwindow']");
    public static By Switchtab=By.xpath("//a[@id='opentab']");
    public static By entername=By.xpath("//input[@id='name']");
    public static By Alert=By.xpath("//input[@id='alertbtn']");
    public static By Confirm=By.xpath("//input[@id='confirmbtn']");
    public static By showorhide=By.xpath("//input[@id='displayed-text']");
    public static By show=By.xpath("//input[@id='show-textbox']");
    public static By hide=By.xpath("//input[@id='hide-textbox']");
    public static By mousehover=By.xpath("//button[@id='mousehover']");
    public static By Top=By.xpath("//a[contains(text(),'Top')]");
    public static By Reload=By.xpath("//a[contains(text(),'Reload')]");
    public static By login=By.xpath("//a[@class='theme-btn register-btn']");
    public static By Allheader=By.xpath("//div[@class='block large-row-spacer']//tr[1]//th");
    public static By blinking=By.xpath("//a[@class='blinkingText']");
    public static By Home=By.xpath("//button[contains(text(),'Home')]");
    public static By row=By.xpath("//tr");
    public static By colunm=By.xpath("//td");
    

	public static void title() {
		//Get the Title, print & verify  the WebPage
		
		String title=driver.getTitle();
		
		System.out.println("Title :" +title);
		
		if (title.equals("Practice Page")) {
			System.out.println("title verified successfully");
		} else {
			System.out.println("title not verified successfully");
		}
		System.out.println("========================================================================");

		
	}
public static void Homepage() throws Throwable {
		//click on home button and verify 
		driver.findElement(Home).click();
		Thread.sleep(5000);
		Set<String> windows=driver.getWindowHandles();
		 ArrayList<String> AllWindowHandles  = new ArrayList<String> (windows);

		 driver.switchTo().window(AllWindowHandles.get(0));
		if(driver.findElement(login).isDisplayed())
		{
			
		System.out.println( "homepage is verifed ");
		}else{
		System.out.println( "homepage is not verifed ");
		
		Thread.sleep(5000);
		
		
		}
		
		System.out.println("========================================================================");

		
	}


	public static void RadioButton() throws InterruptedException {
		
		List<WebElement> Radiobutton = driver.findElements(Radiobuttons);
		
		   //print the total Radiobuttons
		System.out.println( " No.of Radiobuttons :" + Radiobutton.size());
		Thread.sleep(5000);
		//select radiobutton2 and verify
try{
			
			driver.findElement(radio2).click();
			if(driver.findElement(radio2).isSelected())
			{
				
			System.out.println( "Radiobutton is selected ");
			}
			else
			{
			System.out.println( "Radiobutton is not selected ");
			}
			
			}
			catch (Exception e) {
	            e.printStackTrace();
	        }
		System.out.println("========================================================================");

	}

	public static void SuggessionClass() {
		//click on suggesion and enter some text and verify whether it is suggesting or not
		driver.findElement(Suggession).click();
		
		driver.findElement(Suggession).sendKeys("ind");
		act.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN).click().build().perform();
		
		if(driver.findElement(Suggession).isDisplayed())
		{
			
		System.out.println( "SuggessionClass is selected ");
		}
		else
		{
		System.out.println( "SuggessionClass is not selected ");
		}
	
		System.out.println("========================================================================");
}

	public static void Dropdown() {
		// Identify   & print dropdown values  
		driver.findElement(dropdown).click();

		List<WebElement> droplist = driver.findElements(By.tagName("option"));
		System.out.println("No.Dropdown values:" +droplist.size());

				for (int i = 0; i<droplist.size(); i++) {
					System.out.println("DropdownList :" +droplist.get(i).getText());
				}
				
				//Select and print the value from list
		Select s = new Select(driver.findElement(dropdown));
		s.selectByIndex(2);
		String  selected_value=s.getFirstSelectedOption().getText();
		System.out.println("selected_value  :"+selected_value);
				if (selected_value.equals("Option2")) {
					System.out.println("selected value  verified successfully");
				} else {
					System.out.println("selected value not verified successfully");
				}

				System.out.println("========================================================================");

		
	}

	public static void Checkbox() {
		   // select &verify  all Checkboxes 
		List<WebElement> checkBoxes = driver.findElements(Checkboxe);
		
		System.out.println("No.Checkboxes:" +checkBoxes.size());
		for(int i=0; i<checkBoxes.size(); i++)
		{ 
		checkBoxes.get(i).click();
		if(checkBoxes.get(i).isSelected())
		{
		System.out.println(i+" Option is selected ");
		}else{
		System.out.println(i+" Option is not selected ");
		}
		}
		
		System.out.println("========================================================================");

	}

	public static void SwitchWindow() {
		driver.findElement(Switchwindow).click();
		
        Set<String> windows=driver.getWindowHandles();
        
        
        System.out.println("No.Windows :" +windows.size());
        
        
        ArrayList<String> AllWindowHandles  = new ArrayList<String> (windows);

      //Switch & Print to new child window
        driver.switchTo().window(AllWindowHandles.get(1));
        
        System.out.println( "Child window Title :" +driver.getTitle());
        driver.switchTo().window(AllWindowHandles.get(0));
        System.out.println("========================================================================");

		
	}

	public static void SwitchTab() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(Switchtab).click();
		Set<String> window=driver.getWindowHandles();
    
			        //By creating  ArrayList object , can store no of  window based  dynamically
			        ArrayList<String> AllWindowHandles  = new ArrayList<String> (window);

			      //Switch to new Tab
			        driver.switchTo().window(AllWindowHandles.get(2));
			        
			        //print the new tab title
			        System.out.println("NewTab:" +driver.getTitle());
			        
			        //driver.findElement(login).click();
			        if(driver.findElement(login).isDisplayed())
					{
						
					System.out.println( "New tab is opened succesfully");
					}else{
					System.out.println( "New tab is not opened ");
					}
			        driver.switchTo().window(AllWindowHandles.get(0));
			        System.out.println("========================================================================");
				
	}
			        
	

	public static void SwitchAlert() throws Throwable {
		//Enter the name &confirm
		driver.findElement(entername).sendKeys("Ust");
		Thread.sleep(5000);
		driver.findElement(Confirm).click();
		//switchTo alert ,get the alert text and store the the alert text in  alert_text variable

		String alert_text=driver.switchTo().alert().getText();

		System.out.println("Print alert text   :"+alert_text);

		//verify alert text
		if(alert_text.equals("Hello Ust, Are you sure you want to confirm?"))
		{
			System.out.println("alert text verified successfully");
		}else
		{
			System.out.println("alert text not verified successfully");
		}
		//click on ok button
		driver.switchTo().alert().accept();
		System.out.println("========================================================================");

	}

	public static void ElementDisplayed() {
		driver.findElement(showorhide).sendKeys("Hi Ust");
		driver.findElement(show).click();
		
		if(driver.findElement(show).isDisplayed())
		{
			
		System.out.println( "Element is displayed ");
		}else{
		System.out.println( "Element is hidden ");
		}
		System.out.println("========================================================================");
	
	}

	public static void Mousehover() {
		//move to mousehover,then move to top & verify action is performed
		act.moveToElement(driver.findElement(mousehover)).build().perform();
		act.moveToElement(driver.findElement(Top)).build().perform();
		
		
	       String tooltip=driver.findElement(Top).getText();
	        
	        System.out.println("text in tooltip  :" +tooltip);
	        
	       if(tooltip.equals("Top"))
	        {
	        	System.out.println("Top  of tooltip is verified successfully");
	        }else
	        {
	        	System.out.println("Top of tooltip not verified successfully");
	        }
	        driver.findElement(Top).click();
	        
	        System.out.println("========================================================================");
	    	

		
	}

	public static void Frame() {
		List<WebElement> total_frames=driver.findElements(By.tagName("iframe"));
		
		System.out.println("No.Frames  :" +total_frames.size());
		driver.switchTo().frame(total_frames.get(0));
		//print and verify the text from frame
		String text=driver.findElement(login).getText();

		System.out.println(" Text in frame   :"+text);

		//verify alert text
		if(text.equals("LOGIN"))
		{
			System.out.println("Text in frame verified successfully");
		}else
		{
			System.out.println("Text in frame  not  verified successfully");
		}
		
		driver.switchTo().defaultContent();
		System.out.println("========================================================================");

	}

	public static void Webtable() {
		List allHeadersOfTable = new ArrayList(); 
		List<WebElement> allHeaders= driver.findElements(Allheader);
		System.out.println("Headers in table are below:");
		System.out.println("Total headers found: "+allHeaders.size());
		for(WebElement header:allHeaders)
		{
			System.out.println(header.getText());
		}
		System.out.println("***************");
		
		// Finding number of rows& columns in a web table. We need to exclude header to get actual number of data rows
					List allRows= driver.findElements(row);
					System.out.println("Total  rows found in table:"+ (allRows.size()-1));

					
					List allcolumns= driver.findElements(colunm);
					System.out.println("Total colonums found in table:"+ (allcolumns.size()-1));
					System.out.println("***************");
					
//data of 6th row
		List<WebElement> colValue= driver.findElements(By.xpath("//tr[7]"));
		for(WebElement col:colValue)
		{
		System.out.println( "6th row : "+col.getText());
		}
		System.out.println("========================================================================");

		
	}

	public static void Blinking() {
		driver.navigate().back();
		WebElement blink =driver.findElement(blinking);
		if (blink.isDisplayed())
		{
		      System.out.println("blinking text is verifed successfully");
		}
		else
		{
			System.out.println("blinking text is  not verifed successfully");
		}
		System.out.println("========================================================================");

	}

	
	

}
