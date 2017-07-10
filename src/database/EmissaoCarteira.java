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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class EmissaoCarteira {

	public static void writeFile(String nameFile, ArrayList<Acao> carteiraAcoes, double porcenAceitacao, int numAcoes) {
		File f = new File(nameFile);

		try {
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			
			bw.write("Numero total de acoes: "+numAcoes);
			bw.newLine();
			bw.write("Porcentagem de Aceitacao: "+porcenAceitacao+"%.");
			bw.newLine();
			bw.write("Acoes Aprovadas: "+carteiraAcoes.size()+".");
			bw.newLine(); bw.newLine();
			
			for (Acao acao : carteiraAcoes) {
				bw.write(acao.print());
				bw.newLine();
			}
			
			bw.flush();
			bw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void writeTerminal(ArrayList<Acao> carteiraAcoes, double porcenAceitacao, int numAcoes) {
		
		System.out.println("Numero total de acoes: "+numAcoes);
		System.out.println("Porcentagem de Aceitacao: "+porcenAceitacao+"%.");
		System.out.println("Acoes Aprovadas: "+carteiraAcoes.size()+".");
		System.out.println();
		
		for (Acao acao : carteiraAcoes) {
			System.out.println(acao.print());
		}
	}
}
