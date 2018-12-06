package Prueba;

import java.util.Scanner;

public class Ejercicio_6 {public static void main(String[] args) {
	
Scanner keyboard= new Scanner(System.in);
	
	int x,y,z;
	
	System.out.println("el primer número");
	x=keyboard.nextInt();
	System.out.println("el segundo número");
	y=keyboard.nextInt();
	System.out.println("el tercer número");
	z=keyboard.nextInt();
	keyboard.close();
	
	
	if ((x>=y) & (x>=z) & (y>z)) {
		System.out.printf("%d %d %d %n", z, y, x);
		}
	else if ((x>=y) & (z>=y) & (x>=z)) {
		System.out.printf("%d %d %d %n", y, z, x);
	}
	else if ((y>=x) & (y>=z) & (x>=z)) {
		System.out.printf("%d %d %d %n", z, x, y);
		}
	else if ((y>=x) & (y>=z) & (z>=x)) {
		System.out.printf("%d %d %d %n", x, z, y);
		}
	else if ((z>=x) & (z>=y) & (x>=y)) {
		System.out.printf("%d %d %d %n", y, x, z);
		}
	else if ((z>=x) & (z>=y) & (y>=x)) {
		System.out.printf("%d %d %d %n", x, y, z);
		}
	else {
		System.out.println("la has liado bien parda para que te salga este error, crack");
	}
	
}

}

