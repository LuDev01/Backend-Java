package clase;

public class CompruebaMail {
    private Manejador inicial;

    public CompruebaMail(){
        //Inicializar las partes de la cadena
        inicial= new ManejadorGerencial();
        Manejador tecnico=new ManejadorTecnico();
        Manejador comercial=new ManejadorComercial();
        Manejador spam=new ManejadorSpam();

        //Cadena de manejadores
        inicial.setSiguienteManejador(tecnico);
        tecnico.setSiguienteManejador(comercial);
        comercial.setSiguienteManejador(spam);
    }

    public String disparadorCadena(Mail mail){
        return inicial.comprobarMail(mail);
    }
}
