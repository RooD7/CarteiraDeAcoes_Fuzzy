/*
 * Trabalho Inteligência Artificial
 * 
 * Data: 27/06/2017
 * 
 * Alunos:
 * Rafaela Martins 	- 0002852
 * Rodrigo Sousa 	- 0011264
 * Rayra Pinheiro 	- 0002853 
 * 
 */

package logicaFuzzy;

import java.util.ArrayList;

public class Variavel {

	private ArrayList<Double> muitoAlto;
	private ArrayList<Double> alto;
	private ArrayList<Double> medio;
	private ArrayList<Double> baixo;
	private ArrayList<Double> muitoBaixo;
	
	public Variavel() {
		muitoAlto = new ArrayList<>();
		alto = new ArrayList<>();
		medio = new ArrayList<>();
		baixo = new ArrayList<>();
		muitoBaixo = new ArrayList<>();
	}
	
	public ArrayList<Double> getMuitoAlto() {
		return muitoAlto;
	}
	public void setMuitoAlto(ArrayList<Double> muitoAlta) {
		this.muitoAlto = muitoAlta;
	}
	public ArrayList<Double> getAlto() {
		return alto;
	}
	public void setAlto(ArrayList<Double> alta) {
		this.alto = alta;
	}
	public ArrayList<Double> getMedio() {
		return medio;
	}
	public void setMedio(ArrayList<Double> medio) {
		this.medio = medio;
	}
	public ArrayList<Double> getBaixo() {
		return baixo;
	}
	public void setBaixo(ArrayList<Double> baixo) {
		this.baixo = baixo;
	}
	public ArrayList<Double> getMuitoBaixo() {
		return muitoBaixo;
	}
	public void setMuitoBaixo(ArrayList<Double> muitoBaixo) {
		this.muitoBaixo = muitoBaixo;
	}
	
		
	
}
