package checkThePrice;

import org.testng.annotations.Test;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class MyTest extends parameters {
	
private int sum;
int number =0 ;

@BeforeTest
public void MySetUp() {
	GeneralSetup();

	
}

@Test(priority = 1)
public void Signup() throws InterruptedException {
	driver.get(sign);
	WebElement firstname = driver.findElement(By.id("firstname"));
	WebElement lastname = driver.findElement(By.id("lastname"));
	WebElement email = driver.findElement(By.id("email_address"));
	WebElement passeord = driver.findElement(By.id("password"));
	WebElement confirmpassword = driver.findElement(By.id("password-confirmation"));
	WebElement Buttoncreate = driver.findElement(By.cssSelector(".action.submit.primary"));
	 emails = firstName+lastName+domainname ;
     
	firstname.sendKeys(firstName);
	lastname.sendKeys(lastName);
	email.sendKeys(emails);
	passeord.sendKeys(pass);
	confirmpassword.sendKeys(pass);
	Buttoncreate.click();
	
	String Actualmass = driver.findElement(By.cssSelector(".page.messages")).getText();
   
	Thread.sleep(3000);
	Assert.assertEquals(Actualmass, Expectedmass);
	
}
@Test(priority = 2)
public void selectprice() throws InterruptedException {
	driver.get(mywebsite);
	//Thread.sleep(3000);
WebElement WomenCont =	driver.findElement(By.cssSelector(".level0.nav-2.category-item.level-top.parent.ui-menu-item"));
WomenCont.click();
WebElement tees = driver.findElement(By.linkText("Tees"));
tees.click();

WebElement teescont = driver.findElement(By.cssSelector(".products.wrapper.grid.products-grid"));

//Thread.sleep(1000);

List<WebElement> allitem = teescont.findElements(By.tagName("li"));

for (int i = 0; i < Math.min(3, allitem.size()); i++) {
 allitem = teescont.findElements(By.tagName("li"));
 WebElement item = allitem.get(i);
 
 item.click();
 Thread.sleep(1000); 

 selected();
	Thread.sleep(3000);
 driver.navigate().back();
 

 teescont = driver.findElement(By.cssSelector(".products.wrapper.grid.products-grid"));
// Thread.sleep(2000); 

}

Thread.sleep(3000);
}

@Test(priority = 3)
public void checkTotalItemInTheCartIs3Item() throws InterruptedException {
	WebElement cart = driver.findElement(By.cssSelector(".action.showcart"));
	cart.click();
	WebElement totalItem = driver.findElement(By.className("items-total"));
String actualText = totalItem.findElement(By.className("count")).getText();
String expectedText = "3";

WebElement pricecontainer = driver.findElement(By.cssSelector(".amount.price-container"));
String price = pricecontainer.findElement(By.className("price")).getText();
String pricee = price.replace("$","").trim();
double numm = Double.parseDouble(pricee);
//int numt = (int) numm;
//System.out.println(+numm);






WebElement allItemIncart = driver.findElement(By.id("mini-cart"));
List<WebElement> Allprice = allItemIncart.findElements(By.className("minicart-price"));
//System.out.println(Allprice.get(0).getText());
for(int i = 0 ; i < Allprice.size() ; i++) {
	 String Text = Allprice.get(i).getText();
	//System.out.println(Text);
 String test = Text.replace("$","").trim();
 double num = Double.parseDouble(test);
// int numtt = (int)num;
//sum += numtt;
System.out.println(+sum);



}

boolean actual = sum == numm;
boolean expected = true;
Assert.assertEquals(actual, expected);



  Assert.assertEquals(actualText, expectedText);
   }




}
	















