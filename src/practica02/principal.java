package practica02;

import java.util.Scanner;

import libGenerica.generica;

public class principal {


	public static void main(String[] args) {
		int dat=1;
		@SuppressWarnings("resource")
		Scanner in=new Scanner(System.in);
		boolean busqueda=false;
		generica<String,Double> entradaDatos=new generica<String,Double>("",0.0);
		// TODO Auto-generated method stub
		generica<juguete,Integer> listaProductos=new generica<juguete,Integer>();

		do {	
			entradaDatos.print("\n==Juguetería Nacional-Los Mejores Juguetes==\r\n"
					+ "1.Ingresar nueva adquisisión\r\n"
					+ "2.Listar Juguetes en Inventario\r\n"
					+ "3.Vender Juguetes\r\n"
					+ "4.stock de Productos\r\n"
					+ "0.Salir\r\n"
					+ "Ingrese una Opción");
			dat=in.nextInt();
			if(dat==1) {

				entradaDatos.print("Ingrese el id del juguete:");
				entradaDatos.setAtr3((double) in.nextInt());
				entradaDatos.print("Ingrese el nombre del Fabricante:");
				entradaDatos.setAtr1(in.next());
				entradaDatos.print("Ingrese el nombre del Juguete:");
				entradaDatos.setAtr2(in.next());
				entradaDatos.print("Ingrese el Precio:");
				entradaDatos.setAtr4(in.nextDouble());
				entradaDatos.print("Ingrese el total de productos comprados");
				listaProductos.addElement(new juguete(entradaDatos.getAtr3().intValue(),entradaDatos.getAtr1(),entradaDatos.getAtr2(),entradaDatos.getAtr4(),in.nextInt()));

			}
			else if(dat==2) {
				for(juguete jug: listaProductos.getAlmacen()) {
					jug.getBData();
				}
			}
			else if(dat==3) {
				entradaDatos.print("Ingrese el nombre:");
				String nombre=in.next();
				for(juguete jug: listaProductos.getAlmacen()) {
					if(jug.nombreJuguete().equals(nombre)) {
						if(jug.thisStock()!=0) {
							entradaDatos.print("Cantidad:");
							if(!jug.new_compra(in.nextInt())) {
								entradaDatos.print("\nNo existe el producto o las unidades están fuera de stock");
								busqueda=true;
							}
						}
					}
				}
				if(!busqueda) {
					entradaDatos.print("\nNo existe el producto o las unidades están fuera de stock");
				}					
			}
			else if(dat==4) {
				busqueda=false;
				entradaDatos.print("Ingrese el identificador: ");
				entradaDatos.setAtr3(in.nextDouble());
				entradaDatos.print("Ingrese el nombre: ");
				entradaDatos.setAtr1(in.next());
				for(juguete jug: listaProductos.getAlmacen()) {
					if(jug.getId()==entradaDatos.getAtr3()&&jug.nombreJuguete().equals(entradaDatos.getAtr1())){

						busqueda=true;
						if(jug.thisStock()>=1) {
							entradaDatos.print("Aun exite este producto");
						}
						else {
							entradaDatos.print("Cantidad ");
							jug.restock(in.nextInt());
						}
					}
				}
				if(!busqueda) {
					entradaDatos.print("NO EXISTE UN PRODUCTO CON ESTE NOMBRE");
				}
			}
			else if(dat==0) {
				entradaDatos.print("FIN DE APP");
			}

		}while(dat	!=0);

	}

}
