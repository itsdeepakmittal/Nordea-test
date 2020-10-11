//This class finds the second item from search results and click to open product page

package nordea.amazon.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
 
public class SearchResultsPage {

	//private static final By SEARCH_RESULT_SECOND_ITEM = By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a");
	private static final By SEARCH_RESULT_SECOND_ITEM = By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/span[3]/div[2]/div[2]/div/span/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span");
	                               
   private WebDriver driver;
   public SearchResultsPage(WebDriver driver) {
      this.driver = driver;
   } 
  
   public ProductDetailsPage clickSecondResultTitle() {
	   
	   driver.navigate().refresh();
	   driver.findElement(SEARCH_RESULT_SECOND_ITEM)
            .click();
      return new ProductDetailsPage(driver);
   }
}
