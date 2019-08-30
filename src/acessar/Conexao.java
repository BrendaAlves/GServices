package acessar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;

public class Conexao {
    //Método responsavel por abrir/estabelecer a conexão.
    public Connection conectarBanco() {
        Connection conecta = null;

        try {
        	//aqui especificamos o DRIVER referente ao banco que estamos usando no nosso caso o MySQL.
            Class.forName("com.mysql.jdbc.Driver");
            //na linha acima definimos o "endereço/caminho" para o banco que usaremos neste programinha.
            //conecta = DriverManager.getConnection("jdbc:mysql://localhost:3306/gaia","root",""); 
            conecta = DriverManager.getConnection("jdbc:mysql://127.0.0.1/gaia","root","");
                       
            System.out.println("Conexão criada com sucesso!");
            
            String cria = "CREATE TABLE IF NOT EXISTS CLIENTE (\n"
                    + "    id integer AUTOINCREMENT PRIMARY KEY,\n"
                    + "    cad_nomeCliente text NOT NULL,\n"
                    + "    cad_emailCliente text NOT NULL,\n"
                    + "    cad_telefoneCliente text NOT NULL,\n"
                    + "    cad_cpfCliente text NOT NULL,\n"
               		+ "    cad_senhaCliente text NOT NULL,\n"
        			+ "    cad_senhaConfCliente text NOT NULL,\n"
                    + ");";
            
            
            
			/*
			 * PreparedStatement preparedStmt = conecta.preparedStmt();
			 * preparedStmt.setString (1, "nome"); preparedStmt.setString (2, "teste");
			 * preparedStmt.setString (3, "123"); preparedStmt.setString (4, "123");
			 * preparedStmt.setString (5, "teste"); preparedStmt.setString (6, "teste");
			 * 
			 * // execute the preparedstatement preparedStmt.execute();
			 * 
			 * conecta.close();
			 */
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Conectar com Banco de Dados \n" + ex, "Erro de Conexão", JOptionPane.ERROR_MESSAGE);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar o driver do Banco de Dados \n" + ex, "Erro: Driver do Banco de Dados", JOptionPane.ERROR_MESSAGE);
        }
        return conecta;
    }
    

    //Método responsável por fechar a conexão;
    public void fecharConexao(Connection con) {
        try {
        	if (con != null && !con.isClosed()) {  
                con.close();
                JOptionPane.showMessageDialog(null, "Conexão fechada com sucesso!!!");
            }
        } catch (SQLException ex) {
            	JOptionPane.showMessageDialog(null, "Erro ao Fechar a conexão \n" + ex + JOptionPane.ERROR_MESSAGE);
        }
    }
    
}