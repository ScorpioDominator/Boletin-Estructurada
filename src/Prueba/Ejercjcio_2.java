package Prueba;

import java.util.Scanner;

public class Ejercjcio_2 {
	public static void main(String[] args) {
		
		Scanner keyboard= new Scanner (System.in);
		int x, y;
		
		System.out.println("introduce el primer número");
		x=keyboard.nextInt();
		System.out.println("Introduce el segundo número");
		y=keyboard.nextInt();
		keyboard.close();
		
		if (x%y==0) {System.out.println("el primer número es múltimplo del segundo");
		}
		else {System.out.println("el primer número no es múltiplo del segundo");
		}
	}
}

