package chainOfResponsibility;

public class Cliente {
	//atributos
	
	public static void main(String[] args) {
		//se instancian los handlers concretos de la cadena
		Handler depAtencion = new DepartamentoAtencion();
		Handler depTecnico = new DepartamentoTecnico();
		Handler jefeInv = new JefeInventario();
		Handler gerenteTien = new GerenteTienda();
		
		//se setea el orden en el que se ubicaran en la cadena
		depAtencion.setSiguiente(depTecnico);
		depTecnico.setSiguiente(jefeInv);
		jefeInv.setSiguiente(gerenteTien);
		
		//se solicita el cambio al primer handler de la cadena
		depAtencion.solicitarCambio();
	}
}
