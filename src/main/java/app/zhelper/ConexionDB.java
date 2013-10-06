package app.zhelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {

    public static Connection obtenerConexion() throws SQLException {

        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/javaWeb",
                    "root", "mysql");
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Error de Conexion");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Error de Conexion2");
        }
        return con;
    }
}
