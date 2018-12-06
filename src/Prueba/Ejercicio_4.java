package Prueba;

import java.util.Scanner;

public class Ejercicio_4 {public static void main(String[] args) {
	
	Scanner keyboard= new Scanner(System.in);
	
	Integer distancia, dias;
	
	System.out.println("introuduzca la distancia del recorrido en Km");
	distancia=keyboard.nextInt();
	System.out.println("Introduzca los dias que durará el viaje");
	dias=keyboard.nextInt();
	keyboard.close();
	
	
	if ((distancia>0) & (dias<7)) {System.out.println("precio= "+distancia*0.35);}
	else if ((distancia>1000) & (dias>7)) {System.out.println(("precio= "+((distancia*0.35)-(distancia*0.35)*0.30))+"€");}
	
	
}

}
