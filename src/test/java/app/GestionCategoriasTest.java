
package app;

import app.dao.DaoExcepcion;
import app.model.Categoria;
import app.negocio.GestionCategoria;
import java.util.Collection;
import junit.framework.Assert;
import org.junit.Test;


public class GestionCategoriasTest {
    
	@Test
	public void insertarTest() {

		GestionCategoria negocio = new GestionCategoria();

		try {
			negocio.insertar("Electrónicos", "Categoria de electrónicos");

			Categoria nuevo = negocio.obtener(7);

			Assert.assertEquals("Categoria de electrónicos", nuevo.getDescripcion());

		} catch (DaoExcepcion e) {
			Assert.fail("Fallo la inserción: " + e.getMessage());
		}
	}

//	@Test
	public void actualizarTest() {

		GestionCategoria negocio = new GestionCategoria();

		try {

			negocio.actualizar(7, "Electrónicos", "Categoria de electrónicos 2");

			Categoria nuevo = negocio.obtener(7);

			Assert.assertEquals("Categoria de electrónicos 2", nuevo.getDescripcion());

		} catch (DaoExcepcion e) {

			Assert.fail("Falló la actualización: " + e.getMessage());

		}
	}
	
//	@Test
	public void listarTest() {

		GestionCategoria negocio = new GestionCategoria();

		try {
			Collection<Categoria> listado = negocio.listar();

			System.out.println(listado.size());

			Assert.assertTrue(listado.size() > 0);

		} catch (DaoExcepcion e) {

			Assert.fail("Falló el listado: " + e.getMessage());

		}

	}

//	@Test
	public void eliminarTest() {

		GestionCategoria negocio = new GestionCategoria();

		try {

			negocio.eliminar(8);

			Categoria nuevo = negocio.obtener(8);

			Assert.assertEquals(null, nuevo.getDescripcion());

		} catch (DaoExcepcion e) {

			Assert.fail("Falló la eliminición: " + e.getMessage());

		}

	}



}
