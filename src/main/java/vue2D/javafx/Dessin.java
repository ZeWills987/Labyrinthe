package vue2D.javafx;

import java.util.Collection;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import labyrinthe.ILabyrinthe;
import labyrinthe.ISalle;
import vue2D.sprites.ISprite;

/**
*
* @author INFO Professors team
*/

public class Dessin extends Canvas {
    
    private Collection<ISprite> sprites;
    private ILabyrinthe labyrinthe;
    private int unite = 15;
    private GraphicsContext tampon;
    private Image solImage;
    private Image heroImage;
   
    public Dessin(ILabyrinthe labyrinthe, Collection<ISprite> sprites)
    {
        this.sprites = sprites;
        this.labyrinthe = labyrinthe;
        setWidth(labyrinthe.getLargeur()*unite);
        setHeight(labyrinthe.getHauteur()*unite);
        tampon = this.getGraphicsContext2D();
    }
    
    /**
     * Charge l'image de fond du labyrinthe.
     */
     public void chargementImages(){
    	solImage = new Image("file:icons/pyramide.png");
        heroImage = new Image("file:icons/link/LinkRunShieldL1.gif");
    }
    
    /**
     * Dessine le find d'écran du labyrinthe.
     */
    public void dessinFond(){
        tampon.drawImage(solImage,0,0,unite*labyrinthe.getLargeur(),
                unite*labyrinthe.getHauteur());
    }
   
    /**
     * Dessine les salles du labyrinthe.
     */
    public void dessinSalles(){
        //solImage = new Image("file:icons/sortie.gif");
        //tampon.drawImage(solImage,labyrinthe.getEntree().getX()*unite,
                //labyrinthe.getEntree().getY()*unite,unite,unite); 
        solImage = new Image("file:icons/sortie.gif");
        tampon.drawImage(solImage,labyrinthe.getSortie().getX()*unite,
                labyrinthe.getSortie().getY()*unite,unite,unite);
        solImage = new Image("file:icons/ground.gif");
                tampon.drawImage(new Image("file:icons/sortie.gif"),labyrinthe.getSortie().getX()*unite,
                labyrinthe.getSortie().getY()*unite,unite,unite);
        for(ISalle s: this.labyrinthe){
            tampon.drawImage(solImage,s.getX()*unite,s.getY()*unite,unite,unite);
          
        }        
    }
    
    public void dessinSprites(){
        for(ISprite s : this.sprites){
            s.dessiner(tampon);
        }
    }
}
