package Tronos.Paginas;

import Tronos.Steps.Botones;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmarCompra {



    private WebDriver driver;
    private Botones botones;

    public ConfirmarCompra(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.botones = new Botones(driver);
        ;
    }

    @FindBy(how = How.XPATH, using = "//button[@id='checkout']")
    private WebElement checkout;

    @FindBy(how = How.XPATH, using = "//input[@id='first-name']")
    private WebElement Name;

    @FindBy(how = How.XPATH, using = "//input[@id='last-name']")
    private WebElement LastName;

    @FindBy(how = How.XPATH, using = "//input[@id='postal-code']")
    private WebElement PostalCode;

    @FindBy(how = How.XPATH, using = " //input[@id='continue']")
    private WebElement Continue;

    @FindBy(how = How.XPATH, using = "//button[@id='finish']")
    private WebElement finish;

    @FindBy(how = How.XPATH, using = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/h2[1]")
    private WebElement Mensaje;



    public void Checkout() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        checkout.click();
        wait.until(ExpectedConditions.elementToBeClickable(Name));
        Name.clear();
        Name.sendKeys("Carlos");
        LastName.clear();
        LastName.sendKeys("De La Cruz");
        PostalCode.clear();
        PostalCode.sendKeys("1234");
        js.executeScript("arguments[0].scrollIntoView();", Continue);
        Continue.click();
        wait.until(ExpectedConditions.elementToBeClickable(finish));
        finish.click();
        js.executeScript("arguments[0].scrollIntoView();", Mensaje);
        String Text= Mensaje.getText();
        System.out.println(Text);
    }



    }




