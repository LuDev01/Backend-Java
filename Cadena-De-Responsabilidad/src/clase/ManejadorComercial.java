package clase;

public class ManejadorComercial extends Manejador{
    @Override
    public String comprobarMail(Mail mail) {
        if(mail.getAsunto().equalsIgnoreCase("comercial") || mail.getDestino().equals("comercial@lacolmena.com")){
            return "El departamento comercial lo atenderá en unos minutos.";
        }
        else {
            System.out.println("No se pudo atender. Se derivará la consulta.");
        }
        return getSiguienteManejador().comprobarMail(mail);
    }

    }

