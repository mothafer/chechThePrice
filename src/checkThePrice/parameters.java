package checkThePrice;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class parameters {
	//MyTest
	
	WebDriver driver = new ChromeDriver();
	String mywebsite ="https://magento.softwaretestingboard.com/collections/yoga-new.html";
    String sign = "https://magento.softwaretestingboard.com/customer/account/create/";
    Random rand = new Random();
    String emails ="";
    String pass ="Molove@1";
    
    //Test1
String domainname = "@gmail.com";
	
	String[] Firstname = { "Aseel", "Basel", "hamood", "tala", "Eve", "ahamad", "ali" };
	String[]Lastname = { "sabah", "khaddash", "alodeh", "Brath", "Jabad", "Gber"};
	int randomFirst = rand.nextInt(Firstname.length);
	int randomlast = rand.nextInt(Lastname.length);
     String firstName = Firstname [randomFirst];
     String lastName = Lastname [randomlast];
     
 	String Expectedmass = "Thank you for registering with Main Website Store.";
 	    
    
    //Test2
    public void selected() throws InterruptedException {
    	WebElement sizecontainer = driver.findElement(By.cssSelector(".swatch-attribute.size"));
    	List<WebElement>  allsize= sizecontainer.findElements(By.tagName("div"));
    	int allsizenum = allsize.size();
    	int randomsize = rand.nextInt(allsizenum);
    	//System.out.println(alll.size());

    	allsize.get(randomsize).click();

    	WebElement colorcontainer = driver.findElement(By.xpath("//*[@id=\"product-options-wrapper\"]/div/div/div[2]/div"));
    	List<WebElement> allcolor = colorcontainer.findElements(By.tagName("div"));
    	int allcolornum = allcolor.size();
    	int randomcolor = rand.nextInt(allcolornum);
    	allcolor.get(randomcolor).click();
        Thread.sleep(2000);
    	WebElement ButtonAdd = driver.findElement(By.id("product-addtocart-button"));
    	ButtonAdd.click();
       Thread.sleep(3000);


    }
    public void GeneralSetup() {
    	driver.manage().window().maximize();
    	driver.get(mywebsite);
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
	}
    

}




	//Test2
	//public void selectPrice() throws InterruptedException {
		//WebElement teescont = driver.findElement(By.cssSelector(".products.wrapper.grid.products-grid"));

		//Thread.sleep(1000);

		//List<WebElement> allitem = teescont.findElements(By.tagName("li"));

		//for (int i = 0; i < Math.min(3, allitem.size()); i++) {
	 //		 allitem = teescont.findElements(By.tagName("li"));
	// 		 WebElement item = allitem.get(i);
	 		 
//	 		 item.click();
//	 		 Thread.sleep(1000); 

	 		 //selected();
	 		//	Thread.sleep(3000);
	 	//	 driver.navigate().back();
	 		 

	 //		 teescont = driver.findElement(By.cssSelector(".products.wrapper.grid.products-grid"));
	 		// Thread.sleep(2000); 
	// 	}
	
//}
	