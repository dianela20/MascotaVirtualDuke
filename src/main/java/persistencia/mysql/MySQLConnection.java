package persistencia.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQLConnection {
    final String URL = "jdbc:mysql://localhost:3306/";
    final String BD = "dukemascotavirtual";
    final String USERNAME = "root";
    final String PASSWORD = "";


    Connection connection;

    public Connection establecerConexion() {
        // Establecemos la conexión con la base de datos
        try {
            connection = DriverManager.getConnection(URL + BD, USERNAME, PASSWORD);
            System.out.println("Conexión con base de datos " + BD + " ha sido abierta");

        /*    String sql = "CREATE TABLE MASCOTA"
                    + "(id INTEGER PRIMARY KEY AUTO_INCREMENT, "
                    + "name VARCHAR (255), "
                    + "fecha_nacimiento DATE, "
                    + "fecha_muerte DATE, "
                    + "is_live BOOLEAN, "
                    + "nivel_energia INT (11), "
                    + "nivel_hambre VARCHAR (255), "
                    + "nivel_cansancio VARCHAR (255), "
                    + "nivel_felicidad VARCHAR (255), "
                    + "nivel_aburrimiento VARCHAR (255), "
                    + "propietario CHAR(255))";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.executeUpdate();


            stmt.close();
            connection.close();*/


        } catch (SQLException e) {
            System.out.println("No se ha podido ESTABLECER la conexión con la base de datos");
            e.printStackTrace();
        }
        return connection;
    }

    public void cerrarConexion(Connection connection) {
        try {
            connection.close();
            System.out.println("Conexión con base de datos " + BD + " ha sido cerrada");
        } catch (SQLException e) {
            System.out.println("No se ha podido CERRAR la conexión con la base de datos");
            e.printStackTrace();
        }
    }

    public PreparedStatement enviarConsulta(Connection connection, String consultaSQL) {
        try {
            return connection.prepareStatement(consultaSQL);
        } catch (SQLException e) {
            System.out.println("No se ha podido generar el objeto PrepareStatement");
            e.printStackTrace();
        }
        return null;
    }
}

