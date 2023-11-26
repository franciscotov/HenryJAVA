package M3C7.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConfig {

    // Configurar los parámetros de conexión
    static String url = "jdbc:h2:~/test"; // URL de conexión a la base de datos H2
    static String username = "sa"; // Nombre de usuario de la base de datos
    static String password = ""; // Contraseña de la base de datos
    public static Connection getConection() {
        try {
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static Connection createSchema() {
        try(Connection conn = getConection()) {
            String createTable = "CREATE SCHEMA IF NOT EXISTS cards_management;";
            try(var stmt = conn.createStatement()) {
                stmt.executeUpdate(createTable);
                System.out.println("Table creation successfully");
            }
            return DriverManager.getConnection(url, username, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createCreditCardTable() {
        try(Connection conn = getConection()) {
            String createTable = "CREATE TABLE IF NOT EXISTS credit_card(\n" +
                    " id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                    "number VARCHAR(16) NOT NULL,\n" +
                    "owner VARCHAR(20) NOT NULL\n" +
                    ");";
            try(var stmt = conn.createStatement()) {
                stmt.executeUpdate(createTable);
                System.out.println("Table creation successfully");
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void createDebitCardTable() {
        try(Connection conn = getConection()) {
            String createTable = "CREATE TABLE IF NOT EXISTS debit_card(\n" +
                    " id INT PRIMARY KEY AUTO_INCREMENT,\n" +
                    "number VARCHAR(16) NOT NULL,\n" +
                    "owner VARCHAR(20) NOT NULL\n" +
                    ");";
            try(var stmt = conn.createStatement()) {
                stmt.executeUpdate(createTable);
                System.out.println("Table creation successfully");
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public static void runDataChanger() {
        try(Connection conn = getConection()) {
            String insertValues = "INSERT INTO debit_card(id, number, owner) VALUES(1, 1234123456785678, 'francisco tovar')," +
                    "(2, 1234123456785678, 'francisco tovar')," +
                    "(3, 1234123456785678, 'francisco tovar')";
            String insertValuesCredits = "INSERT INTO credit_card(id, number, owner) VALUES(1, 1234123456785678, 'francisco tovar c')," +
                    "(2, 1234123456785678, 'francisco tovar c')," +
                    "(3, 1234123456785678, 'francisco tovar c')";
            try(var stmt = conn.createStatement()) {
                stmt.executeUpdate(insertValues);
                stmt.executeUpdate(insertValuesCredits);
                System.out.println("Table creation successfully");
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
