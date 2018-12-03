package com.demoaut.newtours.certificacion.test;


import javax.naming.spi.DirStateFactory.Result;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

//con esto todas las clases de pruebas de suite comenzaran a ejecutarse.
@RunWith(Suite.class) //trae la clase.
@SuiteClasses({ NewtoursTest.class }) //clases a realizar test de prueba
public class AllTests {
	//codigo.
}
