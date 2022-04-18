package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Campeão A
		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String name = sc.next();

		System.out.print("Vida inicial: ");
		int vida = sc.nextInt();

		System.out.print("Ataque: ");
		int ataque = sc.nextInt();

		System.out.print("Armadura: ");
		int armadura = sc.nextInt();

		Champion championA = new Champion(name, vida, ataque, armadura);

		// Campeão B
		System.out.println();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		name = sc.next();

		System.out.print("Vida inicial: ");
		vida = sc.nextInt();

		System.out.print("Ataque: ");
		ataque = sc.nextInt();

		System.out.print("Armadura: ");
		armadura = sc.nextInt();

		Champion championB = new Champion(name, vida, ataque, armadura);

		System.out.println();
		System.out.print("Quantos turnos você deseja executar? ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			championA.takeDamage(championB);
			championB.takeDamage(championA);

			System.out.println();
			System.out.printf("Resultado do turno " + i + ":%n");
			System.out.println(championA.status());
			System.out.println(championB.status());

			if (championA.getLife() < 0 || championB.getLife() < 0) {
				i = n;
				System.out.println();
				System.out.println("Fim do Combate!");
			}

			if (i == n) {
				System.out.println();
				System.out.println("Fim do Combate!");
			}
		}

		sc.close();
	}

}
