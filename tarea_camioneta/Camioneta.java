// Giovanni Urdaneta
// CI: 28288477

package tarea_camioneta;

public class Camioneta {
	
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
	public Camioneta() { //constructor
		ruedas = 4;
		ancho = 400;
		largo = 2000;
		peso = 600;
		asientos = 5;
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
		return "> ruedas --> " + ruedas;
	}
	public String imprimir_ancho() {
		return "> ancho --> " + ancho;
	}
	public String imprimir_largo() {
		return "> largo --> " + largo;
	}
	public String imprimir_peso() {
		return "> peso --> " + peso;
	}
	public String imprimir_marca() {
		return "> marca --> " + marca;
	}
	public String imprimir_modelo() {
		return "> modelo --> " + modelo;
	}
	public String imprimir_asientos() {
		return "> asientos --> " + asientos;
	}
	public String imprimir_fecha_fabricacion() {
		return "> fecha de fabricacion --> " + fecha_fabricacion;
	}
	public String imprimir_traccion() {
		if(traccion_automatica) {
			return "> automatica";
		}
		else {
			return "> sincronica";
		}
	}
	public String imprimir_asientos_cuero() {
		if(asientos_cuero) {
			return "> tiene asientos de cuero";
		}
		else {
			return "> no tiene asientos de cuero";
		}
	}
	public String imprimir_climatizador() {
		if(climatizador) {
			return "> tiene climatizador";
		}
		else {
			return "> no tiene climatizador";
		}
	}
	public String imprimir_vidrios() {
		if(vidrios_ahumados) {
			return "> tiene vidrios ahumados";
		}
		else {
			return "> no tiene vidrios ahumados";
		}
	}
	public String imprimir_caracteristicas() {
		return "caracteristicas de la camioneta: \n" + 
				imprimir_ruedas() + "\n" +
				imprimir_ancho() + "\n" +
				imprimir_largo() + "\n" +
				imprimir_peso() + "\n" +
				imprimir_marca() + "\n" +
				imprimir_modelo() + "\n" +
				imprimir_asientos() + "\n" +
				imprimir_traccion() + "\n" +
				imprimir_asientos_cuero() + "\n" +
				imprimir_climatizador() + "\n" +
				imprimir_fecha_fabricacion() + "\n" +
				imprimir_vidrios();			
	}
}
