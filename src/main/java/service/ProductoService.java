package service;

import entity.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductoService {

    public List<Producto> cargarListaDeProductos() {
    List<Producto> listaProductos = new ArrayList<Producto>();

    listaProductos.add(new ProductoBebida("Coca-Cola Zero", 20, 1.5));
    listaProductos.add(new ProductoBebida("Coca-Cola", 18, 1.5));
    listaProductos.add(new ProductoAlmacen("Shampoo Sedal", 19, 500));
    listaProductos.add(new ProductoFruta("Frutillas", 64, EnumUnidadDeVenta.Kilo));

    return listaProductos;
    }

    public void imprimirLista(List<Producto> listaProductos){
        for (Producto producto : listaProductos){
            System.out.println(producto);
        }
        System.out.println("=============================");
    }

    public void imprimirProductoMasCaro (List<Producto> listaProductos){
        Collections.sort(listaProductos);
        String productoMasCaro = listaProductos.get(0).getNombre();
        System.out.println("Producto más caro: " + productoMasCaro);
    }

    public void imprimirProductoMasBarato (List<Producto> listaProductos){
        Collections.sort(listaProductos);
        String productoMasCaro = listaProductos.get(listaProductos.size()-1).getNombre();
        System.out.println("Producto más barato: " + productoMasCaro);
    }

}

