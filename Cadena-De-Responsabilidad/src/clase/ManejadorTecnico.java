package clase;

public class ManejadorTecnico extends Manejador{
    @Override
    public String comprobarMail(Mail mail) {
        if(mail.getAsunto().equalsIgnoreCase("tecnico") || mail.getDestino().equals("tecnico@lacolmena.com")){
            return "El departamento técnico lo atenderá en unos minutos.";
        }
        else {
            System.out.println("No se pudo atender. Se derivará la consulta.");
        }
        return getSiguienteManejador().comprobarMail(mail);
    }
}
