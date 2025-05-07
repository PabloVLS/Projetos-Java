package prj_ListaDeCompras_Utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Pablo
 */
public class Conexao {

    // Atributo estático que guarda a instância única da classe
    private static Conexao instancia;

    // Atributo que representa a conexão com o banco de dados
    private Connection conexao;

    // Parâmetros de conexão (ajustados para PostgreSQL)
    private final String driver = "org.postgresql.Driver";
    private final String url = "jdbc:postgresql://localhost:5432/listaCompras";
    private final String usuario = "postgres";
    private final String senha = "postgres";

    // Construtor privado - impede que outras classes criem novas instâncias
    private Conexao() {
        try {
            Class.forName(driver); // Carrega o driver JDBC
            conexao = DriverManager.getConnection(url, usuario, senha); // Abre conexão
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    // Método público e estático que retorna a instância única da classe
    public static Conexao getInstancia() {
        if (instancia == null) {
            instancia = new Conexao(); // cria a instância se ainda não existir
        }
        return instancia; // retorna a instância única
    }

    // Método que retorna a conexão com o banco de dados
    public Connection getConexao() {
        return conexao;
    }
}