package chainOfResponsibility;

public class DepartamentoTecnico extends BaseHandler{
	//atributos
	
	@Override
	public void solicitarCambio() {
		//implementacion
		//tipo de fallo cubierto por la garantia
		this.siguiente.solicitarCambio(); //se pasa al jefe de inventario
	}
}
