/**
 *
 * @author nicolas
 */

package yankenpo;

public class YanKenPo 
{
    public static void main(String[] args)
    {
        juego juegoPC = new juego();
        int puntaje=0;
        System.out.println("Bienvenido a Piedra,Papel o Tijeras"); //cabezera del juego
        System.out.println("El primero en llegar a 3 puntos ganara");
        
        //for (int puntaje = 0; puntaje < 4;) {
            
        do {
            
        
        
        int EleccionMia = juegoPC.Intro();//valida opcion de ingreso
        
        String EleccionMiaLetras=juegoPC.obtenerNombre(EleccionMia); //genera el nombre de la seleccion del usuario
        
        int numeroPC=juegoPC.getEleccionPC()+1; //saca numero ramdom y lo guarda
        
        String EleccionPCLetras=juegoPC.obtenerNombre(numeroPC); //genera el nombre de la seleccion rand de la pc
        
        System.out.println("Usted Eligio: "+EleccionMiaLetras); //print de elecciones
        System.out.println("La PC Eligio: "+EleccionPCLetras);
        
        puntaje=juegoPC.Resultados(EleccionPCLetras,EleccionMiaLetras,puntaje); //compara y resultados
        
        } 
        while (puntaje<3);
    }
}

        
    

