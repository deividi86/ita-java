package com.ita.week1;

/**
 * Created by Deividi on 29/02/2016.
 */
public class Patient {

	private double weight;
	private double height;

	public Patient(double weight, double height) {
		this.weight = weight;
		this.height = height;
	}

	public double calculateBMI(){
		return this.weight / (this.height * this.height);
	}

	public String diagnostic(){
		return BMIResult(calculateBMI());
	}

	private String BMIResult(double BMILevel) {
		if(BMILevel < 16){
			return "Baixo peso muito grave = IMC abaixo de 16 kg/m²";
		} else if (BMILevel >= 16 && BMILevel <= 16.99){
			return "Baixo peso grave = IMC entre 16 e 16,99 kg/m²";
		} else if (BMILevel >= 17 && BMILevel <= 18.49 ){
			return "Baixo peso = IMC entre 17 e 18,49 kg/m²";
		} else if (BMILevel >= 18.50 && BMILevel <= 24.99){
			return "Peso normal = IMC entre 18,50 e 24,99 kg/m²";
		} else if (BMILevel >= 25 && BMILevel <= 29.99){
			return "Sobrepeso = IMC entre 25 e 29,99 kg/m²";
		} else if (BMILevel >= 30 && BMILevel <= 34.99) {
			return "Obesidade grau I = IMC entre 30 e 34,99 kg/m²";
		} else if (BMILevel >= 35 && BMILevel <= 39.99) {
			return "Obesidade grau III (obesidade mórbida) = IMC maior que 40 kg/m²";
		} else {
			return "Obesidade grau III (obesidade mórbida) = IMC maior que 40 kg/m²";
		}
	}
}
