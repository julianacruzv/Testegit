import java.util.Scanner;

public class Exerc01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        double[] notas = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }

        double soma = calcularSoma(notas);
        System.out.println("A soma das notas dos alunos é: " + soma);

        sc.close();
    }

    public static double calcularSoma(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma;
    }
}





     
		    
