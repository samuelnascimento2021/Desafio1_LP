package Exercicios_Desafio1;
import java.util.Scanner;

public class Exercicio1_Desafio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		int a, b, c;
		
		System.out.println("Insira o primeiro lado do tri�ngulo");
		a = ler.nextInt();
		System.out.println("Insira o segundo lado do tri�ngulo");
		b = ler.nextInt();
		System.out.println("Insira o terceiro lado do tri�ngulo");
		c = ler.nextInt();
		
		if(a>0 && b>0 && c>0 && (a+b)>=c && (a+c)>=b && (b+c)>=a) {
		
			if(a == b && b==c) {
				System.out.println("O tri�ngulo � equil�tero");
			}
			else if(a == b || b == c || a == c) {
				System.out.println("O tri�ngulo � is�sceles");
			}
			else {
				System.out.println("O tri�ngulo � escaleno");
			}
		}
		
		else {
			System.out.println("Valores inv�lidos");
		}
	}

}
