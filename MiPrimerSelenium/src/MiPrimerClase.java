//PASO 1: Realizar Imports, ¡estudiar explicaciones!
import org.openqa.selenium.chrome.ChromeDriver; //especificar, abrir, seleccionar controlador, navegador
import org.openqa.selenium.WebDriver; //controlador, usar la clase para manipular
import org.openqa.selenium.By; //localizar, realziar busqueda (id, name, xpath)
//nunca .* al final de estas sentencia
public class MiPrimerClase {

	public static void main(String[] args) {
		//PASO 2 : Ubicar el controlador
		//el controlador para chrome se encuentra en la direccion que se le espeficica
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Daniel = new ChromeDriver();//Instanciacion del navegador, webdriver
		//Se abre el navegador con RUN AS, Javaplications
		
		// --------------------------------------------------------------
		//Acontinuacion vamos al URL
		// PASO 3: Poner URL con protocolo
		Daniel.get("http://www.google.com"); //Esta sentencia es para abrir el sitio (necesitando el URL para la ejecucion)
		
		//PASO 4: Valor a buscar y esperar resultados
		Daniel.findElement(By.name("q")).sendKeys("Suso");
	}

}
