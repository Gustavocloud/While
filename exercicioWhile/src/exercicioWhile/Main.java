package exercicioWhile;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int senha = 0;

		System.out.println("Digite a sua senha:");
		senha = sc.nextInt();

		while (senha != 2002) {

			System.out.println("Digite novamente:");
			senha = sc.nextInt();

		}

		System.out.println("Senha correta!");

	}

}
