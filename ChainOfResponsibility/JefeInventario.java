package chainOfResponsibility;

public class JefeInventario extends BaseHandler{
	//atributos
	
	@Override
	public void solicitarCambio() {
		// implementacion
		//existencia de producto en bodega
		//si el producto supera los 1000 dolares
		this.siguiente.solicitarCambio(); //se pasa al gerente de la tienda
		//caso contrario -> se acaba la cadena
	}
}
