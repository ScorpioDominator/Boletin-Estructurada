package Prueba;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio_7 {

	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner (System.in);
		String cadena;
		Random numAl = new Random();
		int número;
		char carácter;
		
		System.out.println("escribe una cadena de texto");
		cadena=keyboard.nextLine();
		keyboard.close();
		número=numAl.nextInt(cadena.length());
		
		carácter=cadena.charAt(número);
		
		System.out.printf("su cadena es %s cuya posición es %d y su valor es %c", cadena, (número+1), carácter);
	}

}
