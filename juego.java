/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicolas
 */
public class juego 
{
    private int Fruta1;  
    private int Fruta2;
    private int Fruta3;
    String nombreFruta;

    public int getFruta1() 
    {
        Fruta1=(int) Math.floor(Math.random()*(6-1+1)+1);
        return Fruta1;
    }
    public int getFruta2() 
    {
        Fruta2=(int) Math.floor(Math.random()*(6-1+1)+1);
        return Fruta2;
    }
    public int getFruta3() 
    {
        Fruta3=(int) Math.floor(Math.random()*(6-1+1)+1);
        return Fruta3;
    }


    String nombreFruta(int Fruta)
    {
    switch (Fruta)
        {
            case 1: Fruta=1; nombreFruta="Manzana"; break;
            case 2: Fruta=2; nombreFruta="Naranja"; break;
            case 3: Fruta=3; nombreFruta="Fresa"; break;
            case 4: Fruta=4; nombreFruta="Cereza"; break;
            case 5: Fruta=5; nombreFruta="Limon"; break;
            case 6: Fruta=6; nombreFruta="Sandia"; break;
        }
    return nombreFruta;
    }
}
        


