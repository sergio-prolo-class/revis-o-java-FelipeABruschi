import java.util.Scanner;

public class Exercicio3_teste {
	public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.print("Entre com a quantidade de alunos: ");
	int alunos = teclado.nextInt();
	
	double[] notas = new double[alunos];
	
	System.out.print("Entre com a nota de cada aluno: ");
	
		for(int i = 0; i < alunos; i++) {
			notas[i] = teclado.nextDouble();
		}
		
		for(int i = 0; i < alunos - 1; i++) {
			for(int j = i + 1; j < alunos; j++) {
				double menor = notas[i];
				if(menor > notas[j]) {
					double aux = menor;
					notas[i] = notas[j];
					notas[j] = aux;
				}
			}
		}
	
		for(int i = 0; i < alunos; i++) {
			if(notas[i] >= 3) {
				System.out.print("\n");
			}
			if(notas[i] >= 6) {
				System.out.print("\n");			
			}
			if(notas[i] >= 9) {
				System.out.print("\n");			
			}
			System.out.print('*');
		}
		System.out.print("\n");
	}
}
