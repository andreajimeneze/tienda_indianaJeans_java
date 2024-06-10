package clases;

import java.util.ArrayList;
import java.util.List;


public class ProductoServicio {
    private Producto producto = new Producto();
    private List<Producto> listaProductos = new ArrayList<>();


    public ProductoServicio() {

    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setListaProductos(List<Producto> listaProductos) {
        this.listaProductos = listaProductos;
    }

    public void listarProductos() {
        for(Producto producto : listaProductos) {
            System.out.println("**********************************************");
            System.out.println("Nombre del articulo: " + producto.getArticulo());
            System.out.println("Código: " + producto.getCodigo());
            System.out.println("Color: " + producto.getColor());
            System.out.println("Descripción: " + producto.getDescripcion());
            System.out.println("Marca: " + producto.getMarca());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Talla: " + producto.getTalla());
            System.out.println("**********************************************");

        }
        System.out.println();
    }

    public void  agregarProductos(Producto producto) {

        listaProductos.add(producto);

        System.out.println("**********************************************");
        System.out.println("Producto: " + producto.getArticulo() + " agregado correctamente");
        System.out.println("**********************************************");
        System.out.println();
    }
}
