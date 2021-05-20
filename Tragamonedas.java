import  java.util.Scanner;
/*
 * @author nicolas
 */
public class Tragamonedas 
{
    
    public static void main(String args[]) 
    {
        double dinero;
        int numFruta1,numFruta2,numFruta3;
        String nFruta1, nFruta2, nFruta3, continuar;
        Scanner ingreso = new Scanner(System.in);
        juego juego1= new juego();
        System.out.println("Bienvenidos al juego de tragamonedas "
                + "\nSaca 2 o 3 frutas iguales para ganar  "
                + "\ncada juego tiene un costo de $0.5");
        do
        {
        System.out.println("Cuanto dinero desea ingresar para jugar?(de $1 a $50maximo)");
        dinero= ingreso.nextDouble();
        }while(dinero>50);
        do
        {
            
            numFruta1= juego1.getFruta1(); //genera un numero random de 1 a 6 que asocia luego con nombre de frutas
            numFruta2 =juego1.getFruta2();
            numFruta3=juego1.getFruta3();
            nFruta1=juego1.nombreFruta(numFruta1); //nombre de la frutas
            nFruta2=juego1.nombreFruta(numFruta2);
            nFruta3=juego1.nombreFruta(numFruta3);
            System.out.println(""+nFruta1+" "+nFruta2+" "+nFruta3);
            
            if (numFruta1==numFruta2 && numFruta1==numFruta3)
            {
                switch(numFruta1)
                {                    
                    case 4:
                        dinero=dinero+30;
                        System.out.println("***Ganaste $30***");
                        break;
                    case 6:
                        dinero=dinero+20;
                        System.out.println("***Ganaste $20***");
                        break;
                    case 3:
                        dinero=dinero+10;
                        System.out.println("***Ganaste $10***");
                        break;
                    default:
                        dinero=dinero+5;
                        System.out.println("***Ganaste $5***");
                        break;
                }
            }
            else
            {
                if (numFruta1==numFruta3 || numFruta1==numFruta2)
                {
                    switch(numFruta1)
                    {
                        case 4: dinero=dinero+3;
                            System.out.println("\n*Ganaste $3*");
                            break;
                        case 6: dinero=dinero+2;
                            System.out.println("\n*Ganaste $2*");
                            break;
                        default:
                            dinero=dinero+1;
                            System.out.println("\n*Ganaste $1*");
                            break;
                    }
                }
                else if (numFruta2==numFruta3)
                {
                    switch(numFruta2)
                    {
                        case 4: 
                            dinero=dinero+3;
                            System.out.println("\n*Ganaste $3*");
                            break;
                        case 6:
                            dinero=dinero+2;
                            System.out.println("\n*Ganaste $2*");
                            break;
                        default:
                            dinero=dinero+1;
                            System.out.println("\n*Ganaste $1*");
                            break;
                    }
                }
             
                else
                {
                    System.out.println("\n:( Se Perdio $0.50 :( ");dinero=dinero-(0.5);
                }
                
            }
            System.out.println("\nDinero que me queda $" + dinero);
            System.out.println("\nDesea seguir jugando ?'S' para continuar u otra tecla para Salir"); 
            continuar = ingreso.next();
            continuar = continuar.toUpperCase();
            if (dinero==0)
            {
                continuar="N";
                System.out.println("No se puede continuar se quedo sin dinero");
            }
        }while(continuar.contentEquals("S"));
        System.out.println("Hasta la proxima !!");
    }
}