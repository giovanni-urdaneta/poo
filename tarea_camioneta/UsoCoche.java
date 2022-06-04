// Giovanni Urdaneta
// CI: 28288477

package tarea_camioneta;

import java.util.Scanner;

public class UsoCoche {
	
	public static void main(String[] args) {
	       
        // funcion para recibir valores
        Scanner entrada = new Scanner(System.in);
       
        // instancia de Camioneta()
        
        Camioneta mi_camioneta = new Camioneta("rojo"); 
        
        // aplicando metodos setter
        System.out.println("ingrese las caracteristicas de la camioneta");
        
        System.out.println("> marca: ");
        String mi_marca = entrada.nextLine();
        mi_camioneta.establecer_marca(mi_marca);
        
        System.out.println("> modelo: ");
        String mi_modelo = entrada.nextLine();
        mi_camioneta.establecer_modelo(mi_modelo);
        
        System.out.println("> es automatica?: ");
        boolean mi_traccion = entrada.nextBoolean();
        mi_camioneta.establecer_automatico(mi_traccion);
        
        System.out.println("> tiene asientos de cuero?: ");
        boolean mis_asientos = entrada.nextBoolean();
        mi_camioneta.establecer_asientos_cuero(mis_asientos);
        
        
        System.out.println("> tiene climatizador?: ");
        boolean mi_climatizador = entrada.nextBoolean();
        mi_camioneta.establecer_climatizador(mi_climatizador);
        
        System.out.println("> en que anio fue fabricada?: ");
        int anio = entrada.nextInt();
        mi_camioneta.establecer_fecha_fabricacion(anio);
        
        System.out.println("> tiene vidrios ahumados?: "); 
        boolean vidrios = entrada.nextBoolean();
        mi_camioneta.establecer_vidrios_ahumados(vidrios);
        
        // algunos metodos getter
        System.out.println(mi_camioneta.imprimir_largo());
        System.out.println(mi_camioneta.imprimir_fecha_fabricacion() + "\n\n");
        System.out.println(mi_camioneta.imprimir_caracteristicas());   
    }
}
