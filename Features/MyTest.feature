
Feature: Realización de casos ingresando nombre de usuario y contraseña
  Scenario: Verificación de ingreso de sesion
    Given Abrir Chrome
    When ingresa Username "usuario1" y Password "usuario1"
    Then inicia sesion

  Scenario: Ingreso de nombre de usuario y contraseña incorrecto
    Given Abrir Chrome
    When ingresa Username "xusuario" y Password "x12345"
    Then inicia sesion

  Scenario: Ingresar valores vacíos
    Given Abrir Chrome
    When ingresa Username "" y Password ""
    Then inicia sesion

WebDriver driver;

@Given("Abrir Chrome")
public void abrir_Chrome(){
	System.out.println("En este paso abre el navegador google chrome");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admn\\Downloads\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://ced.iplacex.cl/login/index.php");
}

@When("ingresa Username {string} y Password {string}")
public void ingresa_Username_y_Password(String string, String string2){
	System.out.println("En este paso ingresa las credenciales del usuario");
	System.setProperty("Este paso ingresa el nombre de usuario y contraseña en la pagina de login");
	driver.findElement(By.id("username")).sendKeys(string);
	driver.findElement(By.id("password")).sendKeys(string2);
}

@Then("inicia sesion")
public void inicia_sesion(){
	System.out.println("En este paso inicia sesion con los datos ingresados desde nuestro archivo Mytest.feature");
	driver.findElement(By.id("loginbtn")).click();
}

	