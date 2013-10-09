package app.negocio;

import app.dao.DaoExcepcion;
import app.dao.DetallePedido;
import app.dao.PedidoDao;
import app.model.Pedido;
import java.util.Collection;

public class GestionPedidos {

    public void realizarPedido(String idUsuario, String fecha, String estado, double total, Collection<DetallePedido> detalles) throws DaoExcepcion {

        Pedido p = new Pedido();
        p.setIdUsuario(idUsuario);
        p.setFecha(fecha);
        p.setEstado(estado);
        p.setTotal(total);

        p.setDetalles(detalles);

        PedidoDao dao = new PedidoDao();
        try {
            dao.insertar(p);
        } catch (DaoExcepcion e) {
            throw e;
        }


    }
}
