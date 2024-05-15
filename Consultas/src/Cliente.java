import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Cliente {
    private static final String SQL_DROP_CREATE="DROP TABLE IF EXISTS CUENTAS; " +
            "CREATE TABLE CUENTAS (ID INT PRIMARY KEY, NOMBRE VARCHAR(100) NOT NULL, NUMERO_CUENTA INT NOT NULL, SALDO NUMERIC(10,2) NOT NULL)";
    private static final String SQL_INSERT=" INSERT INTO CUENTAS VALUES(?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE CUENTAS SET SALDO=? WHERE ID=?";

    public static final Logger logger=Logger.getLogger(Cliente.class);

    public static void main(String[] args) {
        Connection connection=null;

        try{
            connection=getConnection();

            //Crear la tabla
            Statement statement=connection.createStatement();
            statement.execute(SQL_DROP_CREATE);
            //logger.info("Tablas creadas con éxito);
            System.out.println("Tablas creadas con éxito");

            PreparedStatement psInsert=connection.prepareStatement(SQL_INSERT);

            //Cargar las parametrizadas
            psInsert.setInt(1,1);
            psInsert.setString(2,"Luisita");
            psInsert.setInt(3,111111);
            psInsert.setDouble(4,200);
            psInsert.execute();
            //logger.info("Datos cargados con éxito)
            System.out.println("Datos cargados con éxito");

            PreparedStatement psUpdate=connection.prepareStatement(SQL_UPDATE);
            psUpdate.setDouble(1,200+10);
            psUpdate.setInt(2,1);
            psUpdate.execute();
            //logger.info("Datos actualizados con éxito);
            System.out.println("Datos actualizados con éxito");

        }
        catch (Exception e){
            //logger.error(e.getMessage);
            System.out.println("Errooooor");
        }
    }
    public static Connection getConnection() throws  Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/C9_Consultas","sa","sas");
    }
}
