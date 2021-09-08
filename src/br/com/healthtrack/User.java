package br.com.healthtrack;

import java.util.Calendar;
import java.util.Scanner;

public class User {
	Calendar calendar = Calendar.getInstance();
	Scanner sc = new Scanner(System.in);

	// atributos
	private String name;
	private String email;
	private String password;
	private int age;
	public int mobile;

	private int yesNo;

	//construtor
	public User(String name, String email, String password, int age, int mobile) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.age = age;
		this.mobile = mobile;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public int getMobile() {
		return age;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public void setYesNo(int yesNo) {
		this.yesNo = yesNo;
	}

	public int getYesNo() {
		return yesNo;
	}
	
	

	//metodo para exibir os dados
	public void profile() {
		System.out.println();
		System.out.printf("Usuário cadastrado%n");
		System.out.println("------------------");
		System.out.printf("Nome: " + getName() 
		+ " | Email: " + getEmail() 
		+ " | Idade: " + getAge() 
		+ " | Celular: " + getMobile());
	}

	//metodo para aceitar entrar
	public void yesNo() {
		if (getYesNo() == 1) {
			System.out.print("Digite seu email: ");
			email = sc.nextLine();
			System.out.print("Digite sua senha: ");
			password = sc.nextLine();

		} else {
			System.out.println("Até a próxima!");
		}
	}
}
