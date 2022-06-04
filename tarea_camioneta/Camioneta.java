// Giovanni Urdaneta
// CI: 28288477

package tarea_camioneta;

public class Camioneta {
	String color;
	private int ruedas;
	private float ancho;
	private float largo;
	private float peso;
	String marca;
	String modelo;
	private int asientos;
	private boolean traccion_automatica;
	boolean asientos_cuero;
	boolean climatizador;
	private int fecha_fabricacion;
	boolean vidrios_ahumados;
	
	// metodos
	public Camioneta(String color) { //constructor
		ruedas = 4;
		ancho = 400;
		largo = 2000;
		peso = 600;
		asientos = 5;
		this.color = color;
	}
	
	//metodos setter
	public void establecer_marca(String marca) { 
		this.marca = marca;
	}
	public void establecer_modelo(String modelo) { 
		this.modelo = modelo;
	}
	public void establecer_automatico(boolean automatico) {
		traccion_automatica = automatico;
	}
	public void establecer_asientos_cuero(boolean asientos_cuero) {
		this.asientos_cuero = asientos_cuero;
	}
	public void establecer_climatizador(boolean climatizador) {
		this.climatizador = climatizador;
	}
	public void establecer_fecha_fabricacion(int fecha_fabricacion) {
		this.fecha_fabricacion = fecha_fabricacion;
	}
	public void establecer_vidrios_ahumados(boolean vidrios_ahumados) {
		this.vidrios_ahumados = vidrios_ahumados;
	}
	
	//metodos getter
	public String imprimir_ruedas() {
		return "\n> ruedas --> " + ruedas;
	}
	public String imprimir_ancho() {
		return "\n> ancho --> " + ancho;
	}
	public String imprimir_largo() {
		return "\n> largo --> " + largo;
	}
	public String imprimir_peso() {
		return "\n> peso --> " + peso;
	}
	public String imprimir_marca() {
		return "\n> marca --> " + marca;
	}
	public String imprimir_modelo() {
		return "\n> modelo --> " + modelo;
	}
	public String imprimir_asientos() {
		return "\n> asientos --> " + asientos;
	}
	public String imprimir_fecha_fabricacion() {
		return "\n> fecha de fabricacion --> " + fecha_fabricacion;
	}
	public String imprimir_traccion() {
		if(traccion_automatica) {
			return "\n> automatica";
		}
		else {
			return "\n> sincronica";
		}
	}
	public String imprimir_asientos_cuero() {
		if(asientos_cuero) {
			return "\n> tiene asientos de cuero";
		}
		else {
			return "\n> no tiene asientos de cuero";
		}
	}
	public String imprimir_climatizador() {
		if(climatizador) {
			return "\n> tiene climatizador";
		}
		else {
			return "\n> no tiene climatizador";
		}
	}
	public String imprimir_vidrios() {
		if(vidrios_ahumados) {
			return "\n> tiene vidrios ahumados";
		}
		else {
			return "\n> no tiene vidrios ahumados";
		}
	}
	public String imprimir_caracteristicas() {
		return "\ncaracteristicas de la camioneta: " + 
				"\n> color --> " + this.color +
				imprimir_ruedas() + 
				imprimir_ancho() + 
				imprimir_largo() + 
				imprimir_peso() + 
				imprimir_marca() +
				imprimir_modelo() + 
				imprimir_asientos() + 
				imprimir_traccion() + 
				imprimir_asientos_cuero() + 
				imprimir_climatizador() + 
				imprimir_fecha_fabricacion() + 
				imprimir_vidrios();			
	}
}
