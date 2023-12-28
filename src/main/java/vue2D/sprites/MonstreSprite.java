/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vue2D.sprites;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import javafx.scene.image.Image;
import labyrinthe.ILabyrinthe;
import labyrinthe.ISalle;
import personnages.Monstre;

/**
 *
 * @author William Tchang
 */
public class MonstreSprite extends ASprite {
    private ISalle salleChoisie;
    
    public MonstreSprite(Monstre monstre, ILabyrinthe laby){
        super(monstre);
        this.salleChoisie=monstre.getPosition();
        this.setImage(new Image("file:icons/monstre0.gif"));
    }
    
    @Override
    public ISalle faitSonChoix(Collection<ISalle> sallesAccessibles) {
        if (sallesAccessibles.isEmpty()) {
            System.out.println("Aucune salle accessible trouvée.");
            return null;
        }
        List<ISalle> listeSalles = new ArrayList<>(sallesAccessibles);
        Random random = new Random();
        int indexAleatoire = random.nextInt(listeSalles.size());
        ISalle salle = listeSalles.get(indexAleatoire);
        return salle;
    }

    @Override
    public ISalle getPosition() {
        return super.getPosition();
    }

    @Override
    public void setPosition(ISalle s) {
        salleChoisie=s;
        super.setPosition(s);
    }

    @Override
    public boolean estMonstre() {
        return perso.estMonstre();
    }
}
