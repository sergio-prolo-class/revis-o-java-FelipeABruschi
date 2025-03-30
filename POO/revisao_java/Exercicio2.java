import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Entre com a nota do projeto 1: ");
	double nota1 = teclado.nextDouble();
	
	System.out.print("Entre com a nota do projeto 2: ");
	double nota2 = teclado.nextDouble();
	
	System.out.print("Entre com a nota de participação: ");
	double nota_participacao = teclado.nextDouble();
	
	double cf = (nota1 * 2 + nota2 * 3) / 5 * 0.9 + nota_participacao * 0.1;
	
	if(cf >= 6){
		System.out.printf("Sua média é %.2f. Você foi aprovado!\n", cf);
	}
	else
		System.out.printf("Sua média é %.2f. Você foi reprovado!\n" , cf);
	}
}
