
package app.service;

import app.dao.CategoriaDao;
import app.dao.DaoExcepcion;
import app.model.Categoria;
import java.util.Collection;

public class GestionCategoria {

    public static void main(String[] args) throws DaoExcepcion {
        //Categoria catOfi=GestionCategoria.insertar("OFICINA", "prueba1");
        //Categoria catOfi2=GestionCategoria.insertar("OFICINA2", "prueba1");
        GestionCategoria.Listar();
        
    }
    
	public Collection<Categoria> buscarPorNombre(String nombre)
			throws DaoExcepcion {
		CategoriaDao dao = new CategoriaDao();
		return dao.listar();
	}

	public static Categoria insertar(String nombre, String descripcion)
			throws DaoExcepcion {
		CategoriaDao dao = new CategoriaDao();

		Categoria vo = new Categoria();
		vo.setNombre(nombre);
		vo.setDescripcion(descripcion);

		return dao.insertar(vo);
	}

	public Categoria obtener(int idCategoria) throws DaoExcepcion {
		CategoriaDao dao = new CategoriaDao();
		return dao.obtener(idCategoria);
	}

	public void eliminar(int idCategoria) throws DaoExcepcion {
		CategoriaDao dao = new CategoriaDao();
		dao.eliminar(idCategoria);
	}

	public Categoria actualizar(int idCategoria, String nombre,
			String descripcion) throws DaoExcepcion {
		CategoriaDao dao = new CategoriaDao();

		Categoria vo = new Categoria();
		vo.setIdCategoria(idCategoria);
		vo.setNombre(nombre);
		vo.setDescripcion(descripcion);

		return dao.actualizar(vo);
	}

	public Collection<Categoria> listar() throws DaoExcepcion {
		CategoriaDao dao = new CategoriaDao();
		return dao.listar();
	}
        
        public static void Listar() throws DaoExcepcion{
            CategoriaDao dao=new CategoriaDao();
            Collection<Categoria> cate=dao.listar();
            
            for(Categoria categoria: cate){
                System.out.println(categoria.getIdCategoria()+"  "+categoria.getNombre());
            }
            
        }

}
