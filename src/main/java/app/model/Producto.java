package app.model;

public class Producto {
    //----------------------- CAPA MODEL -------------------------------
    private int idProducto;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;
    private int importancia;
    private String imagen;
    private Categoria categoria;

    public Producto(int idProducto, String nombre, String descripcion, double precio, int stock, int importancia, String imagen, Categoria categoria) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.importancia = importancia;
        this.imagen = imagen;
        this.categoria = categoria;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public int getImportancia() {
        return importancia;
    }

    public String getImagen() {
        return imagen;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setImportancia(int importancia) {
        this.importancia = importancia;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
}
