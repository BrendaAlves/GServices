package gravar;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class GravaDados {
	public static String Read(String Caminho) {
        String conteudo = "";
        try {
            FileReader receber_arquivo = new FileReader(Caminho);
            BufferedReader ler_arquivo = new BufferedReader(receber_arquivo);
            String linha="";
            try {
                linha = ler_arquivo.readLine();
                while(linha!=null) {
                    conteudo += linha+"\n";
                    linha = ler_arquivo.readLine();
                }
                receber_arquivo.close();
                return conteudo;
            } 
            catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } 
        catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return "";
        }
    }
    public static boolean Write(String Caminho,String Texto){
        try {
            FileWriter receber_arquivo = new FileWriter(Caminho,true);
            PrintWriter gravar_arquivo = new PrintWriter(receber_arquivo);
            gravar_arquivo.println(Texto);
            gravar_arquivo.close();
            return true;
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
}