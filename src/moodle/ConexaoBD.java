

package moodle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {

    private static final String URL = "jdbc:mysql://localhost:3306/ConexaoBD";
    private static final String USUARIO = "root";
    private static final String SENHA = "";

    public static Connection conectar() {

        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco.");
            e.printStackTrace();
            return null;
        }

    }

    public static void desconectar(Connection conexao) {

        try {

            if (conexao != null) {
                conexao.close();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}