package com.ita.week1;

/**
 * Created by Deividi on 29/02/2016.
 */
public class Main {

	public static void main(String[] args) {
		Patient p1 = new Patient(87.5, 1.78);
		Patient p2 = new Patient(100, 1.60);
		Patient p3 = new Patient(39, 1.65);

		System.out.println("Pacient 1 { BMI: " + p1.calculateBMI() + " Diagnostic: " + p1.diagnostic() + " }");
		System.out.println("Pacient 2 { BMI: " + p2.calculateBMI() + " Diagnostic: " + p2.diagnostic() + " }");
		System.out.println("Pacient 3 { BMI: " + p3.calculateBMI() + " Diagnostic: " + p3.diagnostic() + " }");
	}
}
