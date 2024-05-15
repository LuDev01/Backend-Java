package clases;

public class Cliente {
    public static void main(String[] args) {
        Tarjeta tarjeta=new Tarjeta(01023,"BBVA");
        Producto producto=new Producto("Tomates","latas");

        int cantidad=12;

        FacadeDescuento fachada=new FacadeDescuento();
        System.out.println("Descuento acumulado: "+fachada.descuento(producto,tarjeta,cantidad));
    }
}
