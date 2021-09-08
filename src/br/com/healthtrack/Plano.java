package br.com.healthtrack;

import java.util.Scanner;

public class Plano {
	
	Scanner sc = new Scanner(System.in);
	
	private static final int Gratuito = 0;
	private static final int Premium = 0;
	private static final int Personal = 0;

	// atributos
	private int planeCode;
	private double price;
	private String dueDate;
	private int planoDesejado;
	private int pagamento;

	public int getPlaneCod() {
		return planeCode;
	}

	public void setPlaneCod(int planeCod) {
		this.planeCode = planeCod;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getDueDate() {
		return dueDate;
	}

	public void setDueDate(String dueDate) {
		this.dueDate = dueDate;
	}

	public int getPlanoDesejado() {
		return planoDesejado;
	}

	public void setPlanoDesejado(int planoDesejado) {
		this.planoDesejado = planoDesejado;
	}

	// Métodos personalizados
	public void addNewRecord() {
		System.out.print("Escolha seu plano? 1 - Gratuito | 2 - Premium | 3 - Personal: ");
		this.planoDesejado = sc.nextInt();
		if (planoDesejado == 1) {
			this.setPlaneCod(Gratuito);
			System.out.println("-------------------------------");
			System.out.println("Você escolheu o Plano Gratuito!");
			System.out.println();

		} else if (planoDesejado == 2) {
			this.setPlaneCod(Premium);
			System.out.println("-------------------------------");
			System.out.println("Você escolheu o Plano Premium");
			System.out.println();

		} else if (planoDesejado == 3) {
			this.setPlaneCod(Personal);
			System.out.println("-------------------------------");
			System.out.println("Você escolheu o Plano Personal");
			System.out.println();

		} else {
			System.out.println("Você escolheu um plano inválido.");
			System.out.println();
		}
	}
	
	// Método para se comunicar com a API do banco - perguntar para o usuário
	public void addPaymentRecord() {
		System.out.print("Você efetuou o pagamento (1-Sim / 2-Não)? ");
		this.pagamento = sc.nextInt();
		if (pagamento == 1) {
			System.out.println("-------------------------------");
			System.out.println("Pagamento realizado!");
			System.out.println();
		} else if (pagamento == 2) {
			System.out.println("-------------------------------");
			System.out.println("Pagamento não realizado!");
			System.out.println();
		} else {
			System.out.println("Você escolheu um número inválido.");
		}
	}

	// Deseja ver seu plano? informar o plano
	public void consultPlane() {
		
		System.out.print("Deseja ver o seu plano (1-Sim / 2-Não)? ");
		this.planeCode= sc.nextInt();
		if (planeCode == 1) {
			System.out.println("-------------------------------");
			if(getPlanoDesejado() == 1) {
				System.out.println("O seu plano é Gratuito. Perfeito para iniciantes!");
			}else if(getPlanoDesejado() == 2) {
				System.out.println("O seu plano é Premium. Aproveite ao máximo nosso app!");
			}else if(getPlanoDesejado() == 3) {
				System.out.println("O seu plano é Personal para quem quer exclusividade!");
			}
			System.out.println();
		} else if (planeCode == 2) {
			System.out.println("-------------------------------");
			System.out.println("Até a próxima!");
			System.out.println();
		} else {
			System.out.println("-------------------------------");
			System.out.println("");
			System.out.println();
		}
	}

}