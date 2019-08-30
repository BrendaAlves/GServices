package validar;

import java.io. *; 
import java.util . *; 
  
public class ValidaDados {  
	  
    public static void main(String[] args) {  
        try {  
            BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));  
            String tipo_usuario = entrada.readLine(); 
            String usuario = entrada.readLine();
			String senha = entrada.readLine();
            String arquivo = usuario+ ".txt";  
            
            if (confere(tipo_usuario, usuario, senha, new File(arquivo))) {  
                return;
            } 
        } catch (Throwable t) {  
            t.printStackTrace();  
        } finally {  
            System.exit(0);  
        }  
    }  
  
    public static boolean confere(String tipo_usuario, String usuario, String senha, File arquivo)  
            throws IOException {  
        Properties p = new Properties();  
        p.load(new FileInputStream(arquivo));  
        String usuarioLido = p.getProperty(tipo_usuario);
        String senhaLida = p.getProperty("Senha"); 

        //Exibe no console
        System.out.println("Pasta CPF ou CNPJ: "+tipo_usuario);
        System.out.println("Usuario digitado: "+usuario);
        System.out.println("Senha digitada: "+senha);
        System.out.println("Usuario que está no arquivo: "+usuarioLido);
        System.out.println("Senha que está no arquivo: "+senhaLida);
        
        return usuario.equals(usuarioLido) && senha.equals(senhaLida);  
    } 
}  

