
package app.dao;

import app.model.Pedido;

public class DetallePedido {
    	private int idDetallePedido;
	private Pedido pedido;
	private int idProducto;
	private double precio;
	private int cantidad;

    public DetallePedido() {
    }

    public int getIdDetallePedido() {
        return idDetallePedido;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setIdDetallePedido(int idDetallePedido) {
        this.idDetallePedido = idDetallePedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

        
}
