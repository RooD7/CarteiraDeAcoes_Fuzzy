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

package main;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import database.Acao;
import database.Database;
import database.EmissaoCarteira;
import logicaFuzzy.Fuzzy;

public class Main extends Exception{
	
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) throws IOException {
		
		// -------	Entrada de Dados	------- //
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("###-------\tTrabalho IA - Lógica Fuzzy\t-------###");
		System.out.println("Nome do arquivo de entrada(ações) --- Padrão[acoes.txt]: ");
		String nameFileAcoes = scan.nextLine();
		
		System.out.println("Nome do arquivo de entrada(variáveis) --- Padrão[variaveis.txt]: ");
		String nameFileVariaveis = scan.nextLine();
		
		System.out.println("Nome do arquivo de saida(Carteira de Ações) --- Padrão[resultadoAcoes.txt]: ");
		String nameFileResultado = scan.nextLine();
		
		System.out.println("Porcentagem de aceitação(Risco): ");
		double porcenAceitacao = scan.nextDouble();
		
		System.out.println("\n");
		
		scan.close();
		
		// -------	Manipulacao - Entrada de Dados	------- //
		
		// Manipula arquivo de entrada das acoes
        Database db = new Database(nameFileAcoes);
        
        ArrayList<Acao> ac = new ArrayList<Acao>();
        
        int numLineFile = db.numeroLinhas();
        
        db.addAcaoFromFile(ac);
        
        
        // -------	Sistema Fuzzy	------- //
        
        // Sistema Fuzzy
        Fuzzy fuzzy = new Fuzzy();
        fuzzy.inputVariable(nameFileVariaveis);
        ArrayList<Double> saidaRegras = new ArrayList<Double>();
        ArrayList<Acao> carteiraAcoes = new ArrayList<Acao>();
        
        double valorNitido = 0;
        
        for (Acao acao : ac) {
        	
        	// saidaRegras = somatorio do resultado das regras. Aplicado segundo as variaveis(alto,baixo,...) 
        	saidaRegras = fuzzy.regras(acao.getQntdeVol(), acao.getQualidade(), acao.getCustoVida());
        	
        	// Truncamento da variaveis (alto,baixo,...). Caso as mesmas excedam 1.
        	saidaRegras = fuzzy.truncSaidaRegras(saidaRegras);
        	
        	// A saida das regras pode ser utilizada para colorir grafico do Resultado	-- Opcional
        	
        	// Valor Nitido
        	valorNitido = fuzzy.valorNitido(saidaRegras);
        	
        	// Se o valor nitido eh menor que a porcentagem de aceitacao, adiciona acao na carteira
        	if(valorNitido < porcenAceitacao) {
        		carteiraAcoes.add(acao);
        	}
        	
		}
        System.out.println("Valor nitido: "+valorNitido);
        // -------	Saida de Dados	------- //
        
        EmissaoCarteira.writeFile(nameFileResultado, carteiraAcoes, porcenAceitacao, numLineFile-1);
    	EmissaoCarteira.writeTerminal(carteiraAcoes, porcenAceitacao, numLineFile-1);
        
	}
}