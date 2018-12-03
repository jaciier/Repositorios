package com.demoaut.newtours.certificacion.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import com.demoaut.newtours.certificacion.pages.NewtourLoginPOM;

public class NewtoursTest {
	NewtourLoginPOM inicio = new NewtourLoginPOM();
	@Before
	public void setUp() throws Exception {
		//Ubicar el controlador
		//el controlador para chrome se encuentra en la direccion que se le espeficica

		inicio.UbicarControlador();
		inicio.AbrirNavegador();
	}

	@After //anotacion, etiqueta o tag. Sirve para inyectar còdigo.
	public void tearDown() throws Exception { 
		
	}

	@Test //parte fundamental para el Test Suite.
	public void test() {
		//fail("Not yet implemented");
		// Mètodo para realizar busqueda en navegador.
		inicio.RealizarBusqueda();
	}

}

//refactorizar para reducir codigo y hacerlo mas entendible.






/*
//WebDriver Daniel;//Instanciacion un objeto de tipo webdriver
	NewtourLoginPOM inicio = new NewtourLoginPOM();
	@Before
	public void setUp() throws Exception {
		//PASO 2 : Ubicar el controlador
		//el controlador para chrome se encuentra en la direccion que se le espeficica
	//	System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
	//	Daniel = new ChromeDriver(); //webdriver, para inicializar el navegador
	//	Daniel.get("http://www.google.com"); //Esta sentencia es para abrir el sitio (necesitando el URL para la ejecucion)
		inicio.UbicarControlador();
		inicio.AbrirNavegador();
	}

	@After //anotacion, etiqueta o tag. Sirve para inyectar còdigo.
	public void tearDown() throws Exception {
		
	//	Daniel.close();
	}

	@Test
	public void test() {
	//ESTO ES TDD.
		//PASO 4: Valor a buscar y esperar resultados
	//	Daniel.findElement(By.name("q")).sendKeys("Salsa");
	//	Daniel.findElement(By.id("lst-ib")).sendKeys(Keys.ESCAPE);
	//	Daniel.findElement(By.name("btnK")).click();
	//	Daniel.findElement(By.id("gsr")).click();
		//fail("Not yet implemented");
		
		inicio.RealizarBusqueda();
	}
	*/
