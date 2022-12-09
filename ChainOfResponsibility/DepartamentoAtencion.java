package chainOfResponsibility;

public class DepartamentoAtencion extends BaseHandler{
	//atributos
	
	@Override
	public void solicitarCambio() {
		// implementacion
		// el producto se encuentra en periodo de garantia
		this.siguiente.solicitarCambio(); //se pasa al departamento tecnico
	}
}
