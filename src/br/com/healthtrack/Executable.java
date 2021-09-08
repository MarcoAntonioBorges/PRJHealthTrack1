package br.com.healthtrack;

import java.util.Locale;
import java.util.Scanner;

public class Executable {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Exercise exCalistenia = new Exercise();

		System.out.println("/////////HealthTrack/////////");
		System.out.println("-------------------------------");
		System.out.println("      Seja bem vindo(a)");
		System.out.println();

		System.out.println("Informe seus dados:");

		System.out.print("Digite seu nome: ");
		String name = sc.nextLine();

		System.out.print("Digite seu email: ");
		String email = sc.nextLine();

		System.out.print("Digite uma senha: ");
		String password = sc.nextLine();

		System.out.print("Digite sua idade: ");
		int age = sc.nextInt();

		System.out.print("Digite seu celular: ");
		int mobile = sc.nextInt();

		User user = new User(name, email, password, age, mobile);
		Evolution evolution = new Evolution();
		Plano plano = new Plano();
		
		
		user.profile();

		System.out.println("\n");
		System.out.print("Deseja efetuar o login (1-Sim / 2-Não)? ");
		int yesNo = sc.nextInt();
		user.setYesNo(yesNo);
		System.out.println("-------------------------------");

		user.yesNo();
	
		
		if (email.equals(user.getEmail()) && password.equals(user.getPassword()) && user.getYesNo() == 1) {
			System.out.println("-------------------------------");
			System.out.println("\\o/ Login efetuado! \\o/ \n");

			System.out.println("-----HealthTrack - Plano-----");
			System.out.println("-------------------------------");
			System.out.println("     Sua Pagina de Plano");
			System.out.println();
			plano.addNewRecord();
			plano.addPaymentRecord();
			plano.consultPlane();	
			evolution.yesNoEvolution();
			
			System.out.println("-------------------------------");
			System.out.print("Deseja treinar? (1-Sim / 2-Não)? ");
			int yesNoExercise = sc.nextInt();
			if (yesNoExercise == 1) {
				exCalistenia.saudacao(0);
				exCalistenia.training(15, 40, 20, 30, 30, 60, 30, 60);
			}else{
				System.out.println("By!");
			}
		
			
		} else if (email != (user.getEmail()) || password != (user.getPassword()) && user.getYesNo() == 1) {
			System.out.println();
			System.out.println("# Login negado! #\n Tente novamente.");
			System.out.println();
			user.yesNo();
			if (email.equals(user.getEmail()) && password.equals(user.getPassword()) && user.getYesNo() == 1) {
				System.out.println("-------------------------------");
				System.out.println("\\o/ Login efetuado! \\o/ \n");

				System.out.println("-----HealthTrack - Plano-----");
				System.out.println("-------------------------------");
				System.out.println("     Sua Pagina de Plano");
				System.out.println();
				plano.addNewRecord();
				plano.addPaymentRecord();
				plano.consultPlane();
				System.out.println();
				evolution.yesNoEvolution();
				
				System.out.println("-------------------------------");
				System.out.print("Deseja treinar? (1-Sim / 2-Não)? ");
				int yesNoExercise = sc.nextInt();
				if (yesNoExercise == 1) {
					exCalistenia.saudacao(0);
					exCalistenia.training(15, 40, 20, 30, 30, 60, 30, 60);
				}else{
					System.out.println("By!");
				}
				

			} else {
				System.out.println();
				System.out.println("## Bloqueado! ##\n Execute novamente.");
			}

		} else {
			System.out.println("inválido execute novamente");
		}

		sc.close();
	}
}
