package chainOfResponsibility;

public abstract class BaseHandler implements Handler{
	protected Handler siguiente;
	
	public void setSiguiente(Handler siguiente){
		this.siguiente = siguiente;
	}
	
	public abstract void solicitarCambio();
}
