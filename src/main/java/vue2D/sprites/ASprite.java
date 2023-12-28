/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue2D.sprites;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import labyrinthe.ISalle;
import labyrinthe.Salle;
import personnages.Heros;
import personnages.IPersonnage;

/**
 *
 * @author William Tchang
 */
public abstract class ASprite implements ISprite {

    public IPersonnage perso;
    private final int UNITE = 15;
    public Image persoImage;
    private int x;
    private int y;
    
    public ASprite(IPersonnage perso){
        this.perso=perso;
    }
    
    public void setImage(Image i){
        this.persoImage=i;
    }
    
    @Override
    public ISalle getPosition(){
        return this.perso.getPosition();
    }
    
    @Override
    public void setPosition(ISalle s){
        this.perso.setPosition(s);
    }
    
    @Override
    public void dessiner(GraphicsContext g) {
        IPersonnage p = this.perso;
        g.drawImage(persoImage, p.getPosition().getX()*UNITE, 
                p.getPosition().getY()*UNITE,UNITE,UNITE);
    }

    @Override
    public void setCoordonnees(int xpix, int ypix) {
        this.x=xpix;
        this.y=ypix;
    }
}
