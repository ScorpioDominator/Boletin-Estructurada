package Prueba;

import java.util.Scanner;

public class Ejercicio_1 {
	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner (System.in);
		
		int number;
		
		System.out.println("introduce un número");
		number=keyboard.nextInt();
		keyboard.close();
		
		if (number==0) {System.out.println("Es igual a 0");}
		
		else if(number>0) {System.out.println("Es mayor que 0");}
		
		else if (number<0) {System.out.println("es menor que 0");}
	}
	

}
