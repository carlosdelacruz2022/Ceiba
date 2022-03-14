package Tronos.Steps;

import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Botones {

    private WebDriver driver;






    public Botones(WebDriver driver)  {

        PageFactory.initElements(driver, this);
        this.driver = driver;

    }


    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Products')]")
    private WebElement Products;

    @Step
    public void ConfirmLogin() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        try {
            if(Products.isDisplayed()){
                System.out.println("se ha iniciado sesión de manera exitosa");
            }
            else{
            }

        } catch (Exception e) {
            System.out.println("No es posible iniciar sesion");
        }
        wait.until(ExpectedConditions.visibilityOf(Products));
    }

    @FindBy(how = How.XPATH, using = "//button[@id='checkout']")
    private WebElement checkout;

    @Step
    public void Confirmcheckout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        try {
            if(checkout.isDisplayed()){
                System.out.println("Se cargó laa pagina de checkout");
            }
            else{
            }

        } catch (Exception e) {
            System.out.println("No se cargó laa pagina de checkout");
        }
        wait.until(ExpectedConditions.visibilityOf(checkout));
    }

}
