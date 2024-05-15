package clases;

public class ApiProducto {
    public int descuentoProducto(Producto producto){
        if (producto.getTipo().equalsIgnoreCase("latas")){
            return 10;
        }
        else {
            return 0;
        }
    }
}
