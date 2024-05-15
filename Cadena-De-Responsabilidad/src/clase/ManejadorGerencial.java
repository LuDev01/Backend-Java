package clase;

public class ManejadorGerencial extends Manejador{
    @Override
    public String comprobarMail(Mail mail) {
        if(mail.getAsunto().equalsIgnoreCase("gerencia ") || mail.getDestino().equals("gerencia@lacolmena.com")){
            return "El departamento de gerencia lo atenderá en unos minutos.";
        }
        else {
            System.out.println("No se pudo atender. Se derivará la consulta.");
        }
        return getSiguienteManejador().comprobarMail(mail);
    }
}

