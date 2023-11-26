package PASOS123;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class cConnection {

    private String url = "jdbc:sqlserver://localhost:1433;" + "database=dbLIBRERIAESTUDIANTE";
    private String usr = "sa";
    private String pswd = "iosmilrojas123";
    private Connection con = null;

    public cConnection() { // Constructor, carga puente JDBC-ODBC
        loadDriver();
    }

    private void loadDriver() { // Carga el driver de la conexión a la base de datos
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException e) {
            System.out.println("Error al crear el puente JDBC-SQL Server");
        }
    }

    public Connection ObtenerConexion() { // Obtiene una conexión con el nombre del driver especificado
        System.out.println("Estableciendo conexión con " + url);
        try { // Obtiene la conexión
            con = DriverManager.getConnection(url, usr, pswd);
        } catch (SQLException ex) {
            System.out.println("No se pudo establecer la conexión");
            return null;
        }
        System.out.println("Conexión establecida con:t " + url);
        return con; // Regresa la conexión
    }

    public boolean closeConecction() { // Cerrar la conexión.
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println("No se cerro la conexión");
            return false;
        }
        System.out.println("Conexión cerrada con éxito ");
        return true;
    }
}