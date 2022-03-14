package Tronos.Paginas;

import Tronos.Steps.Botones;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;

public class Login {

    private WebDriver driver;
    private Botones botones;

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
        this.botones = new Botones(driver);
        ;
    }


    @FindBy(how = How.ID, using = "user-name")
    private WebElement UserName;

    @FindBy(how = How.ID, using = "password")
    private WebElement password;

    @FindBy(how = How.ID, using = "login-button")
    private WebElement ButtonLogin;

    @FindBy(how = How.ID, using = "period")
    private WebElement periodo;

    @FindBy(how = How.ID, using = "campus")
    private WebElement sede;

    @FindBy(how = How.ID, using = "journal")
    private WebElement jornada;

    @FindBy(how = How.XPATH, using = "//button[contains(text(),'Siguiente')]")
    private WebElement Siguiente;

    @FindBy(how = How.XPATH, using = "//span[contains(text(),'Products')]")
    private WebElement Products;

    public void StandartUser() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        ExpectedConditions.elementToBeClickable(UserName);
        UserName.clear();
        //new Select(TipoInscripcion).selectByVisibleText("Registro");
        UserName.sendKeys("standard_user");
        password.clear();
        password.sendKeys("secret_sauce");
        wait.until(ExpectedConditions.elementToBeClickable(ButtonLogin));
        ButtonLogin.click();

    }

    public void LockedUser() throws InterruptedException , IOException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        ExpectedConditions.elementToBeClickable(UserName);
        UserName.clear();
        UserName.sendKeys("locked_out_user");
        password.clear();
        password.sendKeys("secret_sauce");
        wait.until(ExpectedConditions.elementToBeClickable(ButtonLogin));
        ButtonLogin.click();

    }
    public void ProblemUser() throws InterruptedException , IOException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        ExpectedConditions.elementToBeClickable(UserName);
        UserName.clear();
        UserName.sendKeys("problem_user");
        password.clear();
        password.sendKeys("secret_sauce");
        wait.until(ExpectedConditions.elementToBeClickable(ButtonLogin));
        ButtonLogin.click();

    }

    public void PerformanceUser() throws InterruptedException , IOException {
        WebDriverWait wait = new WebDriverWait(driver, 5);
        ExpectedConditions.elementToBeClickable(UserName);
        UserName.clear();
        UserName.sendKeys("performance_glitch_user");
        password.clear();
        password.sendKeys("secret_sauce");
        wait.until(ExpectedConditions.elementToBeClickable(ButtonLogin));
        ButtonLogin.click();

    }


}
