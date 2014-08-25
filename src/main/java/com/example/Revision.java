package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Documented;

@Documented // Generar javadoc en las clases que tengan la anotaci�n
@Retention(RetentionPolicy.RUNTIME) // Para evaluarlas en tiempo de ejecuci�n
@Target(ElementType.TYPE) // Anotaci�n de clase
public @interface Revision {

	// CVS Revision
	public String revision();

}
