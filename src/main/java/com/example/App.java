package com.example;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * Annotation Test
 */
public final class App {

    public static void main( String[] args ) {
        System.out.println("Testing RevisionExample...");
		
		// Obtener la clase a inspeccionar
		Class<RevisionExample> revisionExampleClass = RevisionExample.class;
		
		// Si la clase tiene la anotaci�n Revision
		if (revisionExampleClass.isAnnotationPresent(Revision.class)) {
			// Obtener la anotaci�n definida en la clase RevisionExample
			Annotation annotation = revisionExampleClass.getAnnotation(Revision.class);
			Revision revision = (Revision) annotation;
			
			// Imprimir la revision definida en la anotaci�n de la clase RevisionExample
			System.out.printf("%nRevision :%s", revision.revision());
		}
	}
}
