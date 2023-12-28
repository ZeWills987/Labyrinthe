/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

import labyrinthe.ISalle;

/**
 *
 * @author William Tchang
 */
public abstract class APersonnage implements IPersonnage {
     
    ISalle position;
    boolean estMonstre;
    
    @Override
    public ISalle getPosition(){
         return this.position;
    }
    
    @Override
    public void setPosition(ISalle s){
        this.position=s;
    }
    
    @Override
    public boolean estMonstre(){
        return this.estMonstre;
    }
}
