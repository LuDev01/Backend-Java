package service;

import dao.MedicamentoDAOH2;
import dao.iDao;
import model.Medicamento;

public class MedicamentoService {
    //Siempre vamos a asociarnos con el DAO

    private iDao<Medicamento> medicamentoiDao;

    public MedicamentoService(){
        medicamentoiDao=new MedicamentoDAOH2();
    }

    public Medicamento guardarMedicamento(Medicamento medicamento){
        return medicamentoiDao.guardar(medicamento);
    }
   public Medicamento buscarMedicamentoPorId(int id) {
         return medicamentoiDao.buscar(id);
   }
}
