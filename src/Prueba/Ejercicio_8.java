package Prueba;

import java.util.Random;

public class Ejercicio_8 {public static void main(String[] args) {
	
	
	Integer carta,palo;
	Random numcarta=new Random();
	Random numpalo=new Random();
	
	carta=(numcarta.nextInt(13)+1);
	palo=(numpalo.nextInt(4)+1);
	char  picas='♠', corazones='♥', diamantes='♦', tréboles='♣';
	String sota="sota", reina="reina", rey="rey";
	
 if ((carta<=10) && (palo==1)) {
	 System.out.printf("%d %c %n", carta, picas);
	 }
 else if ((carta==11) && (palo==1)) {
	 System.out.printf("%s %c %n",sota, picas);
	 }
 else if ((carta==12) && (palo==1)) {
	 System.out.printf("%s %c %n",reina, picas);
	 }
 else if ((carta==13) && (palo==1)) {
	 System.out.printf("%s %c %n",rey, picas);
	 }
 else if ((carta<=10) && (palo==2)) {
	 System.out.printf("%d %c %n", carta, corazones);
	 }
 else if ((carta==11) && (palo==2)) {
	 System.out.printf("%s %c %n",sota, corazones);
	 }
 else if ((carta==12) && (palo==2)) {
	 System.out.printf("%s %c %n",reina, corazones);
	 }
 else if ((carta==13) && (palo==2)) {
	 System.out.printf("%s %c %n",rey, corazones);
	 }
 else if ((carta<=10) && (palo==3)) {
	 System.out.printf("%d %c %n", carta, diamantes);
	 }
 else if ((carta==11) && (palo==3)) {
	 System.out.printf("%s %c %n",sota, diamantes);
	 }
 else if ((carta==12) && (palo==3)) {
	 System.out.printf("%s %c %n",reina, diamantes);
	 }
 else if ((carta==13) && (palo==3)) {
	 System.out.printf("%s %c %n",rey, diamantes);
	 }
 else if ((carta<=10) && (palo==4)) {
	 System.out.printf("%d %c %n", carta, tréboles);
	 }
 else if ((carta==11) && (palo==4)) {
	 System.out.printf("%s %c %n",sota, tréboles);
	 }
 else if ((carta==12) && (palo==4)) {
	 System.out.printf("%s %c %n",reina, tréboles);
	 }
 else if ((carta==13) && (palo==4)) {
	 System.out.printf("%s %c %n",rey, tréboles);
	 }
 else System.out.println("No hay carta disponible");
 
 }
	
	
 }



