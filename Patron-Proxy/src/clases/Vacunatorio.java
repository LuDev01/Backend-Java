package clases;

public class Vacunatorio implements ServicioVacuna{
    @Override
    public String vacunar(Persona persona) {
        System.out.println("Verificando datos del paciente");
        System.out.println("Paciente vacunado satisfactoriamente");
        System.out.println("Datos del paciente: ");
        System.out.println(persona.getCedula());
        System.out.println(persona.getCedula());
        System.out.println("Vacuna colocada: "+persona.getNombreVacuna());
        return "Finalizado";
    }
}
