
package com.mycompany.prjpetshop.utillitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author IFTM
 */
public class Conexao {
    /*Abaixo as variaveeis com as informaçoes de acesso ao banco de daos são declaradas
    A palavra reservada "final" define que a variável não poderá ser alterada em outra parte do programa.*/
    final private String driver="org.postgresql.Driver";
    final private String url="jdbc:postgresql://localhost:5432/"
            + "petshop";
    final private String usuario = "postgres";
    final private String senha = "postgres";
    
    
    public Connection conectar(){
        Connection conn = null;
        
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url,usuario,senha);
            System.out.println("entrou");
            
        }catch(ClassNotFoundException ex){/*exceção caso o drive nao seja encontrado*/
            ex.printStackTrace();
        }catch (SQLException ex) {/*excecao caso o camiho de acesso, u´suario a conexão com banco de dados*/
            ex.printStackTrace();
        }
        /*retorna a variavel conn*/
        return conn;
    }
}
