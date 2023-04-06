package java_Class;

import java.util.Scanner;

public class Student {

	public Student() {}

	Scanner sc = new Scanner(System.in);

	private String name;	
	private int[] score = new int[3];
	private String grade;
	private double avg;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getScore() {
		return score;
	}
	public void setScore(int[] score) {
		this.score = score;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {

		
		this.avg = avg;
	}

	
	public void setScoreElement(int index, int value) {

	        this.score[index] = value;
	    }
	public int getScoreElement(int index) {
		return score[index];
	}
	  
	public void setInfo() {
		System.out.println("당신의 이름은 ? : ");
		setName(sc.next());
		System.out.println("당신의 국어 점수는 ? :");
		setScoreElement(0, sc.nextInt());
		System.out.println("당신의 영어 점수는 ? :");
		setScoreElement(1, sc.nextInt());
		System.out.println("당신의 수학 점수는 ? :");
		setScoreElement(2, sc.nextInt());	
		getMean();
		calcGrade();
	}

	public double getMean() {
		int sub = 0;
		for (int i = 0; i < score.length; i++) {
			sub += score[i];
		}
		setAvg((double)sub/score.length);
		return getAvg();
	}
	 
	public String calcGrade() {
		 double avg = getMean();
		 if (avg >= 90)
				this.grade = "A";
			else if (avg >= 80)
				this.grade = "B";
			else if (avg >= 70)
				this.grade = "C";
			else if (avg >= 60)
				this.grade = "D";
			else
				this.grade = "F";
			return this.grade;		 
	 }
	
	void studentInfo() {
		System.out.printf("%s\t%d\t%d\t%d\t%.2f\t%s\n", 
				name, getScoreElement(0), getScoreElement(1), getScoreElement(2), avg, grade);
	}
	
	
	 
	 
	
	
	
	
	

}
