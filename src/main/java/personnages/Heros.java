/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import java.util.Collection;
import labyrinthe.ISalle;


/**
 *
 * @author William Tchang
 */
public class Heros extends APersonnage{
    private static int unite;
    public ISalle salleChoisie;
    
    public Heros(ISalle s){
        super.setPosition(s);
        salleChoisie=s;
        super.estMonstre=false;
    }
    
    @Override
    public ISalle faitSonChoix(Collection<ISalle> sallesAccessibles) {
       return sallesAccessibles.contains(salleChoisie) ? salleChoisie : super.getPosition();
    }
    
    @Override 
    public void setPosition(ISalle s){
        super.setPosition(s);
    }
    
    public static int getUnite(){
        return unite;
    }
}
