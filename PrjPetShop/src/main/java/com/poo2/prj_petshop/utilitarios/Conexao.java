package com.poo2.prj_petshop.utilitarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * CLASSE DE CONEXÃO COM BANCO DE DADOS USANDO PADRÃO SINGLETON
 * 
 * O padrão Singleton garante que haverá apenas **uma única instância**
 * desta classe durante toda a execução do programa. Isso é útil para evitar
 * a criação descontrolada de múltiplas conexões com o banco, o que pode
 * causar lentidão ou até travamentos por excesso de conexões abertas.
 * 
 * COMO FUNCIONA:
 * ----------------------------------------------------------------------------
 * 1) O construtor é **privado**, então ninguém pode criar novas instâncias
 *    de fora da classe.
 * 
 * 2) A classe tem um atributo estático chamado `instancia`, que guarda
 *    a instância única da classe.
 * 
 * 3) Quando alguém chama `Conexao.getInstancia()`, o método verifica se
 *    já existe uma instância:
 *        - Se NÃO existir, cria uma nova.
 *        - Se JÁ existir, apenas retorna a mesma instância.
 * 
 * 4) A conexão com o banco é aberta apenas uma vez, dentro do construtor.
 * 
 * 5) O método `getConexao()` retorna a conexão já estabelecida.
 * 
 * COMO USAR NO CÓDIGO:
 * ----------------------------------------------------------------------------
 * Em vez de:
 *      Connection conn = new Conexao().conectar();  // ERRADO! cria novas instâncias
 * 
 * Use:
 *      Connection conn = Conexao.getInstancia().getConexao(); // CERTO! usa a única instância
 * 
 * ----------------------------------------------------------------------------
 * LIMITAÇÃO:
 * - Essa implementação mantém a conexão sempre aberta.
 * - Em aplicações maiores (como web apps), o ideal seria usar um **pool de conexões**
 *   como HikariCP ou C3P0.
 */

public class Conexao {

    // Atributo estático que guarda a instância única da classe
    private static Conexao instancia;

    // Atributo que representa a conexão com o banco de dados
    private Connection conexao;

    // Parâmetros de conexão (ajustados para PostgreSQL)
    private final String driver = "org.postgresql.Driver";
    private final String url = "jdbc:postgresql://localhost:5432/petshop";
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
