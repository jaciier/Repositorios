package com.procinal.certification.cinema.utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebBrowser {
	
	public static void changeTab(int indice, WebDriver navegador) {
		// Iniciamos la variable con un valor nulo
		String idDeVentana = null;
		// Luego creamos una nueva referencia a la coleccion de ventanas
		// que maneja nuestro driver ó navegador
		Set<String> coleccionDeIdsDeVentanas = navegador.getWindowHandles();
		// Tambien creamos un iterador que nos ayuda a iterar sobre colecciones,
		// en este caso, nos ayudara con la que hemos creado anteriormente
		Iterator<String> iterador = coleccionDeIdsDeVentanas.iterator();
		// Iteramos desde 1 hasta el valor que nos asigne el indice
		for(int i = 1; i <= indice; i++) {
			// Asignamos la id de la ventana correspondiente cada vez que
			// hagamos una iteracion
			idDeVentana = iterador.next();
		}
		//Por ultimo hacemos el cambio de ventana
		navegador.switchTo().window(idDeVentana);
	}
}
