package exercicio01;
import java.util.*;

class Soma {
	public static Scanner sc = new Scanner(System.in);
	
	public static void main(String args[]) {
		//Declaração de variaveis
		
		int num1, num2, soma;
		
		//leituras
		
		System.out.print("Digite um numero: ");
		num1 = sc.nextInt();
		System.out.print("Digite outro numero: ");
		num2 = sc.nextInt();
		
		//somar
		soma = num1 + num2;
		
		//mostra na tela o resultado
		System.out.println("soma " + soma);
	}
}
