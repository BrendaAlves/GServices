package acessar;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import classes.Cliente;

public class ClienteDAO { 
    
    //MÉTODO RESPONSÁVEL POR SALVAR UM NOVO REGISTRO NO BANCO DE DADOS.
    public boolean salvarCliente(Cliente cliente) {
        boolean salvou = true;
        Connection conecta = null;
        Conexao c = new Conexao(); 
        //aqui eu crio um objeto atraves da primeira classe que fiz nesta explicação e abaixo chamo o metodo abrir conexao, evitando que eu tenha que digitar todo aquele codigo de novo.
        try {
        	conecta = c.conectarBanco();
            if (conecta != null) {
                
                //aqui eu mando jogar na tabela do banco(Cliente) nos campos(nome,endereco,estado e biografia) o que esta salvo dentro das variaveis daquele objeto cliente que criamos la em cima.
                Statement stm = conecta.createStatement();
                stm.executeUpdate("insert into Cliente(nome, cpf, telefone, email, senha e senha2) "
                		+ "values ('" + cliente.getNomeCliente() + "' , '" + cliente.getCpfCliente() + "' ,'" + cliente.getTelefoneCliente() + "',  '" + cliente.getEmailCliente() + "',  '" + cliente.getSenhaCliente() + "',  '" + cliente.getSenhaConfCliente() + "')");
                
                salvou = false;
                JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");

            } else {
                System.out.println("Conexão nula.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao tentar salvar cadastro no banco de dados." + ex + JOptionPane.ERROR_MESSAGE);
        } finally {
            c.fecharConexao(conecta);
        }
        return salvou;
    }
}