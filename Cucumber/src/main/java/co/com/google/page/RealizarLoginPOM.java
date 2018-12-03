package co.com.google.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RealizarLoginPOM {
	
	private WebDriver Daniel;//Instanciacion un objeto de tipo webdriver
	
	
	public void Controlador() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//el controlador para chrome se encuentra en la direccion que se le espeficica
	}
	
	public void AbrirPagina() {
		
		Daniel = new ChromeDriver(); //webdriver, para inicializar el navegador
		Daniel.get("http://www.hoteles.com"); //Esta sentencia es para abrir el sitio (necesitando el URL para la ejecucion)
	
	}
	
	public void RealizarBusquedadLogin() {
		Daniel.findElement(By.id("hdr-account")).click();
		Daniel.findElement(By.id("hdr-signin")).click();
		
	}
	public void IngresarDatoUsuario(String usuario) {
		Daniel.findElement(By.name("email")).sendKeys(usuario);;
		
	}
	public void IngresarDatoContraseña(String passwoord) {
	
		Daniel.findElement(By.name("password")).sendKeys(passwoord);
	//	Daniel.findElement(By.type("submit")).click();
		
	}
	public void CerrarNavegador() {
		Daniel.close(); //cerrar la prueba
	}
	public void Localizar() {
		Daniel.findElement(By.id("lst-ib")).sendKeys(Keys.ESCAPE); //localizar el proceso que vamos a realizar
		
	}
	public void HacerClic() {
		Daniel.findElement(By.name("btnK")).click();
		Daniel.findElement(By.id("gsr")).click();
	}

}
