package entity;

public class ProductoAlmacen extends Producto {
    private int contenido;

    public ProductoAlmacen(String nombre, int precio, int contenido) {
        super(nombre, precio);
        this.contenido = contenido;
    }

    public ProductoAlmacen() {}

    public int getContenido() {
        return contenido;
    }

    public void setContenido(int contenido) {
        this.contenido = contenido;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + " /// " +
                "Contenido: " + contenido + "ml /// " +
                "Precio: $" + precio;
    }
}
