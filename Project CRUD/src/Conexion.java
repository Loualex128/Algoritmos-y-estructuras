import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection connect(){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/?user=root;" + "database=Personas;" + "user=root;" +  "password=password;");
            System.out.println("Base de Datos Conectada!");
            return con;
        } catch (SQLException e){
            System.out.println(e.toString());
            return null;
        }
    }
}
