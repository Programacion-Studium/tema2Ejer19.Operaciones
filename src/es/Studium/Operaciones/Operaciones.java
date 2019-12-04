package es.Studium.Operaciones;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b; //números Enteros
		//Creamos el objeto que nos permite leer por teclados
		java.util.Scanner teclado = new Scanner(System.in);
		//mostramos por pantalla y recojemos un numero por teclado
		System.out.println("Introduzca el primer número");
		a = teclado.nextInt();
		System.out.println("Introduzca el segundo número");
		b = teclado.nextInt();
		teclado.close();
		System.out.println( "La suma es " + (a+b));
		System.out.println( "La resta es " + (a-b));
		System.out.println( "La multiplicacion es " + (a*b));
	    if (b!=0)
	    {
	    	System.out.println("El cociente vale " + ((double)(a)/(double)(b)));
	    }
	    else
	    {
	    System.out.println( "El denominador no puede ser 0");
	    }
	}

}
