
package app.dao;

public class DaoExcepcion extends Exception {

	private static final long serialVersionUID = 1L;

	public DaoExcepcion() {
		super();
	}

	public DaoExcepcion(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	public DaoExcepcion(String arg0) {
		super(arg0);
	}

	public DaoExcepcion(Throwable arg0) {
		super(arg0);
	}	
}

