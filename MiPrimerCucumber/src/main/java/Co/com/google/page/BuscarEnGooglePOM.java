package Co.com.google.page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit; //instancia de libreria para traer metodo pause.

public class BuscarEnGooglePOM {
	private WebDriver Daniel;//Instanciacion un objeto de tipo webdriver
	
	
	public void UbicarControlador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		//el controlador para chrome se encuentra en la direccion que se le espeficica
	}
	
	public void AbrirNavegador() {
		
		Daniel = new ChromeDriver(); //webdriver, para inicializar el navegador
		Daniel.get("http://www.Google.com"); //Esta sentencia es para abrir el sitio (necesitando el URL para la ejecucion)
	
	}
	
	public void RealizarBusqueda(String busqueda) {
		Daniel.findElement(By.name("q")).sendKeys(busqueda);
		
	}
	public void Reproducir() {
		Daniel.findElement(By.id("video-title")).click();
		
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
	public void MetodoAssert() {
		String WebElement = "Google";
		String webElements = Daniel.getTitle();
		//WebElement MyWebElement = Daniel.findElement(By.id("logo-icon-container"));
		assert webElements.equals(WebElement);
		
	}
	public void Pause() {
		//Maximizar la ventana del navegador
		Daniel.manage().window().maximize() ;
		Daniel = new ChromeDriver();
		Daniel.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public String TraerElemento(String element) {
		WebElement id= Daniel.findElement(By.xpath(element));  //Para capturar el texto de un elemento mostrado en pantalla
		return id.getText();
	}
	
}
