package Prueba;

import java.util.Scanner;

public class Ejercicio_5 {public static void main(String[] args) {
	
	Scanner keyboard= new Scanner(System.in);
	
	int horas;
	boolean festivo, horario;
	
	System.out.println("¿Es horario de dia?");
	horario=keyboard.nextBoolean();
	System.out.println("¿Cuantas horas se han trabajado?");
	horas=keyboard.nextInt();
	System.out.println("¿Es festivo?");
	festivo=keyboard.nextBoolean();
	keyboard.close();
	
	if ((horario==true) & (horas>0) & (festivo==false))  {
		System.out.println(horas*3);
		}
	else if ((horario==false) & (horas>0) & (festivo==false))  {
		System.out.println(horas*4.80);
		}
	else if ((horario==true) & (horas>0) & (festivo==true))  {
		System.out.println((horas*3)+(horas*1.20));
		}
	else if ((horario==false) & (horas>0) & (festivo==true))  {
		System.out.println((horas*4.80)+(horas*1.80));
		}
	else {
		System.out.println("Entrada errónea");
	}
	
	}
}


