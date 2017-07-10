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

package database;

public class Acao {

	private int id;
	private String nome;
	private String area;
	private double qntdeVol;	// DivBAt
	private double qualidade;	// DivCpDT
	private double custoVida;	// Kd
	private double valorAcao;	// Qntobin
	
	public Acao() {
		setId(0);
		setNome("");
		setArea("");
		setQntdeVol(0.0);
		setQualidade(0.0);
		setCustoVida(0.0);
		setValorAcao(0.0);
	}
	
	public void setAcao(int id, String nome, String area, double qntdeVol, double qualidade, double custoVida, double valorAcao) {

		this.id = id;
		this.nome = nome;
		this.area = area;
		this.qntdeVol = qntdeVol;
		this.qualidade = qualidade;
		this.custoVida = custoVida;
		this.valorAcao = valorAcao;
	}
	
	public String print() {
		return("Id: "+getId()+"\t|\t Nome: "+getNome()+"\t|\t Area: "+getArea()+
				"\t|\t Volume: "+getQntdeVol()+"\t|\t Qualidade: "+getQualidade()+
				"\t|\t CustoVida: "+getCustoVida()+"\t|\t ValorAcao: "+getValorAcao()+".");
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public double getQntdeVol() {
		return qntdeVol;
	}
	public void setQntdeVol(double qntdeVol) {
		this.qntdeVol = qntdeVol;
	}
	public double getQualidade() {
		return qualidade;
	}
	public void setQualidade(double qualidade) {
		this.qualidade = qualidade;
	}
	public double getCustoVida() {
		return custoVida;
	}
	public void setCustoVida(double custoVida) {
		this.custoVida = custoVida;
	}
	public double getValorAcao() {
		return valorAcao;
	}
	public void setValorAcao(double valorAcao) {
		this.valorAcao = valorAcao;
	}
	
	
}
