//package my_previous_works;
//
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.concurrent.TimeUnit;
//
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.core.IsEqual.equalTo;
//
//public class Argos01
//{
//    WebDriver driver;
//
//@Before
//    public void setup()
//{
//    driver=new FirefoxDriver();
//    driver.get("https://www.argos.co.uk/");
//    driver.manage().window().maximize();
//    driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//}
//
////@After
////public void closebrowser()
////{
////    driver.quit();
////}
//
//@Test
//      public void search()
//{
//      driver.findElement(By.xpath("//input[@id='searchTerm']")).sendKeys("nike" + Keys.ENTER);
//      String actual = driver.findElement(By.cssSelector(".search-title__term")).getText();
//      String expected = "nike";
//      Assert.assertEquals(expected, actual);
//      System.out.println("The Expected result = Actual Result");
//      assertThat(actual, is(equalTo("nike")));
//      System.out.println("Hamcrest Assertion expected=actual");
//
//}
//@Test
//     public void execute()
//{
//     rating("4 or more");
//     System.out.println("4 or more is highlighted");
//     List<Double> actualList=getAllRatingOnFilteredProduct();
//     System.out.println(actualList);
//}
//
//      public void rating(String customerrating)
//      {
//          driver.findElement(By.xpath("//input[@id='searchTerm']")).sendKeys("nike" + Keys.ENTER);
//          // driver.findElement(By.cssSelector("label[for=filter-customer-rating-4-or-more]")).click();
//          //  System.out.println("All four star products are highlighted");
//          List<WebElement> reviewrating = driver.findElements(By.cssSelector(".ac-facet__filters--rating .ac-facet__filter--rating "));
//
//          for (WebElement reviewratingelement : reviewrating)
//          {
//              if (reviewratingelement.getText().equalsIgnoreCase(customerrating))
//              {
//                  reviewratingelement.click();
//                  break;
//              }
//          }
//
//
//}
//
//  public List<Double> getAllRatingOnFilteredProduct()
//{
//     try {
//         Thread.sleep(3000);
//     }
//     catch (InterruptedException e)
//     {
//         e.printStackTrace();
//
//     }
//    List<Double> collectedRating = new ArrayList<Double>();
//    List<WebElement> reviewrating = driver.findElements(By.cssSelector(".ac-star-rating"));
//    for (WebElement reviewRatings : reviewrating)
//    {
//        String ratingInString = reviewRatings.getAttribute("data-star-rating");
//        Double ratingInDouble = Double.parseDouble(ratingInString);
//        collectedRating.add(ratingInDouble);
//    }
//
//
//    return collectedRating;
//}
//}
