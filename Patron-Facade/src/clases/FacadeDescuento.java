package clases;

public class FacadeDescuento implements IInFacadeDescuento{
    private ApiCantidad apiCantidad;
    private ApiProducto apiProducto;
    private ApiTarjeta apiTarjeta;

    public FacadeDescuento() {
        apiTarjeta=new ApiTarjeta();
        apiProducto=new ApiProducto();
        apiCantidad=new ApiCantidad();
    }

    @Override
    public int descuento(Producto producto, Tarjeta tarjeta, int cantidad) {
        int descuento=0;
        descuento=descuento+apiCantidad.descuentoCantidad(cantidad);
        descuento=descuento+apiProducto.descuentoProducto(producto);
        descuento=descuento+apiTarjeta.descuentoTarjeta(tarjeta);
        return descuento;
    }
}
