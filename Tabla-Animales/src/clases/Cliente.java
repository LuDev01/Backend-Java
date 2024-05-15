package clases;

import org.apache.log4j.Logger;

import java.sql.*;

public class Cliente {
    private static final Logger logger= Logger.getLogger(Cliente.class);

    public static void main(String[] args) {
        //Inicialmente se crea el objeto inicializandolo en null
        Connection connection=null;
        try{
            //Método que devuelve la conexión
            connection=getConnection();

            //Crear tabla de animales en la tabla

            //Ns permite comunicarnos a la base de datos a traves del método statement
            Statement statement=connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS ANIMALES; CREATE TABLE ANIMALES " +
                    "(ID INT PRIMARY KEY, NOMBRE VARCHAR(20) NOT NULL, TIPO VARCHAR(20) NOT NULL)");

            logger.warn("se insertaron correctamente los animales");

            //Insertar animales en la tabla
            statement.execute("INSERT INTO ANIMALES VALUES (1,'Angie','Delfin'),(2,'Lucas','Perro'),(3,'Sabiola','Conejo'),(4,'Gardfield','Gato'),(5,'Pepo','Rana')");

            //logger.warn("Se creó con exito");

            //Para mostrar los datos necesito guardarlos a los valores en una clase de tipo ResultSet
            ResultSet rs=statement.executeQuery("SELECT * FROM ANIMALES");

            //Se hace ciclo para recorrer lo registros de la tabla
            while (rs.next()){
                System.out.println("ID: "+ rs.getInt(1)+" Nombre: "+ rs.getString(2)+" Tipo: "+rs.getString(3));

            }
            System.out.println("-----------------------------------------------------------------------------");

            //Eliminar un campo
            statement.execute("DELETE FROM ANIMALES WHERE ID=2");
            logger.warn("se elimino el ID 2");
            //Mostrar nuevamente los datos de la tabla

            ResultSet rs1=statement.executeQuery("SELECT * FROM ANIMALES");

            //Se hace ciclo para recorrer lo registros de la tabla
            while (rs1.next()){
                System.out.println("ID: "+ rs1.getInt(1)+" Nombre: "+ rs1.getString(2)+" Tipo: "+rs1.getString(3));

            }
            System.out.println("-----------------------------------------------------------------------------");

        }catch (Exception e){
            e.printStackTrace();
        }
        finally {
            try {
                connection.close();
                logger.warn("se cerro correctamente la conexion a la bdd");
            }
            catch (SQLException ex){
                ex.getMessage();
            }
        }
    }
    public static Connection getConnection() throws Exception{
        //Creación de método que nos devuelve la conexión y nos carga el driver necesario.
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/C3Animales","user123","user123");
    }

}
