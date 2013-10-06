
package app.model;

import java.util.Collection;

public class Categoria {
    //------------------- CAPA MODEL ----------------------------------
    private int idCategoria;
    private String nombre;
    private String descripcion;
    private Collection<Producto> productos;

    public Categoria(int idCategoria, String nombre, String descripcion) {
        this.idCategoria = idCategoria;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Categoria() {
       
    }

    public void setProductos(Collection<Producto> productos) {
        this.productos = productos;
    }

    public Collection<Producto> getProductos() {
        return productos;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
