package Tronos.Definitions;

import Tronos.Paginas.ConfirmarCompra;
import Tronos.Paginas.Login;
import Tronos.Paginas.SeleccionarProducto;
import Tronos.Steps.Botones;
import Tronos.Steps.Conexion;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;


public class DefinitionsSteps {

	private WebDriver driver;
	private Conexion conexion = new Conexion();
	private Botones botones = new Botones(driver);
	private Login login = new Login(driver);
	private SeleccionarProducto seleccionarProducto = new SeleccionarProducto(driver);
	private ConfirmarCompra confirmarCompra= new ConfirmarCompra(driver);


	@Given("^abrir el navegador$")
	public void abrir_navegador()  {
		this.conexion = new Conexion();
	this.driver = this.conexion.abrirNavegador();
	}


	@When("^Login de usuario Standart$")
	public void Login_de_usuario_Standart() throws Throwable {
		this.login = new Login(driver);
		this.login.StandartUser();
		this.botones = new Botones(driver);
		this.botones.ConfirmLogin();
	}

	@When("^Login de usuario locked$")
	public void Login_de_usuario_Locked() throws Throwable {
		this.login = new Login(driver);
		this.login.LockedUser();
		this.botones = new Botones(driver);
		this.botones.ConfirmLogin();
	}

	@When("^Login de usuario problem$")
	public void Login_de_usuario_Problem() throws Throwable {
		this.login = new Login(driver);
		this.login.ProblemUser();
		this.botones = new Botones(driver);
		this.botones.ConfirmLogin();
	}

	@When("^Login de usuario performance$")
	public void Login_de_usuario_performance() throws Throwable {
		this.login = new Login(driver);
		this.login.PerformanceUser();
		this.botones = new Botones(driver);
		this.botones.ConfirmLogin();
	}

	@Then("^Seleccionar producto Sauce Labs Fleece Jacket$")
	public void Seleccionar_producto_Sauce_Labs_Fleece_Jacket() throws Throwable {
		this.seleccionarProducto= new SeleccionarProducto(driver);
		this.seleccionarProducto.FleeceJacket();
		this.botones = new Botones(driver);
		this.botones.Confirmcheckout();

	}

	@And("^Confirmar compra$")
	public void Confirmar_compra() throws Throwable {
		this.confirmarCompra= new ConfirmarCompra(driver);
		this.confirmarCompra.Checkout();
	}





}




