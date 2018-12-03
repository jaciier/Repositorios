package com.demoaut.newtours.certificacion.test;
//clase de corredor de prueba.
import org.junit.runner.JUnitCore; //fachada para la realizaci�n de pruebas
import org.junit.runner.notification.Failure;

public class Test {

	public static void main(String[] args) {
		//Para las pruebas de una sola vez, use el m�todo est�tico runClasses(Class[])
		//agregar escuchas especiales, cree una instancia de la JUnitCore primero y �sela para ejecutar las pruebas.
		
		org.junit.runner.Result result = JUnitCore.runClasses(AllTests.class); //ejecucuion de casos de pruebas usando JUNITCORE, que toma el nombre de la clase de prueba como un parametro
		// el RESULT recopila y resume la informaci�n de la ejecuci�n de varias pruebas. Todas las pruebas se cuentan: se recopila informaci�n adicional de las pruebas que fallan.
		for (Failure failure : result.getFailures()) {
			//procesando los resultados e imprime resultados fallidos
			System.out.println(failure.toString());
		}
		//Failure contiene una descripci�n de la prueba fallida y la excepci�n que se lanz� al ejecutarlo.
		System.out.println(result.wasSuccessful());
		//imprime resultados exitosos
	}
}
