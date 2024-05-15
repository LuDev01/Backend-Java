package clases;

import java.util.Date;

public class VacunatorioProxy implements ServicioVacuna{
    private Vacunatorio centroVacunatorio;

    public VacunatorioProxy() {
        centroVacunatorio= new Vacunatorio();
    }
    @Override
    public String vacunar(Persona persona) {
        //Filtrar y verificar
        Date hoy=new Date();
        System.out.println("La fecha  de hoy  es: "+ hoy);

        if (hoy.before(persona.getFechaVacuna())){
            return "Regrese cuando sea su fecha de vacunación";
        }
        else{
            return centroVacunatorio.vacunar(persona);
             }

    }
}
