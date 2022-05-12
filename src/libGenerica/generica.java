package libGenerica;
import java.util.ArrayList;
public class generica <T,S>{
	private T atr1, atr2;
	private S atr3, atr4;
	private ArrayList<T> almacen;
	public generica() {
		super();
		almacen = new ArrayList<T>();
	}
	public generica(S a1, T a2, T a3) {
		this.setAtr3(a1);
		this.setAtr1(a3);
		this.setAtr2(a2);
	}
	public generica(T a1, S a2) {
		this.setAtr1(a1);
		this.setAtr3(a2);
	}
	public T getAtr1() {
		return atr1;
	}
	public void setAtr1(T atr1) {
		this.atr1 = atr1;
	}
	public T getAtr2() {
		return atr2;
	}
	public void setAtr2(T atr2) {
		this.atr2 = atr2;
	}
	public S getAtr3() {
		return atr3;
	}
	public void setAtr3(S atr3) {
		this.atr3 = atr3;
	}	
	public void addElement(T objeto) {
		almacen.add(objeto);
	}
	public ArrayList<T> getAlmacen(){
		return almacen;
	}
	public S getAtr4() {
		return atr4;
	}
	public void setAtr4(S atr4) {
		this.atr4 = atr4;
	}
	public void print(String data) {
		System.out.print(data);
	}
}
