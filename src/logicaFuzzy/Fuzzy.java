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

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Fuzzy {

	private Variavel qntdeVolume, qualidade, custoVida, resultado; 
	
	public Fuzzy() {
		this.qntdeVolume = new Variavel();	// Divida Ativa
		this.qualidade	 = new Variavel();	// prazo
		this.custoVida	 = new Variavel();	// custo de vida
		this.resultado	 = new Variavel();
	}
	
	// Atribui os valores do arquivo as variaveis
    public void inputVariable(String nameFile) throws FileNotFoundException {
    	
    	BufferedReader in = new BufferedReader(new FileReader(nameFile));
    	String linha;
    	String[] dados;
    	
    	try {
	    	while((linha = in.readLine()) != null) {
            	dados = linha.split(";");
            	
            	//	Quantidade Volume
            	switch (dados[0]) {
				case "1": {
					//	Muito Baixo
					switch (dados[1]) {
						case "0": {
							this.getQntdeVolume().getMuitoBaixo().add(Double.parseDouble(dados[2]));
							this.getQntdeVolume().getMuitoBaixo().add(Double.parseDouble(dados[3]));
							this.getQntdeVolume().getMuitoBaixo().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getQntdeVolume().getMuitoBaixo().add(Double.parseDouble(dados[5]));
							break;
						}
						case "1": {
							this.getQntdeVolume().getBaixo().add(Double.parseDouble(dados[2]));
							this.getQntdeVolume().getBaixo().add(Double.parseDouble(dados[3]));
							this.getQntdeVolume().getBaixo().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getQntdeVolume().getBaixo().add(Double.parseDouble(dados[5]));
							break;
						}
						case "2": {
							this.getQntdeVolume().getMedio().add(Double.parseDouble(dados[2]));
							this.getQntdeVolume().getMedio().add(Double.parseDouble(dados[3]));
							this.getQntdeVolume().getMedio().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getQntdeVolume().getMedio().add(Double.parseDouble(dados[5]));
							break;
						}
						case "3": {
							this.getQntdeVolume().getAlto().add(Double.parseDouble(dados[2]));
							this.getQntdeVolume().getAlto().add(Double.parseDouble(dados[3]));
							this.getQntdeVolume().getAlto().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getQntdeVolume().getAlto().add(Double.parseDouble(dados[5]));
							break;
						}
						case "4": {
							this.getQntdeVolume().getMuitoAlto().add(Double.parseDouble(dados[2]));
							this.getQntdeVolume().getMuitoAlto().add(Double.parseDouble(dados[3]));
							this.getQntdeVolume().getMuitoAlto().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getQntdeVolume().getMuitoAlto().add(Double.parseDouble(dados[5]));
							break;
						}
						default:
							break;
					}
					break;	
				}
				//  Qualidade
				case "2": {
					switch (dados[1]) {
						case "0": {
							this.getQualidade().getMuitoBaixo().add(Double.parseDouble(dados[2]));
							this.getQualidade().getMuitoBaixo().add(Double.parseDouble(dados[3]));
							this.getQualidade().getMuitoBaixo().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getQualidade().getMuitoBaixo().add(Double.parseDouble(dados[5]));
							break;
						}
						case "1": {
							this.getQualidade().getBaixo().add(Double.parseDouble(dados[2]));
							this.getQualidade().getBaixo().add(Double.parseDouble(dados[3]));
							this.getQualidade().getBaixo().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getQualidade().getBaixo().add(Double.parseDouble(dados[5]));
							break;
						}
						case "2": {
							this.getQualidade().getMedio().add(Double.parseDouble(dados[2]));
							this.getQualidade().getMedio().add(Double.parseDouble(dados[3]));
							this.getQualidade().getMedio().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getQualidade().getMedio().add(Double.parseDouble(dados[5]));
							break;
						}
						case "3": {
							this.getQualidade().getAlto().add(Double.parseDouble(dados[2]));
							this.getQualidade().getAlto().add(Double.parseDouble(dados[3]));
							this.getQualidade().getAlto().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getQualidade().getAlto().add(Double.parseDouble(dados[5]));
							break;
						}
						case "4": {
							this.getQualidade().getMuitoAlto().add(Double.parseDouble(dados[2]));
							this.getQualidade().getMuitoAlto().add(Double.parseDouble(dados[3]));
							this.getQualidade().getMuitoAlto().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getQualidade().getMuitoAlto().add(Double.parseDouble(dados[5]));
							break;
						}
						default: 
							break;
					}
					break;	
				}
				// Custo de Vida
				case "3": {
					switch (dados[1]) {
						case "0": {
							this.getCustoVida().getMuitoBaixo().add(Double.parseDouble(dados[2]));
							this.getCustoVida().getMuitoBaixo().add(Double.parseDouble(dados[3]));
							this.getCustoVida().getMuitoBaixo().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getCustoVida().getMuitoBaixo().add(Double.parseDouble(dados[5]));
							break;
						}
						case "1": {
							this.getCustoVida().getBaixo().add(Double.parseDouble(dados[2]));
							this.getCustoVida().getBaixo().add(Double.parseDouble(dados[3]));
							this.getCustoVida().getBaixo().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getCustoVida().getBaixo().add(Double.parseDouble(dados[5]));
							break;
						}
						case "2": {
							this.getCustoVida().getMedio().add(Double.parseDouble(dados[2]));
							this.getCustoVida().getMedio().add(Double.parseDouble(dados[3]));
							this.getCustoVida().getMedio().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getCustoVida().getMedio().add(Double.parseDouble(dados[5]));
							break;
						}
						case "3": {
							this.getCustoVida().getAlto().add(Double.parseDouble(dados[2]));
							this.getCustoVida().getAlto().add(Double.parseDouble(dados[3]));
							this.getCustoVida().getAlto().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getCustoVida().getAlto().add(Double.parseDouble(dados[5]));
							break;
						}
						case "4": {
							this.getCustoVida().getMuitoAlto().add(Double.parseDouble(dados[2]));
							this.getCustoVida().getMuitoAlto().add(Double.parseDouble(dados[3]));
							this.getCustoVida().getMuitoAlto().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getCustoVida().getMuitoAlto().add(Double.parseDouble(dados[5]));
							break;
						}
						default: 
							break;
					}
					break;	
				}
				// Resultado
				case "4": {
					switch (dados[1]) {
						case "0": {
							this.getResultado().getMuitoBaixo().add(Double.parseDouble(dados[2]));
							this.getResultado().getMuitoBaixo().add(Double.parseDouble(dados[3]));
							this.getResultado().getMuitoBaixo().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getResultado().getMuitoBaixo().add(Double.parseDouble(dados[5]));
							break;
						}
						case "1": {
							this.getResultado().getBaixo().add(Double.parseDouble(dados[2]));
							this.getResultado().getBaixo().add(Double.parseDouble(dados[3]));
							this.getResultado().getBaixo().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getResultado().getBaixo().add(Double.parseDouble(dados[5]));
							break;
						}
						case "2": {
							this.getResultado().getMedio().add(Double.parseDouble(dados[2]));
							this.getResultado().getMedio().add(Double.parseDouble(dados[3]));
							this.getResultado().getMedio().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getResultado().getMedio().add(Double.parseDouble(dados[5]));
							break;
						}
						case "3": {
							this.getResultado().getAlto().add(Double.parseDouble(dados[2]));
							this.getResultado().getAlto().add(Double.parseDouble(dados[3]));
							this.getResultado().getAlto().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getResultado().getAlto().add(Double.parseDouble(dados[5]));
							break;
						}
						case "4": {
							this.getResultado().getMuitoAlto().add(Double.parseDouble(dados[2]));
							this.getResultado().getMuitoAlto().add(Double.parseDouble(dados[3]));
							this.getResultado().getMuitoAlto().add(Double.parseDouble(dados[4]));
							if(dados.length == 6)
								this.getResultado().getMuitoAlto().add(Double.parseDouble(dados[5]));
							break;
						}
						default: 
							break;
					}
					break;	
				}
				default:
					break;
				}
	        }
	    	in.close();
    	}
    	catch (Exception done) {
			done.printStackTrace();
    	}
    }
    
    // Base de conhecimento
	public ArrayList<Double> regras(double qntdeVolume, double qualidade, double custoVida) {
		
		ArrayList<Double> saida = new ArrayList<>();
		double muitoBaixo = 0, baixo = 0, medio = 0, alto = 0, muitoAlto = 0;

		// Regra 1 - Vol(MuiAlto) = Resul(Baixo)
		baixo += (valorPertinencia(this.getQntdeVolume().getMuitoAlto(), qntdeVolume));
		
		// Regra 2 - Vol(Alto) e Qualid(MuiBaixo) = Resul(Medio)
		medio += (valorMinimo(
				valorPertinencia(this.getQntdeVolume().getAlto(), qntdeVolume), 
				valorPertinencia(this.getQualidade().getMuitoBaixo(), qualidade)));
		
		// Regra 3 - Vol(MuiBaixo) = Resul(Alto)
		alto += (valorPertinencia(this.getQntdeVolume().getMuitoBaixo(), qntdeVolume));
		
		// Regra 4 - Vol(Media) e Custo(MuiBaixo) = Resul(Alta)
		alto += (valorMinimo(
				valorPertinencia(this.getQntdeVolume().getMedio(), qntdeVolume),
				valorPertinencia(this.getCustoVida().getMuitoBaixo(), custoVida)));
		
		// Regra 5 - Vol(Baixo) e Qualid(Baixo) = Resul(MuiAlta)
		muitoAlto += (valorMinimo(
				valorPertinencia(this.getQntdeVolume().getBaixo(), qntdeVolume),
				valorPertinencia(this.getQualidade().getBaixo(), qualidade)));
		
		// Regra 6 - Qualid(Baixo) e Custo(MuiBaixo) = Resul(MuiAlta)
		muitoAlto += (valorMinimo(
				valorPertinencia(this.getQualidade().getBaixo(), qualidade),
				valorPertinencia(this.getCustoVida().getMuitoBaixo(), custoVida)));
		
		// Regra 7 - Qualid(Medio) e Custo(Alto) = Resul(Alto)
		alto += (valorMinimo(
				valorPertinencia(this.getQualidade().getMedio(), qualidade),
				valorPertinencia(this.getCustoVida().getAlto(), custoVida)));
		
		// Regra 8 - Vol(Medio) e Custo(MuiAlto) = Resul(MuiBaixo)
		muitoBaixo += (valorMinimo(
				valorPertinencia(this.getQntdeVolume().getMedio(), qntdeVolume),
				valorPertinencia(this.getCustoVida().getMuitoAlto(), custoVida)));
		
		// Regra 9 - Vol(Baixo) e Qualid(Alto) = Resul(baixo)
		baixo += (valorMinimo(
				valorPertinencia(this.getQntdeVolume().getBaixo(), qntdeVolume), 
				valorPertinencia(this.getQualidade().getAlto(), qualidade)));
		
		// Regra 10 - Vol(Alto) e Custo(Medio) = Resul(MuiBaixo)
		muitoBaixo += (valorMinimo(
				valorPertinencia(this.getQntdeVolume().getAlto(), qntdeVolume), 
				valorPertinencia(this.getCustoVida().getMedio(), custoVida)));
		
		// Regra 11 - vol(muiAlto) e Qualid(Baixo) = Resul(Media)
		medio += (valorMinimo(
				valorPertinencia(this.getQntdeVolume().getMuitoAlto(), qntdeVolume), 
				valorPertinencia(this.getQualidade().getBaixo(), qualidade)));
		
		// Regra 12 - Vol(baixa) e custo(Baixo) = Resul(MuitoAlto)
		muitoAlto += (valorMinimo(
				valorPertinencia(this.getQntdeVolume().getBaixo(), qntdeVolume), 
				valorPertinencia(this.getCustoVida().getBaixo(), custoVida)));
		
		// Regra 13 - Vol(baixa) e custo(Alto) = Resul(Medio)
		medio += (valorMinimo(
				valorPertinencia(this.getQntdeVolume().getBaixo(), qntdeVolume), 
				valorPertinencia(this.getCustoVida().getAlto(), custoVida)));
		
		// Regra 14 - Vol(Media) e Qualid(Baixo) = Resul(Alto)
		alto += (valorMinimo(
				valorPertinencia(this.getQntdeVolume().getMedio(), qntdeVolume), 
				valorPertinencia(this.getQualidade().getBaixo(), qualidade)));
		
		// Regra 15 - Vol(Media) e Qualid(MuiAlto) = Resul(Baixa)
		baixo += (valorMinimo(
				valorPertinencia(this.getQntdeVolume().getMedio(), qntdeVolume), 
				valorPertinencia(this.getQualidade().getMuitoAlto(), qualidade)));
		
		saida.add(0, muitoBaixo);
		saida.add(1, baixo);
		saida.add(2, medio);
		saida.add(3, alto);
		saida.add(4, muitoAlto);
		return saida;
	}
	
	// Truncamento saida das regras
	public ArrayList<Double> truncSaidaRegras(ArrayList<Double> saidaRegras) {
		
		for (Double saida : saidaRegras) {
			if(saida > 1.0) saida = 1.0;
		}
		return saidaRegras;
	}
	
	//	Valor nitido
	public double valorNitido(ArrayList<Double> saidaRegras) {
		
		double somatorio = 0;
		double aux, maior;
		double multi = 0;
		
		// intervalos de 1 unidade
		for (int i = 0; i <= 100; i+=1) {
			maior = 0;
			aux = -1;
			
			// valor de pertinencia deve ser menor ou igual que o valor definido na saida das regras
			if(valorPertinencia(this.getResultado().getMuitoBaixo(), i) <= saidaRegras.get(0))
				aux = valorPertinencia(this.getResultado().getMuitoBaixo(), i);
			
			// atualiza o maior de todos os valores
			maior = valorMaximo(maior, aux);
			
			
			if(valorPertinencia(this.getResultado().getBaixo(), i) <= saidaRegras.get(1)) 
				aux = valorPertinencia(this.getResultado().getBaixo(), i);
			
			maior = valorMaximo(maior, aux);
			
			if(valorPertinencia(this.getResultado().getMedio(), i) <= saidaRegras.get(2)) 
				aux = valorPertinencia(this.getResultado().getMedio(), i);
			
			maior = valorMaximo(maior, aux);
			
			if(valorPertinencia(this.getResultado().getAlto(), i) <= saidaRegras.get(3)) 
				aux = valorPertinencia(this.getResultado().getAlto(), i);
			
			maior = valorMaximo(maior, aux);
			
			if(valorPertinencia(this.getResultado().getMuitoAlto(), i) <= saidaRegras.get(4)) 
				aux = valorPertinencia(this.getResultado().getMuitoAlto(), i);
			
			maior = valorMaximo(maior, aux);
			
			multi += (maior*i);
			somatorio += maior;
		}
		if(somatorio == 0) return 0;
		return (multi/somatorio);
	}
	
	//	Valor Minimo
	public double valorMinimo(double x1, double x2) {
		
		if(x1 > x2)
			return x2;
		else
			return x1;
	}
	
	//	Valor Maximo
	public double valorMaximo(double x1, double x2) {
		
		if(x1 < x2)
			return x2;
		else
			return x1;
	}
	
	//	Valor Minimo
	public double valorMinimo(double x1, double x2, double x3, double x4, double x5) {
		double menor = x1;
		if(menor > x2) menor = x2;
		if(menor > x3) menor = x3;
		if(menor > x4) menor = x4;
		if(menor > x5) menor = x5;
		
		return menor;
	}
	
	//	Valor Maximo
	public double valorMaximo(double x1, double x2, double x3, double x4, double x5) {
		double maior = x1;
		if(maior < x2) maior = x2;
		if(maior < x3) maior = x3;
		if(maior < x4) maior = x4;
		if(maior < x5) maior = x5;
		
		return maior;
	}
	
	//	Valor de Pertinencia
	public double valorPertinencia(ArrayList<Double> vetor, double valor) {
		if(vetor.size() == 4)
			return funcPertTrapezio(valor, vetor.get(0), vetor.get(1), vetor.get(2), vetor.get(3));
		else if(vetor.size() == 3)
			return funcPertTriangulo(valor, vetor.get(0), vetor.get(1), vetor.get(2));
		else
			return funcPertLinear(valor, vetor.get(0), vetor.get(1));
	}
	
	// Funcao de Pertinencia Triangulo
	public static double funcPertTriangulo(double x, double a, double b, double c) {
		
		if(x < a) {
			return 0;
		}
		else if((a <= x) && (x < b)) {
			return ((x - a) / (b - a));
		}
		else if((b <= x) && (x < c)) {
			return ((c - x) / (c - b));
		}
		else if(c <= x) {
			return 0;
		}
		return 0;
	}

	// Funcao de Pertinencia Trapezio	
	public static double funcPertTrapezio(double x, double a, double b, double c, double d) {
		
		if(x < a) {
			return 0;
		}
		else if((a <= x) && (x < b)) {
			return ((x - a) / (b - a));
		}
		else if((b <= x) && (x < c)) {
			return 1;
		}
		else if((c <= x) && (x < d)) {
			return ((d - x) / (d - c));
		}
		else if(d <= x) {
			return 0;
		}
		return 0;
	}

	// Funcao de Pertinencia Linear
	public static double funcPertLinear(double x, double a, double b) {
		return((a*x) + b);
	}

	
    // Get's e Set's
	public Variavel getQntdeVolume() {
		return qntdeVolume;
	}

	public void setQntdeVolume(Variavel qntdeVolume) {
		this.qntdeVolume = qntdeVolume;
	}

	public Variavel getQualidade() {
		return qualidade;
	}

	public void setQualidade(Variavel qualidade) {
		this.qualidade = qualidade;
	}

	public Variavel getCustoVida() {
		return custoVida;
	}

	public void setCustoVida(Variavel custoVida) {
		this.custoVida = custoVida;
	}

	public Variavel getResultado() {
		return resultado;
	}

	public void setResultado(Variavel resultado) {
		this.resultado = resultado;
	}
	
	
}
