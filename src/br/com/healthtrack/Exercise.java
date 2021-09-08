package br.com.healthtrack;

import java.io.Serializable;
import java.util.Scanner;

public class Exercise implements Serializable {

	Scanner sc = new Scanner(System.in);

	private static final long serialVersionUID = 1L;

	// Atributos
	private int timeTrainingCalistenia; // Dura��o total do treino Calistenia
	private int timeExerciseCalistenia; // Dura��o de cada exerc�cio Calistenia
	private int exerciseBreakCalistenia; // Pausa entre os exerc�cios Calistenia
	private int serieBreakCalistenia; // Pausa entre as s�ries Calistenia
	private int trainingChoose;
	private int nivelChoose;
	private int timeTrainingYoga; // Dura��o total do treino Yoga
	private int timeExerciseYoga; // Dura��o de cada exerc�cio Yoga
	private int exerciseBreakYoga; // Pausa entre os exerc�cios Yoga
	private int serieBreakYoga; // Pausa entre as S�ries Yoga
	private String answerContinueTraining;

	// Construtor Padr�o
	public Exercise() {

	}

	// Construtor de Classe
	public Exercise(int timeTrainingCalistenia, int timeExerciseCalistenia, int exerciseBreakCalistenia,
			int serieBreakCalistenia, int trainingChoose, int timeTrainingYoga, int timeExerciseYoga,
			int exerciseBreakYoga, int serieBreakYoga, int nivelChoose, String answerContinueTraining) {
		this.timeTrainingCalistenia = timeTrainingCalistenia;
		this.timeExerciseCalistenia = timeExerciseCalistenia;
		this.exerciseBreakCalistenia = exerciseBreakCalistenia;
		this.serieBreakCalistenia = serieBreakCalistenia;
		this.trainingChoose = trainingChoose;
		this.timeTrainingYoga = timeTrainingYoga;
		this.timeExerciseYoga = timeExerciseYoga;
		this.exerciseBreakYoga = exerciseBreakYoga;
		this.serieBreakYoga = serieBreakYoga;
		this.nivelChoose = nivelChoose;
		this.answerContinueTraining = answerContinueTraining;
	}

	// M�todos especiais

	public float getTimeTraining() {
		return timeTrainingCalistenia;
	}

	public void setTimeTraining(int timeTrainingCalistenia) {
		this.timeTrainingCalistenia = timeTrainingCalistenia;
	}

	public int getTimeExerciseCalistenia() {
		return timeExerciseCalistenia;
	}

	public void setTimeExercise(int timeExerciseCalistenia) {
		this.timeExerciseCalistenia = timeExerciseCalistenia;
	}

	public float getExerciseBreak() {
		return exerciseBreakCalistenia;
	}

	public void setExerciseBreak(int exerciseBreakCalistenia) {
		this.exerciseBreakCalistenia = exerciseBreakCalistenia;
	}

	public float getSerieBreakCalistenia() {
		return serieBreakCalistenia;
	}

	public void setSerieBreakCalistenia(int serieBreakCalistenia) {
		this.serieBreakCalistenia = serieBreakCalistenia;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getTrainingChoose() {
		return trainingChoose;
	}

	public void setTrainingChooseCalistenia(int trainingChoose) {
		this.trainingChoose = trainingChoose;
	}

	public int getTimeTrainingYoga() {
		return timeTrainingYoga;
	}

	public void setTimeTrainingYoga(int timeTrainingYoga) {
		this.timeTrainingYoga = timeTrainingYoga;
	}

	public int getTimeExerciseYoga() {
		return timeExerciseYoga;
	}

	public void setTimeExerciseYoga(int timeExerciseYoga) {
		this.timeExerciseYoga = timeExerciseYoga;
	}

	public int getExerciseBreakYoga() {
		return exerciseBreakYoga;
	}

	public void setExerciseBreakYoga(int exerciseBreakYoga) {
		this.exerciseBreakYoga = exerciseBreakYoga;
	}

	public int getSerieBreakYoga() {
		return serieBreakYoga;
	}

	public void setSerieBreakYoga(int serieBreakYoga) {
		this.serieBreakYoga = serieBreakYoga;
	}

	public void setTrainingChoose(int trainingChoose) {
		this.trainingChoose = trainingChoose;
	}

	public String getAnswerContinueTraining() {
		return answerContinueTraining;
	}

	public void setAnswerContinueTraining(String answerContinueTraining) {
		this.answerContinueTraining = answerContinueTraining;
	}
	
	// m�todo sauda��o
	public void saudacao(int trainingChoose) {
		System.out.println("----- HealthTrack - Treino -----");
		System.out.println("-------------------------------");
		System.out.println("      Sua Pagina de Treino");
		System.out.println();
		System.out.print("Digite o n�mero do treino: ");
		System.out.println();
		System.out.println("1 - Calistenia");
		System.out.print("2 - Yoga");
		System.out.println();
		this.trainingChoose = sc.nextInt();
		System.out.println();
		System.out.println("Escolha o seu n�vel de treino:");
		System.out.println("1 - F�CIL    |    2 - INTERMEDI�RIO  |   3 - EXPERIENTE");
		System.out.println();
		this.nivelChoose = sc.nextInt();
		System.out.println();
		System.out.println("-----------------------------------------------------");
	}

	// M�todo escolher treino
	public void training(int timeTrainingCalistenia, int timeExerciseCalistenia, int exerciseBreakCalistenia,
			int serieBreakCalistenia, int timeTrainingYoga, int timeExerciseYoga, int exerciseBreakYoga,
			int serieBreakYoga) {
		if (this.trainingChoose == 1 && this.nivelChoose == 1) {
			System.out.println("CALISTENIA - F�CIL");
			System.out.println();
			System.out.println("3 S�RIES - 5 EXERC�CIOS");
			System.out.println();
			System.out.println("Dura��o total do treino: " + timeTrainingCalistenia + "min");
			System.out.println("Dura��o do exerc�cio: " + timeExerciseCalistenia + "s");
			System.out.println("Pausa entre os exerc�cios: " + exerciseBreakCalistenia + "s");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s de FLEX�ES");
			System.out.println(serieBreakCalistenia + "s Pause");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s ELEVA��O DAS PERNAS");
			System.out.println(serieBreakCalistenia + "s Pause");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s ABDOMINAL RUSSO");
			System.out.println(serieBreakCalistenia + "s Pause");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s PRANCHA");
			System.out.println(serieBreakCalistenia + "s Pause");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s POLICHINELO ");
			System.out.println();
			System.out.println("------- FIM DO TREINO -------");
		} else if (this.trainingChoose == 1 && this.nivelChoose == 2) {
			System.out.println("CALISTENIA - INTERMEDI�RIO");
			System.out.println();
			System.out.println("3 S�RIES - 5 EXERC�CIOS");
			System.out.println();
			System.out.println("Dura��o total do treino: " + timeTrainingCalistenia + "min");
			System.out.println("Dura��o do exerc�cio: " + timeExerciseCalistenia + "s");
			System.out.println("Pausa entre os exerc�cios: " + exerciseBreakCalistenia + "s");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s de FLEX�ES");
			System.out.println(serieBreakCalistenia + "s Pause");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s ELEVA��O DAS PERNAS");
			System.out.println(serieBreakCalistenia + "s Pause");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s ABDOMINAL RUSSO");
			System.out.println(serieBreakCalistenia + "s Pause");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s PRANCHA");
			System.out.println(serieBreakCalistenia + "s Pause");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s POLICHINELO ");
			System.out.println();
			System.out.println("------- FIM DO TREINO -------");
		} else if (this.trainingChoose == 1 && this.nivelChoose == 3) {
			System.out.println("CALISTENIA - DIF�CIL");
			System.out.println();
			System.out.println("3 S�RIES - 5 EXERC�CIOS");
			System.out.println();
			System.out.println("Dura��o total do treino: " + timeTrainingCalistenia + "min");
			System.out.println("Dura��o do exerc�cio: " + timeExerciseCalistenia + "s");
			System.out.println("Pausa entre os exerc�cios: " + exerciseBreakCalistenia + "s");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s de FLEX�ES");
			System.out.println(serieBreakCalistenia + "s Pause");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s ELEVA��O DAS PERNAS");
			System.out.println(serieBreakCalistenia + "s Pause");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s ABDOMINAL RUSSO");
			System.out.println(serieBreakCalistenia + "s Pause");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s PRANCHA");
			System.out.println(serieBreakCalistenia + "s Pause");
			System.out.println();
			System.out.println(timeExerciseCalistenia + "s POLICHINELO ");
			System.out.println();
			System.out.println("------- FIM DO TREINO -------");
		} else if (this.trainingChoose == 2 && this.nivelChoose == 1) {
			System.out.println("YOGA - F�CIL");
			System.out.println();
			System.out.println("3 S�RIES - 5 EXERC�CIOS");
			System.out.println();
			System.out.println("Dura��o total do treino: " + timeTrainingYoga + "min");
			System.out.println("Dura��o do exerc�cio: " + timeExerciseYoga + "s");
			System.out.println("Pausa entre os exerc�cios: " + exerciseBreakYoga + "s");
			System.out.println();
			System.out.println(timeExerciseYoga + "s de ALONGAMENTO LENTO NO PESCO�O");
			System.out.println(serieBreakYoga + "s Pause");
			System.out.println();
			System.out.println(timeExerciseYoga + "s ALONGAMENTO DE QUADR�CEPS COM AFUNDO");
			System.out.println(serieBreakYoga + "s Pause");
			System.out.println();
			System.out.println(timeExerciseYoga + "s POSTURA DA BORBOLETA");
			System.out.println(serieBreakYoga + "s Pause");
			System.out.println();
			System.out.println(timeExerciseYoga + "s POSTURA DA PONTE");
			System.out.println(serieBreakYoga + "s Pause");
			System.out.println();
			System.out.println(timeExerciseYoga + "s  ");
			System.out.println();
			System.out.println("------- FIM DO TREINO -------");
		} else if (this.trainingChoose == 2 && this.nivelChoose == 2) {
			System.out.println("YOGA - INTERMEDI�RIO");
			System.out.println();
			System.out.println("3 S�RIES - 5 EXERC�CIOS");
			System.out.println();
			System.out.println("Dura��o total do treino: " + timeTrainingYoga + "min");
			System.out.println("Dura��o do exerc�cio: " + timeExerciseYoga + "s");
			System.out.println("Pausa entre os exerc�cios: " + exerciseBreakYoga + "s");
			System.out.println();
			System.out.println(timeExerciseYoga + "s de ALONGAMENTO LENTO NO PESCO�O");
			System.out.println(serieBreakYoga + "s Pause");
			System.out.println();
			System.out.println(timeExerciseYoga + "s ALONGAMENTO DE QUADR�CEPS COM AFUNDO");
			System.out.println(serieBreakYoga + "s Pause");
			System.out.println();
			System.out.println(timeExerciseYoga + "s POSTURA DA BORBOLETA");
			System.out.println(serieBreakYoga + "s Pause");
			System.out.println();
			System.out.println(timeExerciseYoga + "s POSTURA DA PONTE");
			System.out.println(serieBreakYoga + "s Pause");
			System.out.println();
			System.out.println(timeExerciseYoga + "s  ");
			System.out.println();
			System.out.println("------- FIM DO TREINO -------");
		} else if (this.trainingChoose == 2 && this.nivelChoose == 3) {
			System.out.println("YOGA - DIF�CIL");
			System.out.println();
			System.out.println("3 S�RIES - 5 EXERC�CIOS");
			System.out.println();
			System.out.println("Dura��o total do treino: " + timeTrainingYoga + "min");
			System.out.println("Dura��o do exerc�cio: " + timeExerciseYoga + "s");
			System.out.println("Pausa entre os exerc�cios: " + exerciseBreakYoga + "s");
			System.out.println();
			System.out.println(timeExerciseYoga + "s de ALONGAMENTO LENTO NO PESCO�O");
			System.out.println(serieBreakYoga + "s Pause");
			System.out.println();
			System.out.println(timeExerciseYoga + "s ALONGAMENTO DE QUADR�CEPS COM AFUNDO");
			System.out.println(serieBreakYoga + "s Pause");
			System.out.println();
			System.out.println(timeExerciseYoga + "s POSTURA DA BORBOLETA");
			System.out.println(serieBreakYoga + "s Pause");
			System.out.println();
			System.out.println(timeExerciseYoga + "s POSTURA DA PONTE");
			System.out.println(serieBreakYoga + "s Pause");
			System.out.println();
			System.out.println(timeExerciseYoga + "s  ");
			System.out.println();
			System.out.println("------- FIM DO TREINO -------");
		} else {
			System.out.println("!VOC� DIGITOU O N�MERO ERRADO!");
		}
	}
	
}
