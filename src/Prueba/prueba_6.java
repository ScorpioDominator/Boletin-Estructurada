package Prueba;

import java.util.Scanner;

public class prueba_6 {public static void main(String[] args) {
	
	Scanner keyboard= new Scanner(System.in);
	
	int horas;
	String festivo, horario, dia="diurno", noc="nocturno", s="si", n="no";
	
	System.out.println("¿Qué horario de trabajo es?");
	horario=keyboard.nextLine();
	System.out.println("¿Cuantas horas se han trabajado?");
	horas=keyboard.nextInt();
	keyboard.nextLine();
	System.out.println("¿Es festivo?");
	festivo=keyboard.nextLine();
	keyboard.close();
	
	if ((horario.equals(dia) && (horas>0) && (festivo.equals(n)))) {
		System.out.println(horas*3);
		}
	else if ((horario.equals("nocturno")) && (horas>0) && (festivo.equals("no")))  {
		System.out.println(horas*4.80);
		}
	else if ((horario.equals("diurno")) && (horas>0) && (festivo.equals("si")))  {
		System.out.println((horas*3)+(horas*1.20));
		}
	else if ((horario.equals("nocturno")) && (horas>0) && (festivo.equals("si")))  {
		System.out.println((horas*4.80)+(horas*1.80));
		}
	else {
		System.out.println("Es usted un impresentable");
	}
	
	}
}
