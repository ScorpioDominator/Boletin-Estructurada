package Prueba;

import java.util.Scanner;

public class Ejercicio_3 {
	public static void main(String[] args) {
		
		Scanner keyboard=new Scanner(System.in);
		int x, y, z;
		
		System.out.println("introduce el primer número");
		x=keyboard.nextInt();
		System.out.println("introduce el segundo número");
		y=keyboard.nextInt();
		System.out.println("introduce el tercer número");
		z=keyboard.nextInt();
		keyboard.close();
		
		if ((x==y) & (x==z)) {System.out.println("hay tres números iguales a " + x);}
		
		else if ((x==y) & (x!=z)) {System.out.println("hay dos números iguales a " +x);}
		
		else if ((x!=y) & (y==z)) {System.out.println(("hay dos números iguales a " +y));}
		
		else if ((x==z) & (y!=z)) {System.out.println("hay dos números iguales a " +x);}
		
		else {System.out.println("no hay números iguales");}
}

}
