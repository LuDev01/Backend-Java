package clase;

public class ControlRechazado extends ControlCalidad{
    @Override
    public String validar(Articulo articulo) {
        System.out.println("Articulo rechazado");
        return "Movido a rechazados";
    }
}
