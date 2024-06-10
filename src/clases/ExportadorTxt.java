package clases;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class ExportadorTxt extends ExportarTxt {

    public ExportadorTxt() {
    }

    public void exportar(String nombreDirectorio, String nombreArchivo, List<Producto> listaProductos) throws IOException {

        File directorio = new File("src/" + nombreDirectorio);
        File archivo = new File(directorio + "/" + nombreArchivo + ".txt");

        if (!directorio.exists()) {
            directorio.mkdir();
            System.out.println("Directorio creado correctamente");
        }

        if (directorio.exists() && !archivo.exists()) {
            archivo.createNewFile();
            System.out.println("Archivo creado correctamente");
        } else {
            System.out.println("Directorio y archivo ya fueron creados");
        }

        try {
            FileWriter fw = new FileWriter(archivo);
            BufferedWriter bf = new BufferedWriter(fw);

            if (archivo.exists()) {

                for(int i = 0; i < listaProductos.size(); i++) {

                    bf.write(listaProductos.get(i).toString());
                    bf.newLine();
                }
                bf.close();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}