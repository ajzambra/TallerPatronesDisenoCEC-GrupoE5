package chainOfResponsibility;

public interface Handler {
	public void setSiguiente(Handler siguiente);
	public void solicitarCambio();
}
