package app.model;

import app.dao.DetallePedido;
import java.util.ArrayList;
import java.util.Collection;

public class Pedido {

    	private int idPedido;
	private String idUsuario;
	private String fecha;
	private String estado;
	private double total;
	private Collection<DetallePedido> detalles = new ArrayList<DetallePedido>();

    public Pedido() {
    }

    public int getIdPedido() {
        return idPedido;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public String getFecha() {
        return fecha;
    }

    public String getEstado() {
        return estado;
    }

    public double getTotal() {
        return total;
    }

    public Collection<DetallePedido> getDetalles() {
        return detalles;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void setDetalles(Collection<DetallePedido> detalles) {
        this.detalles = detalles;
    }
      
}
