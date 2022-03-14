package Tronos.Paginas;

import Tronos.Steps.Botones;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleccionarProducto {


    private WebDriver driver;
    private Botones botones;

    public SeleccionarProducto(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.botones = new Botones(driver);
        ;
    }

    @FindBy(how = How.XPATH, using = "//div[normalize-space()='Sauce Labs Fleece Jacket']")
    private WebElement FleeceJacket;

    @FindBy(how = How.XPATH, using = "(//button[normalize-space()='Add to cart'])[1]")
    private WebElement Add;

    @FindBy(how = How.XPATH, using = "//a[@class='shopping_cart_link']")
    private WebElement shopping_cart;



    public void FleeceJacket(){

        WebDriverWait wait = new WebDriverWait(driver,5);
        wait.until(ExpectedConditions.elementToBeClickable(FleeceJacket));
        FleeceJacket.click();
        wait.until(ExpectedConditions.elementToBeClickable(Add));
        Add.click();
        wait.until(ExpectedConditions.elementToBeClickable(shopping_cart));
        shopping_cart.click();
    }


}
