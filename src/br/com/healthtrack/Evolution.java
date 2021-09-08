package br.com.healthtrack;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Evolution implements Serializable {
	
	Scanner sc = new Scanner(System.in);
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	Calendar calendar = Calendar.getInstance();
	
	private static final long serialVersionUID = 1L;

	// Propriedades e Atributos
	private double imc;
	private double height;
	private double weight;
	private Date date;
	private int yesNoEvolution;

	// Construtor padrão
	public Evolution() {
	}

	// Construtor função
	public Evolution(double height, double weight, Date date) {
		this.height = height;
		this.weight = weight;
		this.date = date;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setimc(double imc) {
		this.imc = imc;
	}

	public double imc() {
		return imc;
	}
	
	public void setYesNoEvolution(int yesNoEvolution) {
		this.yesNoEvolution = yesNoEvolution;
	}

	public int getYesNoEvolution() {
		return yesNoEvolution;
	}
	
	
	public void status() {
		System.out.printf("  " + sdf.format(getDate()) + " |" + " Peso: " + String.format("%.1f", getWeight()) + "kg"
				+ " |" + " Sua altura é: " + String.format("%.2f", getHeight()) + "m" + " |");

	}

	// Método Calculo IMC

	public void calculoImc() {
		this.imc = getWeight() / (getHeight() * getHeight());
		System.out.printf("%nSeu IMC é:  " + String.format("%.2f", this.imc));
		if (this.imc < 16.00) {
			System.out.println(" - Baixo peso Grau III");
		} else if (this.imc <= 16.99) {
			System.out.println(" - Baixo peso Grau II");
		} else if (this.imc <= 18.49) {
			System.out.println(" - Baixo peso Grau I");
		} else if (this.imc <= 24.99) {
			System.out.println(" - Peso Ideal");
		} else if (this.imc <= 29.99) {
			System.out.println(" - SobrePeso");
		} else if (this.imc <= 34.99) {
			System.out.println(" - Obesidade Grau I");
		} else if (this.imc <= 39.99) {
			System.out.println(" - Obesidade Grau II");
		} else if (this.imc >= 40.00) {
			System.out.println(" - Obesidade Grau III");
		}

	}
	
	public void yesNoEvolution() {
		System.out.println("-------------------------------");
		System.out.print("Deseja inserir seus dados para evolução (1-Sim / 2-Não)? ");
		this.yesNoEvolution = sc.nextInt();
		if(yesNoEvolution == 1) {
			System.out.println("-----HealthTrack - Evolution-----");
			System.out.println("-------------------------------");
			System.out.println("     Sua Pagina de Evolução");
			System.out.println();
			System.out.println("Inserir dados para Evolução");
			System.out.println();

			System.out.print("Altura: ");
			double height = sc.nextDouble();

			System.out.print("Peso: ");
			double weight = sc.nextDouble();

			System.out.print("Data: ");
			Date date = calendar.getTime();

			Evolution newEvolution = new Evolution(height, weight, date);
			
			newEvolution.status();
			newEvolution.calculoImc();
			System.out.println();
			
		}else{
			System.out.println("By!");
		}
	}

}
