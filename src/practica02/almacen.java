package practica02;

import libGenerica.generica;

public class almacen {
	protected generica<?,String>datos;
	public final String rSocial="Jugueteria Nacional",slogan="Los mejores juguetes";
	public almacen(int id_,String fabricante_) {
		datos=new generica<Integer, String>(id_,fabricante_);
	}
	public int getId() {
		return Integer.valueOf(datos.getAtr1().toString());
	}
	public String getFabricante() {
		return datos.getAtr3().toString();
	}

}
