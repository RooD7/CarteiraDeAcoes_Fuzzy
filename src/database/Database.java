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
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.ArrayList;


public class Database {
	private String nameFile;
	private LineNumberReader lineCounter;
	private BufferedReader in;

    public Database(String nameFile) {
        this.nameFile = nameFile;
        this.lineCounter = null;
        this.in = null;
    }

    // Retorna o numero de linhas que o arquivo possui
    public int numeroLinhas() throws FileNotFoundException {
    	
    	lineCounter = new LineNumberReader(new InputStreamReader(new FileInputStream(this.nameFile)));
		String nextLine = null;
		try {
			// Contando as linhas do arquivo
			while (((nextLine = lineCounter.readLine()) != null) && (nextLine != null) ) {

			}
			lineCounter.close();
		} catch (Exception done) {
			done.printStackTrace();
		}
    	
    	return lineCounter.getLineNumber();
    }
    
    // Retorna o numero de colunas que o arquivo possui
    public int numeroColunas() throws FileNotFoundException {
    	
    	in = new BufferedReader(new FileReader(this.nameFile));
    	String linha;
    	int tam = 0;
    	
    	try {
	    	while((linha = in.readLine()) != null) {
	    		// tam eh o tamanho da maior coluna do arquivo
	            if(tam < linha.split(";").length)
	            	tam = linha.split(";").length;
	        }
	    	in.close();
    	}
    	catch (Exception done) {
			done.printStackTrace();
    	}
		return tam;
    }

    // Imprime o arquivo
    public void printFile() throws FileNotFoundException {
    	in = new BufferedReader(new FileReader(nameFile));
        String linha;
        
        try {
	        while((linha = in.readLine()) != null) {
	            System.out.println(linha);
	        }
	        in.close();
        }
        catch (Exception done) {
        	done.printStackTrace();
        }
    }

 // Retorna a linha indicada do arquivo em formato String[]
    public String[] getLinhaStr(int idLinha) throws FileNotFoundException {
    	String[] aux = new String[numeroColunas()];
    	in = new BufferedReader(new FileReader(nameFile));
        String linha;
        int linhaAtual = 0;
        
        try {
	        while((linha = in.readLine()) != null) {
	            if(linhaAtual == idLinha) {
	            	aux = linha.split(";");
	            	break;
	            }
	            linhaAtual++;
	        }
        }
        catch (Exception done) {
        	done.printStackTrace();
        }
    	return aux;
    }

    // Adiciona Acao do Arquivo no ArrayList<Acao>
    public void addAcaoFromFile(ArrayList<Acao> ac) throws FileNotFoundException {
    	String[] aux = new String[numeroColunas()];
    	in = new BufferedReader(new FileReader(nameFile));
        String linha = "";
        
        try {
        	//Descarta linha 0 (cabecalho)
        	linha = in.readLine();
        	
	        while((linha = in.readLine()) != null) {
            	aux = linha.split(";");
            	// Adiciona linha 1..n, em ac[0..n]
            	ac.add(addAcao(aux));
            	aux = null;
            	linha = "";
	        }
	        in.close();
        }
        catch (Exception done) {
        	done.printStackTrace();
        }
    }
    
    // Converte dados da String[] em Acao
    public Acao addAcao(String[] aux) throws Exception {
    	
    	Acao ac = new Acao();

    	int id = Integer.parseInt(aux[0]);	//id
    	String nome = aux[1];	// nome
    	String area = aux[2];	// area
    	double qntdeVol =  Double.parseDouble(aux[3]);	// volume
    	double qualidade = Double.parseDouble(aux[4]);	// qualidade
    	double custoVida = Double.parseDouble(aux[5]);	// custo de vida
    	double valorAcao = Double.parseDouble(aux[6]);	// valor acao
    	
    	ac.setAcao(id, nome, area, qntdeVol, qualidade, custoVida, valorAcao);
    	//System.out.println(ac.print());
    	
    	return ac;    	
    }
    
    
    // Get's e Set's
	public String getNameFile() {
		return nameFile;
	}

	public void setNameFile(String nameFile) {
		this.nameFile = nameFile;
	}

    
}