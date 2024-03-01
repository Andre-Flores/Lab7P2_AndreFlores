package lab7p2_andreflores;

import java.io.File;
import java.util.ArrayList;

public class Archivos {

    File archivo;

    private ArrayList<Producto> productos;

    public Archivos(File archivo) {
        this.archivo = archivo;
    }

    public void aniadirProducto(Producto p) {
        productos.add(p);
    }
}
