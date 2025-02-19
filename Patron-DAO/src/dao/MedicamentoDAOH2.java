package dao;

import model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MedicamentoDAOH2 implements iDao<Medicamento>{
    private static final Logger logger=Logger.getLogger(MedicamentoDAOH2.class);
    private static final String SQL_INSERT="INSERT INTO MEDICAMENTOS VALUES(?,?,?,?,?,?)";
    private static final String SQL_SEARCH_BY_ID="SELECT * FROM MEDICAMENTOS WHERE ID=?";
    @Override
    public Medicamento guardar(Medicamento medicamento) {
        Connection connection=null;
        try {
            connection=BD.getConnection();
            PreparedStatement psInsert=connection.prepareStatement(SQL_INSERT);
            psInsert.setInt(1,medicamento.getId());
            psInsert.setInt(2,medicamento.getCodigo());
            psInsert.setString(3,medicamento.getNombre());
            psInsert.setString(4,medicamento.getLaboratorio());
            psInsert.setInt(5,medicamento.getCantidad());
            psInsert.setDouble(6,medicamento.getPrecio());
            psInsert.execute();
            logger.info("Datos agregados a la tabla");
        }catch (Exception e){
            logger.warn(e.getMessage());
        }
        return null;
    }

    @Override
    public Medicamento buscar(int id) {
        Connection connection=null;
        try{
            connection=BD.getConnection();
            PreparedStatement psSearch=connection.prepareStatement(SQL_SEARCH_BY_ID);
            psSearch.setInt(1,id);
            psSearch.execute();

            ResultSet rs=psSearch.executeQuery();

            if (rs.next()){
                logger.info("Medicamento  encontrado :)");
                Medicamento medicamento=new Medicamento(rs.getInt(1),rs.getInt(2),rs.getString(3),rs.getString(4),rs.getInt(5), rs.getDouble(6));
                return medicamento;
            }
            else{
                logger.info("Medicamento no encontradoo :(");
            }
        }
        catch (Exception e){
            logger.warn(e.getMessage());
        }
        return null;
    }
}
