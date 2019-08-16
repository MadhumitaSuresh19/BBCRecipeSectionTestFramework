package stepDefinitions;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class BBCFoodRecipeStepDefinition  {

	WebDriver driver;
	
	@Given("^Open Chrome and launch the application$")
	public void open_Chrome_and_launch_the_application()  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "//C:\\chromedrivernew\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.bbcgoodfood.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Given("^I am on the home page$")
	public void i_am_on_the_home_page()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title = driver.getTitle();
		Assert.assertEquals(title, "BBC Good Food | Recipes and cooking tips");
	
	}

	@Given("^I hover over Recipe link$")
	public void i_hover_over_Recipe_link() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions

		WebElement element = driver.findElement(By.linkText("Recipes"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);

		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.linkText("Recipes"))).build().perform();
		Thread.sleep(2000);
		
	    
	}

	@When("^I click on Healthy dinner$")
	public void i_click_on_Healthy_dinner()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//ul[@class='sub-level-2']/child::li[3]/a/span[contains(text(),'Healthy dinner')]")).click();
	}

	@When("^Healthy dinner page open$")
	public void healthy_dinner_page_open()  {
	    // Write code here that turns the phrase above into concrete actions
	
		driver.manage().deleteAllCookies();
		String title = driver.getTitle();
		Assert.assertEquals(title, "Healthy dinner recipes | BBC Good Food");
	    
	}

		
	@Then("^click Spanish chicken stew text$")
	public void click_Spanish_chicken_stew_text() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		WebElement element = driver.findElement(By.linkText("Spanish chicken stew"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);

		driver.findElement(By.linkText("Spanish chicken stew")).click();
	    
	}
	@Then("^I land on Spanish chicken stew recipe page$")
	public void i_land_on_Spanish_chicken_stew_recipe_page()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println("******Spanish Page"+title);
		Assert.assertEquals(title, "Spanish chicken stew recipe | BBC Good Food");
	}

	@Then("^Close browser$")
	public void close_browser()  {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}

	@Then("^click on Tandoori trout$")
	public void click_on_Tandoori_trout() throws InterruptedException  {
	    // Write code here that turns the phrase above into concrete actions
		
		WebElement element = driver.findElement(By.linkText("Tandoori trout"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//img[contains(@alt,'Tandoori trout')]")).click();
	}


	@Then("^land on Tandoori trout recipe page$")
	public void i_land_on_Tandoori_trout_recipe_page()  {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		String titleTandoori = driver.getTitle();
		
		Assert.assertEquals(titleTandoori, "Tandoori trout recipe | BBC Good Food");
	}
	
	@Then("^look for broken link$")
	public void look_for_broken_link() {
	    // Write code here that turns the phrase above into concrete actions
		List<WebElement> links = driver.findElements(By.tagName("a")); 
		 //To print the total number of links
		 System.out.println("Total links are "+links.size()); 
		 //used for loop to 
		 for(int i=0; i<links.size(); i++) {
		 WebElement element = links.get(i);
		 //By using "href" attribute, we could get the url of the requried link
		 String url=element.getAttribute("href");
		 try {
				//Use URL Class - Create object of the URL Class and pass the urlLink as parameter 
				URL link = new URL(url);
				// Create a connection using URL object (i.e., link)
				HttpURLConnection httpConn =(HttpURLConnection)link.openConnection();
				//Set the timeout for 2 seconds
				httpConn.setConnectTimeout(2000);
				//connect using connect method
				httpConn.connect();
				//use getResponseCode() to get the response code. 
					if(httpConn.getResponseCode()== 200) {	
						System.out.println(url+" - "+httpConn.getResponseMessage());
					}
					if(httpConn.getResponseCode()== 404) {
						System.out.println(url+" - "+httpConn.getResponseMessage());
					}
				}
				//getResponseCode method returns = IOException - if an error occurred connecting to the server. 
			catch (Exception e) {
				//e.printStackTrace();
			}
		 } 
	}

	@Then("^exit browser$")
	public void exit_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.close();
	}
}
