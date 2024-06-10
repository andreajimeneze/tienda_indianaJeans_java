package clases;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    private ProductoServicio productoServicio = new ProductoServicio();
    private ExportadorTxt exportadorTxt = new ExportadorTxt();
    private Utilidad utilidad = new Utilidad();

    private Scanner sc = new Scanner(System.in);

    public Menu() {

    }

    public void mostrarMenu() throws IOException {
        int opcion = 0;

        do {
            System.out.println("1 Listar producto");
            System.out.println("2 Agregar datos");
            System.out.println("3 Exportar datos");
            System.out.println("4 Salir");
            System.out.println();

            System.out.println("Elija una opción");
            opcion = sc.nextInt();

            if (opcion < 1 || opcion > 4) {
                System.out.println("Ingrese una opción entre 1 y 4");
            }
        } while (opcion < 1 || opcion > 4);

        ejecucionMenu(opcion);
    }

    public void ejecucionMenu(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                productoServicio.listarProductos();
                mostrarMenu();
                break;
            case 2:
                System.out.println("Crear producto");
                sc.nextLine();
                System.out.println("Ingrese nombre del artículo");
                String articulo = sc.nextLine();

                System.out.println("Ingrese código");
                String codigo = sc.nextLine();
                System.out.println("Ingrese color");
                String color = sc.nextLine();
                System.out.println("Ingrese descripción");
                String descripcion = sc.nextLine();
                System.out.println("Ingrese marca");
                String marca = sc.nextLine();
                System.out.println("Ingrese nuevo precio");
                String precio = sc.nextLine();
                System.out.println("Ingrese nueva talla");
                String talla = sc.nextLine();

                Producto producto = new Producto(articulo, precio, descripcion, codigo, talla, marca, color);
                productoServicio.agregarProductos(producto);

                mostrarMenu();
                break;
            case 3:
                System.out.println("Exportar datos");

                String nombreDirectorio = "fichero";
                String nombreArchivo = "listaProductos";

                exportadorTxt.exportar(nombreDirectorio, nombreArchivo, productoServicio.getListaProductos());
                mostrarMenu();
                break;
            case 4:
                System.out.println("Abandonando el sistema de clientes... ");
                utilidad.tiempoEspera(3000);
                utilidad.limpiarPantalla();
                System.out.println("Acaba de salir del sistema ");
                break;
            default:
                System.out.println("Opción no válida");
        }
    }
}