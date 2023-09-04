package entity;

public class ProductoFruta extends Producto {
    private EnumUnidadDeVenta unidadDeVenta;

    public ProductoFruta(String nombre, int precio, EnumUnidadDeVenta unidadDeVenta) {
        super(nombre, precio);
        this.unidadDeVenta = unidadDeVenta;
    }

    public ProductoFruta() {}

    public EnumUnidadDeVenta getUnidadDeVenta() {
        return unidadDeVenta;
    }

    public void setUnidadDeVenta(EnumUnidadDeVenta unidadDeVenta) {
        this.unidadDeVenta = unidadDeVenta;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + " /// " +
                "Precio: $" + precio + " /// " +
                "Unidad de venta: " + unidadDeVenta;
    }

}
