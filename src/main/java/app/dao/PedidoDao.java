package app.dao;

import app.model.Pedido;
import app.zhelper.ConexionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PedidoDao extends BaseDao {

    public Pedido insertar(Pedido vo) throws DaoExcepcion {
        System.out.println("PedidoDAO: insertar()");

        String query = "INSERT INTO pedido (idUsuario,fecha,estado,total) VALUES (?,?,?,?)";
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            con = ConexionDB.obtenerConexion();
            con.setAutoCommit(false);
            stmt = con.prepareStatement(query);
            stmt.setString(1, "001");
            stmt.setString(2, "1987/09/17");
            stmt.setString(3, "1");
            stmt.setString(4, "500");

            int i = stmt.executeUpdate();
            if (i != 1) {
                throw new SQLException("No se realizo la inserción");
            }

            /*int extrae = 0;
             query = "select LAST_INSERT_ID()";
             stmt = con.prepareStatement(query);*/
            con.commit();
        } catch (SQLException e) {
            try {
                con.rollback();
            } catch (SQLException e1) {
                throw new DaoExcepcion(e.getMessage());
            }
            System.err.println(e.getMessage());
            throw new DaoExcepcion(e.getMessage());
        } finally {
            try {
                con.setAutoCommit(true);
            } catch (SQLException e) {
                throw new DaoExcepcion(e.getMessage());
            }
            this.cerrarResultSet(rs);
            this.cerrarStatement(stmt);
            this.cerrarConexion(con);
        }
        return vo;
    }
}
