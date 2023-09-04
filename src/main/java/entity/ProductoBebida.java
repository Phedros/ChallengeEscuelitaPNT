package entity;

public class ProductoBebida extends Producto {
    private Double litros;

    public ProductoBebida(String nombre, int precio, Double litros) {
        super(nombre, precio);
        this.litros = litros;
    }

    public ProductoBebida() {}

    public Double getLitros() {
        return litros;
    }

    public void setLitros(Double litros) {
        this.litros = litros;
    }

    @Override
    public String toString() {
        return  "Nombre: " + nombre + " /// " +
                "Litros: " + litros + " /// " +
                "Precio: $" + precio;
    }

}
