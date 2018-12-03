package com.demoaut.newtours.certificacion.test;
//clase de corredor de prueba.
import org.junit.runner.JUnitCore; //fachada para la realización de pruebas
import org.junit.runner.notification.Failure;

public class Test {

	public static void main(String[] args) {
		//Para las pruebas de una sola vez, use el método estático runClasses(Class[])
		//agregar escuchas especiales, cree una instancia de la JUnitCore primero y úsela para ejecutar las pruebas.
		
		org.junit.runner.Result result = JUnitCore.runClasses(AllTests.class); //ejecucuion de casos de pruebas usando JUNITCORE, que toma el nombre de la clase de prueba como un parametro
		// el RESULT recopila y resume la información de la ejecución de varias pruebas. Todas las pruebas se cuentan: se recopila información adicional de las pruebas que fallan.
		for (Failure failure : result.getFailures()) {
			//procesando los resultados e imprime resultados fallidos
			System.out.println(failure.toString());
		}
		//Failure contiene una descripción de la prueba fallida y la excepción que se lanzó al ejecutarlo.
		System.out.println(result.wasSuccessful());
		//imprime resultados exitosos
	}
}
