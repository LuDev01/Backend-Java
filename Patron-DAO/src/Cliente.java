import dao.BD;
import model.Medicamento;
import org.apache.log4j.Logger;
import service.MedicamentoService;

public class Cliente {
    private static final Logger logger=Logger.getLogger(Cliente.class);
    public static void main(String[] args) {
        Medicamento medicamento=new Medicamento(1,232424,"Ibuprofeno","BAYER",1000,20.4);
        Medicamento medicamento2=new Medicamento(2,123466,"Paracetamon","BAYER",1000,20.4);
        BD.crearTablas();
        MedicamentoService medicamentoService=new MedicamentoService();
        medicamentoService.guardarMedicamento(medicamento);
        medicamentoService.guardarMedicamento(medicamento2);

        Medicamento medicamentoPrueba= medicamentoService.buscarMedicamentoPorId(2);

        if (medicamentoPrueba!=null){
            logger.info("Medicamento encontrado: "+ medicamentoPrueba.getNombre());
        }
        else{
            logger.warn("Medicamento no encontrado");
        }
    }
}
