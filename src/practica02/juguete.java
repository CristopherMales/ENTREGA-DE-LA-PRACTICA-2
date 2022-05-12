package practica02;

import libGenerica.generica;

public class juguete extends almacen{
	private generica<?,Integer>toyData;
	public juguete(int id, String fabricante, String nameJuguete, double precio,int stock) {
		super(id, fabricante);
		toyData=new generica<Double,Integer>(precio,stock);
		datos.setAtr4(nameJuguete);
	}
	public Double getPrecio() {
		return Double.valueOf(toyData.getAtr1().toString());
	}
	public String nombreJuguete() {
		return datos.getAtr4().toString();
	}
	public int thisStock() {
		return toyData.getAtr3();
	}
	public boolean new_compra(int newCompra) {
		if(newCompra>thisStock()) {
			return false;
		}else {
			toyData.setAtr3(toyData.getAtr3()-newCompra);	
			System.out.println("JUGUETES=FACTURA=JUGETERIA=NACIONAL");
			System.out.println("Valor Unitario: $"+getPrecio()+"IVA 12%: $"+(getPrecio()+(getPrecio()*0.12))+" Total de unidades compradas: "+newCompra+" Total a pagar: $"+((getPrecio()+(getPrecio()*0.12))*newCompra));
			return true;
		}
	}
	public void getBData(){
		System.out.println("Id: "+getId()+"\tFabrica: "+getFabricante()+"\tNombre: "+nombreJuguete()
		+"\tPrecio: $"+getPrecio()+"\tStock: "+thisStock()+"\tPrecio Final(Incluido IVA): $"+(getPrecio()+(getPrecio()*0.12)));

	}
	public void restock(int valor) {
		toyData.setAtr3(valor);
		System.out.println("Pedido Procesado, Entregados y listos para la venta: #"+valor+ " unidades");

	}
}



