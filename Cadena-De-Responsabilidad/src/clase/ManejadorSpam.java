package clase;

public class ManejadorSpam extends Manejador{
    @Override
    public String comprobarMail(Mail mail) {
        System.out.println("Finalmente, no se pudo procesar la solicitud.");
        return  "Movido a spam";

    }

}
