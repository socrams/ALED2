/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package yankenpo;

import java.util.Scanner;
/**
 *
 * @author nicolas
 */
public class juego 
{
   private int EleccionPC;
   private int EleccionMia;

    
    public String obtenerNombre(int Eleccion) 
    {
        String eleccionEnLetras="";
        switch (Eleccion) 
        {
            case 1:
                eleccionEnLetras = "piedra";
                break;
            case 2:
                eleccionEnLetras = "papel";
                break;
            case 3:
                eleccionEnLetras = "tijera";
                break;
        }
        return eleccionEnLetras;
    }
    public int getEleccionPC(){
    	int rand = (int)(Math.random()*3);
        return rand;
    }
    
    public int Resultados(String pc,String yo,int puntaje)
    {
        int puntajeMio=0;
        int puntajePC=0;
        if(yo.equals(pc)) {
            System.out.println("Empate");
        }
        else if((yo.equals("piedra") && pc.equals("tijera")) 
        || (yo.equals("tijera") && pc.equals("papel")) 
        || (yo.equals("paper") && pc.equals("piedra"))) 
        {
            System.out.println("Tu ganas!");
            puntaje=puntajeMio++;
             
        }
        else
        {
            System.out.println("Tu pierdes!");
            puntaje=puntajePC++;
        }
        System.out.println("\nPuntaje");
        System.out.println("Usuario: "+puntajeMio);
        System.out.println("Maquina: "+puntajePC);
        return puntaje;
    }
        
        


    public int Intro(){
    boolean validar=false;
    do {
        System.out.println("Ingrese su Jugada!");
        System.out.println("1.- Elegir Piedra | 2.- Elegir Papel | 3.- Elegir Tijeras | 4.- Elegir para Terminar");
        /*System.out.println("");
        System.out.println("");
        System.out.println("");*/
        Scanner in = new Scanner(System.in);
        EleccionMia = in.nextInt();
        if (EleccionMia==4)
        {   
            break;
	}
        if( (EleccionMia != 1 && EleccionMia != 2) && EleccionMia!=3 ) //Valida Seleccion
        {
            System.out.println("Tu seleccion es invalida \n");
            validar=true;
        }   
        } while (validar==true);
    return EleccionMia;
    }
}
    
        /*
        System.out.println("Puntaje");
        System.out.println("Usuario: "+puntajeUser);
        System.out.println("Maquina: "+puntajePC);
        */