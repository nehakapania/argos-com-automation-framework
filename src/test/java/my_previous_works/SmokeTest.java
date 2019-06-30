//package my_previous_works;
//
//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.Select;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Random;
//import java.util.concurrent.TimeUnit;
//
//public class SmokeTest {
//
//    WebDriver driver;
//
//    @Before
//    public void setUp() {
//        driver = new FirefoxDriver();
//        driver.get("https://www.argos.co.uk/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//    }
//
////    @After
////    public void closeBrowser() {
////        driver.quit();
////    }
//
//    @Test
//    public void doSearch() {
//        driver.findElement(By.name("searchTerm")).sendKeys("nike" + Keys.ENTER);
//        selectAPrice("£15 - £20");
//        // getAllSelectedPriceProducts();
//        sortByPrice("Price: Low - High");
//        addToTrolley();
//        List<Double> actualList=getAllSelectedPriceProducts();
//        Double maximum= Collections.max(actualList);
//        Double minimum=Collections.min(actualList);
//        System.out.println(maximum);
//        System.out.println(minimum);
//
//    }
//
//
//    public void selectAPrice(String customerSelectedPrice) {
//
//        List<WebElement> selectedPrices = driver.findElements(By.cssSelector(".ac-facet__filters--default .ac-facet__label--default"));
//        // List<String> price=new ArrayList<String>();
//
//        for (WebElement selectedPrice : selectedPrices) {
//            //selectedPrice.getAttribute("data-filter-id");
//            //System.out.println(selectedPrice);
//            if (selectedPrice.getText().equalsIgnoreCase(customerSelectedPrice)) {
//                selectedPrice.click();
//                break;
//            }
//
//
//        }
//
//    }
//    public List<Double> getAllSelectedPriceProducts()
//    {
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//   List<Double> allProducts=new ArrayList<Double>();
//   List<WebElement> allProductRange=driver.findElements(By.cssSelector(".ac-product-price__amount"));
//
//        for (WebElement allProductRanges:allProductRange)
//        {
//        String priceInString=allProductRanges.getText().replaceFirst("£"," ");
//        System.out.println(priceInString);
//            double exactPrice=Double.parseDouble(priceInString);
//            allProducts.add(exactPrice);
//                    System.out.println(allProducts);
//        }
//         return allProducts;
//
//        }
//   // Sorting product according to low to high range of prices
//
//    public void sortByPrice(String value) {
//        WebElement sort = driver.findElement(By.cssSelector(".form-control.sort-select"));
//
//        Select dropDown = new Select(sort);   // Using select class selecting low to high from dropdown
//        dropDown.selectByVisibleText(value);
//
//
//    }
//
//    //Adding a product to trolley with random class(random class selects product automatically)
//
//    public void addToTrolley() {
//        List<WebElement> elementsList = driver.findElements(By.cssSelector(".ac-product-card__cta-row"));
//        Random random = new Random();
//        int randomProduct = random.nextInt(elementsList.size());
//        elementsList.get(randomProduct).click();
//        //  elementsList.get(4).click();
//        driver.findElement(By.linkText("Go to Trolley")).sendKeys(Keys.ENTER);
//        // WebElement expected=driver.findElement(By.cssSelector("[aria-label=\"Nike Premier League Strike Size 5 Football\"]"));
//
//    }
////@Test
////     public void run()
////{
////    driver.findElement(By.name("searchTerm")).sendKeys("nike" + Keys.ENTER);
////    selectAPrice("£15 - £20");
////    checkPriceOnProducts();
////}
////    //Checking all the selected prices of products are within a given range
////
////    public void checkPriceOnProducts() {
////        List<WebElement> priceOfProducts = driver.findElements(By.cssSelector(".ac-product-price__amount"));
////
////        for (WebElement priceOfProduct : priceOfProducts)
////        {
////            System.out.println(priceOfProducts);
////        }
////           // String price = priceOfProduct.getAttribute("data-filter-id");
////
////
////        }
//    }
//
//
//
//
//
